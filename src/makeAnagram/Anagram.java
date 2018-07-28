package makeAnagram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "fcrxzwscanmligyxyvym";

        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        
//        System.out.println((int)'a' + " " + (int)'z');
//        int[] chars = new int[26];
//        for(int letter : chars)
//        	System.out.print(letter);
//        
        int res = makeAnagram(a, b);
        System.out.println(a + " and " + b + " make " + res);
	}
	static int makeAnagram(String a, String b) {
		int result = 0;
		int[] chars = new int[26];
		for(int i = 0; i < a.length(); i++){
			chars[a.charAt(i) - 97]++;
		}
		for(int i = 0; i < b.length(); i++){
			chars[b.charAt(i) - 97]++;
		}
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
			if(chars[i] > 1 ) {
				result++;
				chars[i]--;
				i--;
				
			}
		}
		return result;
    }
}
