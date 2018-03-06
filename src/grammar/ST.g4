grammar ST;
sT_LT_prog : (prog_Decl | fB_Decl | func_Decl | data_Type_Decl | config_Decl ) *;

//???????
derived_Type_Access : single_Elem_Type_Access | array_Type_Access | struct_Type_Access
                    | string_Type_Access | class_Type_Access | ref_Type_Access | interface_Type_Access;
class_Type_Access: ( namespace_Name '.' )* class_Type_Name;
class_Type_Name : Identifier;

string_Type_Access  : ( namespace_Name '.' )* string_Type_Name;
string_Type_Name  : 'STRING' ( '[' Unsigned_Int ']' )? | 'WSTRING' ( '[' Unsigned_Int ']' )? | 'CHAR' | 'WCHAR';

single_Elem_Type_Access : simple_Type_Access | subrange_Type_Access | enum_Type_Access;
simple_Type_Access : ( namespace_Name '.' )* simple_Type_Name;
subrange_Type_Access  : ( namespace_Name '.' )* subrange_Type_Name;
enum_Type_Access  : ( namespace_Name '.' )* enum_Type_Name;
array_Type_Access  : ( namespace_Name '.' )* array_Type_Name;
struct_Type_Access  : ( namespace_Name '.' )* struct_Type_Name;
namespace_Name:Identifier;
simple_Type_Name  : Identifier;
subrange_Type_Name : Identifier;
enum_Type_Name  : Identifier;
array_Type_Name  : Identifier;
struct_Type_Name  : Identifier;

data_Type_Decl  : 'TYPE' ( type_Decl ';' )+ 'END_TYPE'; //??
type_Decl  : simple_Type_Decl | subrange_Type_Decl | enum_Type_Decl
| array_Type_Decl | struct_Type_Decl
| str_Type_Decl | ref_Type_Decl;
ref_Type_Decl  : ref_Type_Name ':' ref_Spec_Init;
ref_Type_Name  : Identifier;
ref_Spec_Init  : ref_Spec ( ':=' ref_Value )?;
ref_Spec  : 'REF_TO' + data_Type_Access;
data_Type_Access  : elem_Type_Name | derived_Type_Access;

elem_Type_Name  : numeric_Type_Name | bit_Str_Type_Name
| string_Type_Name | date_Type_Name | time_Type_Name;
numeric_Type_Name : int_Type_Name | real_Type_Name;
bit_Str_Type_Name  : bool_Type_Name | multibits_Type_Name;
bool_Type_Name  : 'BOOL';

simple_Type_Decl  : simple_Type_Name ':' simple_Spec_Init;
simple_Spec_Init  : simple_Spec ( ':=' constant_Expr )?;
simple_Spec  : elem_Type_Name | simple_Type_Access;
subrange_Type_Decl : subrange_Type_Name ':' subrange_Spec_Init;
subrange_Spec_Init  : subrange_Spec ( ':=' Signed_Int )?;
subrange_Spec  : int_Type_Name '(' subrange ')' | subrange_Type_Access;
enum_Type_Decl  : enum_Type_Name ':' ( ( elem_Type_Name ? named_Spec_Init ) | enum_Spec_Init );
named_Spec_Init  : '(' enum_Value_Spec ( ',' enum_Value_Spec )* ')' ( ':=' enum_Value )?;
enum_Spec_Init  : ( ( '(' Identifier ( ',' Identifier )* ')' ) | enum_Type_Access ) ( ':=' enum_Value )?;
enum_Value_Spec  : Identifier ( ':=' ( int_Literal | constant_Expr ) )?;
array_Type_Decl  : array_Type_Name ':' array_Spec_Init;
array_Spec_Init  : array_Spec ( ':=' array_Init )?;
array_Spec  : array_Type_Access | 'ARRAY' '[' subrange ( ',' subrange )* ']' 'OF' data_Type_Access;
array_Init  : '[' array_Elem_Init ( ',' array_Elem_Init )* ']';
array_Elem_Init  : array_Elem_Init_Value | Unsigned_Int '(' array_Elem_Init_Value ? ')';
array_Elem_Init_Value : constant_Expr | enum_Value | struct_Init | array_Init;
struct_Type_Decl  : struct_Type_Name ':' struct_Spec;
struct_Spec  : struct_Decl | struct_Spec_Init;
struct_Spec_Init  : struct_Type_Access ( ':=' struct_Init )?;
struct_Decl  :'STRUCT' 'OVERLAP' ? ( struct_Elem_Decl ';' )+ 'END_STRUCT';
struct_Elem_Decl  : struct_Elem_Name ( located_At multibit_Part_Access ? )? ':'
( simple_Spec_Init | subrange_Spec_Init | enum_Spec_Init | array_Spec_Init
| struct_Spec_Init );
located_At  : 'AT' direct_Variable;
struct_Elem_Name  : Identifier;
struct_Init  : '(' struct_Elem_Init ( ',' struct_Elem_Init )* ')';
struct_Elem_Init  : struct_Elem_Name ':=' ( constant_Expr | enum_Value | array_Init | struct_Init | ref_Value );
str_Type_Decl  : string_Type_Name ':' string_Type_Name ( ':=' char_Str )?;


