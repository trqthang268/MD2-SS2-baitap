public class baitap05 {
    public static void main(String[] args) {
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là:");
        int num = 1;
        while (num > 0) {
            if (num % 5 == 0 && num % 7 == 0 && num % 11 == 0) {
                System.out.println(num);
                break;
            }
            num++;
            }
        }
    }
