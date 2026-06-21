class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0;i<strs.length;i++){
            String value = strs[i];
            int[] frq = new int[26];
            List<String> output = new ArrayList<>();
            for(int j = 0;j<value.length();j++){
                frq[value.charAt(j) - 'a']++;
            }

            String freq = Arrays.toString(frq);

            if(map.containsKey(freq)){
                List<String> value1 = map.get(freq);
                value1.add(strs[i]);
                map.put(freq, value1);
            }else{
                output.add(strs[i]);
                map.put(freq , output);
            }
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}
