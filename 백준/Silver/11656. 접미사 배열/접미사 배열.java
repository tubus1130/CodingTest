import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String temp = sc.next();
		
		String[] arr = new String[temp.length()];
		
		for(int i=0; i<temp.length(); i++) {
			arr[i] = temp.substring(i);
		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}