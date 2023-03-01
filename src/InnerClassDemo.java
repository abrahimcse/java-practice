class Outer{
    int a;  //variable
    public void show()  //method
    {

    }
    class Inner //class into class (Outer$Inner.class)
    {
        public void display()
        {
            System.out.println("In display");
        }

    }
    static class Inner1{
        public void view(){
            System.out.println("Static class Method");
        }
    }
}

public class InnerClassDemo {
    //variable, method, class
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();

        Outer.Inner1 obj2 = new Outer.Inner1();
        obj2.view();
    }
}
