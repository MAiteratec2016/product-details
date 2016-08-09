package product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner initData(ProductDetailsRepository repo){
		return (args) -> {
			repo.save(new ProductDetails(1, "Handschuh", "Schön warm für lange Finger"));
			repo.save(new ProductDetails(2, "Hausschuh", "Sehr leicht. Ideal für kleine Füße."));
			repo.save(new ProductDetails(3, "Keule", "Das Totschlagargument für hitzige Diskussionen."));
			repo.save(new ProductDetails(4, "Schmand", "Das muss für jede Torte."));
		};
	}
}
