package org.wecancodeit.librarydemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Actor {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;


    private String lastName;

    @ManyToMany(mappedBy = "actors")
    private Collection<Review> reviews;

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return " " + lastName;
    }

    public Long getId() {
        return id;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(id, actor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
