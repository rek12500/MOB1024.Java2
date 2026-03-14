package Slide1;

public class Main {
    public static void main(String[] args) {
        System.out.println("12 PS48830 Lê Đăng Hải");
        Xe xe = new Xe();
        xe.setHangXe("Lambo");
        xe.setNamSanXuat(2026);
        System.out.println(xe.toString());
        
        Xe xe2 = new Xe("Ferrari", 2025);
        System.out.println(xe2.toString());
    }   
}
