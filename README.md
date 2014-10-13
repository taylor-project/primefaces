Taylor Project - primefaces
==========

Unofficial Mirror of PrimeFaces JSF Components.

Release Process
==========
# cd to primefaces project
# git checkout trunk-snapshot
# git pull origin trunk-snapshot
# git checkout current-release
# git merge trunk-snapshot
# mvn versions:set -DnewVersion=[next version]
# mvn versions:commit
# git commit -A -m "updating version"
# git tag -a [next version] -m "tagging [next version]"
# git push origin current-release
# git push origin [next version]


