package ktp_task5;

import java.util.Scanner;

public class ex5_3 {
	/**�������, ������������, ����� �� ����� ���� ��������� */
static boolean canComplete (String word, String line) {
	StringBuilder n_word = new StringBuilder(word);
	StringBuilder n_line = new StringBuilder(line);
	for (int i = 0; i < word.length();i++) {
		//����������� i-� ������ �����
		String s = String.valueOf(n_word.charAt(i));
		//������ ����������� �� �������
		if (line.contains(s)) {
			//������ ��������� �� ������, ����� �������� ����������
			n_line.deleteCharAt(n_line.indexOf(s));
			//������������ ������ �������������� (��-�� �������� ������� ������ �������) 
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
