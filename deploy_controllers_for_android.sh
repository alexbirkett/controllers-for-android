SCRIPTNAME=$(basename $0)
if [ -z "${2}"  ] 
then
echo "usage $SCRIPTNAME <version> <url>"
exit 1 
fi

echo ${1}
echo ${2}

VERSION=${1}
URL=${2}

DEPLOY_PARENT="mvn deploy:deploy-file -DgroupId=no.birkett -DartifactId=controllers-for-android-parent -Dversion=$VERSION -Dpackaging=pom -Durl=$URL -Dfile=pom.xml -DpomFile=pom.xml"

DEPLOY_LIBRARY="mvn deploy:deploy-file -DgroupId=no.birkett -DartifactId=controllers-for-android -Dversion=$VERSION -Dpackaging=jar -Durl=$URL -Dfile=./library/target/birkett-controllers-for-android-$VERSION.jar -Dsources=./library/target/birkett-controllers-for-android-$VERSION-sources.jar -D./library/target/javadoc/birkett-controllers-for-android-$VERSION-javadoc.jar -DpomFile=./library/pom.xml"

$DEPLOY_PARENT
$DEPLOY_LIBRARY


