package com.gqt.corejava.hasandisrelation;

class Brain{
	String brain_name;
	double size;
	public Brain(String brain_name, double size) {
		super();
		this.brain_name = brain_name;
		this.size = size;
	}
	public String getBrain_name() {
		return brain_name;
	}
	public double getSize() {
		return size;
	}
	
}
class Heart{
	double valves;
	double size;
	public Heart(double valves, double size) {
		super();
		this.valves = valves;
		this.size = size;
	}
	public double getValves() {
		return valves;
	}
	public double getSize() {
		return size;
	}
	
}
class Human{
	Brain b=new Brain("Cerebrum",210);
	Heart h=new Heart(4,70);
}
class Book{
	String book_name;
	double cost;
	public Book(String book_name, double cost) {
		super();
		this.book_name = book_name;
		this.cost = cost;
	}
	public String getBook_name() {
		return book_name;
	}
	public double getCost() {
		return cost;
	}

}
class Mobile1{
	String company;
	double version_no;
	public Mobile1(String company, double version_no) {
		super();
		this.company = company;
		this.version_no = version_no;
	}
	public String getCompany() {
		return company;
	}
	public double getVersion_no() {
		return version_no;
	}
	
}
class Student extends Human{
	void hasBook(Book b) {
		System.out.println(b.getBook_name());
		System.out.println(b.getCost());
	}
	void hasMobile(Mobile1 m) {
		System.out.println(m.getCompany());
		System.out.println(m.getVersion_no());
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Book b=new Book("I had a love Story",5000);
		Mobile1 m=new Mobile1("Android",2.9);
		
		System.out.println(s.b.getBrain_name());
		System.out.println(s.b.getSize());
		System.out.println("-------------------");
		System.out.println(s.h.getSize());
		System.out.println(s.h.getValves());
		System.out.println("---------------");
		s.hasBook(b);
		s.hasMobile(m);

	}

}
