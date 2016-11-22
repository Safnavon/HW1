/***************************/
/* FILE NAME: MatrixLexer.lex */
/***************************/

/***************************/
/* AUTHOR: OREN ISH SHALOM */
/***************************/

/*************/
/* USER CODE */
/*************/
   
import java_cup.runtime.*;

/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/
      
%%
   
/************************************/
/* OPTIONS AND DECLARATIONS SECTION */
/************************************/
   
/*****************************************************/ 
/* Lexer is the name of the class JFlex will create. */
/* The code will be written to the file Lexer.java.  */
/*****************************************************/ 
%class MatrixLexer

/********************************************************************/
/* The current line number can be accessed with the variable yyline */
/* and the current column number with the variable yycolumn.        */
/********************************************************************/
%line
%column
    
/******************************************************************/
/* CUP compatibility mode interfaces with a CUP generated parser. */
/******************************************************************/
%cup
   
/****************/
/* DECLARATIONS */
/****************/
/*****************************************************************************/   
/* Code between %{ and %}, both of which must be at the beginning of a line, */
/* will be copied letter to letter into the Lexer class code.                */
/* Here you declare member variables and functions that are used inside the  */ 
/* scanner actions.                                                          */   
/*****************************************************************************/   
%{   
    /*********************************************************************************/ 
    /* Create a new java_cup.runtime.Symbol with information about the current token */
    /*********************************************************************************/
    private Symbol symbol(int type, String name)              {System.out.printf("%d: %s\n",yyline+1, name); return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol(int type, String name, Object value) {System.out.printf("%d: %s(%s)\n",yyline+1, name ,yytext());return new Symbol(type, yyline, yycolumn, value);}

%}

/***********************/
/* MACRO DECALARATIONS */
/***********************/
LineTerminator	= \r|\n|\r\n
WhiteSpace		= {LineTerminator} | [ \t\f] | \/\*(.|[\r\n])*?\*\/ | \/\/.*
ROW_ID			= [R][1-3]
INTEGER			= [1-9][0-9]*

/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/

%%

/************************************************************/
/* LEXER matches regular expressions to actions (Java code) */
/************************************************************/
   
/**************************************************************/
/* YYINITIAL is the state at which the lexer begins scanning. */
/* So these regular expressions will only be matched if the   */
/* scanner is in the start state YYINITIAL.                   */
/**************************************************************/
   
<YYINITIAL> {

"ROW_ID"					{ return symbol(MatrixSym.ROW_ID, "ROW_ID", new Integer(yytext().charAt(1));}
"+"					{ return symbol(MatrixSym.PLUS, "PLUS");}
"-"					{ return symbol(MatrixSym.MINUS, "MINUS");}
"<="					{ retun symbol(MatrixSym.ASSIGN, "ASSIGN");}
"<=>"					{ retun symbol(MatrixSym.SWAP, "SWAP");}
<<EOF>>					{ return symbol(MatrixSym.EOF, "EOF"); }
{INTEGER}			{return symbol(CUP_FILESym.INTEGER,"INTEGER", new Integer(yytext()));}
{WhiteSpace}		{ /* just skip what was found, do nothing */ }
.|\n       		  	{ throw new Error("Unrecognized string in line " + (yyline+1) + ": \"" + yytext() + "\""); }

}
