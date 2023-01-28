cd build/libs
del *.jar

call build.gradle

if EXISTS build/libs/*.jar then
copy *.jar project
else echo File cannot be build
fi
