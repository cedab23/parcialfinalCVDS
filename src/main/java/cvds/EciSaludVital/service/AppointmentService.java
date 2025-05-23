package cvds.EciSaludVital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cvds.EciSaludVital.model.Appointment;
import cvds.EciSaludVital.repository.AppointmentRepository;

@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment getAppointmentById(String id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public Appointment updateAppointment(Appointment appointment) {
        if(!appointmentRepository.existsById(appointment.getId())) {
            return null;
        }
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(String id) {
        appointmentRepository.deleteById(id);
    }
}