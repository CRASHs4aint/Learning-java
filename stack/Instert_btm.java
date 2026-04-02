package stack;

import java.util.Stack;

public class Instert_btm {
    static void main() {
        Stack<Integer> st =new Stack<>();
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(7);
        st.push(8);
        int idx=3;
        int x=12;


        Stack<Integer> rt =new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());

        }

        System.out.println(st);
    }


}
