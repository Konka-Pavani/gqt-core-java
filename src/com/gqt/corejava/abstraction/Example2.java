package com.gqt.corejava.abstraction;
abstract class Animal1{
	abstract void eat();
	abstract void sleep();
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
	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Lion sleeps");
		
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
	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cat sleeps");
		
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
	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cow sleeps");
	}
}
public class Example2 {

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

