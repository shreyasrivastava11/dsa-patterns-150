class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] result = new int[temperatures.length];

        for(int i = 1;i<temperatures.length;i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int top = stack.peek();
                if(temperatures[i] > temperatures[top]){
                    result[top] = i - top;
                    stack.pop();
                }
            }
            stack.push(i);
        }

        return result;
    }
}
