package org.wecancodeit.librarydemo.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Category category;
    private String title;
    @ManyToMany
    private Collection<Actor> actors;
    @Lob
    private String reviewContent;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public Collection<Actor> getActors() {
        return actors;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }


    public Review(String title, String imageUrl,  Category category, String reviewContent, Actor... actors) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.category = category;
        this.reviewContent = reviewContent;
        this.actors = new ArrayList<>(Arrays.asList(actors));
    }

    protected Review() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
