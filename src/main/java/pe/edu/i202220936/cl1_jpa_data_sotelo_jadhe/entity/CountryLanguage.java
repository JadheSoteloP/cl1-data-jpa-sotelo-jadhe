package pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "countrylanguage")
@IdClass(CountryLanguageId.class)
public class CountryLanguage {
    @Id
    @Column(name = "CountryCode")
    private String countryCode;
    @Id
    private String language;
    private String isOfficial;
    private Double percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    private Country country;


}
