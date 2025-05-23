package cvds.EciSaludVital.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;
import org.springframework.data.annotation.Id; 
import org.springframework.data.mongodb.core.mapping.Document; 

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Appointment")

public class Appointment{

    @Id
    private String IDAppointment;

    private Date DateSelected;

    private String IDSpecialty;

    private String IDUser;

    private Enum State;
    

}