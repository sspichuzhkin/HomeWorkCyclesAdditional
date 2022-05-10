package pro.sky;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
    }

    public static void Task1() {
// Почти уверен что возможно без вложенности,
// но не уверен что в рамках пройденного материала :)
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }
    }

    public static void Task2() {

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + ", " + b + ", ");
        for (int i = 3; i <= 10; i++) {
            c = a + b;
            if (i != 10) {
                System.out.print(c + ", ");
            } else {
                System.out.print(c);
            }
            a = b;
            b = c;
        }
    }
}