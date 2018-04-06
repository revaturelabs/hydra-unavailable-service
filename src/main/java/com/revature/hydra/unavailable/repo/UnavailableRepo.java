package com.revature.hydra.unavailable.repo;

import com.revature.hydra.unavailable.model.Unavailable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnavailableRepo extends JpaRepository<Unavailable, Integer> {
}