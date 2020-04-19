# Cool Compiler 

To design any compiler you should do several steps:
* Lexical Analysis
* Parsing
* Semantic Analysis
* Code Generation in three address code

we will introduce these steps one by one
let's beigin with lexical analysis

## 1- Lexical Analyser
#### Lexer purpose: 
lexing or tokenization is the process of converting a sequence of characters (such as in a computer program or web page) into a sequence of tokens (strings with an assigned and thus identified meaning). A program that performs lexical analysis may be termed a lexer, tokenizer or scanner.

#### Component Of My Lexer:
* Cool_compiler contain lexer grammar with Antlr 
* Lexer_IO to manipulate with Lexer_grammar generated class
* Main Class to test it 

Examples of Lexer grammar:
* ##### Snapshot 1:
![snap shot1](../imgSrc/1.PNG)

* ##### Snapshot 2:
![snap shot2](../imgSrc/2.PNG)

#### Input Formate:
    any Cool Code
#### Output Formate:
Token can be represented in Three Lines if it is one of this list 
   
   *(TYPE - NUM - LITERAL - ID)*
   * TYPE : can be Int - String - IO - Bool or any Class name
   * NUM : any number like 3 or 50
   * LITERAL : any String Literal as "ahmed" or "anything"
   * ID : any identifier name as ahmed or x 
##### Three line Content:
    * First Line : line number
    * Second Line: Token Rule Name (one type from above list)
    * Third Line : Token Value

any other token that not relate to above list represented in Two Lines:
        * First Line : line number
        * Second Line: Token Rule Name (one type from above list)
##### Example of Input:

```
line1: main() : Int {	-- main() is an atrophied method so we can parse.   
line2:      0 
line3: };
```
##### Output:
```
4
ID
main
4
LEFT_PRANSIS
4
RIGHT_PRANSIS
4
COLUN
4
TYPE
Int
4
LEFT_CURLY
5
NUM
0
6
RIGHT_CURLY
6
SEMICOLUN
```

## 2- Parser 
#### Parser Purpose: 
some_text

#### Component Of My Parser: 
* Cool_compiler.g4 : Contain Parser Grammer with antlr
* Parser_IO : Java Class to manipulate with generated CoolParser and IO files
* Main : java class to test Parser 

Examples for Parser Grammar:
* ##### Snapshot 1:
![snap shot1](../imgSrc/parserGrammar1.PNG)

* ##### Snapshot 2:
![snap shot2](../imgSrc/parserGrammar2.PNG)

* ##### Snapshot 3:
![snap shot3](../imgSrc/parserGrammar3.PNG)

#### Input: 
take TokenStream that generated from lexer 
#### Output: 
Concrete Syntax Tree That Represent parse tree for cool code
### Examples:
#### Good Input Code:
```
class Main inherits IO {

  main() : Int {	-- main() is an atrophied method so we can parse. 
    0
  };

};
```
#### Output CST:
```
(program (classDefinition class Main inherits IO { (classBody (methodDefinition main ( ) : Int { (expr (value 0)) }) ;) } ;))
```

### Bad Input Code: 
```
class Main inherits IO {

  main() : Int {	-- main() is an atrophied method so we can parse. 
    0
  };
  this is the error
};
```
### Output:

![Bad_output](Cool_Compiler/imgSrc/BadOutput.PNG)

## How To Run

### Compile the file

`javac -cp "( ANTLRPATH HERE )\antlr-4.8-complete.jar;" yourPath/Main.java yourPath/coolLexer.java`

### Run the file with the parameter
`java -cp "( ANTLRPATH HERE )\antlr.jar;" Main InputFile`

## Test Cases:
I upload two files one is called `good.cl` doesn't have any errors and compile well 

other file called `bad.cl` have multiple errors and my lexer detect it
