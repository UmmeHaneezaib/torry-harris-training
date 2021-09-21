import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        int[] mya = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< mya.length;i++)
         mya[i] = sc.nextInt();
         for(int n=0;n< mya.length;n++) {
             mya[n] = n * n;
             System.out.println(mya[n]);
         }
    }
}
