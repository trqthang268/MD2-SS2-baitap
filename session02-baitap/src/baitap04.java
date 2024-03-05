public class baitap04 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int count = 0;
        int currentNum = 2;
        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i <= currentNum - 1; i++) {
                if (currentNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Số nguyên tố là: " + currentNum);
                count++;
            }
            currentNum++;
        }
    }
}
