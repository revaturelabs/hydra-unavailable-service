package com.revature.hydra.unavailable.repo;

import com.revature.hydra.unavailable.model.Unavailable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "unavailabilities")
public interface UnavailableRepo extends CrudRepository<Unavailable, Integer> {
}