package br.com.imatech.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.imatech.cursomc.services.DBService;
import br.com.imatech.cursomc.services.EmailService;
import br.com.imatech.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean InstatiateDatabase() throws ParseException {
		dbService.instatiateTestDatabase(); 
		
		return true;
	}
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
