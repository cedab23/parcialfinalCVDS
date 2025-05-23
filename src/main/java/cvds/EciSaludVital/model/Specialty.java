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
@Document(collection = "Specialty")

public class Specialty{

    @Id
    private String ID;

    private String Name;

    private String Description;

    private String Doctor;

    private String Location;
    

}