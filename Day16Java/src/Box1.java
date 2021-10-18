public class Box1 {
    private int l,b,h;
    public Box1(int i, int i1, int i2) {
        l = i;
        b = i1;
        h = i2;
    }
    public void display(){
       System.out.println(l +" "+b+" "+h);
   }
    public int getVolume(){
        return l*b*h;
    }
    public int getL() {
        return l;
    }
    public int getB() {
        return b;
    }
    public int getH() {
        return h;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void setL(int l) {this.l = l;}
    public void setH(int h) {
        this.h = h;
    }
}