//???????
subscript_List  : '[' subscript ( ',' subscript )* ']';
input_Decls  : 'VAR_INPUT' ( 'RETAIN' | 'NON_RETAIN' )? ( input_Decl ';' )* 'END_VAR';
input_Decl  : var_Decl_Init | edge_Decl | array_Conform_Decl;
edge_Decl  : variable_List ':' 'BOOL' ( 'R_EDGE' | 'F_EDGE' );
var_Decl_Init  : variable_List ':' ( simple_Spec_Init | str_Var_Decl | ref_Spec_Init )
| array_Var_Decl_Init | struct_Var_Decl_Init | fB_Decl_Init | interface_Spec_Init;
interface_Spec_Init  : variable_List ( ':=' interface_Value )?;
interface_Value  : symbolic_Variable | fB_Instance_Name | class_Instance_Name | 'NULL';
class_Name  : Identifier;
class_Instance_Name : ( namespace_Name '.' )* class_Name '^' *;

ref_Var_Decl  : variable_List ':' ref_Spec;
interface_Var_Decl  : variable_List ':' interface_Type_Access;
interface_Type_Access : ( namespace_Name '.' )* interface_Type_Name;
interface_Type_Name : Identifier;

variable_List  : variable_Name ( ',' variable_Name )*;
array_Var_Decl_Init  : variable_List ':' array_Spec_Init;
array_Conformand  : 'ARRAY' '[' '*' ( ',' '*' )* ']' 'OF' data_Type_Access;
array_Conform_Decl  : variable_List ':' array_Conformand;
struct_Var_Decl_Init  : variable_List ':' struct_Spec_Init;
fB_Decl_No_Init  : fB_Name ( ',' fB_Name )* ':' fB_Type_Access;
fB_Decl_Init  : fB_Decl_No_Init ( ':=' struct_Init )?;
fB_Name  : Identifier;
output_Decls  : 'VAR_OUTPUT' ( 'RETAIN' | 'NON_RETAIN' )? ( output_Decl ';' )* 'END_VAR';
output_Decl  : var_Decl_Init | array_Conform_Decl;
in_Out_Decls  : 'VAR_IN_OUT' ( in_Out_Var_Decl ';' )* 'END_VAR';
in_Out_Var_Decl  : var_Decl | array_Conform_Decl | fB_Decl_No_Init;
var_Decl  : variable_List ':' ( simple_Spec | str_Var_Decl | array_Var_Decl | struct_Var_Decl );
array_Var_Decl : variable_List ':' array_Spec;
struct_Var_Decl  : variable_List ':' struct_Type_Access;
var_Decls  : 'VAR' 'CONSTANT' ? access_Spec ? ( var_Decl_Init ';' )* 'END_VAR';
retain_Var_Decls  : 'VAR' 'RETAIN' access_Spec ? ( var_Decl_Init ';' )* 'END_VAR';
access_Spec  : 'PUBLIC' | 'PROTECTED' | 'PRIVATE' | 'INTERNAL';
loc_Var_Decls  : 'VAR' ( 'CONSTANT' | 'RETAIN' | 'NON_RETAIN' )? ( loc_Var_Decl ';' )* 'END_VAR';
loc_Var_Decl  : variable_Name ? located_At ':' loc_Var_Spec_Init;
temp_Var_Decls  : 'VAR_TEMP' ( ( var_Decl | ref_Var_Decl | interface_Var_Decl ) ';' )* 'END_VAR';
external_Var_Decls  : 'VAR_EXTERNAL' 'CONSTANT' ? ( external_Decl ';' )* 'END_VAR';
external_Decl  : global_Var_Name ':'
( simple_Spec | array_Spec | struct_Type_Access | fB_Type_Access | ref_Type_Access );
fB_Type_Access  : ( namespace_Name '.' )* fB_Type_Name;
fB_Type_Name:std_FB_Name | derived_FB_Name;

