package com.gqt.corejava.encapsulation;

class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//zero paramterized constructor
	
	public Dog() {
		super();
		System.out.println("Inside zero parametarized consructor");
		this.name="Ramu";
		this.color="Brown";
		this.cost=7000;
		this.age=3;
		this.breed="Pumorian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
	}
	
	//one paramterized constructor
	
		public Dog(String name) {
			this();
			System.out.println("Inside one parametarized consructor");
			this.name=name;
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.cost);
			System.out.println(this.age);
			System.out.println(this.breed);
			
		}
		
		//Two paramterized constructor
		
			public Dog(String name,String color) {
				this("Chintu");
				System.out.println("Inside two parametarized consructor");
				this.name=name;
				this.color=color;
				System.out.println(this.name);
				System.out.println(this.color);
				System.out.println(this.cost);
				System.out.println(this.age);
				System.out.println(this.breed);
				
			}
			
			//Three paramterized constructor
			
			public Dog(String name,String color,int cost) {
				this("Tommy","Blue");
				System.out.println("Inside three parametarized consructor");
				this.name=name;
				this.color=color;
				this.cost=cost;
				System.out.println(this.name);
				System.out.println(this.color);
				System.out.println(this.cost);
				System.out.println(this.age);
				System.out.println(this.breed);
				
			}
			
            //four paramterized constructor
			
			public Dog(String name,String color,int cost,int age) {
				this("Dobby","Orange",9000);
				System.out.println("Inside four parametarized consructor");
				this.name=name;
				this.color=color;
				this.cost=cost;
				this.age=age;
				System.out.println(this.name);
				System.out.println(this.color);
				System.out.println(this.cost);
				System.out.println(this.age);
				System.out.println(this.breed);
				
			}
			
            //five paramterized constructor
			
			public Dog(String name,String color,int cost,int age,String breed) {
				this("Dobby","Orange",9000,7);
				System.out.println("Inside five parametarized consructor");
				this.name=name;
				this.color=color;
				this.cost=cost;
				this.age=age;
				this.breed=breed;
				System.out.println(this.name);
				System.out.println(this.color);
				System.out.println(this.cost);
				System.out.println(this.age);
				System.out.println(this.breed);
				
			}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("Rocky","White",8000,8,"GR");

	}

}
