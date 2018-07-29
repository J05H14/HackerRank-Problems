package makeAnagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "fcrxzwscanmligyxyvym";

        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        
//        System.out.println((int)'a' + " " + (int)'z');
//        int[] chars = new int[26];
//        for(int letter : chars)
//        	System.out.print(letter);
        
        int res = makeAnagram("abc", "cde");
        System.out.println(res);
        
        res = makeAnagram(a, b);
        System.out.println(a + " and " + b + " make " + res);
	}
	static int makeAnagram(String a, String b) {
		int result = 0;
		int[] charsA = new int[26];
		int[] charsB = new int[26];
		for(int i = 0; i < a.length(); i++){
			charsA[a.charAt(i) - 'a']++;
		}
		for(int i = 0; i < b.length(); i++){
			charsB[b.charAt(i) - 'a']++;
		}
	    
//	    System.out.println(Arrays.stream(chars).sum());
//		for(int i = 0; i < chars.length; i++) {
//			//if((chars[i] <= 1 || chars[i] % 2 == 1) && chars[i] > 0) {
//				//result++;
//				if(chars[i] % 2 == 1 && chars[i]> 0) {
//					result++;
//					if(chars[i] > 2) {
//						result++;
//				//	}
//				}
//			}
//		}
	    for (int i = 0; i < 26; i++)
            result += Math.abs(charsA[i] -
                               charsB[i]);
		
		//return Arrays.stream(chars).sum() - result;
		return result;
    }
}
