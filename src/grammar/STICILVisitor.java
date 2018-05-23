package grammar;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.antlr.v4.runtime.misc.NotNull;

import grammar.STParser.Case_SelectionContext;
import grammar.STParser.StmtContext;

public class STICILVisitor extends STBaseVisitor {
	int indentNums = 0;
	BufferedOutputStream bos = null;
	public STICILVisitor() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File("outputICIL/TankControler.il"));
			bos = new BufferedOutputStream(fos);
			try {
				bos.write("Program() = \n".getBytes());
				bos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String visitST_LT_prog(@NotNull STParser.ST_LT_progContext ctx) {
		StringBuilder ST_LT_prog_ICIL = new StringBuilder();
		ST_LT_prog_ICIL.append(visit(ctx.prog_Decl(0)).toString());
		return ST_LT_prog_ICIL.toString();
	}
	
	public String visitProg_Decl(@NotNull STParser.Prog_DeclContext ctx) {
		StringBuilder Prog_Decl_ICIL = new StringBuilder();
		Prog_Decl_ICIL.append(visit(ctx.fB_Body()).toString());
		return Prog_Decl_ICIL.toString();
	}
	
	public String visitFB_Body(@NotNull STParser.FB_BodyContext ctx) { 
		String FB_Body_ICIL = "";
		try {
			FB_Body_ICIL = visit(ctx.stmt_List()).toString();
			bos.write(FB_Body_ICIL.getBytes());
			bos.flush();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return FB_Body_ICIL.toString();
	}
	
	public String visitStmt_List(@NotNull STParser.Stmt_ListContext ctx) {
		StringBuilder stmt_List_ICIL = new StringBuilder();
		for(StmtContext stc : ctx.stmt()) {
			stmt_List_ICIL.append(visit(stc).toString());
		}
		return stmt_List_ICIL.toString();
    }
	
	public String visitStmt(@NotNull STParser.StmtContext ctx) {
		StringBuilder stmt_ICIL = new StringBuilder();
		if(ctx.selection_Stmt()!=null) {
			stmt_ICIL.append(visit(ctx.selection_Stmt()).toString());
		}
		else if(ctx.assign_Stmt()!=null) {
			stmt_ICIL.append(visit(ctx.assign_Stmt()).toString());
		}
		return stmt_ICIL.toString();
		}
	
	public String visitSelection_Stmt(@NotNull STParser.Selection_StmtContext ctx) { 
		StringBuilder selection_Stmt_ICIL = new StringBuilder();
		if(ctx.iF_Stmt()!=null) {
			selection_Stmt_ICIL.append(visit(ctx.iF_Stmt()).toString());
		}
		else if(ctx.case_Stmt()!=null) {
			selection_Stmt_ICIL.append(visit(ctx.case_Stmt()).toString());
		}
		return selection_Stmt_ICIL.toString();
	}
	
	public String visitCase_Stmt(@NotNull STParser.Case_StmtContext ctx) { 
		StringBuilder selection_Stmt_ICIL = new StringBuilder();
		String caseExp = ctx.expression().getText();
		String caseValue = "";
		int i = 0;
		for(Case_SelectionContext csc : ctx.case_Selection()) {
			selection_Stmt_ICIL.append(repeatStr(" ", this.indentNums));
			caseValue = csc.case_List().getText();
			if(i==0) {
				selection_Stmt_ICIL.append("if(" + caseExp + " == " + caseValue + "){ \n");
			}
			else if(i==ctx.case_Selection().size()-1) {
				selection_Stmt_ICIL.append("else{ \n");
			}
			else {
				selection_Stmt_ICIL.append("else if(" + caseExp + " == " + caseValue + "){ \n");
			}
			
			this.indentNums += 4;
			selection_Stmt_ICIL.append(visit(csc.stmt_List()).toString());
			this.indentNums -= 4;
			selection_Stmt_ICIL.append(repeatStr(" ", this.indentNums) + "} \n");
			i++;
		}
		return selection_Stmt_ICIL.toString();
	}
	
	public String visitIF_Stmt(@NotNull STParser.IF_StmtContext ctx) {
		StringBuilder if_Stmt_ICIL= new StringBuilder("");

		int i = 0;
		int c = ctx.getChildCount();
		int i_stmtList = 0;
		String ifExp = "";
		String thenStmtList = "";
		String elsifExp = "";
		String elsifThenStmtList = "";
		String elseStmtList = "";
		while(i<c) {
			// if
			if(ctx.getChild(i).getText().equals("IF")) {
				i++;
				ifExp = ctx.getChild(i).getText();
				if_Stmt_ICIL.append((repeatStr(" ", this.indentNums) + "if(" + ifExp + "){ \n"));
				this.indentNums += 4; // enter if
				i++;
				if(ctx.getChild(i).getText().equals("THEN")) {
					i++;
					thenStmtList = visit(ctx.stmt_List(i_stmtList)).toString();
					i_stmtList++;
					if_Stmt_ICIL.append(thenStmtList);
					this.indentNums -= 4; // exit if
					if_Stmt_ICIL.append(( repeatStr(" ", this.indentNums) + "} \n"));
					i++;
				}
			}
			// else if
			else if(ctx.getChild(i).getText().equals("ELSIF")) {
				i++;
				elsifExp = ctx.getChild(i).getText();
				if_Stmt_ICIL.append(repeatStr(" ", this.indentNums) + "else if(" + elsifExp + "){ \n");
				this.indentNums += 4; // enter if
				i++;
				if(ctx.getChild(i).getText().equals("THEN")) {
					i++;
					elsifThenStmtList = visit(ctx.stmt_List(i_stmtList)).toString();
					i_stmtList++;
					if_Stmt_ICIL.append(elsifThenStmtList);
					this.indentNums -= 4; // exit if
					if_Stmt_ICIL.append(( repeatStr(" ", this.indentNums) + "} \n"));
					i++;
				}
			}
			// else
			else if(ctx.getChild(i).getText().equals("ELSE")) {
				if_Stmt_ICIL.append((repeatStr(" ", this.indentNums) + "else{ \n"));
				this.indentNums += 4; // enter else
				i++;
				elseStmtList = visit(ctx.stmt_List(i_stmtList)).toString();
				i_stmtList++;
				if_Stmt_ICIL.append(elseStmtList);
				this.indentNums -= 4; // exit else
				if_Stmt_ICIL.append(( repeatStr(" ", this.indentNums) + "} \n"));
				i++;
			}
			// end if
			else if(ctx.getChild(i).getText().equals("END_IF")) {
				break;
			}
		} 

		return if_Stmt_ICIL.toString();
		}
	
	public String visitAssign_Stmt(@NotNull STParser.Assign_StmtContext ctx) {
		StringBuilder assign_Stmt_ICIL = new StringBuilder();
		assign_Stmt_ICIL.append(repeatStr(" ", this.indentNums));
		assign_Stmt_ICIL.append(ctx.getChild(0).getText());
		assign_Stmt_ICIL.append(" = ");
		assign_Stmt_ICIL.append(ctx.getChild(2).getText());
		assign_Stmt_ICIL.append("; \n");
		return assign_Stmt_ICIL.toString();
	}
	
	public String repeatStr(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(str);
		}
		return sb.toString();
	}
}
