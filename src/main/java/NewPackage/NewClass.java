package NewPackage;

public class NewClass {

    public static void main(String[] args) {
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64L;
        float e = 12.8f;
        double f = 51.2;
        char g = 'a';
        boolean h = true;

        System.out.println(third());
        System.out.println(fourth(10,5));
        fifth(2);
        System.out.println(sixth(3));
        eighth("Алина");
        ninth(-204);
    }

    public static float third(){
        /*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – аргументы этого метода, имеющие тип float.*/
        float a = 1.1f;
        float b = 2.2f;
        float c = 3.3f;
        float d = 4.4f;
        return a * (b + (c / d));

    }

    public static boolean fourth(int a, int b){
        /*Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false.*/
        return ((a + b) >=10 && (a + b) <=20);

    }

    public static void fifth(int a){
        /*Написать метод, которому в качестве параметра передается
        целое число, метод должен напечатать в консоль, положительное
        ли число передали или отрицательное. Замечание: ноль считаем
        положительным числом.
         */
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean sixth(int a){
        /*Написать метод, которому в качестве параметра передается
        целое число. Метод должен вернуть true, если число
        отрицательное, и вернуть false если положительное.
         */
        return (a < 0);
    }

    public static void eighth(String a){
        /*Написать метод, которому в качестве параметра передается
        строка, обозначающая имя. Метод должен вывести в консоль
        сообщение «Привет, указанное_имя!».
         */
        System.out.println("Привет, " + a + "!");
    }

    public static void ninth(int a){
        /*Написать метод, который определяет, является ли год
        високосным, и выводит сообщение в консоль. Каждый 4-й
        год является високосным, кроме каждого 100-го, при этом
        каждый 400-й – високосный.*/
        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) System.out.println(a + " год - високосный,");
        else System.out.println(a + " год - не високосный,");
    }

}
