package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число, до которого искать совершенные числа: ");
        int maxNumber = sc.nextInt();

        HashMap<Integer, Integer> hashMass = new HashMap<>();
        for (int i = 2; i <= maxNumber; i++) {
            hashMass.put(i, 1);
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= maxNumber; i++) {
            for (int j = i * 2; j <= maxNumber; j += i) {
                hashMass.put(j, hashMass.get(j) + i);
            }
            System.out.println("Проверено: " + i);
            if (i == hashMass.get(i)) {
                numbers.add(i);
            }
        }

        System.out.println(numbers);
    }
}