class Casio{

    int num1;
    int num2;
    String operation;

    //Constractor Overloading
    public Casio(){
        num1=0;
        num2=0;
        operation = "Nothing";
    }
    public Casio(int i){
        num1=i;
        num2=0;
        operation="Nothing";
    }
    public Casio(int i, int j){
        num1=i;
        num2=j;
        operation = "";
    }

    /*//Method Overloading
    public void add(int i, int j){
        System.out.print(i+j);
    }
    public void add(int i, int j, int k){
        System.out.println(i+j+k);
    }
    public void add(double i, double j){
        System.out.println(i+j);
    }*/
}

public class MethodandConstructorOverloading {
    public static void main(String[] args) {
        Casio obj= new Casio();
        /*obj.add(4,5);
        obj.add(3,4,5);
        obj.add(2.1, 3.4);*/
    }
}
