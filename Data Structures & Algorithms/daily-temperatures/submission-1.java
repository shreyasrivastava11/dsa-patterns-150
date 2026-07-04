class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int cnt;

        for(int i = 0;i<temperatures.length;i++){
            cnt = 1;
            for(int j = i+1;j<temperatures.length;j++){
                if(temperatures[i] < temperatures[j]){
                    result[i] = cnt;
                    break;
                }else {
                    cnt+=1;
                }
            }
        }

        return result;
    }
}
