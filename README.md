# DROOL
Compilers-2 Project

The Lexer and Parser generate a Parse tree for the input files. Example programs are provided in the example folder. The test_cases folder contains programs with syntax errors. To generate JAVA files from the grammar files use the make command along with input_file_name from the root directory of the project folder. The command for testing an input file is given below.

$ make f=<INPUTFILENAME>
  
For example, the below command generates the parse tree for graph.dr program in the examples folder.

$ make f=examples/graph.dr

The prerequisites required are:

1. JAVA (Version 1.6 or higher)
2. ANTLR4 (Version antlr-4.8)
