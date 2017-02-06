package hello;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by chao on 06/02/2017.
 */

// This will be AUTO IMPLEMENTED by Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Long> {
}
