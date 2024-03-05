import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị đầu");
        int begin = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá trị cuối");
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for ( int i = begin; i<=end; i++){
            if (i%2==0){
                sum += i;
            }
        }
        System.out.printf("Tổng số chẵn trong khoảng từ %d đến %d là %d",begin,end,sum);
    }
}
