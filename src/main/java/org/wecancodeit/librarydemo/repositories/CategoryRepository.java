package org.wecancodeit.librarydemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.librarydemo.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findCategoryByLocation(String location);
}
