package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.institution.InstitutionService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donation")
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;

    @GetMapping("/form")
    public String addDonation(Model model) {
        model.addAttribute("donation", new Donation());
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("institutions", institutionService.getAllInstitution());
        return "form";
    }

    @PostMapping("/form")
    public String saveDonation(Model model) {
        return "form";
    }
}
