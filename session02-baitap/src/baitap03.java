import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đề kiểm tra số nguyên tố");
        int num = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            for (int i = 2; i < num - 1; i++){
                if (num % i ==0){
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println(num+" là số nguyên tố\n");
        }else{
            System.out.println(num+" không phải là số nguyên tố\n");
        }

        System.out.println("Số nguyên tố từ 2 -100 là:");
        int count = 0;
        int currentNum = 2;
        while (count < 100) {
            boolean flag = true;
            for (int i = 2; i <= currentNum - 1; i++) {
                if (currentNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && currentNum<=100) {
                System.out.println("Số nguyên tố là: " + currentNum);
                count++;
            }
            currentNum++;
        }
        System.out.println();

    }
}
