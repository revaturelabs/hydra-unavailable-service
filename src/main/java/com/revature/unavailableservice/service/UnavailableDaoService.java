package com.revature.unavailableservice.service;

import com.revature.unavailableservice.domain.Unavailable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Nick Edwards on 3/2/2017.
 */

@Transactional
@Service
public class UnavailableDaoService extends DaoService<Unavailable, Integer>{
}
