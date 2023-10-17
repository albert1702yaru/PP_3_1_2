package web.service;

import org.springframework.data.repository.CrudRepository;
import web.model.User;

public interface UserService extends CrudRepository<User, Long> {
}
