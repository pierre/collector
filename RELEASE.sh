set -e

# We need two releases, one for Apache Hadoop and one for Cloudera Hadoop

function confirm() {
    while true; do
        read -p "$1" yn
        case $yn in
            [Yy]* ) break;;
            [Nn]* ) exit 1;;
            * ) echo "Please answer yes or no.";;
        esac
    done
}

VERSION_SNAPSHOT=$(grep SNAPSHOT pom.xml  | head -1 | sed 's/ *<version>\(.*\)<\/version> */\1/g')
CDH_VERSION_SNAPSHOT=$(echo $VERSION_SNAPSHOT | sed s/-SNAPSHOT/-cdh-SNAPSHOT/)

confirm "The SNAPSHOT Apache version is [$VERSION_SNAPSHOT] and the Cloudera one [$CDH_VERSION_SNAPSHOT]. Correct? "

mvn release:clean
mvn release:prepare
echo ********************************
echo *** Releasing Apache version ***
echo ********************************
mvn release:perform

NEXT_VERSION_SNAPSHOT=$(grep SNAPSHOT pom.xml | head -1 | sed 's/ *<version>\(.*\)<\/version> */\1/g')
echo

sed -i bleh s/$NEXT_VERSION_SNAPSHOT/$CDH_VERSION_SNAPSHOT/g pom.xml && rm pom.xmlbleh

diff=$(git diff -q)
confirm "Verify that the following is the SNAPSHOT Cloudera patch. Ok?
$diff
"

git add pom.xml && git commit -s -m "pom.xml: prepare Cloudera release"

confirm "Make sure to specify the next version to be the NON Cloudera one (remove -cdh). Ok? "

mvn release:clean -Pcloudera
mvn release:prepare -Pcloudera
echo **********************************
echo *** Releasing Cloudera version ***
echo **********************************
mvn release:perform -Pcloudera
