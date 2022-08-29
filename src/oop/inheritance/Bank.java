package oop.inheritance;

public class Bank {
    private float rate;

    public void caculateRate(int month) {
        if (month > 0 && month <=6) {
            rate = 5.5f;
            System.out.println("Lãi suất là " + rate);
        } else if (month >= 12) {
            rate = 7.0f;
            System.out.println("Lãi suất là " + rate);
        } else {
            System.out.println("Không có lãi suất");
        }
    }
}
