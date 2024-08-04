public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte apple = 5;
        System.out.println(" Значение переменной с типом apple " + " ровно " + apple);
        short oranges = 10000;
        System.out.println(" Значение переменной с типом oranges " + " ровно " + oranges);
        int lemons = 1000000;
        System.out.println(" Значение переменной с типом lemons " + " ровно " + lemons);
        long bananas = 150000000;
        System.out.println(" Значение переменной с типом bananas " + " ровно " + bananas);
        float grapefruit = 2.5f;
        System.out.println(" Значение с переменной с типом grapefruit" + " ровно " + grapefruit);
        double redOranges = 10.25F;
        System.out.println(" Значение с переменной с типом redOranges " + " ровно " + redOranges);
        System.out.println(" Задание 2");
        byte f = 67;
        int c = 27897;
        short a = 569;
        short e = -159;
        float x = 27.12f;
        float y = 2.786f;
        long g = 987678965549L;
        System.out.println(" Задание 3");
        byte A = 23;
        byte B = 27;
        byte C = 30;
        short D = 480;
        int E = A + B + C;
        int F = 480 / E;
        System.out.println(" Общее количество учеников " + E + ", 480 листов мы делим на общее количество учеников и получается " + F + " листов будет у каждого ученика");
        System.out.println(" Задание 4");
        byte Q = 16 / 2;
        System.out.println(" Машина производит в минуту " + Q + " бутылок ");
        short W = 8*20;
        System.out.println(" За 20 минут машина произвела " + W + " штук бутылок");
        int R = 1440*8;
        System.out.println(" За сутки(1440 минут) машина произвела " + R + " штук бутылок");
        int T = 4320*8;
        System.out.println(" За 3 суток(4320 минут) машина произвела " + T + " штук бутылок");
        double Y = 43800.048*8;
        System.out.println(" За месяц(43800.048 минут) машина произвела " + Y + " штук бутылок");
        System.out.println(" Задание 5");
        byte classes = 120/6;
        byte whitePaint = (byte) (classes*2);
        byte brownPaint = (byte) (classes*4);
        System.out.println(" В школе где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println(" Задание 6");
        short Banana = 5*80;
        short milk = 105*2;
        short iceCream = 100*2;
        short eggs = 70*4;
        int totalWeight = Banana + milk + iceCream +eggs;
        short oneKg = 1000;
        float weightKg = totalWeight/(float)oneKg;
        System.out.println(" масса коктейля в граммах состовляет " + totalWeight + " а в киллограммах " + weightKg);
        System.out.println(" Задание 7");
        short athletemassGr = 7000;
        short z = (short) (athletemassGr/250);
        short s = (short)  (athletemassGr/500);
        byte v = (byte) (z&s);
        System.out.println(" Что бы похудеть спортсмену на 7 кг сбрасывая при этом в день по 250 грамм нужно " + z + " дней, а если худеть по 500 грамм в день, то " + s + " дней, в среднем, чтобы добиться результата в похудения нужно " + v + " дней " );
        System.out.println(" Задание 8");
        int masha = 67760;
        int m = 67760/10;
        int salaryMasha = masha + m;
        int denis = 83690;
        int d = 83790/10;
        int salaryDenis = denis+d;
        int kristina = 76230;
        int k = 76230/10;
        int salaryKristina = kristina+k;
        long oneYearMasha = 67760*12;
        long oneYearDenis = 83690*12;
        long oneYearKristina = 76230*12;
        long newOneYearMasha = salaryMasha*12;
        long newOneYearDenis = salaryDenis*12;
        long newOneYearKrisitna = salaryKristina*12;
        long differenceSalaryMasha = newOneYearMasha-oneYearMasha;
        long differenceSalaryDenis = newOneYearDenis-oneYearDenis;
        long differenceSalaryKristina = newOneYearKrisitna-oneYearKristina;
        System.out.println(" Маша теперь получает " + salaryMasha + " рублей, годовой доход вырос на " + differenceSalaryMasha + " рублей ");
        System.out.println(" Денис теперь получает " + salaryDenis + " рублей, годовой доход вырос на " + differenceSalaryDenis + " рублей ");
        System.out.println(" Кристина теперь получает " + salaryKristina + " рублей, годовой доход вырос на " + differenceSalaryKristina + " рублей ");




















    }
}