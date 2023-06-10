//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

import java.util.Objects;

/**
 * this class represent an Article
 */

public class Article extends Journal{
    /**
     * we have 3 fields
     */
    protected String article_name;
    protected Author author;
    protected String URL;

    /**
     * constructor that accepts values for all instance variables
     * @param title the name of the article
     * @param publisher how wrote the article
     * @param qty number of Copies
     * @param issueNumber The number of publication shows
     * @param year number of the year
     * @param article_name the name of the article
     * @param author who right the article
     * @param URL an address
     */
    public Article (String title , String publisher , int qty , int issueNumber , int year,String article_name,Author author,String URL){
        super(title,publisher,qty,issueNumber,year);
        this.article_name=article_name;
        this.author=author;
        this.URL=URL;
    }

    /**
     * @return unique number , article name , author , title , issuenumber , publisher , year and url
     */

    @Override
    public String toString() {
        return unique_number +"-Artl"+ '\'' +  article_name + '\'' + author + "\n"
                + title + "("+issueNumber+")" + "\n"
                + "published by " + publisher+"("+year+")" + "\n"
                + URL;
    }

    /**
     * equal method
     * @param o he object that we want to Compare to
     * @return  a Boolean value true if they are the same
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Article article = (Article) o;
        return Objects.equals(article_name, article.article_name) && Objects.equals(author, article.author) && Objects.equals(URL, article.URL);
    }
    @Override
    /**
     *  a text for the main method of the library (list of all publication )
     */
    public String toPrint(){
        return unique_number+"-"+"Artl" + "          " + "qty:" + qty +"'"+ article_name +"'";
    }
}
