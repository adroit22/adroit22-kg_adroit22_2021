import java.util.Arrays;

class Main {

	private static final int CHAR_ARRAY_SIZE = 256;
	
	public static void main(String args[]) {
		System.out.println(oneToOneRelationExists(args[0], args[1]));
	}

	private static boolean oneToOneRelationExists(String s1, String s2) {

		if(s1.length() != s2.length()) {
			return false;
		}

		int[] map = new int[CHAR_ARRAY_SIZE];
		Arrays.fill(map, -1);

		for(int i=0; i < s1.length(); i++) {
			if(map[s1.charAt(i)] == -1) {
				map[s1.charAt(i)] = s2.charAt(i);
			}

			else if(map[s1.charAt(i)] != s2.charAt(i)) {
				return false;				
			}
		}

		return true;
	}

}