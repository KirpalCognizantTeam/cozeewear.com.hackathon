package cozeewear.com.hackathon.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Admin {

    @Id
    private String Userid;
    private String Password;

}


