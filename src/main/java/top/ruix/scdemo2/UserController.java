package top.ruix.scdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ruixian
 * @date 2017/11/14
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }

    @GetMapping("/get")
    public User get(Long id, String username) {
        System.out.println("id=" + id + ", username=" + username);
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        System.out.println("id=" + user.getId() + ", username=" + user.getUsername());
        User findOne = this.userRepository.findOne(user.getId());
        return findOne;
    }

}