std_FB_Name  : 'SR' | 'RS' | 'R_TRIG' | 'F_TRIG' | 'CTU'| 'CTD' | 'CTUD' | 'TP' | 'TON' | 'TOF';
// liste incomplète
derived_FB_Name  : Identifier;

ref_Type_Access  : ( namespace_Name '.' )* ref_Type_Name;

global_Var_Name  : Identifier;
global_Var_Decls  : 'VAR_GLOBAL' ( 'CONSTANT' | 'RETAIN' )? ( global_Var_Decl ';' )* 'END_VAR';
global_Var_Decl  : global_Var_Spec ':' ( loc_Var_Spec_Init | fB_Type_Access );
global_Var_Spec  : ( global_Var_Name ( ',' global_Var_Name )* ) | ( global_Var_Name located_At );
loc_Var_Spec_Init  : simple_Spec_Init | array_Spec_Init | struct_Spec_Init | s_Byte_Str_Spec | d_Byte_Str_Spec;
str_Var_Decl  : s_Byte_Str_Var_Decl | d_Byte_Str_Var_Decl;
s_Byte_Str_Var_Decl : variable_List ':' s_Byte_Str_Spec;
s_Byte_Str_Spec  : 'STRING' ( '[' Unsigned_Int ']' )? ( ':=' S_Byte_Char_Str )?;
d_Byte_Str_Var_Decl : variable_List ':' d_Byte_Str_Spec;
d_Byte_Str_Spec  : 'WSTRING' ( '[' Unsigned_Int ']' )? ( ':=' D_Byte_Char_Str )?;
loc_Partly_Var_Decl  : 'VAR' ( 'RETAIN' | 'NON_RETAIN' )? loc_Partly_Var * 'END_VAR';
loc_Partly_Var  : variable_Name 'AT' '%' ( 'I' | 'Q' | 'M' ) '*' ':' var_Spec ';';
var_Spec  : simple_Spec | array_Spec | struct_Type_Access
| ( 'STRING' | 'WSTRING' ) ( '[' Unsigned_Int ']' )?;

