package pl.coderslab.charity.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final InstitutionService institutionService;

    @GetMapping("/institution/add")
    public String register(Model model) {
        model.addAttribute("institution", new Institution());
        return "adminInstitution/addInstitution";
    }

    @PostMapping("/institution/add")
    public String saveInstitution(@ModelAttribute("institution") @Valid Institution institution, BindingResult result) {
        if (result.hasErrors()) {
            return "adminInstitution/addInstitution";
        }
        institutionService.save(institution);
        return "redirect:/admin/institution/list";
    }

    @GetMapping("/institution/list")
    public String institutionList(Model model) {
        model.addAttribute("InstitutionList", institutionService.getAll());
        return "adminInstitution/listInstitution";
    }

    @GetMapping("/institution/edit/{id}")
    public String editInstitution(Model model, @PathVariable Long id) {
        model.addAttribute("institution", institutionService.findById(id));
        return "adminInstitution/editInstitution";
    }

    @PostMapping("/institution/edit/{id}")
    public String institutionEdited(@ModelAttribute("institution") @Valid Institution institution, BindingResult result) {
        if (result.hasErrors()) {
            return "adminInstitution/editInstitution";
        }
        institutionService.save(institution);
        return "redirect:/admin/institution/list";
    }

    @GetMapping("/institution/delete/{id}")
    @Transactional
    public String deleteInstitution(@PathVariable long id) {
        institutionService.delete(id);
        return "redirect:/admin/institution/list";
    }
}
