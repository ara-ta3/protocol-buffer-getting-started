SBT=sbt

server/scala:
	$(SBT) ";project scala_protobuff;~jetty:start"
