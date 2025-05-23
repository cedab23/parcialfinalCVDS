package cvds.EciSaludVital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cvds.EciSaludVital.model.Specialty;
import cvds.EciSaludVital.repository.SpecialtyRepository;

@Service
public class SpecialtyService {
    
    @Autowired
    private SpecialtyRepository specialtyRepository;

    public Specialty createSpecialty(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    public Specialty getSpecialtyById(String id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    public Specialty updateSpecialty(Specialty specialty) {
        if(!specialtyRepository.existsById(specialty.getId())) {
            return null;
        }
        return specialtyRepository.save(patient);
    }

    public void deleteSpecialty(String id) {
        specialtyRepository.deleteById(id);
    }
}