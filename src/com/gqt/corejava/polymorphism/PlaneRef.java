package com.gqt.corejava.polymorphism;

class Plane1{
	void takeoff() {
		System.out.println("Plane tookoff");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane1 extends Plane1{
	@Override
	void fly(){
		System.out.println("CargoPlane flys");
	}
	void CarryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	void fly(){
		System.out.println("PassengerPlane flys");
	}
	void CarryHumans() {
		System.out.println("Passenger carry Humans");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void fly(){
		System.out.println("FighterPlane flys");
	}
	void CarryWeapons() {
		System.out.println("Fighter carry weapons");
	}
}
public class PlaneRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane1 cp1=new CargoPlane1();
		PassengerPlane1 pp1=new PassengerPlane1();
		FighterPlane1 fp1=new FighterPlane1();
		Plane1 ref;
		ref=cp1;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp1.CarryGoods();
		System.out.println("---------------");
		ref=pp1;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp1.CarryHumans();
		System.out.println("-------------------");
		ref=fp1;
		ref.takeoff();
		ref.fly();
		ref.land();
		fp1.CarryWeapons();

	}

}
