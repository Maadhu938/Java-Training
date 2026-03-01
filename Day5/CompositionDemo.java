class Engine{//this is part of car class but it is not a subclass of car class
    String type;
    Engine(String type){//constructor to initialize engine type    
        this.type=type;
    }
}
class car{//car class is composed of engine class
    Engine engine;//car has an engine (HAS-A relationship)
    car(String engineType){
        this.engine=new Engine(engineType);
    }
    void show(){
    System.out.println("Car has "+engine.type);
    }
}
public class CompositionDemo {//composition is a strong form of association where one class contains an object of another class as a part of its state. In composition, the contained object (part) cannot exist independently of the containing object (whole). If the whole is destroyed, the part is also destroyed. In this example, the car class is composed of the engine class. The engine is a part of the car, and it cannot exist without the car. When we create a car object, we also create an engine object as part of it.
    public static void main(String args[]){
        car c=new car("Petrol Engine");
        c.show();
    }
}