//????????????????
config_Name  : Identifier;
resource_Type_Name : Identifier;
config_Decl  : 'CONFIGURATION' config_Name global_Var_Decls ?
( single_Resource_Decl | resource_Decl + ) access_Decls ? config_Init ?
'END_CONFIGURATION';
resource_Decl  : 'RESOURCE' resource_Name 'ON' resource_Type_Name
global_Var_Decls ? single_Resource_Decl
'END_RESOURCE';
single_Resource_Decl : ( task_Config ';' )* ( prog_Config ';' )+;
resource_Name  : Identifier;
access_Decls  : 'VAR_ACCESS' ( access_Decl ';' )* 'END_VAR';
access_Decl  : access_Name ':' access_Path ':' data_Type_Access access_Direction ?;
access_Path  : ( resource_Name '.' )? direct_Variable
| ( resource_Name '.' )? ( prog_Name '.' )?
( ( fB_Instance_Name | class_Instance_Name ) '.' )* symbolic_Variable;
global_Var_Access  : ( resource_Name '.' )? global_Var_Name ( '.' struct_Elem_Name )?;
access_Name  : Identifier;
prog_Output_Access  : prog_Name '.' symbolic_Variable;
prog_Name  : Identifier;
access_Direction  : 'READ_WRITE' | 'READ_ONLY';
task_Config  : 'TASK' task_Name task_Init;
task_Name  : Identifier;
task_Init  : '(' ( 'SINGLE' ':=' data_Source ',' )?
( 'INTERVAL' ':=' data_Source ',' )?
'PRIORITY' ':=' Unsigned_Int ')';
data_Source  : constant | global_Var_Access | prog_Output_Access | direct_Variable;
prog_Config  : 'PROGRAM' ( 'RETAIN' | 'NON_RETAIN' )? prog_Name ( 'WITH' task_Name )? ':'prog_Type_Access ( '(' prog_Conf_Elems ')' )?;
prog_Type_Name  : Identifier;
prog_Type_Access  : ( namespace_Name '.' )* prog_Type_Name;
prog_Conf_Elems  : prog_Conf_Elem ( ',' prog_Conf_Elem )*;
prog_Conf_Elem  : fB_Task | prog_Cnxn;
fB_Task  : fB_Instance_Name 'WITH' task_Name;
prog_Cnxn  : symbolic_Variable ':=' prog_Data_Source | symbolic_Variable '=>' data_Sink;
prog_Data_Source  : constant | enum_Value | global_Var_Access | direct_Variable;
data_Sink  : global_Var_Access | direct_Variable;
config_Init  : 'VAR_CONFIG' ( config_Inst_Init ';' )* 'END_VAR';
config_Inst_Init  : resource_Name '.' prog_Name '.' ( ( fB_Instance_Name | class_Instance_Name ) '.' )*
( variable_Name located_At ? ':' loc_Var_Spec_Init
| ( ( fB_Instance_Name ':' fB_Type_Access )
| ( class_Instance_Name ':' class_Type_Access ) ) ':=' struct_Init );

//?????
derived_Func_Name: Identifier;
func_Decl  : 'FUNCTION' derived_Func_Name ( ':' data_Type_Access )? using_Directive *
( iO_Var_Decls | func_Var_Decls | temp_Var_Decls )* func_Body 'END_FUNCTION';
using_Directive  : 'USING' namespace_H_Name ( ',' namespace_H_Name )* ';';
namespace_H_Name: namespace_Name ( '.' namespace_Name )*;
iO_Var_Decls  : input_Decls | output_Decls | in_Out_Decls;
func_Var_Decls  : external_Var_Decls | var_Decls;
func_Body  :  stmt_List| instruction_List ;


