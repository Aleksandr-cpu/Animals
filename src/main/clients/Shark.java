package main.clients;

import java.time.LocalDate;

public class Shark extends Animal{
    public Shark(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Shark() {
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " не бегает");
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
