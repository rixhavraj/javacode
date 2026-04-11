/// create a class with abstract method and concate methods Hello hey
/// project hail mary....+
/// a silence voice 
/// the metro
abstract class vehicle {
    public void wheeler2() {
        System.out.println("This is a two wheeler vehicle and parent class");
    }
    void wheeler4() {
        System.out.println("This is a four wheeler vehicle parents class");
    }
}
abstract class car {
    public void suv(){
        System.out.println("This is a suv car");
    }

    public void start(){
        System.out.println("Car starts automatically");
    }

    public void stop(){
        System.out.println("Stops this car with the help me ironman");
    }
}
class honda extends vehicle {
    public void sizuka(){
        System.out.println("This is a sizuka car - child class");
    }

    public void auto() {
        System.out.println("This is a automatic vehicle");
    }
}
class E100 extends car {
    public void manual() {
        System.out.println("Manual car");
    }
    public void color() {
        System.out.println("E100 color is Gray");
    }
}
class Integerwrapper{
    private int value;

    public Integerwrapper(int value){
        this.value=value;
        System.out.println("I don't know what is this");
         System.out.println("wrapper value: "+ value);
         Integer autoBoxedInt=100;
         System.out.println("Autobox value: "+ autoBoxedInt);
    }
    public int getValue(){
        return value;
    }
}

public class abst {
    public static void main(String[] agrs) {
        honda h1 = new honda();
        h1.wheeler2();
        h1.wheeler4();

        E100 E = new E100();
        E.start();
        E.color();

        try {
            int a = 77;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        }catch (ArithmeticException i) {
            System.out.println("Error: " + i.getMessage());
        }
        Integerwrapper obj = new Integerwrapper(555);
        System.out.println("Value: "+ obj.getValue());
    }
}
