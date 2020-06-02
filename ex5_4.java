package ktp_task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5_4 {

/**возвращает произведение цифр числа */
static int Multy_fig(int x) {
		int res = 1;
		while (x!=0) {
			res = res * (x%10);
			x = x/10;
		}
		return res;
	}
/** принимает числа и возвращает произведение цифр, пока ответ 
 * не станет длинной в одну цифру */ 

static int sumDigProd (ArrayList<Integer> numbers) {
	int x = 0;
	for(int i = 0; i< numbers.size(); i++) {
		x = x + numbers.get(i);
	}
	while (x>9) {
		x = Multy_fig(x);
	}
	return x;
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter numbers");
		String str = in.nextLine();
		in.close();
		String [] sym = str.split(" ");
		ArrayList<Integer> nums = new ArrayList<Integer>();	
		for (int i = 0; i< sym.length; i++) {
			nums.add(Integer.parseInt(sym[i]));
		}
		System.out.println(sumDigProd(nums));
	}

}
