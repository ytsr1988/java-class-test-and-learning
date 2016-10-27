package animals;

public class Animal {
    private String name = "no_name";
    private String nickname = "NA"; 
    public Animal(){
    	System.out.println("Animal constructed");
    }
    public Animal(String x){
    	name = x;
    	System.out.println("Animal constructed by name");
    }
    public String getName(){
    	return name;
    }
    public String getNickname(){
    	return nickname;
    }
    public void printName(){
    	System.out.println("The anmimal's name is " + getName());
    }
    public void printNickName(){
    	System.out.print("The animal's nickname is " + getNickname());
    }
    public void setName(String x){
    	System.out.println("Name changed from " + name + " to " + x);
    	name = x;
    }
    public void setNickname(String x){
    	System.out.println("Set nickname to "+x);
    	nickname = x;
    }
}
