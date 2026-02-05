cd C:\Users\fares\Desktop\windsurfFront\Entity
./build.cmd
cd C:\Users\fares\Desktop\windsurfFront\back
mvn install:install-file -Dfile="C:\Users\fares\Desktop\windsurfFront\Entity\target\unified-1.0.0.jar" -DgroupId=sparkJar -DartifactId=sparkJar -Dversion=1.0 -Dpackaging=jar
