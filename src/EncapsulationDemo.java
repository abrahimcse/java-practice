//Encapsulation -> Binding data with method

class Student{
    private int roll;
    private String name;

    //Getter and Setter

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setRoll(2);
        s1.setName("Akash");

        System.out.println(s1.getRoll());
        System.out.println(s1.getName());

    }
}
