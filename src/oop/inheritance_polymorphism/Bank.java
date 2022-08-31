package oop.inheritance_polymorphism;

public class Bank {
    private float rate;

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

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
