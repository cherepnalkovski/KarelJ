package com.musala.training.design.patterns.creational.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String args[]) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINIUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
