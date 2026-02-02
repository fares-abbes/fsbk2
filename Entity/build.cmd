call mvn -DskipTests=true  package
cd C:\Users\Victus\Documents\FSBKWork\Back
call mvn install:install-file -Dfile="C:\Users\Victus\Documents\FSBKWork\Entity\target\unified-1.0.0.jar" -DgroupId=sparkJar -DartifactId=sparkJar -Dversion=1.0 -Dpackaging=jar