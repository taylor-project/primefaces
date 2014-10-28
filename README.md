Taylor Project - primefaces
==========

Unofficial Mirror of PrimeFaces JSF Components.

Release Process
==========
1. cd to primefaces project
2. git checkout trunk-snapshot
3. git pull origin trunk-snapshot
4. git checkout current-release
5. git merge trunk-snapshot
6. mvn versions:set -DnewVersion=[next version]
7. mvn versions:commit
8. git commit -A -m "updating version"
9. git tag -a [next version] -m "tagging [next version]"
10. git push origin current-release
11. git push origin [next version]


