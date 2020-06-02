package ktp_task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5_6 {
	
	static boolean validateCard (String num) {	
		if ((14 >= num.length())||(num.length() >= 19)){
				return false;
			}
		else {
			String [] symbols = num.split("");
			ArrayList<Integer> card = new ArrayList<Integer>();
			//получаем список с цифрами
			for (String x: symbols) {
				card.add(Integer.parseInt(x));
			}		
			if (Loon(card) == true) {
				return true;
			}
			else {
				return false;
			}
		}
		}
	
	
	static boolean Loon (ArrayList<Integer> figures) {
		int control = figures.get(figures.size()-1); //контрольное значение
		System.out.println("control: " + control);
		figures.remove(figures.size()-1);
		ArrayList<Integer> copy = new ArrayList<Integer>(figures);
		for (int i = 0; i < figures.size(); i++) {
			figures.set(i, copy.get(figures.size()-i-1));
		}
		System.out.println ("перевернуто: " + figures);
		for (int i = 0; i< figures.size(); i++) {
			if (i % 2 != 0) {
				int mul = figures.get(i)*2;
				if(mul>=10) {
					mul = mul%10 + mul/10;
				}
				figures.set(i, mul);
			}
		}
		System.out.println ("удвоены нечетные позиции       " + figures);
		int sum_figures= 0;
		for (int x: figures) {
			sum_figures = sum_figures+ x;
		}
		System.out.println ("сумма:  " + sum_figures);
		sum_figures = sum_figures/10;
		System.out.println ("последн€€ цифра: " + sum_figures);
		if (sum_figures == control) {
			System.out.println ("Loon test: true");
			return true;
		}
		else { System.out.println ("Loon test: false");	
		return false;
		}		
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of the card");
		System.out.println(validateCard(in.nextLine()));
		in.close();
		
	}

}
