//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

import java.util.Objects;


public class Book extends Publication {
    /**
     * 3 fields
     */
    protected Author author;
    protected String editor;
    protected int year;

    /**
     * an constructor of the book class
     * @param title of the book
     * @param publisher of the book
     * @param qty num of copies of the book
     * @param author of the book
     * @param editor of the book
     * @param year of the book
     */

    public Book(String title, String publisher, int qty, Author author,String editor ,int year) {
        super(title, publisher, qty);
        this.author = author;
        this.editor=editor;
        this.year=year;
    }

    @Override
    public String getEditor() {
        return editor;
    }

    /**
     *
     * @param o he object that we want to Compare to
     * @return  a Boolean value true if they are the same
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(editor, book.editor);
    }

    /**
     * @return the information of the book
     */

    @Override
    public String toString() {
        return unique_number + "-Book " + '\'' + "'"+title+"'" + author + "\n "
                + "  published by  " + publisher + " edited by  " + editor +"("+year+")";
    }

    /**
     * @return a text for the main method of the library (list of all publication )
     */
    @Override
    public String toPrint(){
        return unique_number+"-"+"Book" + "          " + "qty:" + qty +"'"+ title +"'";
    }
}
