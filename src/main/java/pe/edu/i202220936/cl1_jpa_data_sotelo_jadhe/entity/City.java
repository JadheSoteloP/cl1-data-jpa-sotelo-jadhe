package pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "CountryCode")
    private String countryCode;
    private String district;
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "code", insertable = false, updatable = false)
    private Country country;
}


