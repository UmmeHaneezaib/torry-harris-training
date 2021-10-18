package com.torryharris.driver;

import com.torryharris.model.*;

public class CarDemo1 {
    public static void main(String[] args) {
        tyre  mrf = new tyre("mrf",17);
        MusicSystem sony = new MusicSystem("Sony",2,4,"True");

        HatchBack swift = new HatchBack("Swift","Petrol",400,3,5.6f,mrf,sony,"Electrical");
        swift.displayHatchBackFeatures();
        Sedan sedan = new Sedan("Sedan","petrol",200,4,3.5f,mrf,sony,2);
        sedan.displaySedanFeatures();
        Suv vitara = new Suv("vitara","petrol",500,5,5.6f,mrf,sony,"power",true);
        vitara.displaySuvFeatures();
    }
}
