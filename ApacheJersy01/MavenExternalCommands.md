####Setting Up For External Maven
Set M2_HOME=G:\WsApril17\Maven350
Set PATH=%M2_HOME%\bin;%PATH%
####Create A Archetype For Jersey:Created JerseySampleByArchetype.7z
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=2.2 