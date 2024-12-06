package Dec.ex_12032024;

public class super_abstract {


    public static void main(String[] args) {
        Car C= new Car();


    }

}


class Car extends Vehicle{
    private int maxSpeed=281;

    @Override
    void display() {
        System.out.println("Child");
    }

    Car(){
        super(5);
        System.out.println("DC");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        super.display();
        this.display();
    }


}

class Vehicle{
    public int maxSpeed=180;



    void display(){
        System.out.println("parent");
    }

    Vehicle(){
        System.out.println("DC-Vehicle");
    }

    Vehicle(int a){
        System.out.println("Pc-Vehicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }









}