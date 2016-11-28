/*
  This example comes from a short article series in the Linux 
  Gazette by Richard A. Sevenich and Christopher Lopes, titled
  "Compiler Construction Tools". The article series starts at

  http://www.linuxgazette.com/issue39/sevenich.html

  Small changes and updates to newest JFlex+Cup versions 
  by Gerwin Klein
*/

/*
  Commented By: Christopher Lopes
  File Name: Main.java
  To Create: 
  After the scanner, lcalc.flex, and the parser, ycalc.cup, have been created.
  > javac Main.java
  
  To Run: 
  > java Main test.txt
  where test.txt is an test input file for the calculator.
*/
   
import java.io.*;
import java_cup.runtime.Symbol;
   
public class Main {
  static public void main(String argv[]) throws IOException {    
	  FileWriter writer = new FileWriter(new File(argv[2]));
      try
    { 
      MatrixLexer matrixLexer = new MatrixLexer(new FileReader(argv[0]));
      MatrixCup matrixParser = new MatrixCup(matrixLexer);
      Matrix mat = (Matrix) matrixParser.parse().value;
      
      OperationLexer operationLexer = new OperationLexer(new FileReader(argv[1]));
      OperationsCup operationsParser = new OperationsCup(operationLexer, mat);
      
      operationsParser.parse();
      
      writer.write(mat.toString());
      writer.close();
      
      } catch (Throwable e) {
    	  writer.write(e.getMessage());
    } finally {
		writer.close();
	}
  }
}


