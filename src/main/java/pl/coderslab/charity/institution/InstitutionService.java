package pl.coderslab.charity.institution;

import java.util.List;

public interface InstitutionService {

    List<Institution> getAll();
    Institution findById(Long id);
    void save(Institution institution);
    void delete(Long id);
    void update(Institution institution);
}
