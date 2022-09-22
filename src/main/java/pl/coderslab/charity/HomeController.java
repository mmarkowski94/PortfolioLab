package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.InstitutionService;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;
    private final CategoryService categoryService;


    @RequestMapping("/")
    public String homeAction(Model model) {
        model.addAttribute("InstitutionList", institutionService.getAllInstitution());
        model.addAttribute("CountDonations",donationService.countDonations());
        model.addAttribute("CountDonationBags",donationService.countDonationBags());
        return "index";
    }

    @GetMapping("/form")
    public String formAction(Model model) {
        model.addAttribute("CategoryList", categoryService.getAllCategory());

        return "form";
    }


}