package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 타입 배열
        // int, float, double, char,boolean, byte,long, short
        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);

        System.out.println();

        int[] intArr2 = {1, 2, 3, 4, 5};
//        int[] intArr2=new int[]{1,2,3,4,5};
        printArray(intArr2);

        System.out.println();

        double[] doubleArr = null;
        doubleArr = new double[5];

        printArray(doubleArr);

        System.out.println();

        String[] strArr = new String[3];
        Book[] book = new Book[2];
        book[0] = new Book("s", "s", 1);
        book[1] = new Book("a", "b", 2);
        printArray(book);

        Book[] book2={
                new Book("hello","good",1),
                new Book("asdas","asdsa",1),
                new Book("xcvbxc","xcvbx",1),
        };
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.printf(value + " | ");
        }
    }

    private static void printArray(double[] intArr) {
        for (double value : intArr) {
            System.out.printf(value + " | ");
        }
    }

    private static void printArray(String[] intArr) {
        for (String value : intArr) {
            System.out.printf(value + " | ");
        }
    }

    private static void printArray(Book[] intArr) {
        for (Book value : intArr) {
            System.out.println(value);
        }
    }
}