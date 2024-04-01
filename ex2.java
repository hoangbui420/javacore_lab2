import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten");
        String ten = input.next();
        System.out.println("Nhap tuoi");
        int tuoi = input.nextInt();
        System.out.println("Nhap gioi tinh");
        String gioiTinh = input.next();
        System.out.println("Nhap dia chi");
        String diaChi = input.next();
        System.out.println("Xin chào các bạn, mình tên là " + ten +", năm nay mình " + tuoi + " tuổi, giới tính " + gioiTinh + "Hiện tại mình đang sống và làm việc tại " + diaChi);
    }
}
