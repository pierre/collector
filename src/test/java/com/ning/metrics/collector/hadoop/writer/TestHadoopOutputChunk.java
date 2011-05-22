/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.hadoop.writer;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestHadoopOutputChunk
{
    private final Path srcPath = new Path("/tmp/parent/child.txt");
    private final Path dstPath = new Path("/parent/child.txt");
    private HadoopOutputChunk hdfsChunk;
    private MockFileSystem filesystem;

    class MockFileSystem extends FileSystem
    {
        private final Collection<Path> inodes = new ArrayList<Path>();
        private boolean mkdirsThrowsException = false;
        private boolean renameThrowsException = false;
        private boolean deleteThrowsException = false;
        private boolean mkdirsFails = false;
        private boolean renameFails = false;
        private boolean deleteFails = false;

        public void setMkdirsThrowsException(final boolean mkdirsThrowsException)
        {
            this.mkdirsThrowsException = mkdirsThrowsException;
        }

        public void setRenameThrowsException(final boolean renameThrowsException)
        {
            this.renameThrowsException = renameThrowsException;
        }

        public void setDeleteThrowsException(final boolean deleteThrowsException)
        {
            this.deleteThrowsException = deleteThrowsException;
        }

        public void setMkdirsFails(final boolean mkdirsFails)
        {
            this.mkdirsFails = mkdirsFails;
        }

        public void setRenameFails(final boolean renameFails)
        {
            this.renameFails = renameFails;
        }

        public void setDeleteFails(final boolean deleteFails)
        {
            this.deleteFails = deleteFails;
        }

        @Override
        public URI getUri()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public FSDataInputStream open(final Path path, final int i) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean exists(final Path f) throws IOException
        {
            return inodes.contains(f);
        }

        @Override
        public FSDataOutputStream create(final Path f) throws IOException
        {
            inodes.add(f);
            return null;
        }

        @Override
        public FSDataOutputStream create(final Path path, final FsPermission fsPermission, final boolean b, final int i, final short j, final long l, final Progressable progressable) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public FSDataOutputStream append(final Path path, final int i, final Progressable progressable) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean rename(final Path path, final Path path1) throws IOException
        {
            if (renameThrowsException) {
                throw new IOException("IGNORE - expected for tests");
            }
            else if (renameFails) {
                return false;
            }
            inodes.remove(path);
            inodes.add(path1);
            return true;
        }

        /**
         * @deprecated
         */
        @Override
        public boolean delete(final Path path) throws IOException
        {
            if (deleteThrowsException) {
                throw new IOException("IGNORE - expected for tests");
            }
            else if (deleteFails) {
                return false;
            }
            return inodes.remove(path);
        }

        @Override
        public boolean delete(final Path path, final boolean b) throws IOException
        {
            return delete(path);
        }

        @Override
        public FileStatus[] listStatus(final Path path) throws IOException
        {
            return new FileStatus[0];  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setWorkingDirectory(final Path path)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Path getWorkingDirectory()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean mkdirs(final Path path, final FsPermission fsPermission) throws IOException
        {
            if (mkdirsThrowsException) {
                throw new IOException("IGNORE - expected for tests");
            }
            else if (mkdirsFails) {
                return false;
            }
            return true;
        }

        @Override
        public FileStatus getFileStatus(final Path path) throws IOException
        {
            return new FileStatus();
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception
    {
        hdfsChunk = new HadoopOutputChunk(srcPath, dstPath, null);
        filesystem = new MockFileSystem();
    }

    @Test(groups = "fast")
    public void testCommit() throws Exception
    {
        filesystem.create(srcPath);

        Assert.assertTrue(filesystem.exists(srcPath));
        Assert.assertFalse(filesystem.exists(dstPath));
        Assert.assertFalse(filesystem.exists(dstPath.getParent()));

        hdfsChunk.commit(filesystem);

        Assert.assertFalse(filesystem.exists(srcPath));
        Assert.assertTrue(filesystem.exists(dstPath));
    }

    @Test(groups = "fast")
    public void testMkdirsThrowsException() throws Exception
    {
        filesystem.setMkdirsThrowsException(true);
        try {
            hdfsChunk.commit(filesystem);
            Assert.fail();
        }
        catch (IOException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testMkdirsFails() throws Exception
    {
        filesystem.setMkdirsFails(true);
        try {
            hdfsChunk.commit(filesystem);
            Assert.fail();
        }
        catch (IOException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testRenameThrowsException() throws Exception
    {
        filesystem.setRenameThrowsException(true);
        try {
            hdfsChunk.commit(filesystem);
            Assert.fail();
        }
        catch (IOException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testRenameFails() throws Exception
    {
        filesystem.setRenameFails(true);
        try {
            hdfsChunk.commit(filesystem);
            Assert.fail();
        }
        catch (IOException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testDeleteThrowsException() throws Exception
    {
        filesystem.create(srcPath);
        filesystem.setDeleteThrowsException(true);
        try {
            hdfsChunk.rollback(filesystem);
            Assert.fail();
        }
        catch (IOException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testDeleteFails() throws Exception
    {
        filesystem.create(srcPath);
        filesystem.setDeleteFails(true);
        try {
            hdfsChunk.rollback(filesystem);
            Assert.fail();
        }
        catch (IOException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testRollback() throws Exception
    {
        Assert.assertFalse(filesystem.exists(srcPath));
        Assert.assertFalse(filesystem.exists(srcPath));

        filesystem.create(srcPath);
        filesystem.create(dstPath);

        Assert.assertTrue(filesystem.exists(srcPath));
        Assert.assertTrue(filesystem.exists(srcPath));

        hdfsChunk.rollback(filesystem);

        Assert.assertFalse(filesystem.exists(srcPath));
        Assert.assertFalse(filesystem.exists(srcPath));

        // Ok to delete dummy Paths? Rollback again!
        hdfsChunk.rollback(filesystem);

        Assert.assertFalse(filesystem.exists(srcPath));
        Assert.assertFalse(filesystem.exists(srcPath));
    }

    @Test(groups = "fast")
    public void testGetWriter() throws Exception
    {
        Assert.assertNull(hdfsChunk.getWriter());
    }
}
