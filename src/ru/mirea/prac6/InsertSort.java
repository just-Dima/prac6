package ru.mirea.prac6;
import java.util.ArrayList;
import java.util.List;
public class InsertSort {
    public static void sort(Comparable[] list) {
        List<Comparable> result = new ArrayList<>(list.length);
        for (Comparable c : list) {
            int i;
            for (i = 0; i < result.size(); i++) {
                if (result.get(i).compareTo(c) > 0)
                    break;
            }
            result.add(i, c);
        }
        for (int i = 0;i<list.length; i++){
            list[i] = result.get(i);
        }
    }
    public static void main(String[] args){
        Student[] students = {
                new Student("И.И.Иванов",3),
                new Student("П.П.Петров",5),
                new Student("С.С.Смирнов",4),
        } ;
        sort(students);
        for (Student s: students){
            System.out.println(s);
        }
    }
}
