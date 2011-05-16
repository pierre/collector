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

package com.ning.metrics.collector.events.hadoop.writer;

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
import java.util.List;

public class TestHadoopOutputChunk
{
    private final Path srcPath = new Path("/tmp/parent/child.txt");
    private final Path dstPath = new Path("/parent/child.txt");
    private HadoopOutputChunk hdfsChunk;
    private MockFileSystem filesystem;

    class MockFileSystem extends FileSystem
    {
        private final List<Path> inodes = new ArrayList<Path>();
        private boolean mkdirsThrowsException = false;
        private boolean renameThrowsException = false;
        private boolean deleteThrowsException = false;
        private boolean mkdirsFails = false;
        private boolean renameFails = false;
        private boolean deleteFails = false;

        public void setMkdirsThrowsException(boolean mkdirsThrowsException)
        {
            this.mkdirsThrowsException = mkdirsThrowsException;
        }

        public void setRenameThrowsException(boolean renameThrowsException)
        {
            this.renameThrowsException = renameThrowsException;
        }

        public void setDeleteThrowsException(boolean deleteThrowsException)
        {
            this.deleteThrowsException = deleteThrowsException;
        }

        public void setMkdirsFails(boolean mkdirsFails)
        {
            this.mkdirsFails = mkdirsFails;
        }

        public void setRenameFails(boolean renameFails)
        {
            this.renameFails = renameFails;
        }

        public void setDeleteFails(boolean deleteFails)
        {
            this.deleteFails = deleteFails;
        }

        @Override
        public URI getUri()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public FSDataInputStream open(Path path, int i) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean exists(Path f) throws IOException
        {
            return inodes.contains(f);
        }

        @Override
        public FSDataOutputStream create(Path f) throws IOException
        {
            inodes.add(f);
            return null;
        }

        @Override
        public FSDataOutputStream create(Path path, FsPermission fsPermission, boolean b, int i, short j, long l, Progressable progressable) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public FSDataOutputStream append(Path path, int i, Progressable progressable) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean rename(Path path, Path path1) throws IOException
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
        public boolean delete(Path path) throws IOException
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
        public boolean delete(Path path, boolean b) throws IOException
        {
            return delete(path);
        }

        @Override
        public FileStatus[] listStatus(Path path) throws IOException
        {
            return new FileStatus[0];  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setWorkingDirectory(Path path)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Path getWorkingDirectory()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean mkdirs(Path path, FsPermission fsPermission) throws IOException
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
        public FileStatus getFileStatus(Path path) throws IOException
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
