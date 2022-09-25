package pl.coderslab.charity.user;

import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));
        userService.save(user);
        return "redirect:/user/login";
    }

        @GetMapping("/login")
        public String login() {
            return "login";
        }

        @PostMapping("/login")
        public String login(@RequestParam String email,
                            @RequestParam String password,
                            Model model) {

            if (userService.existsByEmail(email)) {
                User user = userService.findByEmail(email);
                if (BCrypt.checkpw(password, user.getPassword())) {
                    model.addAttribute("loggedUser", userService.findByEmail(email));
                    return "redirect:/";
                }
            }
            return "login";
        }
    
}

