//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

import java.util.Scanner;

public class Mainlibrary {

    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");

        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

        Publication[] publications = new Publication[100];


        publications[10] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                2, authors[0], "Tay Hohoff", 1960);
        publications[11] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020,
                "Yanshuf Aezim", authors[5],
                "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[12] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[13] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
        publications[14] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021,
                "Alufot Eropa le-Mathematica", authors[4],
                "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[15] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
        publications[16] = new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1], "Maxwell Perkins", 1925);
        publications[17] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[18] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[19] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2], "", 2002);
        publications[20] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022,
                "AI (artificial intelligence) is upgrading", authors[3],
                "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[21] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
        publications[22] = new Journal("Nature", "Springer Nature",
                5, 590, 2021);

        Publication[] publication2 = new Publication[13];
        publication2[0] = publications[10];
        publication2[1] = publications[16];
        publication2[2] = publications[19];
        publication2[3] = publications[12];
        publication2[4] = publications[17];
        publication2[5] = publications[22];
        publication2[6] = publications[11];
        publication2[7] = publications[14];
        publication2[8] = publications[20];
        publication2[9] = publications[13];
        publication2[10] = publications[15];
        publication2[11] = publications[18];
        publication2[12] = publications[21];

        Student student = new Student();
        Publication[] students1 = new Publication[4];
        Publication[] students2 = new Publication[4];
        Publication[] students3 = new Publication[4];

        Scanner input = new Scanner(System.in);
        int e = 0;
        int i = 0;
        int j = 0;
        int u = 0;
        // application of a library
        while (true) {
            System.out.println("Welcome to the library.start lone:");
            System.out.println("Insert student number [0,3]: (if u wanna leave type -1)");
            int num_student = input.nextInt();
            if (num_student == -1) {
                System.out.println("Report on library status:");
                System.out.println("==============================");
                for (Publication list : publication2) {
                    if (list != null)
                        System.out.println(list.toPrint());
                }
                break;
            }
            System.out.println("Insert publication number [10,22]:");
            int publication_number = input.nextInt();
            // the if check if u have a copy and check if The student has borrowed more then 3 publications
            if (publications[publication_number].qty == 0) {
                System.out.println("Load report:Loan failed -out of stock." + publications[publication_number].toPrint());
            } else if (students[num_student].loanedNum < 0 || students[num_student].loanedNum >= 3) {
                System.out.println("Load report:Loan failed - student has already loaned 3 publications");
                System.out.println(students[num_student]);
                if (num_student == 0) {
                    for (int h = 0; h < student.borrowedPublications.length; h++) {
                        if (student.borrowedPublications[h] != null) {
                            System.out.println(student.borrowedPublications[h].toString());
                        }
                    }
                }
                    if (num_student == 1) {
                        for (int a = 0; a < students1.length; a++) {
                            if (students1[a] != null) {
                                System.out.println(students1[a].toString());
                            }
                        }
                    }
                if (num_student == 2) {
                    for (int l = 0; l < students2.length; l++) {
                        if (students2[l] != null) {
                            System.out.println(students2[l].toString());
                        }
                    }
                }
                if (num_student == 3) {
                    for (int k = 0; k < students3.length; k++) {
                        if (students3[k] != null) {
                            System.out.println(students3[k].toString());
                        }
                    }
                }



                }
                // if The student has not yet borrowed 3 publications and There are enough copies of this publication in the library
                else {
                    System.out.println("Loan Report:");
                    students[num_student].loanedNum++;
                    System.out.println(students[num_student]);

                    // students[num_student].setLoanedNum(i + 1);
                    //System.out.println(students[num_student]);
                    //i++;
                    // every time that we take a publication so the copy get down by one
                    if (publications[publication_number].qty != 0) {
                        publications[publication_number].qty = publications[publication_number].qty - 1;
                    }
                    System.out.println();
                    System.out.println("List of loaned publications:");
                    // I saved the publication that the student take each time in a new array;
                    if (num_student == 0) {

                        student.borrowedPublications[j] = publications[publication_number];
                        j++;
                        System.out.println();
                        // here I print the List of loaned publications that the student take
                        for (int h = 0; h < student.borrowedPublications.length; h++) {
                            if (student.borrowedPublications[h] != null) {
                                System.out.println(student.borrowedPublications[h].toString());
                            }
                        }
                    }
                    if (num_student == 1) {
                        students1[u] = publications[publication_number];
                        u++;
                        System.out.println();
                        // here I print the List of loaned publications that the student take
                        for (int a = 0; a < students1.length; a++) {
                            if (students1[a] != null) {
                                System.out.println(students1[a].toString());
                            }
                        }
                    }
                    if (num_student == 2) {
                        students2[i] = publications[publication_number];
                        i++;
                        System.out.println();
                        // here I print the List of loaned publications that the student take
                        for (int l = 0; l < students2.length; l++) {
                            if (students2[l] != null) {
                                System.out.println(students2[l].toString());
                            }
                        }
                    }
                    if (num_student == 3) {
                        students3[e] = publications[publication_number];
                        e++;
                        System.out.println();
                        // here I print the List of loaned publications that the student take
                        for (int k = 0; k < students3.length; k++) {
                            if (students3[k] != null) {
                                System.out.println(students3[k].toString());
                            }
                        }
                    }

                    System.out.println();
                    // print the successful loan
                    System.out.println("Successful loan of:");
                    System.out.println(publications[publication_number].unique_number + "-Book" + '\''
                            + "qty:" + publications[publication_number].qty + '\'' + publications[publication_number].title);
                }
                System.out.println();
            }
        }
    }
