package com.daniela.hicua;

		import com.daniela.hicua.Service.AlphabetService;
		import com.daniela.hicua.Service.DiccionarioService;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.builder.SpringApplicationBuilder;

		import javax.annotation.PostConstruct;

@SpringBootApplication
public class HicuaApplication {
	@Autowired
	private AlphabetService AlphabetService;
	@Autowired
	private DiccionarioService DiccionarioService;

	public static void main(String[] args) {
		SpringApplicationBuilder springApp = new SpringApplicationBuilder(HicuaApplication.class);
		springApp.headless(false);
		springApp.run(args);
	}

	@PostConstruct
	public void insertDataToDataBase(){

		AlphabetService.saveData();
		DiccionarioService.saveData();
	}

}