//IL
instruction_List: iL_Instruction +;
iL_Instruction  : ( iL_Label ':' )? ( iL_Simple_Operation | iL_Expr | iL_Jump_Operation
| iL_Invocation | iL_Formal_Func_Call
| iL_Return_Operator ) ;
iL_Simple_Inst  : iL_Simple_Operation | iL_Expr | iL_Formal_Func_Call;
iL_Label  : Identifier;
iL_Simple_Operation  : iL_Simple_Operator iL_Operand ? | func_Access iL_Operand_List ?;
iL_Expr  : iL_Expr_Operator '(' iL_Operand ?  iL_Simple_Inst_List ? ')';
iL_Jump_Operation  : iL_Jump_Operator iL_Label;
iL_Invocation  : iL_Call_Operator ((( fB_Instance_Name | func_Name | method_Name | 'THIS '
| ( ( 'THIS' '.' ( ( fB_Instance_Name | class_Instance_Name ) '.' )* ) method_Name ) )
( '(' ( (  iL_Param_List ? ) | iL_Operand_List ? ) ')' )? ) | 'SUPER' '(' ')' );
iL_Formal_Func_Call : func_Access '('  iL_Param_List ? ')';
iL_Operand  : constant | enum_Value | variable_Access;
iL_Operand_List  : iL_Operand ( ',' iL_Operand )*;
iL_Simple_Inst_List  : iL_Simple_Instruction +;
iL_Simple_Instruction : ( iL_Simple_Operation | iL_Expr | iL_Formal_Func_Call ) ;
iL_Param_List  : iL_Param_Inst * iL_Param_Last_Inst;
iL_Param_Inst  : ( iL_Param_Assign | iL_Param_Out_Assign ) ',' ;
iL_Param_Last_Inst  : ( iL_Param_Assign | iL_Param_Out_Assign ) ;
iL_Param_Assign  : iL_Assignment ( iL_Operand | ( '('  iL_Simple_Inst_List ')' ) );
iL_Param_Out_Assign : iL_Assign_Out_Operator variable_Access;
iL_Simple_Operator  : 'LD' | 'LDN' | 'ST' | 'STN' | 'ST?' | 'NOT' | 'S' | 'R'
| 'S1' | 'R1' | 'CLK' | 'CU' | 'CD' | 'PV'
| 'IN' | 'PT' | iL_Expr_Operator;
iL_Expr_Operator  : 'AND' | '&' | 'OR' | 'XOR' | 'ANDN' | '&N' | 'ORN'
| 'XORN' | 'ADD' | 'SUB' | 'MUL' | 'DIV'
| 'MOD' | 'GT' | 'GE' | 'EQ' | 'LT' | 'LE' | 'NE';
iL_Assignment  : variable_Name ':=';
iL_Assign_Out_Operator  : 'NOT' ? variable_Name '=>';
iL_Call_Operator  : 'CAL' | 'CALC' | 'CALCN';
iL_Return_Operator  : 'RT' | 'RETC' | 'RETCN';
iL_Jump_Operator  : 'JMP' | 'JMPC' | 'JMPCN';

//?????
interface_Name_List  : interface_Type_Access ( ',' interface_Type_Access )*;
fB_Decl  : 'FUNCTION_BLOCK' ( 'FINAL' | 'ABSTRACT' )? derived_FB_Name using_Directive *
( 'EXTENDS' ( fB_Type_Access | class_Type_Access ) )?
( 'IMPLEMENTS' interface_Name_List )?
( fB_IO_Var_Decls | func_Var_Decls | temp_Var_Decls | other_Var_Decls )*
( method_Decl )* fB_Body ? 'END_FUNCTION_BLOCK';
fB_IO_Var_Decls  : fB_Input_Decls | fB_Output_Decls | in_Out_Decls;
fB_Input_Decls  : 'VAR_INPUT' ( 'RETAIN' | 'NON_RETAIN' )? ( fB_Input_Decl ';' )* 'END_VAR';
fB_Input_Decl  : var_Decl_Init | edge_Decl | array_Conform_Decl;
fB_Output_Decls  : 'VAR_OUTPUT' ( 'RETAIN' | 'NON_RETAIN' )? ( fB_Output_Decl ';' )* 'END_VAR';
fB_Output_Decl  : var_Decl_Init | array_Conform_Decl;
other_Var_Decls  : retain_Var_Decls | no_Retain_Var_Decls | loc_Partly_Var_Decl;
no_Retain_Var_Decls : 'VAR' 'NON_RETAIN' access_Spec ? ( var_Decl_Init ';' )* 'END_VAR';
fB_Body  :  //instruction_List | 
            stmt_List ;
