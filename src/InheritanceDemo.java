class Calculator{       //Super Class
    public int add(int i, int j){
        return i+j;
    }

    }
class CalAdv extends Calculator{        //Sub class
    public int sub(int i, int j) {
        return i - j;
    }
}
    class CalVeAdv extends CalAdv{
        public int multi(int i, int j){
            return i*j;
        }
    }

public class InheritanceDemo {
    public static void main(String[] args) {
        CalVeAdv c=new CalVeAdv();
       int result1=c.add(5,4);
       int result2=c.sub(8,2);
       int result3=c.multi(3,2);
       System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
