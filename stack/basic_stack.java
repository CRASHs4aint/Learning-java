package stack;

import java.util.Stack;

public class basic_stack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("size is:"+st.size());
        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        //peek

        System.out.println(st.peek());
        System.out.println("size is:"+st.size());
        System.out.println(st);
    }
}
