package org.wecancodeit.librarydemo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.librarydemo.models.Actor;
import org.wecancodeit.librarydemo.models.Category;
import org.wecancodeit.librarydemo.models.Review;
import org.wecancodeit.librarydemo.repositories.ActorRepository;
import org.wecancodeit.librarydemo.repositories.ReviewRepository;
import org.wecancodeit.librarydemo.repositories.CategoryRepository;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @MockBean
    private CategoryRepository categoryRepo;

    @MockBean
    private ReviewRepository reviewRepo;

    @MockBean
    private ActorRepository actorRepo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void categoriesShouldBeOkAndReturnCategoriesViewWithCategoriesModelAttribute() throws Exception {
        mockMvc.perform(get("/categories"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("categoriesView"))
                .andExpect(model().attributeExists("categories"));
    }

    @Test
    public void reviewsShouldBeOkAndReturnReviewsViewWithReviewsModelAttribute() throws Exception {
        mockMvc.perform(get("/reviews"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("reviewsView"))
                .andExpect(model().attributeExists("reviews"));
    }

    @Test
    public void actorsShouldBeOkAndReturnActorsViewWithActorsModelAttribute() throws Exception {
        mockMvc.perform(get("/actors"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("actorsView"))
                .andExpect(model().attributeExists("actors"));
    }

    @Test
    public void shouldBeOkForASingleCategoryEndpointWithCategoryViewAndCategoryModelAttribute() throws Exception {
        Category testCategory = new Category("Original");
        when(categoryRepo.findCategoryByLocation("Original")).thenReturn(testCategory);
        mockMvc.perform(get("/category/Original"))
                .andExpect(status().isOk())
                .andExpect(view().name("categoryView"))
                .andExpect(model().attributeExists("category"));
    }

    @Test
    public void shouldBeOkForASingleReviewEndpointWithReviewViewAndReviewModelAttribute() throws Exception {
        Category testCategory = new Category("Prequel");
        Actor testActor = new Actor("First", "Last");
        Review testReview = new Review("Title", "Description", testCategory, "Content", testActor);
        when(reviewRepo.findById(1L)).thenReturn(java.util.Optional.of(testReview));
        mockMvc.perform(get("/reviews/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("reviewView"))
                .andExpect(model().attributeExists("review"));
    }



}
