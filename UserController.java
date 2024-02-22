package PersonalFinanceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.arcane.entities.User;

import personalfinance.Incomeprojection;
import personalfinance.Userclass;
import personalfinancerepository.UserRepository;
import personalfinanceservice.ProjectionService;

@RestController
public class UserController {
  @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectionService projectionService;

    @PostMapping("/users")
    public User createUser(@RequestBody Userclass user) {
        return userRepository.save(user);
    }
    @GetMapping("/users/{userId}/projection")
    public Incomeprojection getUserProjection(@PathVariable Long userId) {
        User user = ((Object) userRepository.findById(userId)).Else(null);
        if (user == null) {
            return null;
        }
        return projectionService.calculateProjection(user);
    }
}