package pl.coderslab.charity.institution;

import java.util.List;

public interface InstitutionService {

    List<Institution> getAllInstitution();
    void saveInstitution(Institution institution);
    void deleteInstitution(Long id);
    void updateInstitution(Institution institution);
}
