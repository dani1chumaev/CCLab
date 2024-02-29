grammar MyGrammar;
program: BEGIN (decl | stmt) (SEMICOLON (decl | stmt))* END;
// описание
decl: DIM idt (COMMA idt)* var_type;
//тип переменных
var_type: (INT | FLOAT | BOOL);
// оператор
stmt: (stmt_let | stmt_input | stmt_output | stmt_if | stmt_for | stmt_while);
stmt_let: (LET)? idt EQ expr;
stmt_if: IF expr THEN stmt (ELSE stmt)? END_ELSE;
stmt_for: FOR LPAR expr SEMICOLON expr SEMICOLON expr RPAR stmt;
stmt_while: DO WHILE expr stmt LOOP;
stmt_input: INPUT LPAR idt (idt)* RPAR;
stmt_output: OUTPUT LPAR expr (expr)* RPAR;
// EXPR
expr: LPAR expr RPAR #par_expr
| unary_op expr #unary_expr
| expr mul_op expr #mul_expr
| expr add_op expr #add_expr
| expr rel_op expr #rel_expr
| bool_value #bool_expr
| idt #idt_expr
| number #number_expr;
BOOL_VALUE: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';
idt: ID;
// VALUES
number: int_number| real_number;
int_number: INT_NUMBER;
real_number: REAL_NUMBER;
bool_value: BOOL_VALUE;
// OPERATIONS
rel_op: NE | EQ | LT | LE | GT | GE;
add_op: ADD | SUB | OR;
mul_op: MUL | DIV | AND;
unary_op: NOT;
// LEXER
// KEYWORDS
BEGIN: 'begin';
END: 'end';
LET: 'let';
IF: 'if';
THEN: 'then';
ELSE: 'else';
END_ELSE: 'end_else';
FOR: 'for';
DO: 'do';
WHILE: 'while';
LOOP: 'loop';
INPUT: 'input';
OUTPUT: 'output';
DIM: 'dim';
INT: '%';
FLOAT: '!';
BOOL: '$';
// OPERATIONS
// REL
NE : '<>' ;
EQ : '=' ;
LT : '<' ;
LE : '<=' ;
GT : '>' ;
GE : '>=' ;
// ADD
ADD : '+' ;
SUB : '-' ;
OR : 'or' ;
// MUL
MUL: '*';
DIV: '/';
AND: 'and';
// UNARY
NOT: 'not';
ID: LETTER (LETTER | DIGIT)*;
// CHARS
LETTER: [a-zA-Z];
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
DOT: '.';
LPAR: '(';
RPAR: ')';
LBR: '{';
RBR: '}';
// VALUES
REAL_NUMBER: DIGIT+ EXP | (DIGIT+)? DOT DIGIT+ EXP?;
EXP: EXP_LETTER (ADD | SUB)? DIGIT+;
INT_NUMBER: HEX_NUMBER | OCT_NUMBER | DEX_NUMBER | HEX_NUMBER;
BIN_NUMBER: BIN_DIGIT+ BIN_LETTER;
OCT_NUMBER: OCT_DIGIT+ OCT_LETTER;
DEX_NUMBER: DIGIT+ DEX_LETTER?;
HEX_NUMBER: DIGIT HEX_DIGIT* HEX_LETTER;
DIGIT: [0-9];
fragment BIN_DIGIT: [0-1];
fragment OCT_DIGIT: [0-7];
fragment HEX_DIGIT: [a-fA-F] | DIGIT;
fragment BIN_LETTER: ('B' | 'b');
fragment OCT_LETTER: ('O' | 'o');
fragment HEX_LETTER: ('H' | 'h');
fragment DEX_LETTER: ('D' | 'd');
fragment EXP_LETTER: ('E' | 'e');
// SKIP
WS: [ \r\n\t]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
