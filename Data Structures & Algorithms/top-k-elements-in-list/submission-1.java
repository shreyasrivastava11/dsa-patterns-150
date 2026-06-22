class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        int m = 0;
        
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        for(int i = 0;i<list.size();i++){
            if(k != 0){

                ans[m] = list.get(i).getKey();
                m+=1;
                k-=1;
            }
        }

        return ans;
    }
}
