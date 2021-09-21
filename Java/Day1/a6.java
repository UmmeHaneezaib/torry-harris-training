import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}