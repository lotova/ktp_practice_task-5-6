package ktp_task5;

import java.util.Scanner;

public class ex5_7 {
	    static final String[] BELOW_TENS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    static final String[] BETWEEN_TENS_TWENTY = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
	    "seventeen", "eighteen", "nineteen"};
	    static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	    static final String[] HUNDREDS = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
	                                          "six hundred", "seven hundred", "eight hundred", "nine hundred"};
	 
	    private static String getNumAsString(int num) {
	        StringBuilder stringBuilder = new StringBuilder();
	        if (num < 0) {
	            num *= -1;
	            stringBuilder.append("minus ");
	        }
	        int tmp = num % 1000;
	        if(tmp % 100 == 0) stringBuilder.append(HUNDREDS[tmp/100]);
	        else {
	            if (tmp % 10 != 0)
	                //stringBuilder.append(HUNDREDS[tmp/100]).append(" AND ");
	            	stringBuilder.append(HUNDREDS[tmp/100]);
	            else return stringBuilder.append(TENS[tmp/10]).toString();
	        }
	        tmp = num % 100;
	        if(tmp % 10 == 0) stringBuilder.append(TENS[tmp/10]);
	        else {
	            if(tmp > 10 && tmp < 20) {
	                stringBuilder.append(BETWEEN_TENS_TWENTY[tmp % 10]);
	                return stringBuilder.toString();
	            }
	            else stringBuilder.append(TENS[tmp/10]).append("-");
	        }
	        tmp %= 10;
	        stringBuilder.append(BELOW_TENS[tmp]);
	        return stringBuilder.toString();
	    }

	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("enter number for 0 to 999");	    	
	        System.out.println(getNumAsString(in.nextInt()));
	        in.close();       
	    }
	}

