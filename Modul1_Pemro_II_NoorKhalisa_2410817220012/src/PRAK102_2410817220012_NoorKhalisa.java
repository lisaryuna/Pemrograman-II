import java.util.Scanner;

public class PRAK102_2410817220012_NoorKhalisa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();

        int count = 0;

        while(count <= 10){

            if (start % 5 == 0){
                System.out.print((start / 5) - 1);
            } else {
                System.out.print(start);
            }

            if (count < 10) {
                System.out.print(", ");
            }

            start++;
            count++;
        }

        input.close();
    }
}