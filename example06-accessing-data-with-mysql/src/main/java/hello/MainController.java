package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chao on 06/02/2017.
 */
@Controller
@RequestMapping(path="/demo")
public class MainController {

    // This means to get the bean called UserRepository, Which is auto-generated
    // by Spring, we will use it to handle the data
    @Autowired
    private UserRepository userRepository;

    // Map ONLY GET Requests
    @GetMapping(path="/add")
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
    public @ResponseBody String addNewUser(@RequestParam String name,
                                           @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // returns a JSON or XML with the users
        return userRepository.findAll();
    }
}
