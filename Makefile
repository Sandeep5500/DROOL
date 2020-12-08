MAKE = make
%: build

build:
	$(MAKE) -C ./Lexer_Parser/src/grammars -f Makefile
	$(MAKE) -C ./Lexer_Parser/src/java -f Makefile

clean:
	$(MAKE) -C ./Lexer_Parser/src/java -f Makefile clean
