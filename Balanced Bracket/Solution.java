class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i = 0; i < s.length(); i++) {

            Character c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            } else {
                if(stack.empty()){
                    return false;
                }else {
                    Character p=stack.pop();
                    if(c==')' && p=='('){
                        continue;
                    } else if(c=='}' && p=='{'){
                        continue;
                    } else if(c==']' && p=='['){
                        continue;
                    } else{
                        return false;
                    }
                }
            }

        }
        if(stack.empty())
            return true;

        return false;
    }
}