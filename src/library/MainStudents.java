//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

public class MainStudents {
    public static void listStudents(Student [] students){
        for (Student student : students){
            if (student!=null)
                System.out.println(student);
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0]=new Student("Albert Einstein");
        students[1]= new Student("Marie Curie");
        students[2]= new Student("Rosalind Franklin");
        students[3]= new Student("Stephen Hawking");
        listStudents(students);

    }
}
