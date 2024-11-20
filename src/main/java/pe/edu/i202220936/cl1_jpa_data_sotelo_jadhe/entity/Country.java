package pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Double lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
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