import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập số cần kiểm tra");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("==========MENU==========");
            System.out.println("1. Kiểm tra tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    ;
                    break;
                case 2:
                    boolean check = true;
                    if (number < 2) {
                        check = false;
                    } else {
                        for (int i = 2; i < number - 1; i++) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                        }
                    }
                    if (check) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không phải là số nguyên tố");
                    }
                    break;
                case 3:
                    if (number % 3 == 0) {
                        System.out.println(number + " là số chia hết cho 3");
                    } else {
                        System.out.println(number + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập liệu sai");
                    break;
            }
        }
    }
}
