import java.util.Scanner;

public class PRAK104_2410817220012_NoorKhalisa {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] abu = scanner.nextLine().trim().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] bagas = scanner.nextLine().trim().split(" ");

        int pointAbu = 0;
        int pointBagas = 0;

        for (int i = 0; i < 3; i++) {
            String a = abu[i];
            String b = bagas[i];

            if (a.equals(b)) {
                continue;
            } else if (
                    a.equals("B") && b.equals("G") ||
                    a.equals("G") && b.equals("K") ||
                    a.equals("K") && b.equals("B")
            ) {
                pointAbu++;
            } else {
                pointBagas++;
            }
        }

        if (pointAbu > pointBagas) {
            System.out.print("Abu");
        } else if (pointAbu < pointBagas) {
            System.out.print("Bagas");
        }  else {
            System.out.print("Seri");
        }

        scanner.close();
    }
}
