package sort;

import java.util.Scanner;

class Source {
    public static void main(String ss[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            int inputArraySize = scanner.nextInt();
            String firstNames[] = new String[inputArraySize];
            String lastNames[] = new String[inputArraySize];
            for (int i = 0; i < inputArraySize; i++) {
                firstNames[i] = scanner.next().toLowerCase();
            }
            for (int i = 0; i < inputArraySize; i++) {
                lastNames[i] = scanner.next().toLowerCase();
            }

            int firstNamesArraySize = firstNames.length;
            String temp = "";
            for (int i = 0; i < firstNamesArraySize; i++) {
                for (int j = i + 1; j < firstNamesArraySize; j++) {
                    if (firstNames[i].compareToIgnoreCase(firstNames[j]) > 0) {
                        temp = firstNames[i];
                        firstNames[i] = firstNames[j];
                        firstNames[j] = temp;
                    }
                }
            }

            int lastNamesArraySize = lastNames.length;
            temp = "";
            for (int i = 0; i < lastNamesArraySize; i++) {
                for (int j = i + 1; j < lastNamesArraySize; j++) {
                    if (lastNames[i].compareToIgnoreCase(lastNames[j]) < 0) {
                        temp = lastNames[i];
                        lastNames[i] = lastNames[j];
                        lastNames[j] = temp;
                    }
                }
            }

            for (String i : firstNames) {
                System.out.println(i);
            }
            for (String i : lastNames) {
                System.out.println(i);
            }
        }
    }
}
