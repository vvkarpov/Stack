package ru.vkarpov.dev;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Sheet> stack = new ArrayList<>();
    static int count = 1;

    public static void main(String[] args) {
        putPaper(new Sheet(count));
        putPaper(new Sheet(count));
        putPaper(new Sheet(count));
        takePaper();
        putPaper(new Sheet(count));

        System.out.println(stack);
    }

    public static void putPaper(Sheet sheet) {
        stack.add(sheet);
        count++;
    }

    public static void takePaper() {
        if (stack != null && stack.size() != 0 ){
            stack.remove(stack.size() - 1);
            count--;
        }
    }

    public static class Sheet{
        private int number;

        public Sheet(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String toString() {
            return "Sheet{" +
                    "number=" + number +
                    '}';
        }
    }

}
