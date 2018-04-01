package com.revature.hydra.unavailable.dao;

import org.springframework.stereotype.Repository;


import com.revature.hydra.unavailable.domain.Unavailable;

@Repository
public interface UnavailableRepository extends BaseRepository<Unavailable, Integer> {

}
