package com.gqt.corejava.inheritance;

class Animal1{
	void eat() {
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
	void sound() {
		System.out.println("Animal sounds");
	}
}
class Dog extends Animal1{
	@Override
	void eat(){
		System.out.println("Dog eats biscuits");
	}
	void bark() {
		System.out.println("dog makes bow bow");
	}
}
class Cat extends Animal1{
	@Override
	void eat(){
		System.out.println("Cat eats Rats");
	}
	void soundCat() {
		System.out.println("Cat makes sound as meow meow");
	}
}
class Cow extends Animal1{
	@Override
	void eat(){
		System.out.println("Cow eats grass");
	}
	void soundCow() {
		System.out.println("cow makes sound as amba amba");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Cat c=new Cat();
		Cow c1=new Cow();
		d.eat();
		d.sleep();
		d.sound();
		d.bark();
		System.out.println("---------------");
		c.eat();
		c.sleep();
		c.sound();
		c.soundCat();
		System.out.println("---------------");
		c1.eat();
		c1.sleep();
		c1.sound();
		c1.soundCow();
		
	}

}

