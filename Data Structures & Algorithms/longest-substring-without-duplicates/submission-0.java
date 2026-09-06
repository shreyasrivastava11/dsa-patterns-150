class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Variable Size Sliding Window
        int left = 0;
        int max = 0;

        int[] freq = new int[128];
        // 128: ASCII

        for(int right = 0;right<s.length();right++){
            freq[s.charAt(right)]++;

            while(freq[s.charAt(right)] > 1){
                freq[s.charAt(left)]--;
                left+=1;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
