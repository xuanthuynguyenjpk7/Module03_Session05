package Bai2;
public class Main {
    public static void main(String[] args) {

        // Chuỗi ban đầu
        StringBuilder sb = new StringBuilder("Hello, Java World!");

        // In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + sb);

        // Xóa các ký tự từ vị trí 5 đến 9
        sb.delete(5, 10);

        // In chuỗi sau khi xóa
        System.out.println("Chuỗi sau khi xóa: " + sb);

        // Thay thế "World" bằng "Universe"
        sb.replace(7, 12, "Universe");

        // In chuỗi sau khi thay thế
        System.out.println("Chuỗi sau khi thay thế: " + sb);
    }
}
