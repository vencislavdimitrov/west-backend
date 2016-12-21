package west.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import west.dao.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    public List<User> findAll();
}
