Set JAVALIB=D:\src\perforce\DevCentral\DC4\Labs\iControlAssembly\java\3rdparty\jar\Axis1
set AXIS_CLASSPATH=%JAVALIB%\axis.jar;%JAVALIB%\commons-discovery.jar;%JAVALIB%\commons-logging.jar;%JAVALIB%\jaxrpc.jar;%JAVALIB%\junit.jar;%JAVALIB%\saaj.jar;%JAVALIB%\wsdl4j.jar;%JAVALIB%\activation.jar;%JAVALIB%\mail.jar
:c:\jdk1.6.0_16\bin\javac -classpath %AXIS_CLASSPATH%;..\lib\iControl.jar SystemInfo.java
c:\jdk1.6.0_16\bin\javac -classpath %AXIS_CLASSPATH%;..\lib\iControl.jar PoolMember.java
:c:\jdk1.6.0_16\bin\javac -classpath %AXIS_CLASSPATH%;..\lib\iControl.jar Main.java