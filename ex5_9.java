package ktp_task5;

import java.util.Arrays;
import java.util.Scanner;

public class ex5_9 {

	/**функция, которая принимает строку и возвращает строку с правильным
регистром для заголовков символов в серии "Игра престолов".
Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь
первый символ в верхнем регистре, а остальные-в Нижнем.  */ 
	
	static String UpperFirstCase(String str) {
		char s = Character.toUpperCase(str.charAt(0));
		return String.valueOf(s)+ str.substring(1);
	}
	
	static String correctGameOfThrones (String line) {

		//служебные слова 
		String[]  def = {"and", "the", "of", "in"};
		String [] words = line.toLowerCase().split(" ");
		StringBuilder result = null;

		for (String x: words) {
			String str;
			
			if (Arrays.asList(def).contains(x)){
				str = x;
			} else {
			   str = UpperFirstCase(x);
			}
			

			if (result == null) {
				result = new StringBuilder(str);
			} else {			
			    result.append(' ').append(str);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("original: " + in.nextLine());
		System.out.println(correctGameOfThrones(in.nextLine()));
		in.close();
	}

}
