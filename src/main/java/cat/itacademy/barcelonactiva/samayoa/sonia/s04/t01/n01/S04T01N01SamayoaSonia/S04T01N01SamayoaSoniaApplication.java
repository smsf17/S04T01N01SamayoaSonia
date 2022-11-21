package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t01.n01.S04T01N01SamayoaSonia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers"})
public class S04T01N01SamayoaSoniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01SamayoaSoniaApplication.class, args);
		System.out.println("hola");
	}

}
