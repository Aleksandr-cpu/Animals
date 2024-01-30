package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Солнышко", new Owner("Владимир Юрьевич"),
                LocalDate.of(2021, 10, 26), new Illness("Лишай"));

        System.out.println(cat.getNickName());
        System.out.println(cat.getOwner());

        System.out.println(cat.getNickName());

        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        System.out.println("Болезнь" + cat.getIllness());

        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());


        cat.lifeCycle();

        System.out.println(cat.getType());
        System.out.println(cat);

        Animal catty = new Cat();
        Dog goodBoy = new Dog();

        System.out.println(goodBoy.getType());
        System.out.println(catty.getType());
        System.out.println(catty);
        Cat.meow();

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(catty);
        animals.add(goodBoy);
        animals.add(cat);
        int i = 0;
        for (Animal animal : animals){
            System.out.println(i + " " + animal);
            i++;
        }

        Animal flint = new Shark();
        Animal switty = new Flamingo();
        Animal dobbi = new Penguin();

        flint.fly();
        flint.toGo();
        flint.swim();

        switty.fly();
        switty.toGo();
        switty.swim();

        dobbi.fly();
        dobbi.toGo();
        dobbi.swim();

    }
}
