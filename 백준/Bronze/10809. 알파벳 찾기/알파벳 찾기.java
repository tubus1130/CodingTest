import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int[] alphabet = new int[26];
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		for(int i=0; i<S.length(); i++) {
			if(alphabet[S.charAt(i)-97] == -1) {
				alphabet[S.charAt(i)-97] = i;
			}
		}
		
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}