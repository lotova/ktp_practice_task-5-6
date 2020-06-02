package ktp_task5;

import java.util.Scanner;

public class ex5_3 {
	/**функци€, определ€юща€, может ли слово быть завершено */
static boolean canComplete (String word, String line) {
	StringBuilder n_word = new StringBuilder(word);
	StringBuilder n_line = new StringBuilder(line);
	for (int i = 0; i < word.length();i++) {
		//извлекаетс€ i-й символ слова
		String s = String.valueOf(n_word.charAt(i));
		//символ провер€етс€ на наличие
		if (line.contains(s)) {
			//символ удал€етс€ из строки, чтобы избежать повторений
			n_line.deleteCharAt(n_line.indexOf(s));
			//оригинальна€ строка переписываетс€ (из-за нужности методов разных классов) 
			line = n_line.toString();
		}
		else return false;
	}
	return true;
}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter word and line");
		System.out.println(canComplete(in.nextLine(),in.nextLine()));
		in.close();
	}

}
