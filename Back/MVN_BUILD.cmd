cd C:\Users\Victus\Documents\FSBKWork\Entity
./build.cmd
cd C:\Users\Victus\Documents\FSBKWork\Back
mvn install:install-file -Dfile="C:\Users\Victus\Documents\FSBKWork\entity\target\unified-1.0.0.jar" -DgroupId=sparkJar -DartifactId=sparkJar -Dversion=1.0 -Dpackaging=jar
