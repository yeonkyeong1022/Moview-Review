package org.zerock.mreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MrebviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrebviewApplication.class, args);
	}

}
