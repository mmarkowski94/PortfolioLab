package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstitutionServiceImpl implements InstitutionService {

    private final InstitutionRepository institutionRepository;

    @Override
    public List<Institution> getAll() {
        return institutionRepository.findAll();
    }

    @Override
    public Institution findById(Long id) {
        return institutionRepository.getById(id);
    }

    @Override
    public void save(Institution institution) {
        institutionRepository.save(institution);
    }

    @Override
    public void delete(Long id) {
        institutionRepository.deleteById(id);
    }

    @Override
    public void update(Institution institution) {
        institutionRepository.save(institution);
    }
}
