class calc{
    int num1;
    int num2;
    int result;
    public calc(int num1, int num2){
       this.num1=num1; // current object
       this.num2=num2;
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        calc obj = new calc(4,5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
