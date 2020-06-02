package ktp_task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5_1 {

	/**функция, возвращающая символьный код каждой буквы*/
static ArrayList<Integer> encrypt (String str){
	StringBuilder simbols = new StringBuilder(str);
	ArrayList<Integer> result = new ArrayList<Integer>();
	result.add((int) simbols.charAt(0));
	
	for (int i = 1; i<simbols.length(); i++) {
		result.add(((int)simbols.charAt(i))- (int)simbols.charAt(i-1));
	}
	return result;	
}

/**функция, получающая представление строки из ее символьного кода */
static String decrypt (ArrayList<Integer> code) {
	StringBuilder result = new StringBuilder();
	result.append(Character.toChars(code.get(0)));
	for (int i = 1; i < code.size(); i++) {
		 code.set(i, code.get(i-1) + code.get(i));
		 result.append(Character.toChars(code.get(i)));
	}
	return result.toString();
}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter string for encrypt");
		System.out.println(encrypt(in.nextLine()));
		System.out.println("enter array by line for decrypt");
		String str = in.nextLine();
		in.close();
		ArrayList<Integer> code = new ArrayList<Integer> ();
		String [] sym = str.split(" ");
		for (int i = 0; i< sym.length; i++) {
			code.add(Integer.parseInt(sym[i]));
		}
		System.out.println(decrypt(code));
	}

}
