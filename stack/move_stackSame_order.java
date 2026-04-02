package stack;

import java.util.Scanner;
import java.util.Stack;

public class move_stackSame_order {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();

        int n;
        System.out.print(("Enter the elements you want to insert:"));
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }

        System.out.println(st);


        //reversing
        Stack<Integer> rt =new Stack<>();
        while(st.size()>0){
//            int x= st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());

        }
        System.out.println(rt);


        //copy
        Stack<Integer> gt =new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println("copy stack:"+gt);


    }
}
