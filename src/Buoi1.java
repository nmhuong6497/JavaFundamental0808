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
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Mời bạn nhập cân nặng (kg): ");
        // Float weight = scanner.nextFloat();
        // System.out.print("Mời bạn nhập chiều cao (cm): ");
        //Float height = scanner.nextFloat();
        //Float a = height / 100;
        //Float b = a * a;
        //Float c = weight / b;
        //System.out.println("Chỉ số BMi của bạn là: " + c);
        //if (c < 18.5) {
        //System.out.println("Bạn bị gầy, nguy cơ phát triển bệnh thấp");
        //} else if (18.5 <= c) if (c < 25){
        //System.out.println("Bạn bình thường, nguy cơ phát triển bệnh trung bình");
        //} else if (25 <= c) if (c < 30) {
        //System.out.println("Bạn hơi béo, nguy cơ phát triển bệnh cao");
        //} else if (30 <= c) if (c < 35) {
        //System.out.println("Bạn bị béo phì cấp độ 1, nguy cơ phát triển bệnh cao");
        //} else if (35 <= c) if (c <= 40) {
        //System.out.println("Bạn bị béo phì cấp độ 2, nguy cơ phát triển bệnh rất cao");
        //} else if (c > 40) {
        //System.out.println("Bạn bị béo phì cấp độ 3, nguy cơ phát triển bệnh nguy hiểm");
        //}


        // 5. Câu điều kiện switch case
        //int month = 1;

        //switch (month) {
        //    case 1:
        //    case 2:
        //    case 3:
        //      System.out.println("Quý 1");
        //      break;

        //}


        // Tạo chức năng cho người dùng nhập
        // 1 - Mã tài khoản theo chữ cái
        //      a: M (Member)
        //      b: V (Vip)
        //      c: D (Diamond)
        // Nếu nhập sai cho thoát
        // 2 - Nhập tổng tiền
        // Loại M -> Giảm 5%
        // Loại V -> Giảm 7%
        // Loại D -> Giảm 15%

        // Out put
        // Thành viên thuôc loại gì
        // Giảm bao nhiêu phần trăm
        // Tổng tiền cần phải trả là bao nhiêu

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Mời bạn nhập mã tài khoản: ");
        //String acc = scanner.next();


        //switch (acc) {
        //    case "a":
        //        System.out.println("Bạn là thành viên M (Member)");
        //        break;
        //    case "b":
        //        System.out.println("Bạn là thành viên V (Vip)");
        //        break;
        //    case "c":
        //        System.out.println("Bạn là thành viên D (Diamond)");
        //        break;
        //}

        //float giam = 1f;

        //switch (acc) {
        //    case "a":
        //       System.out.println("Bạn được giảm 5%");
        //        float giam = 5/100;
        //        break;
        //    case "b":
        //        System.out.println("Bạn được giảm 7%");
        //        float giam = 7 / 100;
        //        break;
        //    case "c":
        //        System.out.println("Bạn được giảm 15%");
        //       float giam = 15 / 100;
        //        break;
        //}

        //int i = 100000;
        //float price = i * (100 - giam);

        //switch (acc) {
        //    case "a":
        //        System.out.println("Số tiền bạn cần phải trả là: " + price);
        //        break;
        //    case "b":
        //        System.out.println("Số tiền bạn cần phải trả là: " + price);
        //        break;
        //    case "c":
        //       System.out.println("Số tiền bạn cần phải trả là: " + price);
        //       break;
        //}

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Mời bạn nhập mã khách hàng: ");
        //String codeUser = scanner.nextLine();
        // System.out.print("Mời bạn tổng tiền: ");
        // int totalPayment = scanner.nextInt();
        // int discountPercent = 0;
        //String categoryCodeUser = "";

        //switch (codeUser) {
        //    case "M":
        //    case "m":
        //      discountPercent = 5;
        //       categoryCodeUser = "Member";
        //       break;
        //    case "V":
        //   case "v":
        //      discountPercent = 7;
        //      categoryCodeUser = "Vip";
        //       break;
        //   case "D":
        //   case "d":
        //       discountPercent = 15;
        //       categoryCodeUser = "Diamond";
        //       break;
        //   default:
        //     System.out.print("Không đúng mã khách hàng");
        //   return;
        //}
        //totalPayment = (int) (totalPayment * ((float) (100 - discountPercent) / 100));
        // System.out.println("Thành viên thuộc loại " + categoryCodeUser);
        //System.out.println("Được ưu đãi giảm " + discountPercent + "%");
        //System.out.println("Số tiền cần phải thanh toán là " + totalPayment + " VNĐ");


        // 5. Mảng
        // Array => Tất cả được lưu ở 1 nơi

        // Cách 1: Tạo ra và truyền các phần tử cho mạng
        //String[] arrNames = {"Tí", "Tèo", "Hoa", "Lan"};

        // Lấy kích thước của mảng (Size, Length)
        //System.out.println("Kích thước của mảng là " + arrNames.length);

        // Lấy giá trị phần tử theo index
        // Vị trí đầu tiên sẽ có index = 0
        // Vị trí cuối là length - 1

        //System.out.println(arrNames[1]);

        //arrNames[1] = "Tèo Update";
        //System.out.println(arrNames[1]);


        // Cách 2:Tạo ra mảng nhưng chỉ biết số lượng
        // String[] arrNames = new String[10];


        // 6. Vòng lặp for
        //for (int i = 0; i < 10; i++) {
        //    System.out.println(i);
        //}

        //for (int i = 10; i >= 0; i--) {
        //    System.out.println(i);
        //}

        //for (int i = 1; i <= 100; i++) {
        //    if (i % 2 == 0) {
        //        System.out.println(i);
        //    }
        //}

