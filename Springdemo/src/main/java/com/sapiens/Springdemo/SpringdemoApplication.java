package com.sapiens.Springdemo;
//import com.sapiens.Springdemo.di.ConstructorBasedDI;
import com.sapiens.Springdemo.di.SetterBasedDI;
import com.sapiens.Springdemo.ioc.Address;
import com.sapiens.Springdemo.ioc.Contact;
import com.sapiens.Springdemo.ioc.Employee;
import com.sapiens.Springdemo.ioc.Official_Details;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringdemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringdemoApplication.class, args);
//		// Task 2.1 constructorBasedDI
//		System.out.println("Constructor Based DI");
//		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ConstructorBasedDI.class);
//        ConstructorBasedDI.AccountServiceClient bean = context2.getBean(ConstructorBasedDI.AccountServiceClient.class);
//		bean.showAccountDetails();
		// Task 2.2 setterBasedDI
		System.out.println("Setter based ");
		AnnotationConfigApplicationContext configApplicationContext1 = new AnnotationConfigApplicationContext(SetterBasedDI.class);
		SetterBasedDI.AccountServiceClient accountServiceClient = configApplicationContext1.getBean(SetterBasedDI.AccountServiceClient.class);
		accountServiceClient.ShowAccountDetails();





		// Task 1
		XmlBeanFactory factory= new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		for(int i=1;i<5;i++)
		{
			String employee="Employee"+i;
			String Address="Address"+i;
			String cont="Contact"+i;
			String OD="OD"+i;
			Employee emp = (Employee) factory.getBean(employee);
			Address add = (Address) factory.getBean(Address);
			Contact contact=(Contact) factory.getBean(cont);
			Official_Details OFD= (Official_Details) factory.getBean(OD);
			System.out.println("********************************"+employee+"********************************");
			System.out.println("Hi My Details are: "+emp.getName()+" " + emp.getID()+ " " + emp.getAge()+" "+emp.getGender() +"\n");
			System.out.println("My Address is: "+add.getCountry()+ " " + add.getCity()+ " " + add.getPincode()+ " "+add.getPO_BOX_NUMBER()+ " "+add.getState()+ " " +"\n");
			System.out.println("My Contacts details are: "+contact.getEmail_id()+ " " + contact.getEmergency_Contact_no()+ " " + contact.getOfficial_mail_id()+ " "+contact.getPrimary_Mobile_no()+ " "+contact.getSecondary_Mobile_no()+ " " +"\n");
			System.out.println("My Official_details are: "+OFD.getCurrent_company_name()+ " " + OFD.getDesignation()+ " " + OFD.getEdu_qualification()+ " "+OFD.getPercentage()+ " "+ " "+OFD.getYears_of_experience()+ " " +OFD.getCurrent_company_name()+ " " +"\n");
		}
	}

}
