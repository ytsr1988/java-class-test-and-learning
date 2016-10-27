package animals;
import animals.*;

public class Mammal extends Animal{
	
	public Mammal(){
		System.out.println("Mammal constructor 1 called");
	}
	public Mammal(String x){
		super(x);
		System.out.println("Mammal constructor 2 called");
	}
	public void printName(){
		System.out.println("The Mammal's name is " + getName());
	}
	
	public static void main(String[] args){
		Mammal a = new Mammal("Jack");
		a.printName();
	}

}
