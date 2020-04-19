grammar Cool_compiler;

program : classDefinition+;

classDefinition :
    CLASS TYPE (INHERITS TYPE)? LEFT_CURLY
        classBody
    RIGHT_CURLY SEMICOLUN
    ;

classBody : ((varDeclaration | methodDefinition) SEMICOLUN)*;

//=========================== method Rules ===================================
methodDefinition
                :
                ID LEFT_PRANSIS formalParamList* RIGHT_PRANSIS COLUN TYPE LEFT_CURLY
                    expr
                RIGHT_CURLY
                ;

methodCall : ID LEFT_PRANSIS actualParamList RIGHT_PRANSIS SEMICOLUN;

formalParamList: param (COMMA param)*;
param : ID COLUN TYPE;
actualParamList : expr (expr COMMA)*;
//=========================== varDeclaration Rules ===================================
varDeclaration: ID COLUN TYPE (ASSIGN_OPERATOR expr)?;

//=========================== expr Rules ===================================
expr
    : expr MULDIV expr
    | expr PLUSMINUS expr
    | expr op expr
    | LEFT_PRANSIS expr RIGHT_PRANSIS
    | value
    | blockStmt
    | methodCall
    | letStmt
    | whileStmt
    | ifStmt
    | assignmentStmt
    | invExprStmt
    | notExprStmt
    | newObjStmt
    | isvoidStmt
    | caseStmt
    | featureAccess =  expr (AT TYPE)? DOT ID (LEFT_PRANSIS expr (COMMA expr)* RIGHT_PRANSIS)?
    ;

op
    : EQUAL
    | LT
    | LE
    ;

value
     : LITERAL
     | NUM
     | ID (ASSIGN_OPERATOR expr)?
     | TRUE
     | FALSE
     ;

ifStmt : IF expr THEN expr ELSE expr FI;

whileStmt : WHILE expr THEN expr POOL;

letStmt: LET  assignmentStmt+ IN expr;

caseStmt : CASE expr OF caseBody ESAC;
caseBody : (ID COLUN TYPE CASE_ARROW expr)+;

assignmentStmt : ID COLUN TYPE ASSIGN_OPERATOR expr;

blockStmt : LEFT_CURLY (expr SEMICOLUN)+ RIGHT_CURLY;

newObjStmt : NEW TYPE;

isvoidStmt : ISVOID expr;

notExprStmt : NOT expr;

invExprStmt : TILDE expr;

PLUSMINUS
         : PLUS
         | MINUS
         ;
MULDIV
      : MUL
      | DIV
      ;
// Keywords
INHERITS : I N H E R I T S ;
CLASS : C L A S S ;
IF  : I F ;
THEN : T H E N ;
ELSE : E L S E;
FI : F I ;

WHILE : W H I L E ;
LOOP : L O O P ;
POOL : P O O L ;

LET  : L E T ;
IN   : I N ;

CASE : C A S E ;
OF   : O F ;
ESAC : E S A C;

ISVOID : I S V O I D ;

NOT  : N O T ;

NEW  : N E W ;

TRUE : 't' R U E ;
FALSE : 'f' A L S E ;


// primitives
NUM : [0-9]+ ;                                  // there is no float in Cool
LITERAL : '"' ~["\n\r\b\f]* '"';                // any literal constant like "ahmed "
TYPE: [A-Z][_0-9A-Za-z]*;                       // SELFT_TYPE - Int - String - Bool ...etc
ID : [a-zA-Z][_a-zA-Z0-9]*;
ASSIGN_OPERATOR : '<-' ;
CASE_ARROW : '=>' ;
EQUAL : '=' ;
LT : '<' ;
LE : '<=';
PLUS : '+' ;
MINUS : '-' ;
DIV : '/' ;
MUL : '*' ;
TILDE: '~';
WS : (' '  | '\t') -> skip;
NEWLINE : ('\r'? '\n' | '\r')-> skip;
MULTI_LINE_COMMENT : '(*' (MULTI_LINE_COMMENT | .)*? '*)' -> skip ;
LINE_COMMENT: '--' (~ '\n')* '\n'? -> skip ;
LEFT_CURLY : '{' ;
RIGHT_CURLY : '}' ;
LEFT_PRANSIS : '(' ;
RIGHT_PRANSIS : ')' ;
LEFT_SQUARE : '[';
RIGHT_SQUARE: ']';
SEMICOLUN : ';';
COLUN : ':' ;
COMMA : ',' ;
DOT : '.';
AT : '@';
ERROR : . ;
fragment A
   : [aA]
   ;
fragment C
   : [cC]
   ;
fragment D
   : [dD]
   ;
fragment E
   : [eE]
   ;
fragment F
   : [fF]
   ;
fragment H
   : [hH]
   ;
fragment I
   : [iI]
   ;
fragment L
   : [lL]
   ;
fragment N
   : [nN]
   ;
fragment O
   : [oO]
   ;
fragment P
   : [pP]
   ;
fragment R
   : [rR]
   ;
fragment S
   : [sS]
   ;
fragment T
   : [tT]
   ;
fragment U
   : [uU]
   ;
fragment V
   : [vV]
   ;
fragment W
   : [wW]
   ;