//            Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập số bất kỳ: ");
//        int number = scanner.nextInt();
//
//        if (number < 2) {
//            System.out.print("Không phải là số nguyên tố");
//            return;
//        }
//
//        for(int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                System.out.print("Không phải là số nguyên tố");
//                return;
//            }
//        }
//
//        System.out.print("Số " + number + " là số nguyên tố");

//            int[] arrNumber = {2,3,4,5,6,10,1,20,30,15,16,17,18,21,22,23};

        // Kiếm số lớn nhất
//            int maxNumber = arrNumber[0];
        //           for (int i = 0; i < arrNumber.length; i++) {
        //               if (maxNumber < arrNumber[i]) {
//                    maxNumber = arrNumber[i];
//               }
        //         }
        //           System.out.println(maxNumber + " là số lớn nhất");

        //         // Kiếm số nhỏ nhất là số lẻ
        //         int minOddNumber = arrNumber[0];
        //         for (int i = 0; i < arrNumber.length; i++) {
        //             if (minOddNumber > arrNumber[i] && arrNumber[i] % 2 != 0) {
        //                minOddNumber = arrNumber[i];
        //             }
        //         }
        //         System.out.println(minOddNumber + " là số lẻ nhỏ nhất");


        //----------------------------------------------------------------------------------------


        //          int[] arrNumber = {2, 3, 4, 5, 6, 10, 1, -1, 20, 30, 15, 16, 17, 18, 21, 22, 23};

        // Kiếm số lớn nhất
        // Kiếm số nhỏ nhất là số lẻ

        //          int max, min;
        //         max = min = arrNumber[0];

        //          for (int i = 1; i < arrNumber.length; i++) {
        //              if (arrNumber[i] > max) {
//                } else if (arrNumber[i] < min && arrNumber[i] % 2 != 0) {
        //                  min = arrNumber[i];
        //             }
        //         }

        //         System.out.println("Số lớn nhất " + max);
        //          System.out.println("Số nhỏ nhất " + min);


        //----------------------------------------------------------------------------------------


        // 7. Vòng lặp while
        //int count = 0;
        //while (count < 5) {
        //        count++;
        //}

        //int[] arrNumber = {2, 3, 4, 5, 6, 10, 1, -1, 20, 30, 15, 16, 17, 18, 21, 22, 23};
        //int index = arrNumber.length - 1;
        //while (index >= 0) {
        //        System.out.println(arrNumber[index--]);
        //}


        //Scanner scanner = new Scanner(System.in);
        //int value = -1;
        //do {
        //        System.out.print("Mời bạn nhập tuổi: ");
        //        value = scanner.nextInt();
        //} while (value < 0);
        //System.out.println("Bạn hiện tại " + value + " tuổi");


        //------------------------------------------------------------------------------------


        // Hướng đối tượng
        // Object (instance) và class

        // Định nghĩa ra Object (instance)
        // Animal cat = new Animal("1,2 kg", "20 cm");
        //cat.run("Chạy bằng 4 chân");

        // Phương thức
        // Access modifier: phạm vi truy cập
        // duplicate

        //    print("Xin chào");
        //}
        // Định nghĩa phương thức
        // 1: Phạm vi truy cập (public, private, protected, default)
        // 2: Giá trị trả về
        // 3: Tên phương thức
        // 4: Tham số truyền vào

        int data = plus(5, 10);
        print(data + "");
    }

    private static void print(String message) {
        System.out.println(message);

    }

    // Phương thức tính tổng khi xử lý xong trả về kết quả
    private static int plus(int a, int b) {
        int result = a + b;
        return result;
    }


}

