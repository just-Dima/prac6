package ru.mirea.prac6;

public class Student implements Comparable <Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (grade>o.grade){
            return 1;
        }
        if(grade==o.grade){
            return 0;
        }
        return -1;
    }
    }
