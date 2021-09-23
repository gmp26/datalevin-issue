Minimal example showing failure to require datalevin according to the docs. (FIXED  BY UPDATE TO JDK16)

I have tried other environments with the same result, but this one is:
MacOS 11.5.2

java version "1.8.0_152"
Java(TM) SE Runtime Environment (build 1.8.0_152-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.152-b16, mixed mode)

deps.edn

THE ABOVE ISSUE IS RESOLVED BY UPDATING THE JDK. JDK 16 is fine. JDK 11 _probably_ works but I have not tested it yet.

However... another early issue appears at database/datalevin.clj:7. 
d/get-conn throws an error...
