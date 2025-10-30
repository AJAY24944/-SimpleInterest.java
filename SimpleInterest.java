public class SimpleInterest {
    static int principal = 5000;
    static int rate = 5;
    static int time = 2;
    public static int calculateInterest(int principal,int rate,int time){
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        System.out.println(calculateInterest(principal, rate, time));
    }
}
