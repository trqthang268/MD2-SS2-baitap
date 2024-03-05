import java.util.Scanner;

public class baitap08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập độ dài cạnh a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập độ dài cạnh b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập độ dài cạnh c");
            int c = Integer.parseInt(scanner.nextLine());
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
                int p = (a+b+c)/2;
                int chuvi = p*2;
                float dientich = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("Chu vi tam giác là: "+chuvi);
                System.out.println("Diện tích tam giác là: "+dientich);
                break;
            }else {
                System.out.println("Đây không phải là độ dài của 3 cạnh tam giác");
                System.out.println("Mời nhập lại:");
            }
        }
    }
}
