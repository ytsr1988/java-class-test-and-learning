package fundermentals;
public class ConstructorsTest {
	public static void main(String[] args){
		foo b = new foo("harry");
		foo c = new foo();
		foo d=b;  // d and b are references to the same object
		// There are only two foo objects in this code.
		b.showName();
		c.showName();
		d.showName();
		System.out.println("--------");
		b.changeName("Jack");
		b.showName();
		d.showName();
	}

}

class foo {
	private String Name = "No name";
	void showName(){
		System.out.println("The name is "+Name);
	}
	void changeName(String x){
		System.out.println("name changed from "+ Name + " to "+ x);
		Name = x;
	}
	foo(){
		System.out.println("Construct object from NULL");
	}
	foo(String x){
		Name = x;
		System.out.println("Construct object from string: "+x);
	}
}

/*



*/