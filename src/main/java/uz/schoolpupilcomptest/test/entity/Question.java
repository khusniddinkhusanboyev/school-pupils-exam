package uz.schoolpupilcomptest.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String image;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    //@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "category_id", nullable = false , table = "category",referencedColumnName ="id")
    private Integer categoryId;
}
