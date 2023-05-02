package uz.schoolpupilcomptest.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String subCategoryImage;
    private String title;
    @Lob
    @Column(length=8192)
    private String description;
    @JoinColumn(name = "category_id",table = "category",referencedColumnName = "id",nullable = false)
    private Integer categoryId;

}
