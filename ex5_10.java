package ktp_task5;

import java.util.Scanner;

public class ex5_10 {
	/**функци€, принимающа€ целое число, провер€юща€
	 * насоответствие централизованному шестиугольному числу и выдает иллюстрацию */
	public static String hexLattice(int num) {
        int n = centeredHexNum(num);
        if (n == -1)
            return "Invalid";
        String result = "";
        for (int i = 0; i < n; i++)
        {
           for (int k = 0; k < n - i; k++){
                result += " ";
            }
            for (int j = 0; j < n + i; j++ ) {
                result += "o ";
            }
            result += "\n";
        }

        for (int i = n - 2; i >= 0; i--)   {
            for (int k = 0; k < n - i; k++)
                result += " ";
            for (int j = 0; j < n + i; j++) {
                result += "o ";
            }
            result += "\n";
        }
        return result;
    }
	 private static int centeredHexNum(int num) {
	        int count = 1;
	        int result = count * 3 * (count - 1) + 1;
	        while (result <= num) {
	            if (result == num)
	                return count;
	            else   {
	              count++;
	              result = count * 3 * (count - 1) + 1;
	            }
	        }
	        return -1;
	    }

	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("enter number");
		System.out.println(hexLattice(in.nextInt()));
		in.close();

	}

}
