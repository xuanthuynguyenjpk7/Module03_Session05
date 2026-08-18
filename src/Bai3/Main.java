package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        // Thay thế tất cả ký tự số từ 0-9 bằng *
        String result = str.replaceAll("[0-9]", "*");

        // In kết quả
        System.out.println("Chuỗi sau khi thay thế: " + result);

        sc.close();
    }
}