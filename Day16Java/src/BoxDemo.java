public class BoxDemo {
    public static void main(String[] args) {
        Box hp =new Box();
        Box del =new Box();

        hp.initialize(10,20,"intel",15.77);
        del.initialize(20,30,"amd",16.77);
        System.out.println("The features of hp are");
        hp.display();
        System.out.println("The features of del are");
        del.display();

    }
}
