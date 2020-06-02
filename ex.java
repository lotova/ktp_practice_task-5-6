package ktp_task5;

import java.util.ArrayList;


public class ex {

	public static void main(String[] args) {
		String x = "derrrek";
		char s = Character.toUpperCase(x.charAt(0));
		x = String.valueOf(s)+ x.substring(1);
		System.out.println(x);
	}

}
