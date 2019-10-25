package August2018;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LSS {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        String str = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int k = str.indexOf(c);
            if(k > -1){
                str = str.substring(k + 1);
            }
            str += c;
            if(str.length() > max_len){
                max_len = str.length();
            }
        }
        return max_len;
    }
}