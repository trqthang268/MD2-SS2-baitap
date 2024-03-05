import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========MENU==========");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("4. In hình tam giác cân");
        System.out.println("Chọn 1 trong menu");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                };
                break;
            case 3:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                };
                break;
            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Nhập liệu sai");
        }
    }
}
