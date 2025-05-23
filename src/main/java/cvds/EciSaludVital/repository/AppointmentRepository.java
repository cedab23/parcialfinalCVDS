package cvds.EciSaludVital.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cvds.EciSaludVital.model.Appointment;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String>{


}