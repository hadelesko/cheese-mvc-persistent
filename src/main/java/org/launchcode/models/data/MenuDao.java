package org.launchcode.models.data;

import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository //
@Transactional  // to difine the start and the end of every transactions
public interface MenuDao  extends CrudRepository<Menu, Integer> {
}
