package pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "country")
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private Integer surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Integer lifeExpectancy;
    private Integer gnp;
    private Integer gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> languages;
}