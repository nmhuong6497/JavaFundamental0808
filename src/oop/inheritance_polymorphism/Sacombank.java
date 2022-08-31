package oop.inheritance_polymorphism;

public class Sacombank extends Bank {
    @Override
    public void caculateRate(int month) {
        if (month > 0 && month <=6) {
            super.setRate(6f);
            System.out.println("Lãi suất là " + super.getRate());
        } else if (month >= 12) {
            super.setRate(7.5f);
            System.out.println("Lãi suất là " + super.getRate());
        } else {
            System.out.println("Không có lãi suất");
        }
//        super.caculateRate();
    }
}
