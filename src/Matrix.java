/* The following code was generated by JFlex 1.4.3 on 11/22/16 6:18 PM */

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
      

class Matrix implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\55\1\15"+
    "\2\0\1\60\1\47\1\0\1\21\1\22\1\5\1\17\1\36\1\20"+
    "\1\42\1\4\1\6\3\11\6\7\1\0\1\63\1\57\1\23\1\46"+
    "\2\0\21\12\1\10\10\12\1\50\1\16\1\61\1\0\1\13\1\0"+
    "\1\30\1\24\1\34\1\44\1\27\1\45\1\52\1\53\1\40\1\14"+
    "\1\33\1\26\1\14\1\31\1\25\2\14\1\32\1\35\1\37\1\41"+
    "\1\64\1\54\1\43\2\14\1\51\1\56\1\62\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\2\5\2\6\1\7"+
    "\1\1\1\10\1\11\1\12\1\13\1\14\7\7\1\15"+
    "\2\7\1\16\1\7\1\17\1\1\1\20\1\21\1\7"+
    "\1\22\1\1\1\23\1\24\1\25\1\26\1\27\1\7"+
    "\1\2\1\0\1\30\1\0\1\31\1\0\1\32\16\7"+
    "\1\33\1\7\1\34\1\35\1\7\1\36\1\37\1\40"+
    "\1\7\1\0\5\7\1\41\10\7\1\42\2\7\1\43"+
    "\1\7\1\2\3\7\1\44\1\7\1\45\5\7\1\46"+
    "\1\47\2\7\1\50\1\7\1\51\4\7\1\52\2\7"+
    "\1\53\1\54\1\7\1\55\1\7\1\56\1\7\1\57"+
    "\1\60\1\61\1\62\1\7\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\65\0\237\0\65\0\65\0\324"+
    "\0\u0109\0\u013e\0\u0173\0\u01a8\0\65\0\65\0\65\0\65"+
    "\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b\0\u0350"+
    "\0\65\0\u0385\0\u03ba\0\65\0\u03ef\0\u0424\0\u0459\0\65"+
    "\0\65\0\u048e\0\u04c3\0\u04f8\0\u052d\0\65\0\65\0\65"+
    "\0\65\0\u0562\0\u0597\0\u05cc\0\u013e\0\u01a8\0\65\0\u0601"+
    "\0\65\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774"+
    "\0\u07a9\0\u07de\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7\0\u0173"+
    "\0\u091c\0\65\0\65\0\u0951\0\65\0\65\0\u0986\0\u09bb"+
    "\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0173\0\u0b2e"+
    "\0\u0b63\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0173"+
    "\0\u0cd6\0\u0d0b\0\65\0\u0d40\0\u05cc\0\u0d75\0\u0daa\0\u0ddf"+
    "\0\u0173\0\u0e14\0\u0173\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d"+
    "\0\u0173\0\u0173\0\u0f52\0\u0f87\0\u0173\0\u0fbc\0\u0173\0\u0ff1"+
    "\0\u1026\0\u105b\0\u1090\0\u0173\0\u10c5\0\u10fa\0\u0173\0\u0173"+
    "\0\u112f\0\u0173\0\u1164\0\u0173\0\u1199\0\u0173\0\u0173\0\u0173"+
    "\0\u0173\0\u11ce\0\u0173";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\10\1\12\1\2\1\13\1\14\1\2\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\13\1\23\1\24\1\13"+
    "\1\25\1\26\1\13\1\27\1\30\1\31\1\32\1\33"+
    "\1\13\1\34\2\13\1\35\1\36\1\37\1\40\1\41"+
    "\2\13\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\67\0\1\4\66\0\1\53\1\54\65\0"+
    "\2\10\1\0\1\10\61\0\3\12\1\55\3\12\7\0"+
    "\12\12\1\0\3\12\1\0\3\12\4\0\3\12\7\0"+
    "\1\12\6\0\7\12\7\0\12\12\1\0\3\12\1\0"+
    "\3\12\4\0\3\12\7\0\1\12\6\0\7\13\7\0"+
    "\12\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\15\56\1\57\1\60\46\56\23\0\1\61\47\0"+
    "\7\13\7\0\1\13\1\62\4\13\1\63\3\13\1\0"+
    "\3\13\1\0\3\13\4\0\3\13\7\0\1\13\6\0"+
    "\7\13\7\0\3\13\1\64\6\13\1\0\3\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\2\13\1\65\7\13\1\0\3\13\1\0\1\66\2\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\3\13"+
    "\1\67\6\13\1\0\2\13\1\70\1\0\3\13\4\0"+
    "\3\13\7\0\1\13\6\0\7\13\7\0\3\13\1\71"+
    "\6\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\1\13\1\72\1\73\7\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\12\13\1\0\1\74\2\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\6\13\1\75\3\13\1\0\3\13\1\0\3\13\4\0"+
    "\1\13\1\76\1\13\7\0\1\13\6\0\7\13\7\0"+
    "\5\13\1\77\4\13\1\0\3\13\1\0\2\13\1\100"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\4\13"+
    "\1\101\5\13\1\0\3\13\1\0\3\13\4\0\3\13"+
    "\7\0\1\13\23\0\1\102\110\0\1\103\23\0\7\13"+
    "\7\0\12\13\1\0\3\13\1\0\3\13\4\0\1\13"+
    "\1\104\1\13\7\0\1\13\23\0\1\105\117\0\1\106"+
    "\31\0\1\107\47\0\7\13\7\0\1\13\1\110\10\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\2\53\1\0\62\53\5\54\1\111\57\54\2\56\1\0"+
    "\62\56\6\0\7\13\7\0\1\13\1\112\10\13\1\0"+
    "\3\13\1\0\3\13\4\0\3\13\7\0\1\13\6\0"+
    "\7\13\7\0\3\13\1\113\6\13\1\0\3\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\5\13\1\114\4\13\1\0\3\13\1\0\3\13\4\0"+
    "\3\13\7\0\1\13\6\0\7\13\7\0\11\13\1\115"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\12\13\1\0\1\116\2\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\12\13\1\0\3\13\1\0\3\13\4\0\2\13\1\117"+
    "\7\0\1\13\6\0\7\13\7\0\2\13\1\120\7\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\12\13\1\0\1\121\2\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\5\13\1\122\4\13\1\0\3\13\1\0\3\13\4\0"+
    "\3\13\7\0\1\13\6\0\7\13\7\0\4\13\1\123"+
    "\5\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\4\13\1\124\1\13\1\125"+
    "\3\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\12\13\1\0\2\13\1\126"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\12\13\1\0\1\13\1\127\1\13\1\0\3\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\12\13"+
    "\1\0\1\130\2\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\2\13\1\131\7\13\1\0"+
    "\3\13\1\0\3\13\4\0\3\13\7\0\1\13\6\0"+
    "\7\13\7\0\12\13\1\0\1\13\1\132\1\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\46\0\1\133\24\0"+
    "\7\13\7\0\12\13\1\0\1\13\1\134\1\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\4\54\1\135\1\111"+
    "\57\54\6\0\7\13\7\0\2\13\1\136\7\13\1\0"+
    "\3\13\1\0\3\13\4\0\3\13\7\0\1\13\6\0"+
    "\7\13\7\0\4\13\1\137\5\13\1\0\3\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\12\13\1\0\3\13\1\0\3\13\4\0\1\140\2\13"+
    "\7\0\1\13\6\0\7\13\7\0\3\13\1\141\6\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\3\13\1\142\6\13\1\0\3\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\2\13\1\143\7\13\1\0\3\13\1\0\3\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\12\13"+
    "\1\0\2\13\1\144\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\12\13\1\0\1\145\2\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\11\13\1\146\1\0\3\13\1\0\3\13\4\0"+
    "\3\13\7\0\1\13\6\0\7\13\7\0\12\13\1\0"+
    "\1\147\2\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\12\13\1\0\1\13\1\150\1\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\3\13\1\151\6\13\1\0\3\13\1\0\3\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\11\13"+
    "\1\152\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\11\13\1\153\1\0\3\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\2\13\1\154\7\13\1\0\3\13\1\0\3\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\12\13"+
    "\1\0\3\13\1\0\1\13\1\155\1\13\4\0\3\13"+
    "\7\0\1\13\6\0\7\13\7\0\3\13\1\156\6\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\7\13\1\157\2\13\1\0\3\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\12\13\1\0\1\160\2\13\1\0\3\13\4\0"+
    "\3\13\7\0\1\13\6\0\7\13\7\0\5\13\1\161"+
    "\4\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\6\13\1\162\3\13\1\0"+
    "\3\13\1\0\3\13\4\0\3\13\7\0\1\13\6\0"+
    "\7\13\7\0\12\13\1\0\1\13\1\163\1\13\1\0"+
    "\3\13\4\0\3\13\7\0\1\13\6\0\7\13\7\0"+
    "\11\13\1\164\1\0\3\13\1\0\3\13\4\0\3\13"+
    "\7\0\1\13\6\0\7\13\7\0\12\13\1\0\1\13"+
    "\1\165\1\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\5\13\1\166\4\13\1\0\3\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\3\13\1\167\6\13\1\0\3\13\1\0\3\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\3\13"+
    "\1\170\6\13\1\0\3\13\1\0\3\13\4\0\3\13"+
    "\7\0\1\13\6\0\7\13\7\0\4\13\1\171\5\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\12\13\1\0\3\13\1\0\3\13"+
    "\4\0\1\13\1\172\1\13\7\0\1\13\6\0\7\13"+
    "\7\0\12\13\1\0\3\13\1\0\1\13\1\173\1\13"+
    "\4\0\3\13\7\0\1\13\6\0\7\13\7\0\5\13"+
    "\1\174\4\13\1\0\3\13\1\0\3\13\4\0\3\13"+
    "\7\0\1\13\6\0\7\13\7\0\5\13\1\175\4\13"+
    "\1\0\3\13\1\0\3\13\4\0\3\13\7\0\1\13"+
    "\6\0\7\13\7\0\10\13\1\176\1\13\1\0\3\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\12\13\1\0\3\13\1\0\3\13\4\0\1\177"+
    "\2\13\7\0\1\13\6\0\7\13\7\0\5\13\1\200"+
    "\4\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13\6\0\7\13\7\0\11\13\1\201\1\0\3\13"+
    "\1\0\3\13\4\0\3\13\7\0\1\13\6\0\7\13"+
    "\7\0\12\13\1\0\2\13\1\202\1\0\3\13\4\0"+
    "\3\13\7\0\1\13\6\0\7\13\7\0\3\13\1\203"+
    "\6\13\1\0\3\13\1\0\3\13\4\0\3\13\7\0"+
    "\1\13";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4611];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\2\11\5\1\4\11"+
    "\10\1\1\11\2\1\1\11\3\1\2\11\4\1\4\11"+
    "\2\1\1\0\1\1\1\0\1\11\1\0\1\11\20\1"+
    "\2\11\1\1\2\11\2\1\1\0\21\1\1\11\50\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    /*********************************************************************************/ 
    /* Create a new java_cup.runtime.Symbol with information about the current token */
    /*********************************************************************************/
    private Symbol symbol(int type, String name)              {System.out.printf("%d: %s\n",yyline+1, name); return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol(int type, String name, Object value) {System.out.printf("%d: %s(%s)\n",yyline+1, name ,yytext());return new Symbol(type, yyline, yycolumn, value);}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Matrix(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Matrix(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { return symbol(CUP_FILESym.MOD, "MOD");
          }
        case 52: break;
        case 10: 
          { return symbol(CUP_FILESym.LP, "LP");
          }
        case 53: break;
        case 51: 
          { return symbol(CUP_FILESym.CONTINUE, "CONTINUE");
          }
        case 54: break;
        case 28: 
          { return symbol(CUP_FILESym.GTE, "GTE");
          }
        case 55: break;
        case 6: 
          { return symbol(CUP_FILESym.CLASS_ID, "CLASS_ID", yytext());
          }
        case 56: break;
        case 41: 
          { return symbol(CUP_FILESym.BREAK, "BREAK");
          }
        case 57: break;
        case 3: 
          { return symbol(CUP_FILESym.DIVIDE, "DIVIDE");
          }
        case 58: break;
        case 49: 
          { return symbol(CUP_FILESym.BOOLEAN, "BOOLEAN");
          }
        case 59: break;
        case 33: 
          { return symbol(CUP_FILESym.NEW, "NEW");
          }
        case 60: break;
        case 35: 
          { return symbol(CUP_FILESym.SR, "SR");
          }
        case 61: break;
        case 45: 
          { return symbol(CUP_FILESym.LENGTH, "LENGTH");
          }
        case 62: break;
        case 39: 
          { return symbol(CUP_FILESym.THIS, "THIS");
          }
        case 63: break;
        case 16: 
          { return symbol(CUP_FILESym.LB, "LB");
          }
        case 64: break;
        case 2: 
          { /* just skip what was found, do nothing */
          }
        case 65: break;
        case 19: 
          { return symbol(CUP_FILESym.LT, "LT");
          }
        case 66: break;
        case 32: 
          { return symbol(CUP_FILESym.LTE, "LTE");
          }
        case 67: break;
        case 14: 
          { return symbol(CUP_FILESym.DOT, "DOT");
          }
        case 68: break;
        case 8: 
          { return symbol(CUP_FILESym.PLUS, "PLUS");
          }
        case 69: break;
        case 9: 
          { return symbol(CUP_FILESym.MINUS, "MINUS");
          }
        case 70: break;
        case 30: 
          { return symbol(CUP_FILESym.NEQUAL, "NEQUAL");
          }
        case 71: break;
        case 23: 
          { return symbol(CUP_FILESym.SEMI, "SEMI");
          }
        case 72: break;
        case 18: 
          { return symbol(CUP_FILESym.LNEG, "LNEG");
          }
        case 73: break;
        case 29: 
          { return symbol(CUP_FILESym.LAND, "LAND");
          }
        case 74: break;
        case 50: 
          { return symbol(CUP_FILESym.EXTENDS, "EXTENDS");
          }
        case 75: break;
        case 40: 
          { return symbol(CUP_FILESym.VOID, "VOID");
          }
        case 76: break;
        case 34: 
          { return symbol(CUP_FILESym.INT, "INT");
          }
        case 77: break;
        case 26: 
          { return symbol(CUP_FILESym.EQUAL, "EQUAL");
          }
        case 78: break;
        case 37: 
          { return symbol(CUP_FILESym.NULL, "NULL");
          }
        case 79: break;
        case 48: 
          { return symbol(CUP_FILESym.STRING, "STRING");
          }
        case 80: break;
        case 43: 
          { return symbol(CUP_FILESym.FALSE, "FALSE");
          }
        case 81: break;
        case 31: 
          { return symbol(CUP_FILESym.LOR, "LOR");
          }
        case 82: break;
        case 11: 
          { return symbol(CUP_FILESym.RP, "RP");
          }
        case 83: break;
        case 17: 
          { return symbol(CUP_FILESym.LCBR, "LCBR");
          }
        case 84: break;
        case 15: 
          { return symbol(CUP_FILESym.GT, "GT");
          }
        case 85: break;
        case 24: 
          { return symbol(CUP_FILESym.ROW_ID, "ROW_ID", yytext().charAt(1));
          }
        case 86: break;
        case 12: 
          { return symbol(CUP_FILESym.ASSIGN, "ASSIGN");
          }
        case 87: break;
        case 46: 
          { return symbol(CUP_FILESym.RETURN, "RETURN");
          }
        case 88: break;
        case 38: 
          { return symbol(CUP_FILESym.TRUE, "TRUE");
          }
        case 89: break;
        case 7: 
          { return symbol(CUP_FILESym.ID, "ID", yytext());
          }
        case 90: break;
        case 44: 
          { return symbol(CUP_FILESym.WHILE, "WHILE");
          }
        case 91: break;
        case 42: 
          { return symbol(CUP_FILESym.CLASS, "CLASS");
          }
        case 92: break;
        case 27: 
          { return symbol(CUP_FILESym.IF, "IF");
          }
        case 93: break;
        case 47: 
          { return symbol(CUP_FILESym.STATIC, "STATIC");
          }
        case 94: break;
        case 4: 
          { return symbol(CUP_FILESym.MULTIPLY, "MULTIPLY");
          }
        case 95: break;
        case 21: 
          { return symbol(CUP_FILESym.RB, "RB");
          }
        case 96: break;
        case 36: 
          { return symbol(CUP_FILESym.ELSE, "ELSE");
          }
        case 97: break;
        case 25: 
          { return symbol(CUP_FILESym.QUOTE, "QUOTE", yytext());
          }
        case 98: break;
        case 13: 
          { return symbol(CUP_FILESym.COMMA, "COMMA");
          }
        case 99: break;
        case 1: 
          { throw new Error("Unrecognized string in line " + (yyline+1) + ": \"" + yytext() + "\"");
          }
        case 100: break;
        case 5: 
          { return symbol(CUP_FILESym.INTEGER,"INTEGER", new Integer(yytext()));
          }
        case 101: break;
        case 22: 
          { return symbol(CUP_FILESym.RCBR, "RCBR");
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case YYINITIAL: {
              return symbol(CUP_FILESym.EOF, "EOF");
            }
            case 132: break;
            default:
              { return new java_cup.runtime.Symbol(sym.EOF); }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
