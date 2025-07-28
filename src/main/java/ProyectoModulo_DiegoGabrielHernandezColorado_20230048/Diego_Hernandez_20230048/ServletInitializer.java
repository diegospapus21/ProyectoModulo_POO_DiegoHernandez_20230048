package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DiegoHernandez20230048Application.class);
	}

}
