package com.musala.training.design.patterns.structural.composite;

public class MenuItem extends MenuComponent{
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
