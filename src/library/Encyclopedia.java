//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

public class Encyclopedia extends Publication {
    protected int volume;
    protected String editor;

    /**
     * an constructor of the ency class
     * @param title of the ency
     * @param publisher who wrote the ency
     * @param qty number of copies
     * @param editor who edit the ency
     * @param volume of the ency
     */

    public Encyclopedia(String title, String publisher, int qty, String editor , int volume) {
        super(title, publisher, qty);
        this.editor = editor;
        this.volume = volume;
    }

    /**
     * @return the details of the ency
     */

    @Override
    public String toString() {
        return unique_number + "-Ency "+ '\''+  title + " vol " + volume + "\n" + "  published by  " + publisher
                +  " edited by  " +  editor;
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
        if (!(o instanceof Encyclopedia))
            return false;
        Encyclopedia ency = (Encyclopedia) o;
        return volume == ency.volume && editor == ency.editor;
    }

    /**
     * @return a text for the main method of the library
     */
    @Override
    public String toPrint(){
        return unique_number+"-"+"Ency" + "          " + "qty:" + qty +"'"+ title +"'" +"vol " + "" + volume;
    }
}

