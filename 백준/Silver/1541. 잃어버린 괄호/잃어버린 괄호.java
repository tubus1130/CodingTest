import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int result = 0;
		boolean flag = true; // false => - , true => +
		Stack<Integer> stack = new Stack<>();
		int temp = 0;
		int minusTemp = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(flag) {
				if(input.charAt(i) == '-') {
					result += temp;
					temp = 0;
					flag = !flag;
				}else if(input.charAt(i) == '+') {
					result += temp;
					temp = 0;
				}else {
					temp *= 10;
					temp += Integer.parseInt(input.substring(i, i+1));
				}
			}else {
				if(input.charAt(i) == '-') {
					temp += minusTemp;
					minusTemp = 0;
				}else if(input.charAt(i) == '+') {
					temp += minusTemp;
					minusTemp = 0;
				}else {
					minusTemp *= 10;
					minusTemp += Integer.parseInt(input.substring(i, i+1));
				}
			}
		}
		if(!flag) {
			result -= temp;
			result -= minusTemp;
		}else {
			result += temp;
		}
		System.out.println(result);
	}
}