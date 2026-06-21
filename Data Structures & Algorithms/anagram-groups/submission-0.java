class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0;i<strs.length;i++){
            String value = strs[i];
            ArrayList<String> output = new ArrayList<>();
            output.add(value);
            
            if(visited[i]){
                continue;
            }

            for(int j = i+1;j<strs.length;j++){
                if(checkAnagrams(value, strs[j])){
                    visited[j] = true;
                    output.add(strs[j]);
                }
            }
            ans.add(output);
        }  

        return ans; 
    }

    public boolean checkAnagrams(String s1, String s2){
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(arr.length != arr1.length){
            return false;
        }

        int i = 0;
        int j = 0;

        while(i < arr.length && j < arr1.length){
            if(arr[i] != arr1[j]){
                return false;
            }
            i+=1;
            j+=1;
        }
        return true;
    }
}
