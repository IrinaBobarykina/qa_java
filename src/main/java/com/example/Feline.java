package com.example;

import java.util.List;

public class Feline extends Animal implements IFeline, Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public List<String> getFood() {
        return null;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
