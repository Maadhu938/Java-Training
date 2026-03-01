//Encapsulation demonstration using SuperHero class 
public class SuperHero{
    private String name;
    private String power;
    public void setName(String name){//setter method
        this.name=name;
        //no return type for setter method
    }
    public String getName(){//getter method
        return name;
    }
    public void setPower(String power){//setter method
        this.power=power;
    }
    public String getPower(){//getter method
        return power;
    }
    void display(){//method to display hero details
        System.out.println("Hero:" + name);
        System.out.println("Power:" + power);
    }
    public static void main(String[] args){
        SuperHero hero=new SuperHero();//if any constructor is not defined java provides default constructor
        hero.setName("Iron man");
        hero.setPower("Genius level intellect, Powered armor suit");
        //hero.display(); because we have getters we can directly print the values without using display method
        //getters have return types so we can directly print the values returned by getters
        System.out.println(hero.getName());
        System.out.println(hero.getPower());
    }
}