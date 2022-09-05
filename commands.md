set JAVA_HOME=C:\Progra~1\Java\jdk1.8.0_331

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic cotTeam --from-beginning
