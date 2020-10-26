# all: compile

all: compile
	java org.antlr.v4.gui.TestRig Drool program -gui $.../../../$(f)

compile:
	java -jar /usr/local/lib/antlr-4.8-complete.jar DroolLexer.g4
	javac DroolLexer*.java
	java -jar /usr/local/lib/antlr-4.8-complete.jar DroolParser.g4
	javac Drool*.java
	# grun Drool program -gui $(filename)

debug: compile
	java org.antlr.v4.runtime.misc.TestRig  Erlang forms -gui -encoding utf8

check: compile
	./check.sh test/

clean:
	rm -f *.class

distclean: clean
	rm -f *.java *.tokens
