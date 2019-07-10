package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr=new int[2][3];
        printArray(intArr);

        String[][] strArr={
                new String[3],
                new String[2]
        };
        printArray(strArr);
        String[][] strArr2={
                {"C","JAVA","PHP"},
                {"C#","Python"}
        };
        String[][] strArr3= {
                new String[]{"C", "JAVA", "PHP"},
                new String[]{"C#", "Python"}
        };
        String[][] strArr4= new String[][]{
                {"C","JAVA","PHP"},
                {"C#","Python"}
        };
        String[][] strArr5= new String[][]{
                new String[]{"C", "JAVA", "PHP"},
                new String[]{"C#", "Python"}
        };
    }

    private static void printArray(int[][] intArr) {
        for(int[] i:intArr){
            for(int j:i){
                System.out.println(j);
            }
        }
    }
    private static void printArray(String[][] intArr) {
        for(String[] i:intArr){
            for(String j:i){
                System.out.println(j);
            }
        }
    }
}
