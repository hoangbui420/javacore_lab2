import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double chieuDai = input.nextDouble();
        System.out.println("Nhap chieu rong");
        double chieuRong = input.nextDouble();
        double chuVi = chieuDai + chieuRong;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Chu vi cua hinh chu nhat la " + chuVi);
        System.out.println("Dien tich cua hinh chu nhat la " + dienTich);

    }
}
