/***************************/
/* FILE NAME: LEX_FILE.lex */
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
%class Lexer

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
    private Symbol symbol(int type, String name)               {System.out.printf("%d:%s\n",yyline, name); return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol(int type, Object value,String name) {System.out.printf("%d:%s(%s)\n",yyline, name ,yytext());return new Symbol(type, yyline, yycolumn, value);}

%}

/***********************/
/* MACRO DECALARATIONS */
/***********************/
LineTerminator	= \r|\n|\r\n
WhiteSpace		= {LineTerminator} | [ \t\f]
INTEGER			= 0 | [1-9][0-9]*
   
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
   
"+"					{ return symbol(CUP_FILESym.PLUS, "PLUS");}
"-"					{ return symbol(CUP_FILESym.MINUS, "MINUS");}
"*"					{ return symbol(CUP_FILESym.TIMES, "TIMES");}
"/"					{ return symbol(CUP_FILESym.DIVIDE, "DIVIDE");}
"("					{ return symbol(CUP_FILESym.LPAREN, "LPAREN");}
")"					{ return symbol(CUP_FILESym.RPAREN, "RPAREN");}
{INTEGER}			{return symbol(CUP_FILESym.NUMBER, new Integer(yytext()),"NUMBER");}   
{WhiteSpace}		{ /* just skip what was found, do nothing */ }
}
