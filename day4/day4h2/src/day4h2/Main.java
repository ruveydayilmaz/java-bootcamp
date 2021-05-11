package day4h2;

import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setFirstName("RUVEYDA");
		customer.setLastName("YILMAZ");
		customer.setDateOfBirth(LocalDate.of(2000,07,20));
		customer.setNationalityId("39538623500");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
	}

}