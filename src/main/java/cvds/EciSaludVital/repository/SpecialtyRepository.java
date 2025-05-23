package cvds.EciSaludVital.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cvds.EciSaludVital.model.Specialty;

@Repository
public interface SpecialtyRepository extends MongoRepository<Specialty,String>{


}