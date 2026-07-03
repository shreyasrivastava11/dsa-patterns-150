class MinStack {
    int[] stack;
    int i = -1;
    public MinStack() {
        stack = new int[10000000];
    }
    
    public void push(int val) {
        i+=1;
        stack[i] = val;
    }
    
    public void pop() {
        i-=1;
    }
    
    public int top() {
        return stack[i];
    }
    
    public int getMin() {
        int min = stack[0];
        //T(C) - O(n)
        for(int j = 0;j<=i;j++){
            if(min > stack[j]){
                min = stack[j];
            }
        }

        return min;
    }
}
