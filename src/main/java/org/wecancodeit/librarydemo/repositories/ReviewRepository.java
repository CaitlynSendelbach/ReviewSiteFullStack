package org.wecancodeit.librarydemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.librarydemo.models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}
