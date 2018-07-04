public class Dog extends Animal {

    private String name;
    private int age;
    private String type;

    public Dog(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setType(String type){
        this.type = type;
    }

}
