# DROOL
Compilers-2 Project

The Lexer and Parser generate a Parse tree for the input files. Correct test cases programs are provided in the test_cases folder. The error_test_cases folder contains programs with syntax errors. To generate JAVA files from the grammar files use the make command along with input_file_name from the root directory of the project folder. The generated files are stored in java folder(Lexer_Parser/src/java). Refer to makefile function in Whitepaper for more details. The command for testing an input file is given below.

$ make f=\<INPUTFILENAME\>
  
For example, the below command generates the parse tree for graph.dr program in the test_cases folder.

$ make f=test_cases/graph.dr

To delete the files generated during the above step use:
$ make clean

The prerequisites required are:
1. LINUX OS
2. JAVA (Version 1.6 or higher)
3. ANTLR4 (Version antlr-4.8)

For all the antlr commands to work and for all the files to compile, download antlr packages using the quickstart commands in the following link: 
https://www.antlr.org/
