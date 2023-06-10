//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

public class Journal extends Publication {
    /**
     * we have here 2 fields
     */
    protected int issueNumber;
    protected int year;

    /**
     * an constructor
     * @param title name of the journal
     * @param publisher the publisher
     * @param qty number of copies
     * @param issueNumber of the journal
     * @param year the year of the journal
     */
    public Journal(String title , String publisher , int qty , int issueNumber , int year){
        super(title,publisher,qty);
        this.issueNumber=issueNumber;
        this.year=year;
    }

    /**
     * @return a unique number ,title, issue number ,publisher and a year
     */

    public String toString(){
        return unique_number +"-Jrnl "+ '\'' + title + "("+issueNumber+")" +"\n" + " published by " + publisher +"("+year+")";
    }

    /**
     *
     * @param o he object that we want to Compare to
     * @return  a Boolean value true if they are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Journal))
            return false;
        Journal journal = (Journal) o;
        return issueNumber == journal.issueNumber && year == journal.year;
    }

    /**
     *
     * @return a text for the main method of the library (list of unique number , qty and title)
     */
    @Override
    public String toPrint(){
        return unique_number+"-"+"Jrnl" + "          " + "qty:" + qty +"'"+ title +"'";
    }
}
