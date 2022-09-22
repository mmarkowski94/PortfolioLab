package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstitutionServiceImpl implements InstitutionService {

    private  final InstitutionRepository institutionRepository;

    @Override
    public List<Institution> getAllInstitution() {
        return institutionRepository.findAll();
    }

    @Override
    public void saveInstitution(Institution institution) {

    }

    @Override
    public void deleteInstitution(Long id) {

    }

    @Override
    public void updateInstitution(Institution institution) {

    }
}
