#!/bin/bash
sudo mvn -f /home/ec2-user/ package
java -jar /home/ec2-user/target/mivi-0.0.1-SNAPSHOT.jar
exit 0
