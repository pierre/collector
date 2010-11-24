@Echo On
	setlocal EnableDelayedExpansion
	set JAVAHOME=c:\jdk1.6.0_16
	Set JAVA=%JAVAHOME%\bin\java
	Set JAVAC=%JAVAHOME%\bin\javac
	Set JAR=%JAVAHOME%\bin\jar
:	Set JAVALIB=..\3rdparty\jar
	Set JAVALIB=D:\src\perforce\DevCentral\DC4\Labs\iControlAssembly\java\3rdparty\jar\Axis1
	set AXIS_CLASSPATH=%JAVALIB%\axis.jar;%JAVALIB%\commons-discovery.jar;%JAVALIB%\commons-logging.jar;%JAVALIB%\jaxrpc.jar;%JAVALIB%\junit.jar;%JAVALIB%\saaj.jar;%JAVALIB%\wsdl4j.jar;%JAVALIB%\activation.jar;%JAVALIB%\mail.jar
:	Set JAVA_CLASSPATH=%AXIS_CLASSPATH%
	set AXIS2_CLASSPATH=%JAVALIB%
	FOR %%c in ("%JAVALIB%\*.jar") DO set AXIS2_CLASS_PATH=!AXIS2_CLASS_PATH!;%%c
	Set JAVA_CLASSPATH=!AXIS2_CLASS_PATH!
	Set _JAVAC_FLAGS=-Xlint:unchecked

	Set SOURCE_DIR=.\source
	Set BINDINGS_DIR=.\bindings
	Set CLASSES_DIR=.\classes
	Set LIB_DIR=.\lib
	Set WSDL2JAVA=%JAVAHOME%\bin\java -classpath %JAVA_CLASSPATH% org.apache.axis.wsdl.WSDL2Java
	Set WSDL2JAVA_FLAGS= -o %BINDINGS_DIR%

	if not exist %BINDINGS_DIR%\iControl Goto BINDINGS
	if not exist %CLASSES_DIR%\iControl goto CLASSES
:	if not exist %LIB_DIR%\iControl.jar goto JAR
	GOTO SOURCE
	goto END

:BINDINGS
	Echo Generating java stub files...
	for %%s in (wsdl\*.wsdl) do echo Compiling %%s...& %WSDL2JAVA% %WSDL2JAVA_FLAGS% %%s
	goto END

:CLASSES
	Echo Compiling iControl bindings sources...
	if not exist %CLASSES_DIR%\NUL mkdir %CLASSES_DIR%
	cd %BINDINGS_DIR%/iControl
	for %%s in (*.java) do echo Compiling %%s...& %JAVAC% %JAVAC_FLAGS% -classpath %AXIS_CLASSPATH%;.. -d ..\..\classes %%s
	cd ..\..
	Echo Compiling holder classes...
	cd %BINDINGS_DIR%/iControl/holders
	for %%s in (*.java) do echo Compiling %%s...& %JAVAC% %JAVAC_FLAGS% -classpath %AXIS_CLASSPATH%;..\.. -d ..\..\..\classes %%s
	cd ..\..\..	
	Goto End
	goto SOURCE
	goto END

:SOURCE
	Echo Compiling iControl Sources...
	cd %SOURCE_DIR%\iControl
	for %%s in (*.java) do echo Compiling %%s...& %JAVAC% %JAVAC_FLAGS% -classpath %AXIS_CLASSPATH%;..;..\..\classes -d ..\..\classes %%s
	cd ..\..
	goto JAR

:JAR
	Echo Creating iControl.jar
	if not exist %LIB_DIR%\NUL mkdir %LIB_DIR%
	if Exist %LIB_DIR%\iControl.jar goto end
	cd %CLASSES_DIR%
	%JAR% cvf ..\lib\iControl.jar iControl
	cd ..
	goto END

:END
	Endlocal