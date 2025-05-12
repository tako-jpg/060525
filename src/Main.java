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
        int year = 0;
        int changesOn = 1000;
        while (year <= 10) {
            year++;
            y += ((y / changesOn) * (birth - mortality));
            System.out.println("Год " + year + " , численность населения составляет " + y);
        }
        System.out.println("Задача 4");
        int deposit = 15000;
        double percentMonth = 0.07;
        int accumulation = 12_000_000;
        int month = 1;
        while (deposit <= accumulation) {
            deposit += deposit * percentMonth;
            System.out.println("В " + month + " месяц, сумма накоплений составит: " + deposit);
            month++;
        }
        System.out.println("Задача 5");
        int deposit2 = 15000;
        double percentMonth2 = 0.07;
        int accumulation2 = 12_000_000;
        int month2 = 1;
        while (deposit2 <= accumulation2) {
            deposit2 += deposit2 * percentMonth2;
        if (month2 % 6 == 0)
            System.out.println("В " + month2 + " месяц, сумма накоплений составит: " + deposit2);
        month2++;
        }
        System.out.println("Задача 6");
        int deposit3 = 15000;
        double percent = 0.07;
        int monthOn6 = 108;
        for (int i = 0; i < monthOn6; i = i + 6) {
            deposit3 += (deposit3 * percent) * 6;
            System.out.println("Через " + (i + 6) + " месяцев сумма накоплений: " + deposit3 + " рублей");
        }
        System.out.println("Задача 7");
        int firstFriday = 6;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int nowYear = 2025;
        int yearBefore = nowYear - 200;
        int yearAfter = nowYear + 100;
        int period = 79;
        for (year = 0; year < yearAfter; year += period)
            if (year > yearBefore) {
                System.out.println(year);
        }
    }
}