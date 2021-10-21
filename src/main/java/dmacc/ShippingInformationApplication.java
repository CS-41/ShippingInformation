package dmacc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import dmacc.beans.Shipping;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ShippingRepository;

@SpringBootApplication
public class ShippingInformationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShippingInformationApplication.class, args);
	
	}
		
	@Autowired
	ShippingRepository repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Shipping sh = appContext.getBean("shipping", Shipping.class);
		sh.setShippingCost(8.50);
		repo.save(sh);
		
		Shipping p = new Shipping("Max Bean", true, 3);
		Shipping r = new Shipping("Frank Oz", 15.25, true, 5);
		repo.save(p);
		repo.save(r);
		
		List<Shipping> shippingOrders = repo.findAll();
		for(Shipping info : shippingOrders) {
			System.out.println(info.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
	

}
