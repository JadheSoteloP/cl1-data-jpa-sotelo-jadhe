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
        private String countryCode;
        @Id
        private String language;
        private String isOfficial;
        private Integer percentage;

        @ManyToOne
        @JoinColumn(name = "countryCode", insertable = false, updatable = false)
        private Country country;

}
