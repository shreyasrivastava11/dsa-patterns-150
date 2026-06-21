class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0;i<strs.length;i++){
            String value = strs[i];
            char[] arr = value.toCharArray();
            Arrays.sort(arr);

            String sort = new String(arr);
            List<String> output = new ArrayList<>();

            if(map.containsKey(sort)){
                output = map.get(sort);
                output.add(value);
                map.put(sort, output);
            }else{
                output.add(value);
                map.put(sort, output);
            }
        } 

        for(Map.Entry<String, List<String>> fetch : map.entrySet()){
            ans.add(fetch.getValue());
        }

        return ans;  
    }
}
