package demo.resource;

import demo.document.Users;
import demo.repository.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
    
    @PostMapping(value = "/load")
    public Users load(@RequestBody final Users users) {
    	this.userRepository.save(users);
        return this.userRepository.findByName(users.getName());
    }
    
}
