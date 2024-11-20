package pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity.CountryLanguage;
import pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity.CountryLanguageId;

import java.util.List;

public interface CountryRepository extends CrudRepository<CountryLanguage, CountryLanguageId> {
    List<CountryLanguage> findByCountryCode(String countryCode);
}