method_Decl  : 'METHOD' access_Spec ( 'FINAL' | 'ABSTRACT' )? 'OVERRIDE' ?
method_Name ( ':' data_Type_Access )?
( iO_Var_Decls | func_Var_Decls | temp_Var_Decls )* func_Body 'END_METHOD';

//?????
prog_Decl  : 'PROGRAM' prog_Type_Name
( iO_Var_Decls | func_Var_Decls | temp_Var_Decls | other_Var_Decls
| loc_Var_Decls | prog_Access_Decls )* fB_Body 'END_PROGRAM';
prog_Access_Decls  : 'VAR_ACCESS' ( prog_Access_Decl ';' )* 'END_VAR';
prog_Access_Decl  : access_Name ':' symbolic_Variable multibit_Part_Access ?
':' data_Type_Access access_Direction ?;



expression  : xor_Expr ( 'OR' xor_Expr )*;
constant_Expr  : expression;
// a constant expression must evaluate to a constant value at compile time
xor_Expr  : and_Expr ( 'XOR' and_Expr )*;
and_Expr  : compare_Expr ( ( '&' | 'AND' ) compare_Expr )*;
compare_Expr  : ( equ_Expr ( ( '=' | '<>' ) equ_Expr )* );
equ_Expr  : add_Expr ( ( '<' | '>' | '<=' | '>=' ) add_Expr )*;
add_Expr  : term ( ( '+' | '-' ) term )*;
term  : power_Expr ( ('*' | '/' | 'MOD') power_Expr )*;
power_Expr  : unary_Expr ( '**' unary_Expr )*;
unary_Expr  : '-' | '+' | 'NOT' ? primary_Expr;
primary_Expr  : constant | variable_Access | enum_Value | func_Call | ref_Value| '(' expression ')';

enum_Value  : (  Identifier '#' )? Identifier;
ref_Value  : ref_Addr | 'NULL';
ref_Addr  : 'REF' '(' ( symbolic_Variable | fB_Instance_Name) ')';

symbolic_Variable  : ( ( 'THIS' '.' ) | ( Identifier '.' )+ )? ( var_Access | multi_Elem_Var );
var_Access  : Identifier|ref_Deref;
ref_Deref  : Identifier '^' +;
multi_Elem_Var  : var_Access ( subscriptList | struct_Variable )+;
subscriptList  : '[' subscript ( ',' subscript )* ']';
subscript  : expression;
struct_Variable  : '.' struct_Elem_Select;
struct_Elem_Select : var_Access;

fB_Instance_Name  : ( Identifier '.' )* Identifier '^' *;

variable_Access  : variable multibit_Part_Access ?;

variable : direct_Variable| symbolic_Variable;

func_Call  : func_Access '(' ( param_Assign ( ',' param_Assign )* )? ')';

func_Access: ( Identifier '.' )* func_Name;
func_Name  : std_Func_Name | Identifier;
std_Func_Name  : 'TRUNC' | 'ABS' | 'SQRT' | 'LN' | 'LOG' | 'EXP'
| 'SIN' | 'COS' | 'TAN' | 'ASIN' | 'ACOS' | 'ATAN' | 'ATAN2 '
| 'ADD' | 'SUB' | 'MUL' | 'DIV' | 'MOD' | 'EXPT' | 'MOVE '
| 'SHL' | 'SHR' | 'ROL' | 'ROR'
| 'AND' | 'OR' | 'XOR' | 'NOT'
| 'SEL' | 'MAX' | 'MIN' | 'LIMIT' | 'MUX '
| 'GT' | 'GE' | 'EQ' | 'LE' | 'LT' | 'NE'
| 'LEN' | 'LEFT' | 'RIGHT' | 'MID' | 'CONCAT' | 'INSERT' | 'DELETE' | 'REPLACE' | 'FIND';
// incomplete list

