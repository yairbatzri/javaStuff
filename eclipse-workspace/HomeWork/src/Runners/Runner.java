package Runners;

import Objects.Address;
import Objects.Person;

public class Runner {

	public static void main(String[] args) {

		Address address = new Address("Tel Aviv", "bugrashov", 2);
		Person person = new Person("Avner", 74, address);

		System.out.printf(person.toString(), address.toString());

	}

}
