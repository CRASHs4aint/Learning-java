package stack;

import java.util.Stack;

public class Display_stack {
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top + " ");
        displayRec(st);
        st.push(top);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(7);
        st.push(8);
        displayRec(st);

        //revrese stace recersilvily


//        Stack<Integer> rt = new Stack<>();
//        while (st.size() > 0) {
//            rt.push(st.pop());
//        }
//        while (rt.size() > 0) {
//            int x = rt.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }
//        System.out.println();
//
//
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i = n - 1; i >= 0; i--) {
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//            st.push(arr[i]);
//        }
   }
}
