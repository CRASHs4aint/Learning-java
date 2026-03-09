package String;

public class sum_of_all_substring {
    static void main() {
        String s="6759";
        int sum=0;
        int value;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                value=Integer.parseInt(s.substring(i,j));
                sum=sum+value;
            }
        }
        System.out.println("sumof all sub-string is "+sum);
    }
}
