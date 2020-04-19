grammar Test;

expr
    : expr MULDIV expr
    | expr PLUSMIN expr
    | expr op expr
    | '('expr')'
    | value
    | '{' expr ';''}'
    ;
op
    : EQUAL
    | LT
    | LE
    ;

value: NUM
       | ID (ASSIGN_OPERATOR expr)?
       ;

ASSIGN_OPERATOR : '<-' ;

NL: [\n\r];
EQUAL : '=' ;
LT : '<' ;
LE : '<=';
ID: [a-zA-Z][_a-zA-Z0-9]*;
MULDIV:[*\\];
PLUSMIN:[+-];
NUM: DIGIT+;
fragment DIGIT: [0-9];

/*
@init {System.out.println("Question last update 1213");}
    :   line+ EOF
    ;

line
    :   expression NL
        {System.out.println("Expression found : " + $expression.text); }
    ;

expression
    :   expression mult='*' expression          # expressionMultExpression
    |   expression add=( '+' | '-' ) expression # expressionAddExpression
    |   VARIABLE '=' expression                 # expressionAssign
    |   '(' expression ')'                      # parenthesisedExpression
    |   atom                                    # atomExpression
    ;

atom
    :   INT                                     #int
    |   VARIABLE                                #var
    ;

VARIABLE : LETTER ( LETTER | DIGIT )*;
INT      : DIGIT+;

NL      : [\r\n] ;
WS      : [ \t] -> channel(HIDDEN) ; // -> skip ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT  : [0-9] ;
*/