package animals;

public class Bird extends Animal {
	public Bird(){
		System.out.println("Bird constructor 1 called");
	}
	public Bird(String x){
		super(x);
		System.out.println("Bird constructor 2 called");
	}
	public void printName(){
		System.out.println("The bird's name is " + getName());
	}

	
	public static void main(String[] args){
		Bird a = new Bird();
		System.out.println("");
		Animal b = new Animal();
		System.out.println("");
		Animal c = new Bird(); 
		System.out.println("");
		
		Bird a1 = new Bird("Larry");
		System.out.println("");
		Animal b1 = new Animal("Jack");
		System.out.println("");
		Animal c1 = new Bird("Herry"); 
		System.out.println("");
		
		a.printName();
		b.printName();
		c.printName();
		a1.printName();
		b1.printName();
		c1.printName();
	}

}
