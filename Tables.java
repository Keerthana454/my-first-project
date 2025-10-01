public class Tables {
    public static void calc(int n1,int n2) {
        if (n1 > n2) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n2 = n1 + n2;
        }
        for (int i = n1; i<=n2; i++) {
            System.out.printf("Multiplication Table for %d:%n",i);

            for (int j = 1; j<=10; j++) {
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        calc(3,20);
    }
}