stmt_List  : ( stmt ? ';')*;
stmt  : assign_Stmt | subprog_Ctrl_Stmt | selection_Stmt | iteration_Stmt;
assign_Stmt  : ( variable ':=' expression ) | ref_Assign | assignment_Attempt;

ref_Assign  : Identifier ':=' ( Identifier | ref_Deref | ref_Value );

assignment_Attempt  : ( ref_Name | ref_Deref ) '?=' ( ref_Name | ref_Deref | ref_Value );

ref_Name:Identifier;

invocation  : ( fB_Instance_Name | method_Name | 'THIS'
| ( ( 'THIS' '.' )? ( ( ( fB_Instance_Name) '.' )+ ) method_Name ) )
'(' ( param_Assign ( ',' param_Assign )* )? ')';

method_Name:  Identifier;

subprog_Ctrl_Stmt  : func_Call | invocation | 'SUPER' '(' ')' | 'RETURN';
param_Assign  : ( ( variable_Name ':=' )? expression ) | ref_Assign | ( 'NOT' ? variable_Name '=>' variable );

variable_Name: Identifier;

selection_Stmt  : iF_Stmt | case_Stmt;
iF_Stmt  : 'IF' expression 'THEN' stmt_List ( 'ELSIF' expression 'THEN' stmt_List )* ( 'ELSE' stmt_List )?
'END_IF';
case_Stmt  : 'CASE' expression 'OF' case_Selection + ( 'ELSE' stmt_List )? 'END_CASE';
case_Selection  : case_List ':' stmt_List;
case_List  : case_List_Elem ( ',' case_List_Elem )*;

case_List_Elem  : subrange | constant_Expr;
subrange:constant_Expr '..' constant_Expr;

iteration_Stmt  : for_Stmt | while_Stmt | repeat_Stmt | 'EXIT' | 'CONTINUE';
for_Stmt  : 'FOR' control_Variable ':=' for_List 'DO' stmt_List 'END_FOR';
control_Variable  : Identifier;
for_List  : expression 'TO' expression ( 'BY' expression )?;
while_Stmt  : 'WHILE' expression 'DO' stmt_List 'END_WHILE';
repeat_Stmt  : 'REPEAT' stmt_List 'UNTIL' expression 'END_REPEAT';


constant  : numeric_Literal | char_Literal | time_Literal | bit_Str_Literal | bool_Literal;
numeric_Literal  : int_Literal | real_Literal;
int_Literal  : ( int_Type_Name'#' )? ( Signed_Int | Binary_Int | Octal_Int | Hex_Int );
int_Type_Name  : sign_Int_Type_Name | unsign_Int_Type_Name;
sign_Int_Type_Name : 'SINT' | 'INT' | 'DINT' | 'LINT';
unsign_Int_Type_Name : 'USINT' | 'UINT' | 'UDINT' | 'ULINT';
char_Literal  : ( 'STRING#' )? char_Str;
char_Str  : S_Byte_Char_Str | D_Byte_Char_Str;

time_Literal  : duration | time_Of_Day | date | date_And_Time;
duration  : ( time_Type_Name | 'T' | 'LT' ) '#' ( '+' | '-' )? interval;
fix_Point  : Unsigned_Int ( '.' Unsigned_Int )?;
interval  : days | hours | minutes | seconds | milliseconds | microseconds | nanoseconds;
days  : ( fix_Point 'd' ) | ( Unsigned_Int 'd' '_' ? ) hours ?;
hours  : ( fix_Point 'h' ) | ( Unsigned_Int 'h' '_' ? ) minutes ?;
minutes  : ( fix_Point 'm' ) | ( Unsigned_Int 'm' '_' ? ) seconds ?;
seconds  : ( fix_Point 's' ) | ( Unsigned_Int 's' '_' ? ) milliseconds ?;
milliseconds  : ( fix_Point 'ms' ) | ( Unsigned_Int 'ms' '_' ? ) microseconds ?;
microseconds  : ( fix_Point 'us' ) | ( Unsigned_Int 'us' '_' ? ) nanoseconds ?;
nanoseconds  : fix_Point 'ns';

