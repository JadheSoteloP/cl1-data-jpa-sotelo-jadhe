package pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.entity.CountryLanguage;
import pe.edu.i202220936.cl1_jpa_data_sotelo_jadhe.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataSoteloJadheApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataSoteloJadheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<String> countryCodesToDelete = List.of("COL", "ARG");

		for (String countryCode : countryCodesToDelete) {
			List<CountryLanguage> countryLanguages = countryRepository.findByCountryCode(countryCode);

			countryRepository.deleteAll(countryLanguages);
		}
		System.out.println("Eliminación completada para los países: " + countryCodesToDelete);
	}

	}


