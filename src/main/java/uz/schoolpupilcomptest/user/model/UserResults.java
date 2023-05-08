package uz.schoolpupilcomptest.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.schoolpupilcomptest.security.model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@SecondaryTable(name = "user",schema ="school-pupils-test", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
@Entity
public class UserResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User userId;
    private Integer answerCount;
    private LocalDateTime localDateTime ;


}
