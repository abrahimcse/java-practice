
class Emp{

    int id;
    int salary;
    static String ceo;

    static {   // when you load a class
        ceo="Lamim";
        System.out.println("in Static");
    }

    public Emp(){    // when you create an object
        id=101;
        salary=2900;
        System.out.println("In constractor");
    }

    public void show(){
        System.out.println(id + ":" +salary + ": " + ceo);
    }
}
public class StaticKeywordDemo {
    public static void main(String[] args) {
        Emp akash = new Emp();
        akash.id=1;
        akash.salary=200;


        Emp batas = new Emp();
        batas.id=2;
        batas.salary=300;


        akash.show();
        batas.show();
    }



}
