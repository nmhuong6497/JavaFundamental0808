public class Animal {
    // Thuộc tính
    String weight;
    String height;

    // constructor (Phương thức khởi tạo)
    public Animal(String weight, String height) {
        this.weight = weight;
        this.height = height;
    }

    // Hành vi
    public void run(String action) {
        System.out.println(action);
    }
}
