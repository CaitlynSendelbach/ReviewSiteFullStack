package org.wecancodeit.librarydemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @OneToMany(mappedBy = "category")
    private Collection<Review> reviews;

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }


    protected Category() {

    }


    public Category(String location) {
        this.location = location;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
