class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();

       for(int i = 0;i<tokens.length;i++){
        if(tokens[i].equals("+")){
            int value1 = stack.pop();
            int value2 = stack.pop();
            int ans = value1 + value2;
            stack.push(ans);
        }else if(tokens[i].equals("*")){
            int value1 = stack.pop();
            int value2 = stack.pop();
            int ans = value1 * value2;
            stack.push(ans);
        }else if(tokens[i].equals("-")){
            int value1 = stack.pop();
            int value2 = stack.pop();
            int ans = value2 - value1;
            stack.push(ans);
        }else if(tokens[i].equals("/")){
            int value1 = stack.pop();
            int value2 = stack.pop();
            int ans = value2 / value1;
            stack.push(ans);
        }else{
            int value = Integer.parseInt(tokens[i]);
            stack.push(value);
        }
       } 

       return stack.pop();
    }
}
