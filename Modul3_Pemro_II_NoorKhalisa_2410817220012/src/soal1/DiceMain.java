package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class DiceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDice = scanner.nextInt();
        LinkedList<Dice> diceList = new LinkedList<Dice>();

        for(int i = 0; i < numberOfDice; i++) {
            diceList.add(new Dice());
        }


        int totalValue = 0;
        for(int i = 0; i < diceList.size(); i++) {
            int diceValue = diceList.get(i).getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + diceValue);
            totalValue += diceValue;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalValue);

        scanner.close();
    }
}
