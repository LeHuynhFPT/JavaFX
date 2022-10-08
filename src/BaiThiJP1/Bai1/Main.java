package BaiThiJP1.Bai1;

public class Main {
    public static void main(String[] args){
        Acount c = new Acount(1000000, 12.5);
        double interest = c.calculateInterest(c.balance,c.rate);
        System.out.println("Tài khoản hiện có : " + interest +"$");
    }
}