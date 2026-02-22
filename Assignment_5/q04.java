public class q04 {
    
}
class Parent{
    String name ;
    int age;

    public Parent(int age,String name ){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name + age);
    }
}

class Child extends Parent{
    
    public Child(age,name){
        super(age,name);
    }
}