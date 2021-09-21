import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }}
        System.out.println("the Primary diagonal elements are");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("the Secondary diagonal elements are");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i + j == a[i].length-1) {
                    System.out.print(a[i][j] + " ");

                }
            }
            System.out.println();
        }
    }
}