package com.helloworld.test;

public class Vehicle {
	private int speed;
    private String size;
    public void move()
    {
    System.out.println("1010101" + size);
    }
    public void setSpeed(int speed)
    {
        System.out.println("a" + speed);
    }
    public void speedUp()
    {
        Vehicle v=new Vehicle();
        v.setSpeed(1000);
    }
    public void speedDown()
    {
    Vehicle v=new Vehicle();
        v.setSpeed(20);
    }
    public static void main(String[] dsa)
    {
    Vehicle v=new Vehicle();
    v.speed=100;
    v.size="50/m^3";
    System.out.println(v.speed+"s"+v.size);
    v.speedUp();
    v.speedDown();
    v.move();
    }
}