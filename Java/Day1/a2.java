public class a2 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        float[] b = {2.1f,3.2f,3.2f,4.4f,5.6f};
        float sum =0f;
        float avg=0f;
        for( int i=0;i< b.length;i++) {
            sum = sum + b[i];
            avg = sum / 2;
        }
        System.out.println("The average is" + avg);
    }

}
