# all: compile

all: compile
	java org.antlr.v4.gui.TestRig Drool program -gui $.../../../$(f)

compile:
	#java -jar /usr/local/lib/antlr-4.8-complete.jar -o $.../java/ $.../grammars/DroolLexer.g4
	javac DroolLexer*.java
	#java -jar /usr/local/lib/antlr-4.8-complete.jar -o $.../java/ $.../grammars/DroolParser.g4
	javac Drool*.java
	# grun Drool program -gui $(filename)

clean:
	rm -f *.class *.java *.tokens *.interp


