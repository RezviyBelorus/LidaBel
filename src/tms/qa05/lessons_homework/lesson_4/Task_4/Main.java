package tms.qa05.lessons_homework.lesson_4.Task_4;

import tms.qa05.lessons_homework.lesson_4.Task_1.Girl;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Girl girl_1 = new Girl();
        Girl girl_2 = new Girl();

        System.out.println(girl.showText());

        girl_2.setText("Bye from static");

        System.out.println(girl_1.showText());
        System.out.println(girl_2.showText());
    }
}
