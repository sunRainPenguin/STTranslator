// Generated from ST.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link STParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface STVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Output_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Output_Decls(@NotNull STParser.FB_Output_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#date_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_Literal(@NotNull STParser.Date_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Decl(@NotNull STParser.Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#loc_Partly_Var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_Partly_Var(@NotNull STParser.Loc_Partly_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_IO_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_IO_Var_Decls(@NotNull STParser.FB_IO_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Spec_Init(@NotNull STParser.Array_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interface_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Var_Decl(@NotNull STParser.Interface_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#elem_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_Type_Name(@NotNull STParser.Elem_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#resource_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_Decl(@NotNull STParser.Resource_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Decl_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Decl_Init(@NotNull STParser.FB_Decl_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#str_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_Var_Decl(@NotNull STParser.Str_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#d_Byte_Str_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_Byte_Str_Var_Decl(@NotNull STParser.D_Byte_Str_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Instruction(@NotNull STParser.IL_InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#while_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_Stmt(@NotNull STParser.While_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Conform_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Conform_Decl(@NotNull STParser.Array_Conform_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#output_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_Decls(@NotNull STParser.Output_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#enum_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_Spec_Init(@NotNull STParser.Enum_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#time_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_Literal(@NotNull STParser.Time_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#time_Of_Day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_Of_Day(@NotNull STParser.Time_Of_DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_Path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_Path(@NotNull STParser.Access_PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iO_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIO_Var_Decls(@NotNull STParser.IO_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Spec_Init(@NotNull STParser.Struct_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Var_Decl(@NotNull STParser.Array_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subscriptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptList(@NotNull STParser.SubscriptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Body(@NotNull STParser.FB_BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#string_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Type_Access(@NotNull STParser.String_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Simple_Inst_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Simple_Inst_List(@NotNull STParser.IL_Simple_Inst_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#class_Instance_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Instance_Name(@NotNull STParser.Class_Instance_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#task_Config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_Config(@NotNull STParser.Task_ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#func_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Body(@NotNull STParser.Func_BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#xor_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_Expr(@NotNull STParser.Xor_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#char_Str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_Str(@NotNull STParser.Char_StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#daytime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaytime(@NotNull STParser.DaytimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#and_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_Expr(@NotNull STParser.And_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Decl(@NotNull STParser.Struct_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#day_Second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_Second(@NotNull STParser.Day_SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#simple_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_Spec_Init(@NotNull STParser.Simple_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#assign_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_Stmt(@NotNull STParser.Assign_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Var_Decl(@NotNull STParser.Struct_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#global_Var_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_Var_Spec(@NotNull STParser.Global_Var_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#constant_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_Expr(@NotNull STParser.Constant_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#class_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Type_Name(@NotNull STParser.Class_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interface_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Spec_Init(@NotNull STParser.Interface_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull STParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#microseconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMicroseconds(@NotNull STParser.MicrosecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Operand_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Operand_List(@NotNull STParser.IL_Operand_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Name(@NotNull STParser.Ref_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#real_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_Literal(@NotNull STParser.Real_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#data_Sink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_Sink(@NotNull STParser.Data_SinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull STParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#case_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_Stmt(@NotNull STParser.Case_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#s_Byte_Str_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_Byte_Str_Spec(@NotNull STParser.S_Byte_Str_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Param_Last_Inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Param_Last_Inst(@NotNull STParser.IL_Param_Last_InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Assign(@NotNull STParser.Ref_AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#numeric_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_Type_Name(@NotNull STParser.Numeric_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#resource_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_Name(@NotNull STParser.Resource_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Decl(@NotNull STParser.Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#std_FB_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStd_FB_Name(@NotNull STParser.Std_FB_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Type_Access(@NotNull STParser.FB_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Var_Decl_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Var_Decl_Init(@NotNull STParser.Array_Var_Decl_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#days}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDays(@NotNull STParser.DaysContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Decl_No_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Decl_No_Init(@NotNull STParser.FB_Decl_No_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#multi_Elem_Var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_Elem_Var(@NotNull STParser.Multi_Elem_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subprog_Ctrl_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_Ctrl_Stmt(@NotNull STParser.Subprog_Ctrl_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#unary_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_Expr(@NotNull STParser.Unary_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#global_Var_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_Var_Name(@NotNull STParser.Global_Var_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Type_Access(@NotNull STParser.Ref_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Spec(@NotNull STParser.Ref_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#class_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Type_Access(@NotNull STParser.Class_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#input_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_Decl(@NotNull STParser.Input_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#multibit_Part_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultibit_Part_Access(@NotNull STParser.Multibit_Part_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#sT_LT_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitST_LT_prog(@NotNull STParser.ST_LT_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#bool_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_Type_Name(@NotNull STParser.Bool_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Simple_Operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Simple_Operation(@NotNull STParser.IL_Simple_OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Simple_Instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Simple_Instruction(@NotNull STParser.IL_Simple_InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Elem_Init_Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Elem_Init_Value(@NotNull STParser.Array_Elem_Init_ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Invocation(@NotNull STParser.IL_InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_Decl(@NotNull STParser.Access_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Var_Decl_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Var_Decl_Init(@NotNull STParser.Struct_Var_Decl_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interface_Name_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Name_List(@NotNull STParser.Interface_Name_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#enum_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_Type_Access(@NotNull STParser.Enum_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#tod_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTod_Type_Name(@NotNull STParser.Tod_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#other_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_Var_Decls(@NotNull STParser.Other_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iF_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_Stmt(@NotNull STParser.IF_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Conf_Elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Conf_Elem(@NotNull STParser.Prog_Conf_ElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Expr(@NotNull STParser.IL_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Param_Inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Param_Inst(@NotNull STParser.IL_Param_InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#bool_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_Literal(@NotNull STParser.Bool_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#add_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_Expr(@NotNull STParser.Add_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Simple_Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Simple_Operator(@NotNull STParser.IL_Simple_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Label(@NotNull STParser.IL_LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Jump_Operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Jump_Operation(@NotNull STParser.IL_Jump_OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Instance_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Instance_Name(@NotNull STParser.FB_Instance_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interface_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Type_Name(@NotNull STParser.Interface_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Addr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Addr(@NotNull STParser.Ref_AddrContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#case_Selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_Selection(@NotNull STParser.Case_SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_Name(@NotNull STParser.Access_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#str_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_Type_Decl(@NotNull STParser.Str_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Spec(@NotNull STParser.Struct_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#unsign_Int_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsign_Int_Type_Name(@NotNull STParser.Unsign_Int_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#enum_Value_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_Value_Spec(@NotNull STParser.Enum_Value_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Type_Name(@NotNull STParser.Prog_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#stmt_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_List(@NotNull STParser.Stmt_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Variable(@NotNull STParser.Struct_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(@NotNull STParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Assign_Out_Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Assign_Out_Operator(@NotNull STParser.IL_Assign_Out_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Param_Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Param_Assign(@NotNull STParser.IL_Param_AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Task(@NotNull STParser.FB_TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#nanoseconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNanoseconds(@NotNull STParser.NanosecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#namespace_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_Name(@NotNull STParser.Namespace_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#hours}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHours(@NotNull STParser.HoursContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#no_Retain_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_Retain_Var_Decls(@NotNull STParser.No_Retain_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#global_Var_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_Var_Access(@NotNull STParser.Global_Var_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Access_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Access_Decls(@NotNull STParser.Prog_Access_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#for_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_Stmt(@NotNull STParser.For_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#day_Minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_Minute(@NotNull STParser.Day_MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#bit_Str_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_Str_Type_Name(@NotNull STParser.Bit_Str_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_Decl_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Decl_Init(@NotNull STParser.Var_Decl_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Init(@NotNull STParser.Array_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subscript_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_List(@NotNull STParser.Subscript_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#config_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_Init(@NotNull STParser.Config_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#simple_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_Type_Access(@NotNull STParser.Simple_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Assignment(@NotNull STParser.IL_AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Input_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Input_Decls(@NotNull STParser.FB_Input_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#bit_Str_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_Str_Literal(@NotNull STParser.Bit_Str_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#milliseconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMilliseconds(@NotNull STParser.MillisecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Spec(@NotNull STParser.Var_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#control_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_Variable(@NotNull STParser.Control_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#func_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Decl(@NotNull STParser.Func_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#eOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEOL(@NotNull STParser.EOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Type_Name(@NotNull STParser.Struct_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#temp_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_Var_Decls(@NotNull STParser.Temp_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#for_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_List(@NotNull STParser.For_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Elem_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Elem_Init(@NotNull STParser.Struct_Elem_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_List(@NotNull STParser.Variable_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#derived_Func_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_Func_Name(@NotNull STParser.Derived_Func_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#named_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_Spec_Init(@NotNull STParser.Named_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Param_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Param_List(@NotNull STParser.IL_Param_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#external_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_Decl(@NotNull STParser.External_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#seconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeconds(@NotNull STParser.SecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Type_Decl(@NotNull STParser.Array_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#simple_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_Spec(@NotNull STParser.Simple_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Jump_Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Jump_Operator(@NotNull STParser.IL_Jump_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Return_Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Return_Operator(@NotNull STParser.IL_Return_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#retain_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetain_Var_Decls(@NotNull STParser.Retain_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#task_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_Init(@NotNull STParser.Task_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#enum_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_Type_Decl(@NotNull STParser.Enum_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#derived_FB_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_FB_Name(@NotNull STParser.Derived_FB_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#repeat_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_Stmt(@NotNull STParser.Repeat_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_Name(@NotNull STParser.Variable_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#simple_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_Type_Name(@NotNull STParser.Simple_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#func_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Name(@NotNull STParser.Func_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#equ_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu_Expr(@NotNull STParser.Equ_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(@NotNull STParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Type_Name(@NotNull STParser.Array_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Formal_Func_Call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Formal_Func_Call(@NotNull STParser.IL_Formal_Func_CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_Direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_Direction(@NotNull STParser.Access_DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#char_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_Literal(@NotNull STParser.Char_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#in_Out_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_Out_Decls(@NotNull STParser.In_Out_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#int_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Literal(@NotNull STParser.Int_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(@NotNull STParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#data_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_Type_Decl(@NotNull STParser.Data_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Decl(@NotNull STParser.FB_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subrange_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange_Type_Access(@NotNull STParser.Subrange_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#namespace_H_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_H_Name(@NotNull STParser.Namespace_H_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#power_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_Expr(@NotNull STParser.Power_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#derived_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_Type_Access(@NotNull STParser.Derived_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#data_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_Type_Access(@NotNull STParser.Data_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#loc_Partly_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_Partly_Var_Decl(@NotNull STParser.Loc_Partly_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#enum_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_Type_Name(@NotNull STParser.Enum_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#simple_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_Type_Decl(@NotNull STParser.Simple_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#edge_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_Decl(@NotNull STParser.Edge_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Output_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Output_Decl(@NotNull STParser.FB_Output_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Data_Source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Data_Source(@NotNull STParser.Prog_Data_SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#loc_Var_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_Var_Spec_Init(@NotNull STParser.Loc_Var_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#config_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_Decl(@NotNull STParser.Config_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Type_Access(@NotNull STParser.Array_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#s_Byte_Str_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_Byte_Str_Var_Decl(@NotNull STParser.S_Byte_Str_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#case_List_Elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_List_Elem(@NotNull STParser.Case_List_ElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Name(@NotNull STParser.Prog_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Access_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Access_Decl(@NotNull STParser.Prog_Access_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Elem_Select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Elem_Select(@NotNull STParser.Struct_Elem_SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#dT_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDT_Type_Name(@NotNull STParser.DT_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#using_Directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_Directive(@NotNull STParser.Using_DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#global_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_Var_Decl(@NotNull STParser.Global_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#global_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_Var_Decls(@NotNull STParser.Global_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#int_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Type_Name(@NotNull STParser.Int_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iteration_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_Stmt(@NotNull STParser.Iteration_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#config_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_Name(@NotNull STParser.Config_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interface_Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Value(@NotNull STParser.Interface_ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Expr_Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Expr_Operator(@NotNull STParser.IL_Expr_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#single_Resource_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_Resource_Decl(@NotNull STParser.Single_Resource_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#func_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Access(@NotNull STParser.Func_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#date_And_Time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_And_Time(@NotNull STParser.Date_And_TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#func_Call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Call(@NotNull STParser.Func_CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Type_Access(@NotNull STParser.Prog_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#in_Out_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_Out_Var_Decl(@NotNull STParser.In_Out_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_Access(@NotNull STParser.Variable_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Input_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Input_Decl(@NotNull STParser.FB_Input_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#case_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_List(@NotNull STParser.Case_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull STParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Elem_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Elem_Name(@NotNull STParser.Struct_Elem_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Operand(@NotNull STParser.IL_OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull STParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fix_Point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFix_Point(@NotNull STParser.Fix_PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subrange_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange_Spec(@NotNull STParser.Subrange_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#date_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_Type_Name(@NotNull STParser.Date_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Conf_Elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Conf_Elems(@NotNull STParser.Prog_Conf_ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subrange_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange_Spec_Init(@NotNull STParser.Subrange_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_Decls(@NotNull STParser.Access_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#loc_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_Var_Decl(@NotNull STParser.Loc_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#output_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_Decl(@NotNull STParser.Output_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#task_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_Name(@NotNull STParser.Task_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#data_Source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_Source(@NotNull STParser.Data_SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#selection_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_Stmt(@NotNull STParser.Selection_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Access(@NotNull STParser.Var_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#config_Inst_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_Inst_Init(@NotNull STParser.Config_Inst_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#sign_Int_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_Int_Type_Name(@NotNull STParser.Sign_Int_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#single_Elem_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_Elem_Type_Access(@NotNull STParser.Single_Elem_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subrange_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange_Type_Decl(@NotNull STParser.Subrange_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#multibits_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultibits_Type_Name(@NotNull STParser.Multibits_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#resource_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_Type_Name(@NotNull STParser.Resource_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#assignment_Attempt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_Attempt(@NotNull STParser.Assignment_AttemptContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#string_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Type_Name(@NotNull STParser.String_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(@NotNull STParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#input_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_Decls(@NotNull STParser.Input_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#instruction_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_List(@NotNull STParser.Instruction_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#minutes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinutes(@NotNull STParser.MinutesContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Decl(@NotNull STParser.Prog_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#direct_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_Variable(@NotNull STParser.Direct_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Spec(@NotNull STParser.Array_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#loc_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_Var_Decls(@NotNull STParser.Loc_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Cnxn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Cnxn(@NotNull STParser.Prog_CnxnContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#compare_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_Expr(@NotNull STParser.Compare_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Deref(@NotNull STParser.Ref_DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Param_Out_Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Param_Out_Assign(@NotNull STParser.IL_Param_Out_AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#class_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_Name(@NotNull STParser.Class_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#primary_Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_Expr(@NotNull STParser.Primary_ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Value(@NotNull STParser.Ref_ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Decls(@NotNull STParser.Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_Spec(@NotNull STParser.Access_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Elem_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Elem_Decl(@NotNull STParser.Struct_Elem_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#method_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_Decl(@NotNull STParser.Method_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Type_Decl(@NotNull STParser.Ref_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#std_Func_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStd_Func_Name(@NotNull STParser.Std_Func_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#numeric_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_Literal(@NotNull STParser.Numeric_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Output_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Output_Access(@NotNull STParser.Prog_Output_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#symbolic_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolic_Variable(@NotNull STParser.Symbolic_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#located_At}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocated_At(@NotNull STParser.Located_AtContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#param_Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_Assign(@NotNull STParser.Param_AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#enum_Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_Value(@NotNull STParser.Enum_ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Type_Access(@NotNull STParser.Struct_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Spec_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Spec_Init(@NotNull STParser.Ref_Spec_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#day_Hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_Hour(@NotNull STParser.Day_HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#time_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_Type_Name(@NotNull STParser.Time_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#func_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Var_Decls(@NotNull STParser.Func_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#interface_Type_Access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Type_Access(@NotNull STParser.Interface_Type_AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Name(@NotNull STParser.FB_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Elem_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Elem_Init(@NotNull STParser.Array_Elem_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#real_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_Type_Name(@NotNull STParser.Real_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#fB_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFB_Type_Name(@NotNull STParser.FB_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Type_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Type_Decl(@NotNull STParser.Struct_Type_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Type_Name(@NotNull STParser.Ref_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#struct_Init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_Init(@NotNull STParser.Struct_InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#d_Byte_Str_Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_Byte_Str_Spec(@NotNull STParser.D_Byte_Str_SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#method_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_Name(@NotNull STParser.Method_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_Conformand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Conformand(@NotNull STParser.Array_ConformandContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#external_Var_Decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_Var_Decls(@NotNull STParser.External_Var_DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Call_Operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Call_Operator(@NotNull STParser.IL_Call_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#ref_Var_Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_Var_Decl(@NotNull STParser.Ref_Var_DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange(@NotNull STParser.SubrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#subrange_Type_Name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange_Type_Name(@NotNull STParser.Subrange_Type_NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull STParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#iL_Simple_Inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIL_Simple_Inst(@NotNull STParser.IL_Simple_InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#prog_Config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_Config(@NotNull STParser.Prog_ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull STParser.StmtContext ctx);
}