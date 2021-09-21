public class cardemo {
    public static void main(String[] args) {
        MusicSystem ms1 = new MusicSystem("Sony",7,2,"false");
        tyre t1=new tyre("ceat",16);
        Car c1=new Car("Nexon","Petrol",200,7,3.5f,t1,ms1);
        c1.accelarate();
        c1.applyBrake();
        c1.changingGear(7);
        c1.steer();

        tyre t2=new tyre("Apollo",17);
        c1.setTy(t2);
        c1.setMs(ms1);
        c1.displayFeatures();

    }

}
