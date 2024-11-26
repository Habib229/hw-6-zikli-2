public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя рабоиа");
        System.out.println("Задача 1");
        int postpone = 15000;
        int postpone1 = 0;
        int months = 0;
        while (postpone1 < 2_459_000) {
            postpone1 = postpone1 + postpone;
            months = postpone1 / postpone;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + postpone1 + " рублей");
        }

        System.out.println();

        System.out.println("Задача 2");
        for (int a = 1; a <= 10; a = a + 1){
            System.out.println(a);
        }
        System.out.println();
        int b = 11;
        while (b > 1) {
            b = b - 1;
            System.out.println(b);
        }

        System.out.println();

        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int people = 1000;
        for (int c = 1; c <= 10; c = c + 1) {
            population = population + ((population / people) * (birthRate - deathRate));
            System.out.println("Год " + c + ", численность населения составляет " + population);
        }

        System.out.println();

        System.out.println("Задача 4");
        int deposit = 15_000;
        int depositNyu = 0;
        int month = 0;
        int theBanksPercentage = 7;
        while (depositNyu <= 12_000_000) {
            depositNyu = (depositNyu + ((depositNyu / 100) * theBanksPercentage)) + deposit;
            month = month + 1;
            System.out.println("В " + month + " месяц накопление составляет " + depositNyu + " рублей");
        }

        System.out.println();

        System.out.println("Задача 5");
        int deposit2 = 15_000;
        int depositNyu2= 0;
        int month2 = 0;
        int theBanksPercentage2 = 7;
        while (depositNyu2 <= 12_000_000) {
            depositNyu2 = (depositNyu2 + ((depositNyu2 / 100) * theBanksPercentage2)) + deposit2;
            month2 = month2 + 1;
            if (month2 % 6 == 0) {
                System.out.println("В " + month2 + " месяц накопление составляет " + depositNyu2 + " рублей");
            }
        }

        System.out.println();

        System.out.println("Задача 6");
        int initialAmount = 15_000;
        int bankInterest = 7;
        int bank = 0;
        int year = 0;
        while (year < 9 * 12) {
            bank = bank + ((bank / 100) * bankInterest );
            bank = bank + initialAmount;
            year = year + 1;
            if (year % 6 == 0){
                System.out.println(year + " месяц, сумма накопления равна " + bank);
                }
            }

        System.out.println();

        System.out.println("Задача 7");
        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println();

        System.out.println("Задача 8");
        int beginning = 2024 - 200;
        int completion = 2024 + 100;
        for (int year2 = beginning; year2 < completion; year2 ++) {
            if (year2 % 79 == 0) {
                System.out.println(year2);
            }
        }

    }
}