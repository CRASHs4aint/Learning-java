package stack;

public class linkListImplementaion {
    static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println((st.size()));
        st.pop();
        st.display();
        System.out.println((st.size()));
        st.push(8);
        st.push(10);
        System.out.println(st.isFull());
        st.push(4);

    }
}
