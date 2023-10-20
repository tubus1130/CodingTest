import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String form = br.readLine();
		
		// A -> cnt[0], Z -> cnt[25], 65차이
		int cnt[] = new int[26];
		for(int i=0; i<N; i++) {
			cnt[i] = Integer.parseInt(br.readLine());
		}
		
		
		Stack<Double> stack = new Stack<>();
		for(int i=0; i<form.length(); i++) {
			int temp = form.charAt(i) - 65;
			if(temp >= 0 && temp <=26) { // A ~ Z라면
				stack.push((double)cnt[temp]);
			}else { // 연산자라면
				double num1 = stack.pop();
				double num2 = stack.pop();
				double result = 0.0;
				switch(form.charAt(i)) {
				case '+':
					result = num2 + num1;
					break;
				case '-':
					result = num2 - num1;
					break;
				case '*':
					result = num2 * num1;
					break;
				case '/':
					result = num2 / num1;
					break;
				}
				stack.push(result);
			}
		}
		System.out.printf("%.2f", stack.pop());
	}
}