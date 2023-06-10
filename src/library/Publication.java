//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

/**
 * we have 5 fields
 */

public class Publication {
    protected String title;
    protected String publisher;
    protected int qty ;
    protected static int next_unique_number = 10;
    protected final int unique_number;

    /**
     * constructor that accepts values for all instance variables
     * @param title the name of the article
     * @param publisher  how wrote the article
     * @param qty number of Copies
     */
    public Publication (String title , String publisher , int qty) {
        this.title=title;
        this.publisher=publisher;
        this.qty=qty;
        unique_number = next_unique_number;
        next_unique_number++;
    }

    /**
     * a default constructor
     */
    public Publication(){
        unique_number = next_unique_number;
        next_unique_number++;
    }

    /**
     * @return a title and a publisher
     */
    @Override
    public String toString() {
        return  "title : " + title +  "  publication  " + publisher;
    }

    /**
     *
     * @param o he object that we want to Compare to
     * @return  a Boolean value true if they are the same
     */
    @Override
    public boolean equals(Object o){
        if (this==o)
            return true;
        if (!(o instanceof Publication))
            return false;
        Publication pub = (Publication) o;
        return title ==pub.title && publisher == pub.publisher && unique_number == pub.unique_number;

    }

    /**
     *
     * @return a text for the main method of the library (list of unique number , qty and title)
     */
    public String toPrint (){
        return unique_number + '\'' + "qty:" + qty + "'" + title +"'";
    }

    public String getEditor() {
        return "";
    }
}
