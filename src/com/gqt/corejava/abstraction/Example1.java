package com.gqt.corejava.abstraction;
abstract class Plane{
	abstract void takeoff();
	abstract void fly();
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
	@Override
	void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane takeoff");
		
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
	@Override
	void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("PassengerPlane takeoff");
		
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
	@Override
	void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("FighterPlane takeoff");
		
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class Example1 {

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
		Plane p=new Plane(){

			@Override
			void takeoff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			void fly() {
				// TODO Auto-generated method stub
				
			}
			
		}

	}

}
