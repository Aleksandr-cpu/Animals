package main.clients;

import java.time.LocalDate;

public class Penguin extends Animal{
    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Penguin() {
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " бегает");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " не летает");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " плавает");
    }
}
