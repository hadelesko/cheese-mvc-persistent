package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository //
@Transactional  // to difine the start and the end of every transactions
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
    //CrudRepository is
    //@Query(my sql query) here i can write my transaction to assessthe deta i want

}
