class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    ArrayList<Integer> output = new ArrayList<>();
                    if(nums[i] + nums[j] + nums[k] == 0){
                        output.add(nums[i]);
                        output.add(nums[j]);
                        output.add(nums[k]);
                        Collections.sort(output);
                        if(!ans.contains(output)){
                            ans.add(output);
                        }
                    }
                }
            }
        }

        return ans;
    }
}
