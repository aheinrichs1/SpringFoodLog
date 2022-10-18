package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Food;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.FoodRepository;

@SpringBootApplication
public class SpringFoodLogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFoodLogApplication.class, args);
	}
	
	@Autowired
	FoodRepository repo;

	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Food banana = new Food("Banana", 110, 0.0, 28.0, 1.0);
		Food broccoli = new Food("Broccoli", 31, 0.4, 6.0, 2.5);
		Food potato = new Food("Potato", 161, 0.2, 36.6, 4.3);
		Food cheerios = new Food("Cheerios", 104, 1.8, 20.5, 3.5);
		Food tempeh = new Food("Tempeh", 160, 5.0, 10.0, 18.0);
		
		repo.save(banana);
		repo.save(broccoli);
		repo.save(potato);
		repo.save(cheerios);
		repo.save(tempeh);
		
		List<Food> allFood = repo.findAll();
		for(Food food: allFood) {
			System.out.println(food.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
