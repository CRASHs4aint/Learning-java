package stack;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }

    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(7);
        st.push(8);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
