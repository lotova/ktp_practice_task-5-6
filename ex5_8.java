package ktp_task5;
import java.security.MessageDigest;
import java.util.Scanner;
public class ex5_8 {

	/**возвращает безопасный хеш SHA-256 для данной строки*/
	 public static String getSha256(String value) {
		    try{
		        MessageDigest md = MessageDigest.getInstance("SHA-256");
		        md.update(value.getBytes());
		        return bytesToHex(md.digest());
		    } catch(Exception ex){
		        throw new RuntimeException(ex);
		    }
		 }
		 private static String bytesToHex(byte[] bytes) {
		    StringBuffer result = new StringBuffer();
		    for (byte b : bytes) result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
		    return result.toString();
		 }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter line");
		System.out.print(getSha256(in.nextLine()));
		in.close();
	}

}
