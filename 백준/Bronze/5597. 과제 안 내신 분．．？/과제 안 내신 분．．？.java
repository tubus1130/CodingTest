import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[31];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<28; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

}