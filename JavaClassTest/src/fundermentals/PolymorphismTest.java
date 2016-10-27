package fundermentals;
import animals.*;

public class PolymorphismTest {
	public static void main(String[] args){
		Bird a = new Bird("Larry");
		Mammal b = new Mammal("Luke");
		Animal c1 = new Animal("Jack");
		Animal c2 = new Bird("Herry"); 
		Animal c3 = new Mammal("Tom"); 
		System.out.println("");
		

		a.printName();
		b.printName();
		c1.printName();
		c2.printName();
		c3.printName();
	}
}

/* comparison on c++ code
#include <bits/stdc++.h>
using namespace std;

class Animal{
protected: 
    string name;
public:
    Animal(){
        name = "no_name";
    }        
    Animal(string x){
        name = x;
    }
    void printName(){
        cout<<"The Animal's name is "<<name<<endl;
    }
    virtual void polymorphismPrintName(){
        cout<<"The Animal's name is "<<name<<endl;
    }
};

class Bird:public Animal{
public:
	void printName(){
        cout<<"The bird's name is "<<name<<endl;
    }
    void polymorphismPrintName(){
        cout<<"The bird's name is "<<name<<endl;
    }
};

int main(){
    Animal a;
    Bird b;
    Animal *c = new Animal;
    Animal *d = new Bird;
    a.printName();
    b.printName();
    c->printName();
    d->printName();
    cout<<endl;

    a.polymorphismPrintName();
    b.polymorphismPrintName();
    c->polymorphismPrintName();
    d->polymorphismPrintName();

    return 0;
}

The output is:
The Animal's name is no_name
The bird's name is no_name
The Animal's name is no_name
The Animal's name is no_name

The Animal's name is no_name
The bird's name is no_name
The Animal's name is no_name
The bird's name is no_name

Remark:
c++ needs virtual function to achieve polymorphism.
In Java, all non-static methods are by default "virtual functions." 
Only methods marked with the keyword final, which cannot be overridden, 
along with private methods, which are not inherited, are non-virtual.
*/