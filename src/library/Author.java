//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

import java.util.Objects;

public class Author {
    /**
     * an 2 fields
     */

    protected String name;
    protected String email;

    /**
     *
     * @param name of the author
     * @param email of the author
     */
    public Author (String name , String email){
        this.name=name;
        this.email=email;
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
        if (o == null || getClass() != o.getClass())
            return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(email, author.email);
    }

    /**
     * @return the name and the email of the author
     */

    @Override
    public String toString() {
        return " by " + name +   " at " + email;
    }
}
