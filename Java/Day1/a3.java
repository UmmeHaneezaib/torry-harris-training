import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println(a[0]);
        }
        if(n==2){
            System.out.println(a[1]+" "+a[2]);
        }
        if(n==3){
            System.out.println(a[3]+" "+a[4]+" "+a[5]);
        }
        if(n==4){
            System.out.println(a[6]+" "+a[7]+" "+a[8]+" "+a[9]);
        }
        if(n==5){
            System.out.println(" ");
        }
    }
}
