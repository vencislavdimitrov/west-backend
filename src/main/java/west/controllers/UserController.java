package west.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import west.dao.User;
import west.repositories.UserRepository;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserRepository repository;


    @RequestMapping("/api/users")
    public List<User> list() {
        return repository.findAll();
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.POST)
    public User create(@Validated @RequestBody User user) {
        return repository.save(user);
    }

    @RequestMapping(value = "/api/users/{userId}", method = RequestMethod.DELETE)
    public void create(@PathVariable String userId) {
        repository.delete(userId);
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.PUT)
    public void update(@Validated @RequestBody User user) {
        repository.save(user);
    }

}
