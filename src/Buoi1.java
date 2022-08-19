import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] arg) {

        //comment
        // 1: Kiểu dữ liệu
        // Nhóm 1 (Nguyên thủy - primities): char, int, long, double, float, boolean
        // Nhóm 2 (Đối tượng - Object): String, Integer, Long, Double, Float, Boolean

        // 2: Khai bao bien tuân thủ theo camelCase
        // char a = 'a';   // char - kiểu ký tự chứa trong ''
        // int age = 28; // int, long - kiểu số nguyên (Số không có phần thập phân)
        //float height = 1.75f; // float, double - kiểu số có phần thập phân
        // boolean isMale = true; // kiểu luận lý (đúng sai)

        //String name = "Nguyen Minh Huong"; //String - kiểu chuỗi

        //3. Toán tử
        //  int a = 5;
        //   a = a + 1; // a +=1;
        //  a++;

        //   int b = a++;

        // System.out.println("Gia tri cua a:" + a);
        //System.out.println("Gia tri cua a:" + b);

        //Truong hop 1: a++
        // Truyen gia tri a vao vi tri a++
        // Tang a len 1 don vi

        //Truong hop 2: ++a
        // Tang a len 1 don vi
        // Truyen gia tri a vao vi tri a++
        //int a = 5;  //a=6
        //int b = 3;  //b=3

        //int result = a++ - --b + --a + a-- + b++ - b-- + a++ + --a;
        // = 6 - 2 + 4 + 4 + 4 - 2 + 6 + 4
        //System.out.println("a:"+ a);
        //System.out.println("b:"+ b);
        //System.out.println("result:" + result);


        //int c =  -5;
        //int d = 5;

        //int result =  --c + c++ - d-- + d-- + ++c + c-- - d++ + c++ - d--;
        // -6 + c++ - d-- + d-- + ++c + c-- - d++ + c++ - d--; c = -5, d = 5
        // -6 + -5 - d-- + d-- + ++c + c-- - d++ + c++ - d--; c = -4, d = 5
        // -6 + -5 - 5 + d-- + ++c + c-- - d++ + c++ - d--; c = -4, d = 4
        // -6 + -5 - 5 + 4 + ++c + c-- - d++ + c++ - d--; c = -4, d = 3
        // -6 + -5 - 5 + 4 + -3 + c-- - d++ + c++ - d--; c = -4, d = 3
        // -6 + -5 - 5 + 4 + -3 + -4 - d++ + c++ - d--; c = -5, d = 3
        // -6 + -5 - 5 + 4 + -3 + -4 - 3 + c++ - d--; c = -5, d = 4
        // -6 + -5 - 5 + 4 + -3 + -4 - 3 + -5 - d--; c = -4, d = 4
        // -6 + -5 - 5 + 4 + -3 + -4 - 3 + -5 - 4; c = -4, d = 3
        // Độ ưu tiên
        // ++ --
        // * /
        // + -
        //System.out.println("a:"+ c);
        //System.out.println("b:"+ d);
        //System.out.println("result:" + result);

        //int a = 5;
        //int b = a/3;    // Chia lấy phần nguyên

        // Toán tử so sánh: >, <, ==

        // 4. Câu điều kiện

        //int a = 5;
        //int b = 10;

        // Trường hợp xảy ra sẽ phải làm gì

        //if (a > b) {
        //    System.out.println("A lớn hơn B");
        //} else if (a < b) {
        //    System.out.println("A bé hơn B");
        //} else {
        //    System.out.println("A bằng B");
        //}
        // (): chứa value
        // {}: chứa đoạn lệnh
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập cân nặng (kg): ");
        Float weight = scanner.nextFloat();
        System.out.print("Mời bạn nhập chiều cao (cm): ");
        Float height = scanner.nextFloat();
        Float a = height / 100;
        Float b = a * a;
        Float c = weight / b;
        System.out.println("Chỉ số BMi của bạn là: " + c);
        if (c < 18.5) {
            System.out.println("Bạn bị gầy, nguy cơ phát triển bệnh thấp");
        } else if (18.5 <= c) if (c < 25){
            System.out.println("Bạn bình thường, nguy cơ phát triển bệnh trung bình");
        } else if (25 <= c) if (c < 30) {
            System.out.println("Bạn hơi béo, nguy cơ phát triển bệnh cao");
        } else if (30 <= c) if (c < 35) {
            System.out.println("Bạn bị béo phì cấp độ 1, nguy cơ phát triển bệnh cao");
        } else if (35 <= c) if (c <= 40) {
            System.out.println("Bạn bị béo phì cấp độ 2, nguy cơ phát triển bệnh rất cao");
        } else if (c > 40) {
            System.out.println("Bạn bị béo phì cấp độ 3, nguy cơ phát triển bệnh nguy hiểm");
        }


    }
}

