class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<st.length();i++){
            if(s.size()==0){
                s.push(st.charAt(i));
            }
            else if(st.charAt(i)=='('){
                s.push(st.charAt(i));
            }
            else if(st.charAt(i)=='{'){
                s.push(st.charAt(i));
            }
            else if(st.charAt(i)=='['){
                s.push(st.charAt(i));
            }
            else if(st.charAt(i)==')'){
                if(s.peek()=='('){
                    s.pop();
                }
                else{
                    return false;
                }
            }
            else if(st.charAt(i)=='}'){
                if(s.peek()=='{'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
            else if(st.charAt(i)==']'){
                if(s.peek()=='['){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}