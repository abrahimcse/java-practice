class Cal{
    public int add(int ... n){  // Variable Length argument
        int sum=0;
        for (int i:n ){
            sum=sum+i;
        }
        return sum;
    }
}
public class VarargsDemo {
    public static void main(String[] args) {
        Cal obj = new Cal();
        System.out.println(obj.add(12,11,133,23,44,5,5656,76767));
    }
}
