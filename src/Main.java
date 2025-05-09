public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int plannedCapital = 2459000;
        int monthlyAccumulation = 15000;
        int totalAccumulation = 0;
        int months = 0;

        while (totalAccumulation < plannedCapital) {
            totalAccumulation += monthlyAccumulation;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalAccumulation + " рублей");
        }

        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
            for (int start2 = 10; start2 >= 1; start2--) {
            System.out.print(start2 + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int y = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int year = 1;
        int changesOn = 1000;
        while (year <= 10) {
            year++;
            y += ((birth - mortality) * changesOn) * (y / changesOn);

            System.out.println("Год " + year + " , численность населения составляет " + y);
        }
    }
}