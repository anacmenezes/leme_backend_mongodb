package com.anamenezes.lemeviagensmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.anamenezes.lemeviagensmongo.domain.Cliente;
import com.anamenezes.lemeviagensmongo.repositories.ClienteRepository;

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	private ClienteRepository userReposiroty;

	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposiroty.deleteAll();
		
		Cliente maria = new Cliente(null, "Maria Brown", "maria@gmail.com", "46985231496", "998734685");
		Cliente alex = new Cliente(null, "Alex Green", "alex@gmail.com", "12864975329", "992846312");
		Cliente bob = new Cliente(null, "Bob Grey", "bob@gmail.com", "69742198731", "99364875");
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
	}
}
