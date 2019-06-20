package oopsConcept;

public class constructor {

	public constructor() {
		this(10);
		System.out.println("DEFAULT");
	}

	constructor(int x) {
		this(10, 20);
		System.out.println(x);
	}

	public constructor(int x,int y){
		System.out.println(x+y);
	}
	void show(){
		System.out.println("ConstructorChaining");
	}

	public static void main(String[] args) {
		constructor c=new constructor();
		c.show();

	}

}
