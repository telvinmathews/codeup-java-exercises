public class Person {
    //member variables
    private String name;

    //constructor
    public Person(String name){
        this.name = name;

    }

    //member methods
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hi, Im "+ this.name + "!");
    }

}
