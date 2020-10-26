package ru.mirea.prac6;

public class MergeSort {
    public static void sortArray(Comparable[] arrayA) {
        if (arrayA.length < 2) {
            return;
        }
        Comparable[] arrayB = new Comparable[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayB.length);

        Comparable[] arrayC = new Comparable[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayB.length, arrayC, 0, arrayC.length);

        sortArray(arrayB);
        sortArray(arrayC);

        System.arraycopy(mergeArray(arrayB, arrayC), 0, arrayA, 0, arrayA.length);
    }

    public static Comparable[] mergeArray(Comparable[] arrayA, Comparable[] arrayB) {

        Comparable[] arrayC = new Comparable[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA].compareTo(arrayB[positionB]) < 0) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;

    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("И.И.Иванов", 3),
                new Student("П.П.Петров", 5),
                new Student("С.С.Смирнов", 4),
        };
        sortArray(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
