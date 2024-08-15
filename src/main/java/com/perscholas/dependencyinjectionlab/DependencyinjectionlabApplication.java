package com.perscholas.dependencyinjectionlab;

import com.perscholas.dependencyinjectionlab.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyinjectionlabApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(DependencyinjectionlabApplication.class, args);

		Coach coach = context.getBean(Coach.class);

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		context.close();


	}

}
