import java.util.Scanner;

public class Hw7 {

    public static int scanner(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        return input.nextInt();
    }

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int neededSum1 = 2459000;
        int defferedSum1 = 15000;
        int start1 = 0;
        int month1 = 0;

        while (start1 < neededSum1) {
            start1 += defferedSum1;
            month1++;
        }
        System.out.println("Месяц: " + month1 + ", Сумма накоплений: " + start1);

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        int q = 1;
        while (q <= 10) {
            System.out.print(q + " ");
            q++;
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");

        int y = 12_000_000;
        int years = 1;
        int birthRate = 17;
        int mortalityRate = 8;

        while (years <= 10) {
            System.out.println("Год " + years + ", численность населения составляет " + y);
            y = y + ((y / 1000) * (birthRate - mortalityRate));
            years++;
        }

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        double deposit2 = 15_000;
        double baseRate2 = 7;
        int neededSum2 = 12_000_000;
        int income2 = 15_000;
        int month2 = 0;

        while (deposit2 <= neededSum2) {
            deposit2 += deposit2 * (baseRate2 / 100);
            deposit2 = Math.round(deposit2);
            deposit2 += income2;
            month2++;
            System.out.println("Месяц: " + month2 + ". Депозит на счету: " + String.format("%.2f", deposit2));
        }

        //do {
        //    deposit2 += deposit2 * (baseRate2 / 100);
        //    deposit2 = Math.round(deposit2);
        //    deposit2 += income;
        //    month2++;
        //    System.out.println("Месяц: " + month2 + ". Депозит на счету: " + String.format("%.2f", deposit2));

        System.out.println();

        //Task 5
        System.out.println("Task 5");

        double deposit3 = 15_000;
        double baseRate3 = 7;
        int neededSum3 = 12_000_000;
        int income3 = 15_000;
        int month3 = 0;
        while (deposit3 <= neededSum3) {
            deposit3 += deposit3 * (baseRate3 / 100);
            deposit3 = Math.round(deposit3);
            deposit3 += income3;
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц: " + month3 + ". Депозит на счету: " + String.format("%.2f", deposit3));
            }
        }

        System.out.println();

        //Task 6
        System.out.println("Task 6");

        double deposit4 = 15_000;
        double baseRate4 = 7;
        int income4 = 15_000;
        int month4 = 9 * 12;

        for (int i = 0; i <= month4; i++) {
            deposit4 += deposit4 * (baseRate4 / 100);
            deposit4 = Math.round(deposit4);
            deposit4 += income4;
            if (i % 6 == 0) {
                System.out.println("Месяц: " + i + ". Депозит на счету: " + String.format("%.2f", deposit4));
            }
        }

        System.out.println();

        //Task 7
        System.out.println("Task 7");

        String firstFridayName = "Input the date of the first friday of the month:";
        int firstFriday = scanner(firstFridayName);

        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчёт! ");
        }

        System.out.println();

        //Task 8
        System.out.println("Task 8");

        String yearName = "Input the current year:";
        int thisYear = scanner(yearName);

        int beforeTwoHundredYears = thisYear - 200;
        int afterOneHundredYears = thisYear + 100;

        for (int i = beforeTwoHundredYears; i <= afterOneHundredYears; i++) {
            if (i % 79 == 0) {
                System.out.println("This year (" + i + ") is awesome. The comet will come back.");
            }
        }
    }
}
