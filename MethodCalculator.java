import java.util.ArrayList;
import java.util.List;

public class MethodCalculator {
    public static List<Integer>calc2(int n1,int n2) {
        List<Integer> list1 = new ArrayList<>();
        int sum1 = n1 + n2;
        list1.add(sum1);
        int diff1 = n1 - n2;
        list1.add(diff1);
        int prod1 = n1 * n2;
        list1.add(prod1);
        if (n2==0) {
            System.out.println("n2 should not be zero");
         } else {
             int div1 = n1 / n2;
             list1.add(div1);

         }
         int div2 = n2 / n1;
         list1.add(div2);
         int rem1 = n1 % n2;
         list1.add(rem1);
         int exp1 = (int) Math.pow(n1, n2);
         list1.add(exp1);

         return list1;
         
        
    }
      public static void main(String[] args) {
        List<Integer> result = calc2(10,2);
        System.out.println("List of Calulations : " + result);
}
  
}

