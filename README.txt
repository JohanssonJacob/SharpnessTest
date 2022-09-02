How to run this application through CLI:
Open e.g. cmd, change directory to the project root folder.
    cd ~/SharpnessTest
Clean, compile & package the project with maven.
    mvn clean compile package
After that run the jar "SharpnessTest-1.0.jar"
    java -jar target/SharpnessTest-1.0.jar

To run the unit tests, do:
mvn test
