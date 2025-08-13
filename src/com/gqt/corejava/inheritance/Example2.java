package com.gqt.corejava.inheritance;

class Plane{
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
class CargoPlane extends Plane{
	@Override
	void fly(){
		System.out.println("CargoPlane flys");
	}
	void CarryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly(){
		System.out.println("PassengerPlane flys");
	}
	void CarryHumans() {
		System.out.println("Passenger carry Humans");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly(){
		System.out.println("FighterPlane flys");
	}
	void CarryWeapons() {
		System.out.println("Fighter carry weapons");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.CarryGoods();
		System.out.println("---------------");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryHumans();
		System.out.println("-------------------");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.CarryWeapons();

	}

}
