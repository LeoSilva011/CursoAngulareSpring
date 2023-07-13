package com.usuario.api;

import com.usuario.api.model.entity.Cliente;
import com.usuario.api.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsuarioApiApplication {

//	@Bean
//	public CommandLineRunner run(@Autowired ClienteRepository repository){
//		return args ->{
//			Cliente cliente = Cliente.builder().cpf("00000000000").nome("Fulano").build();
//			 repository.save(cliente);
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(UsuarioApiApplication.class, args);
	}

}
