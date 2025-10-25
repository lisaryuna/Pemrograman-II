package soal2;

import java.util.HashMap;

public class Country {
    private String countryName, formsOfGovernment, nameOfPresident;
    private int independenceDate, independenceMonth, independenceYear;

    public Country(String countryName, String formsOfGovernment, String nameOfPresident, int independenceDate, int independenceMonth, int independenceYeara) {
        this.countryName = countryName;
        this.formsOfGovernment = formsOfGovernment;
        this.nameOfPresident = nameOfPresident;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYeara;
    }

    public Country(String countryName, String formsOfGovernment, String nameOfPresident) {
        this.countryName = countryName;
        this.formsOfGovernment = formsOfGovernment;
        this.nameOfPresident = nameOfPresident;
        this.independenceDate = 0;
        this.independenceMonth = 0;
        this.independenceYear = 0;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getNameOfPresident() {
        return nameOfPresident;
    }

    public String getFormsOfGovernment() {
        return formsOfGovernment;
    }

    public int getIndependenceDate() {
        return independenceDate;
    }

    public int getIndependenceMonth() {
        return independenceMonth;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }

    public void displayDetail(HashMap<Integer, String> monthName) {
        String formsOfGovernmentFormatted = "";
        switch (formsOfGovernment.toLowerCase()) {
            case "presiden":formsOfGovernmentFormatted = "Presiden";
            break;
            case "monarki":formsOfGovernmentFormatted = "Raja";
            break;
            case "perdana menteri": formsOfGovernmentFormatted = "Perdana Menteri";
            break;
            default: formsOfGovernmentFormatted = formsOfGovernment;
        }

        System.out.println();
        System.out.println("Negara " + getCountryName() + " mempunyai " + formsOfGovernmentFormatted + " bernama " + getNameOfPresident());

        if(!formsOfGovernment.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + getIndependenceDate() + " " + monthName.get(getIndependenceMonth()) + " " + getIndependenceYear());
        }
    }
}
