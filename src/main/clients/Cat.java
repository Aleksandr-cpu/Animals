package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10d;
    }

    public static void meow(){
        System.out.println("Мяяяяу");
    }
    @Override
    public String toString() {
        return super.toString()+" Discount("+discount+")";
    }
}
