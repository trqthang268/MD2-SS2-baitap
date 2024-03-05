import java.util.Scanner;

public class baitap07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("========MENU========");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát\n");
            System.out.println("Hãy chọn 1");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    System.out.println("Nhập chiều dài");
                    int dai = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều rộng");
                    int rong = Integer.parseInt(scanner.nextLine());
                    int chuvi = (dai+rong)*2;
                    int dientich = dai*rong;
                    System.out.println("Chu vi hình chữ nhật là: "+chuvi);
                    System.out.println("Diện tích hình chữ nhật là: "+dientich);
                    break;
                case 2:
                    System.out.println("Nhập chiều dài cạnh a");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều dài cạnh b");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều dài cạnh c");
                    int c = Integer.parseInt(scanner.nextLine());
                    int p = (a+b+c)/2;
                    int chuvitg = a+b+c;
                    float dientichtg = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("Chu vi hình tam giác là: "+chuvitg);
                    System.out.println("Diện tích hình tam giác là: "+dientichtg);
                    break;
                case 3:
                    System.out.println("Nhập bán kính hình tròn");
                    int r = Integer.parseInt(scanner.nextLine());
                    final double PI = 3.14;
                    int chuvitron = (int) (2*PI*r);
                    int dientichtron = (int) (PI*(r*r));
                    System.out.println("Chu vi hình tròn là: "+chuvitron);
                    System.out.println("Diện tích hình tròn là: "+dientichtron);
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
