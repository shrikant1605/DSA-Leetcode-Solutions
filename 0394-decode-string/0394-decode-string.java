class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String current = "";
        int num = 0;
        
        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                num = num * 10 + (ch - '0');
            }
            else if(ch == '['){
                strStack.push(current);
                numStack.push(num);
                current = "";
                num = 0;
            }
            else if(ch == ']'){
                int repeatCount = numStack.pop();
                String prevStr = strStack.pop();
                String temp = "";
                for(int i = 0; i < repeatCount; i++){
                    temp += current;
                }
                current = prevStr + temp;
            }
            else{
                current += ch;
            }
        }
        
        return current;
    }
}