time_Of_Day  : ( tod_Type_Name | 'LTIME_OF_DAY' ) '#' daytime;
daytime  : day_Hour ':' day_Minute ':' day_Second;
day_Hour  : Unsigned_Int;
day_Minute  : Unsigned_Int;
day_Second  : fix_Point;
date  : ( date_Type_Name | 'D' | 'LD' ) '#' date_Literal;
date_Literal  : year=Unsigned_Int '-' month=Unsigned_Int '-' day=Unsigned_Int;
date_And_Time  : ( dT_Type_Name | 'LDATE_AND_TIME' ) '#' date_Literal '-' daytime;

time_Type_Name  : 'TIME' | 'LTIME';
date_Type_Name  : 'DATE' | 'LDATE';
tod_Type_Name  : 'TIME_OF_DAY' | 'TOD' | 'LTOD';
dT_Type_Name  : 'DATE_AND_TIME' | 'DT' | 'LDT';

bit_Str_Literal  : ( multibits_Type_Name '#' )? ( Unsigned_Int | Binary_Int | Octal_Int | Hex_Int );
multibits_Type_Name : 'BYTE' | 'WORD' | 'DWORD' | 'LWORD';
bool_Literal  : ( 'BOOL' '#' )? (Unsigned_Int | 'FALSE' | 'TRUE' );

real_Literal  : ( real_Type_Name '#' )? Signed_Int '.' Unsigned_Int ( 'E' Signed_Int )?;
real_Type_Name  : 'REAL' | 'LREAL';

direct_Variable  : '%' ( 'I' | 'Q' | 'M' ) ( 'X' | 'B' | 'W' | 'D' | 'L' )? Unsigned_Int ( '.' Unsigned_Int )*;

multibit_Part_Access  : '.' ( Unsigned_Int | '%' ( 'X' | 'B' | 'W' | 'D' | 'L' ) ? Unsigned_Int );
eOL  : '\n'; 
Unsigned_Int  : Digit ( '_' ? Digit )*;
Signed_Int  : ( '+' | '-' )? Unsigned_Int;
Binary_Int  : '2#' ( '_' ? Bit )+;
Octal_Int  : '8#' ( '_' ? Octal_Digit )+;
Hex_Int  : '16#' ( '_' ? Hex_Digit )+;
fragment
Letter  : [a-zA-Z];
fragment
Digit  : '0'..'9';
fragment
Bit  : '0'..'1';
fragment
Octal_Digit  : '0'..'7';
fragment
Hex_Digit  : '0'..'9' | 'A'..'F';

Identifier  : (Letter|'_')( '_'|Letter | Digit )*;

S_Byte_Char_Str  : '\'' S_Byte_Char_Value + '\'';
D_Byte_Char_Str  : '"' D_Byte_Char_Value + '"';
fragment
S_Byte_Char_Value  : Common_Char_Value | '$\'' | '"' | '$' Hex_Digit Hex_Digit;
fragment
D_Byte_Char_Value  : Common_Char_Value | '\'' | '$"' | '$' Hex_Digit Hex_Digit Hex_Digit Hex_Digit;
fragment
Common_Char_Value : ' ' | '!' | '#' | '%' | '&' | '('..'/' | '0'..'9' | ':'..'@' | Letter | '['..'`' | 'a'..'z' | '{'..'~'
| '$$' | '$L' | '$N' | '$P' | '$R' | '$T';

COMMENT
    :   '/*' ( . )*? '*/' -> channel (HIDDEN)
    ;   
LINE_COMMENT: '//' ~('\n'|'\r')* '\r'? '\n' -> channel (HIDDEN) ;   
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
