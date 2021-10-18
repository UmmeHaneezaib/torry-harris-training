public class BoxDemo1 {
    public static void main(String[] args) {
        Box1 b1 = new Box1(10,20,30);
        b1.display();
        System.out.println("The volume is" +b1.getVolume());
        b1.setL(b1.getL()*110/100);
        b1.setB(b1.getB()*120/100);
        b1.setH(b1.getH()*108/100);
        b1.display();
        System.out.println("The Updated volume is" +b1.getVolume());
    }
}
