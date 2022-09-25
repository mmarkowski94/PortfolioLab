package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.institution.InstitutionService;
import pl.coderslab.charity.user.User;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donation")
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @GetMapping("/add")
    public String addDonation(Model model) {
        model.addAttribute("donation", new Donation());
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("institutions", institutionService.getAll());
        return "addDonation";
    }

    @PostMapping("/add")
    public String saveDonation(@ModelAttribute("donation") @Valid Donation donation, BindingResult result) {
        if (result.hasErrors()) {
            return "addDonation";
        }
        donation.setCategories(donation.getCategories());
        donationService.save(donation);
        return "redirect:/";
    }
}
