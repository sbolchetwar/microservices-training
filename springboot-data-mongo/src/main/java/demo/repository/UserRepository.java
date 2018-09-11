package demo.repository;

import demo.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {

	Users findByName(String name);
}
