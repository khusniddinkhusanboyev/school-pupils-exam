package uz.schoolpupilcomptest.security.model;




import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String fullName;
    @Column(unique = true)
    private String username;

    private String password;



}
