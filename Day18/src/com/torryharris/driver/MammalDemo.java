package com.torryharris.driver;

import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Mammal;
import com.torryharris.model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        Mammal cow = new Cow();
        cow.feed();
        cow.eat();

        Mammal tiger = new Tiger();
        tiger.feed();
        tiger.eat();

        Bat bat = new Bat();
        bat.eat();
        bat.feed();
        bat.fly();
    }
}
