To add a new artifact:

mvn org.apache.maven.plugins:maven-install-plugin:2.3.1:install-file \
                         -Dfile=<path-to-file> -DgroupId=<myGroup> \ 
                         -DartifactId=<myArtifactId> -Dversion=<myVersion> \
                         -Dpackaging=<myPackaging> -DlocalRepositoryPath=<path>
