package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class CountryMain {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        LinkedList<Country> countryList = new LinkedList<>();

        HashMap<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Januari");
        monthMap.put(2, "Februari");
        monthMap.put(3, "Maret");
        monthMap.put(4, "April");
        monthMap.put(5, "Mei");
        monthMap.put(6, "Juni");
        monthMap.put(7, "Juli");
        monthMap.put(8, "Agustus");
        monthMap.put(9, "September");
        monthMap.put(10, "Oktober");
        monthMap.put(11, "November");
        monthMap.put(12, "Desember");

        int totalCountry = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < totalCountry; i++) {
            String countryName = scanner.nextLine();
            String formsOfGovernment = scanner.nextLine();
            String nameOfPresident = scanner.nextLine();

            if (formsOfGovernment.equalsIgnoreCase("monarki")) {
                countryList.add(new Country(countryName, formsOfGovernment, nameOfPresident));
            } else {
                int date = Integer.parseInt(scanner.nextLine());
                int month = Integer.parseInt(scanner.nextLine());
                int year = Integer.parseInt(scanner.nextLine());
                countryList.add(new Country(countryName, formsOfGovernment, nameOfPresident, date, month, year));
            }
        }

        System.out.println();
        for (Country country : countryList) {
            country.displayDetail(monthMap);
        }

        scanner.close();
    }
}
