package demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRespository extends JpaRepository<Users, Long>{

    Users findByName(String name);
}
