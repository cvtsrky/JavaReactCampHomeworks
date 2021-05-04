package consoleMain;


import java.util.GregorianCalendar;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
			//Date dateOfBirth = new GregorianCalendar(1995,07,04);
			Customer customer1 = new Customer();
			customer1.setId(1);
			customer1.setFirstName("Ad");
			customer1.setLastName("Soyad");
			//customer1.setNationalityId("11111111111");			
			customer1.setDateOfBirth(new GregorianCalendar(1990,07,04).getTime());
			BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
			customerManager.Save(customer1);
	}

}
