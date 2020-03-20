import java.util.Arrays;

class Main {

	private static final int CHAR_ARRAY_SIZE = 256;

	public static void main(String args[]) {
		try {
			/* Printing result of one-to-one character mapping of string1 (i.e. args[0]) to string2 (i.e. args[1])*/
			System.out.println(oneToOneRelationExists(args[0], args[1]));
		} catch (Exception e) {
			System.out.println("Error: The program needs two arguments for comparision");
		}
	}

	private static boolean oneToOneRelationExists(String s1, String s2) {
		/*one to one relation check fails if length of strings don't match*/
		if(s1.length() != s2.length()) {
			return false;
		}

		/*Using integer array map[] to store mapping of every character of s1 to that of s2.*/
		int[] map = new int[CHAR_ARRAY_SIZE];

		/*Initializing the map with value -1*/
		Arrays.fill(map, -1);

		for(int i=0; i < s1.length(); i++) {
			/*If character is encountered for the first time*/
			if(map[s1.charAt(i)] == -1) {
				/*populate the map*/
				map[s1.charAt(i)] = s2.charAt(i);
			}

			/*check if mapping matches*/
			else if(map[s1.charAt(i)] != s2.charAt(i)) {
				return false;				
			}
		}

		return true;
	}

}