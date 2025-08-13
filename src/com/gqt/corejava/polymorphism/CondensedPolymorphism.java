package com.gqt.corejava.polymorphism;

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
class Airport{
	void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class CondensedPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		
		a.permit(cp);
		cp.CarryGoods();
		System.out.println("---------------");
		a.permit(pp);
		pp.CarryHumans();
		System.out.println("-------------------");
		a.permit(fp);
		fp.CarryWeapons();

	}

}
