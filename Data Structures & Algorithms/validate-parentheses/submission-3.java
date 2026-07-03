class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

       for(int i = 0;i<s.length();i++){
        if(s.charAt(i) == '('){
            stack.push('(');
        }else if(s.charAt(i) == '['){
            stack.push('[');
        }else if(s.charAt(i) == '{'){
            stack.push('{');
        }else if(stack.isEmpty()){
            return false;
        }else if(!stack.isEmpty() && s.charAt(i) == ')'){
            char value = stack.pop();
            if(value != '('){
                return false;
            }
        }else if(!stack.isEmpty() && s.charAt(i) == ']'){
            char value = stack.pop();
            if(value != '['){
                return false;
            }
        }else if(!stack.isEmpty() && s.charAt(i) == '}'){
            char value = stack.pop();
            if(value != '{'){
                return false;
            }
        }
       }

       if(!stack.isEmpty()){
        return false;
       }

       return true;
    }
}
