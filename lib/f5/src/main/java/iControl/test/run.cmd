Set JAVALIB=D:\src\perforce\DevCentral\DC4\Labs\iControlAssembly\java\3rdparty\jar\Axis1
set AXIS_CLASSPATH=%JAVALIB%\axis.jar;%JAVALIB%\commons-discovery.jar;%JAVALIB%\commons-logging.jar;%JAVALIB%\jaxrpc.jar;%JAVALIB%\junit.jar;%JAVALIB%\saaj.jar;%JAVALIB%\wsdl4j.jar;%JAVALIB%\activation.jar;%JAVALIB%\mail.jar

:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar SystemInfo theboss 443 joeuser p!@#
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 add 1.1.1.1 80
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 remove 1.1.1.1 80
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 sessstate 10.10.10.149 80 enable
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar Main 
c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin noerror getgtmrule foo 10
