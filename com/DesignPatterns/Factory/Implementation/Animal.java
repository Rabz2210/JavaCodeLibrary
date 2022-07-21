package com.DesignPatterns.Factory.Implementation;

abstract public class Animal {
    int eye;
    int legs;

    Animal(int eye, int legs){
        this.eye = eye;
        this.legs = legs;
    }
    abstract public void eat();

    abstract public void kill();

    public void killPlayer(){
        System.out.println("Trying to Kill Player");
    }
}
