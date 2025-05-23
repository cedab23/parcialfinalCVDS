package cvds.EciSaludVital.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import cvds.EciSaludVital.model.Specialty;
import cvds.EciSaludVital.service.SpecialtyService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/specialty")
public class PatientController {

    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getSpecialtyById(@PathVariable String id) {
        return ResponseEntity.ok().body(specialtyService.getSpecialtyById(id));
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> createSpecialty(@RequestBody Specialty specialty) {
        return ResponseEntity.ok().body(specialtyService.createSpecialty(specialty));
    }

    @PutMapping(value = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> updateSpecialty(@RequestBody Specialty specialty) {
        return ResponseEntity.ok().body(specialtyService.updateSpecialty(specialty));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpecialty(@PathVariable String id) {
        patientService.deleteSpecialty(id);
        return ResponseEntity.ok().build();
    }
    
}