package main.clients;

import java.time.LocalDate;

public class Flamingo extends Animal{
    public Flamingo(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Flamingo() {
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " бегает");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " летает");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " не плавает");
    }
}
