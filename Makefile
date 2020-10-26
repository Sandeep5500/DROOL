MAKE = make
%: build

build:
	$(MAKE) -C ./Parser/src/grammar -f Makefile

clean:
	$(MAKE) -C ./src/grammar -f Makefile clean
