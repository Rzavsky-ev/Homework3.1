public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int varInt = 100000;
        byte varByte = 20;
        short varShort = 300;
        long varLong = 100000000L;
        float varFloat = 1.5f;
        double varDouble = 2.551254789;
        System.out.println("Значение переменной varInt с типом int равно " + varInt + ".\n" +
                "Значение переменной varByte с типом byte равно " + varByte + ".\n" +
                "Значение переменной varShort с типом short равно " + varShort + ".\n" +
                "Значение переменной varLong с типом long равно " + varLong + ".\n" +
                "Значение переменной varFloat с типом float равно " + varFloat + ".\n" +
                "Значение переменной varDouble с типом double равно " + varDouble + ".\n");

        //Задача 2
        System.out.println("Задача 2");
        float var_1 = 27.12f;
        long var_2 = 987678965549L;
        /* Так как в задаче у числа 2,786-запятая, а не точка т.е. в
        численную переменную ее поместить не смогу, то буду "выкручиваться";*/
        String var_3 = "2,786";
        short var_4 = 569;
        short var_5 = -159;
        short var_6 = 27897;
        byte var_7 = 67;
        System.out.println("Значение переменной var_1 с типом float равно " + var_1 + ".\n" +
                "Значение переменной var_2 с типом long равно " + var_2 + ".\n" +
                "Значение переменной var_3 с типом String равно " + var_3 + ".\n" +
                "Значение переменной var_4 с типом short равно " + var_4 + ".\n" +
                "Значение переменной var_5 с типом short равно " + var_5 + ".\n" +
                "Значение переменной var_6 с типом short равно " + var_6 + ".\n" +
                "Значение переменной var_7 с типом byte равно " + var_7 + ".\n");


        //Задача 3
        System.out.println("Задача 3");
        //Количество учеников у Людмилы Павловны
        int studentsLP = 23;
        //Количество учеников у Аны Сергеевны
        int studentsAS = 27;
        //Количество учеников у Екатерины Андреевны
        int studentsEA = 30;
        //Всего бумаги
        int totalPaper = 480;
        //чтобы не вводить новую переменную, вычисление запишу в print
        System.out.println("На каждого ученика рассчитано " + (totalPaper /
                (studentsEA + studentsAS + studentsLP)) + " листов бумаги.\n");

        //Задача 4
        System.out.println("Задача 4");
        //Производительность бутылок за две минуты
        int performance = 16;
        //Производительность бутылок за 20 минут
        int performance_20m = 20 * performance / 2;
        //Производительность бутылок за сутки (в сутках 24 часа, в часе 60 мин.)
        int performanceDay = 24 * 60 * performance / 2;
        //Производительность за трое суток
        int performance_3day = performanceDay * 3;
        //Производительность за месяц (допустим, что месяц состоит из 30 дней)
        int performanceMonth = performanceDay * 30;

        System.out.println("За 20 минут машина произвела " + performance_20m + " бутылок.\n" +
                "За сутки машина произвела " + performanceDay + " бутылок.\n" +
                "За трое суток машина произвела " + performance_3day + " бутылок.\n" +
                "За месяц машина произвела " + performanceMonth + " бутылок.\n");

        //Задача 5
        System.out.println("Задача 5");
        //Общее количество банок краски
        int totalCans = 120;
        //Количество банок белой краски на класс
        int cansWhitePaint = 2;
        //Количество банок коричневой краски на класс
        int cansBrownPaint = 4;
        //Количество классов в школе
        int totalClass = totalCans / (cansWhitePaint + cansBrownPaint);
        //Количество банок белой краски на школу
        int totalWhiteCans = cansWhitePaint * totalClass;
        //Количество банок коричневой краски на школу
        int totalBrownCans = cansBrownPaint * totalClass;

        System.out.println("В школе, где " + totalClass + " классов, нужно " +
                totalWhiteCans + " банок белой краски и " +
                totalBrownCans + " банок коричневой краски.\n");

        //Задача 6
        System.out.println("Задача 6");
        //масса одного банана
        int massBanan = 80;
        //масса 100 мл молока
        int massMilk = 105;
        // масса одного брикета мороженного
        int massIce = 100;
        //масса одного яйца
        int massEgg = 70;
        //количество продуктов в рецепте
        int quantityBanan = 5, quantityMilk = 200, quantityIce = 2, quantityEgg = 4;
        //масса завтрака в граммах
        int massGr = (massBanan * quantityBanan) + ((massMilk / 100) * quantityMilk) + (massIce * quantityIce) +
                (massEgg * quantityEgg);
        //масса завтрака в килограммах, т.к. масса в кг будет дробным числом, делаем приведение типов
        float massKg = (float) massGr / 1000;
        System.out.println("Масса завтрака спортсмена в граммах " + massGr + ", а в килограммах " +
                massKg + ".\n");

        //Задача 7
        System.out.println("Задача 7");
        //какое количество массы нужно сбросить (сразу переведу в граммы)
        int weightLose = 7 * 1000;
        //максимальная и минимальная возможная масса потери в день в граммах
        int maxLoss_500g = 500, minLoss_250g = 250;
        //количество дней при потере - 500 г.
        int dayLoss_500g = weightLose / maxLoss_500g;
        //количество дней при потере - 500 г.
        int dayLoss_250g = weightLose / minLoss_250g;
        //среднее количество дней
        int averageDays = (dayLoss_500g + dayLoss_250g) / 2;
        System.out.println("Если спортсмен будет терять по 500г. каждый день, то потребуется " +
                dayLoss_500g + " дней, если по 250г.,\n то " + dayLoss_250g +
                " дней. В среднем ему потребуется " + averageDays + " дней.\n");

        //Задача 8
        System.out.println("Задача 8");
        //Зарплаты в месяц Маши, Дениса и Кристины соответственно
        int salaryMasha = 67760, salaryDenis = 83690, salaryKris = 76230;
        //Зарплаты в месяц с учетом повышения на 10%
        int newSalaryMasha = ((salaryMasha * 10) / 100) + salaryMasha;
        int newSalaryDenis = ((salaryDenis * 10) / 100) + salaryDenis;
        int newSalaryKris = ((salaryKris * 10) / 100) + salaryKris;
        //Разница годового дохода
        int diffSalaryMasha = 12 * (newSalaryMasha - salaryMasha);
        int diffSalaryDenis = 12 * (newSalaryDenis - salaryDenis);
        int diffSalaryKris = 12 * (newSalaryKris - salaryKris);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей в месяц. Годовой доход вырос на " +
                diffSalaryMasha + " рублей.\n" + "Денис теперь получает " + newSalaryDenis + " рублей в месяц. Годовой " +
                "доход вырос на " +
                diffSalaryDenis + " рублей.\n" + "Кристина теперь получает " + newSalaryKris + " рублей в месяц. " +
                "Годовой доход вырос на " +
                diffSalaryKris + " рублей.");
    }
}