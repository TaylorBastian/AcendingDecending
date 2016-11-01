import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		String ss[] = { "Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman" };
		
		
		Arrays.sort(ss);
		
		
		System.out.println("Ascending:");
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		
		
		System.out.println("Descending:");
		for (int i = ss.length - 1; i >= 0; i--) {
			System.out.println(ss[i]);
		}

	}

}
