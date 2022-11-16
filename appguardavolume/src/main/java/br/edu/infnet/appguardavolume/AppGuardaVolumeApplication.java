package br.edu.infnet.appguardavolume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppGuardaVolumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGuardaVolumeApplication.class, args);
	}

}
