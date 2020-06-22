package org.wecancodeit.librarydemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.librarydemo.models.Actor;
import org.wecancodeit.librarydemo.models.Category;
import org.wecancodeit.librarydemo.models.Review;
import org.wecancodeit.librarydemo.repositories.ActorRepository;
import org.wecancodeit.librarydemo.repositories.ReviewRepository;
import org.wecancodeit.librarydemo.repositories.CategoryRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private ActorRepository actorRepo;
    @Autowired
    private ReviewRepository reviewRepo;


    @Test
    public void campusShouldHaveAListOfBooks() {
        Category testCategory = new Category("Test Location");
        Category testCategory2 = new Category("Test Location");
        Actor testActor1 = new Actor("test firstName", "Test lastName");
        Review testReview = new Review("Title", "Description", testCategory, "Content", testActor1);
        Review testReview2 = new Review("Title", "Description", testCategory2, "Content", testActor1);

        categoryRepo.save(testCategory);
        categoryRepo.save(testCategory2);
        actorRepo.save(testActor1);
        reviewRepo.save(testReview);
        reviewRepo.save(testReview2);

        entityManager.flush();
        entityManager.clear();

        Optional<Category> retrievedCampusOpt = categoryRepo.findById(testCategory.getId());
        Category retrievedCategory = retrievedCampusOpt.get();
        Review retrievedReview = reviewRepo.findById(testReview.getId()).get();
        assertThat(retrievedCategory.getReviews()).contains(retrievedReview);
    }

    @Test
    public void booksShouldBeAbleToHaveMultipleAuthors() {
        Category testCategory = new Category("Test Location");
        Actor testActor1 = new Actor("test firstName", "Test lastName");
        Actor testActor2 = new Actor("test firstName2", "Test lastName2");
        Review testReview1 = new Review("Title", "Description", testCategory, "Content", testActor1, testActor2);
        Review testReview2 = new Review("Title", "Description", testCategory, "Content", testActor2);
        Review testReview3 = new Review("Title", "Description", testCategory, "Content", testActor2);
        categoryRepo.save(testCategory);
        actorRepo.save(testActor1);
        actorRepo.save(testActor2);
        reviewRepo.save(testReview1);
        reviewRepo.save(testReview2);
        reviewRepo.save(testReview3);

        entityManager.flush();
        entityManager.clear();

        Review retrievedReview = reviewRepo.findById(testReview1.getId()).get();
        Actor retrieveActor1 = actorRepo.findById(testActor1.getId()).get();
        Actor retrieveActor2 = actorRepo.findById(testActor2.getId()).get();
        assertThat(retrievedReview.getActors()).contains(retrieveActor1, retrieveActor2);

    }
}
