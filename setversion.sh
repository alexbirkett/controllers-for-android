SCRIPTNAME=$(basename $0)
if [ -z "${1}"  ] 
then
echo "usage $SCRIPTNAME <version>"
exit 1 
fi

VERSION=${1}
mvn versions:set -DnewVersion="$VERSION"



