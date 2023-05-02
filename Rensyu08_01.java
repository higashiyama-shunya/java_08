package rensyu08;

import lib.Input;

public class Rensyu08_01 {

	public static void main(String[] args) {
		String text=Input.getString();
		String nul=text==null?null:text; 	//3項演算子:trueなら?の左、falseなら?の右が代入される
		System.out.println("文字列は"+nul);	

	}

}
