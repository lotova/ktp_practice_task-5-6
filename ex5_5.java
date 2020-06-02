package ktp_task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5_5 {
/** функци€, получающа€ массив слов из строки */
	static ArrayList<String> getArrayString (String line) {
		ArrayList<String> lines =  new ArrayList<String> ();
		String [] str = line.split(" ");
		for (int i = 0; i< str.length; i++) {
		lines.add(str[i]);
		}
		System.out.println("get: "+ lines);
		return lines;
	}
	
	/**функци€, ищуща€ заданные гласные слова */ 
	static String getVowel (String str, String Vowels) {
		StringBuilder w_Vowel = new StringBuilder();
		for (int i = 0; i< str.length(); i++) {
			if (Vowels.contains(String.valueOf(str.charAt(i)))) {
				if (w_Vowel.indexOf(String.valueOf(str.charAt(i)))== -1) {
			w_Vowel.append(str.charAt(i));
				}
		}
		}
		return w_Vowel.toString();
	}
	
/**функци€, провер€юща€ одинаковые гласные в словах */
	static ArrayList<String> sameVowelGroup (ArrayList<String> words) {
		ArrayList<String> result = new ArrayList<String>();
		//получаем гласные первого слова и помещаем его  в рез. массив
		String first_Vow = getVowel(words.get(0),"eyuioa");
		result.add(words.get(0));
		for (int i = 1; i< words.size(); i++) {
			String word_Vow = getVowel(words.get(i),first_Vow);
			if (word_Vow.equals(first_Vow)){
				result.add(words.get(i));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		System.out.println("enter words by one line");
		String words = in.nextLine();
		in.close();
		
		/**получение массива из полученной строки из консоли*/
		ArrayList<String> lines = new ArrayList<String> (getArrayString(words));
		System.out.println(sameVowelGroup(lines));	
	}

}
