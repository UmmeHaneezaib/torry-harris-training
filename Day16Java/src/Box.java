public class Box {
    private int ram, hdd;
    private String processor;
    private double screenSize;

    public void initialize(int r, int h, String p, double ss) {
        ram = r;
        hdd = h;

        processor = p;
        screenSize = ss;
    }

    public void display() {
        System.out.println("The ram is" + ram + "gb");
        System.out.println("The hdd is" + hdd + "gb");
        System.out.println("The processor used is" + processor);
        System.out.println("The Screen Size is" + screenSize);
    }

}
