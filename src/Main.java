public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte myByte = 100;
        short myShort = 10000;
        int myInt = 100000000;
        long myLong = 1000000000000000l;
        float myFloat = 0.00001f;
        double myDouble = 0.100000000000000000000000001;
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float myFloat = 27.12f;
        long myLong = 987678965549l;
        double myDouble = 2.786;
        int myInt = 569;
        short myShort = -159;
        int myInt2 = 27897;
        byte myByte = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int studentClass1 = 23;
        int studentClass2 = 27;
        int studentClass3 = 30;
        int paper = 480;
        int paperStudent = paper / (studentClass1 + studentClass2 + studentClass3);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte speedMachine = 16;
        byte timeMachine = 2;
        int speed = speedMachine / timeMachine;
        int speedTime1 = 20 * speed;
        int speedTime2 = 60 * 24 * speed;
        int speedTime3 = 60 * 24 * 3 * speed;
        int speedTime4 = 60 * 24 * 30 * speed;
        System.out.println("За 20 минут машина произвела " + speedTime1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + speedTime2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + speedTime3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + speedTime4 + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int jars = 120;
        int jarWhiteToClass = 2;
        int jarBrownToClass = 4;
        int sumJarsToClasses = jarBrownToClass + jarWhiteToClass;
        int sumClasses = jars / sumJarsToClasses;
        int sumJarWhite = sumClasses * jarWhiteToClass;
        int sumJarBrown = sumClasses * jarBrownToClass;
        System.out.println("В школе, где " + sumClasses + " классов, нужно " + sumJarWhite + " банок белой краски и " + sumJarBrown + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        // количество продуктов
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        // вес продуктов
        int bananasWeight = 5 * 80;
        int milkWeight = (200 / 100) * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int AllWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Вес коктеля в граммах - " + AllWeight);
        System.out.println("Вес коктеля в килограммах - " + AllWeight / 1000 + "кг, а точнее " + (AllWeight / 1000.0) + "кг");


    }

    public static void task7() {
        System.out.println("Задача 7");
    }

    public static void task8() {
        System.out.println("Задача 8");
    }
}