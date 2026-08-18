package Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập email
        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine();

        // Loại bỏ khoảng trắng thừa ở đầu và cuối
        email = email.trim();

        // Regex kiểm tra email
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";

        // Kiểm tra email
        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        sc.close();
    }
}
