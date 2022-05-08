package strings;

public class CharInString {

	public static void main(String[] args) {
		String str = "Dee102Pak971";
		str = str.toLowerCase();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = ch - 'a';
			System.out.println("ascii : "+ ascii);
			if(0 <= ascii  && ascii < 26) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
