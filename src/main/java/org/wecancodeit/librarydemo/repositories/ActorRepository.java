package org.wecancodeit.librarydemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.librarydemo.models.Actor;

public interface ActorRepository extends CrudRepository<Actor, Long> {
}
