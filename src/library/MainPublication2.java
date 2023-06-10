//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;
public class MainPublication2 {
    public static Publication[] sort (Publication[] publications){
        Publication [] arr = new Publication[publications.length];
        int j=0;
        for (int i=0 ; i< publications.length ; i++){
            if (publications[i] instanceof Book){
                arr[j]=publications[i];
                j++;
            }
        }
        for (int i=0 ; i< publications.length;i++){
            if (publications[i] instanceof Journal && !(publications[i] instanceof Article )){
                arr[j]=publications[i];
                j++;
            }
        }
        for (int i=0 ; i< publications.length;i++){
            if (publications[i] instanceof Article){
                arr[j]=publications[i];
                j++;
            }
        }
        for (int i=0 ; i< publications.length;i++){
            if (publications[i] instanceof Encyclopedia){
                arr[j]=publications[i];
                j++;
            }
        }
        return arr;
    }
        public static void main (String[]args){

            Publication[] publications = new Publication[100];
            Author[] authors = new Author[100];
            authors[0] = new Author("Harper Lee", "harper@somwhere.com");
            authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
            authors[2] = new Author("Amos Oz", "oz@somwhere.com");
            authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
            authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
            authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

            publications[0] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                    2, authors[0], "Tay Hohoff", 1960);
            publications[1] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020,
                    "Yanshuf Aezim", authors[5],
                    "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
            publications[2] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
            publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
            publications[4] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021,
                    "Alufot Eropa le-Mathematica", authors[4],
                    "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
            publications[5] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
            publications[6] = new Book("The Great Gatsby", "Charles Scribner's Sons",
                    1, authors[1], "Maxwell Perkins", 1925);
            publications[7] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
            publications[8] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
            publications[9] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                    1, authors[2], "", 2002);
            publications[10] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022,
                    "AI (artificial intelligence) is upgrading", authors[3],
                    "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
            publications[11] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
            publications[12] = new Journal("Nature", "Springer Nature",
                    5, 590, 2021);

            System.out.println("List of publication in the order they were entered:");
            System.out.println("===================================================");
            for (Publication publication : publications)
                if (publication != null)
                    System.out.println(publication);
            System.out.println();

            System.out.println("List of publication sorted by 'Book', 'Journal','Article','Encyclopedia'");
            System.out.println("===================================================");
            publications = sort(publications);
            for (int i=0;i<publications.length;i++){
                if(publications[i]!= null) {
                    System.out.println(publications[i]);
                }

            }
        }
    }
