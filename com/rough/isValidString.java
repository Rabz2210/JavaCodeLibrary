package com.rough;

import java.util.Stack;

public class isValidString {
    public static void main(String[] args) {
        String s = "[]()){";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if(s.length()==0||s.length()==1 ||s.charAt(0)=='}'||s.charAt(0)==']'||s.charAt(0)==')')return false;
        Stack<Character> st = new Stack<>();
        int length = s.length();
        for(int i=0;i<length;i++){
            char tmp = s.charAt(i);
            if(tmp=='{' || tmp=='('||tmp=='[')st.push(tmp);
            else if(st.size()>0 && tmp=='}' && st.peek()=='{')st.pop();
            else if(st.size()>0 && tmp=='}' && st.peek()=='{')st.pop();
            else if(st.size()>0 && tmp=='}' && st.peek()=='{')st.pop();
            else return false;
        }
        return st.size()==0?true:false;
    }
}
