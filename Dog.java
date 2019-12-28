public class Dog implements Pet {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String say(String s){
        return "ワン";
    }
}

// UML 演習