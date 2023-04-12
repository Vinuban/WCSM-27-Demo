package sample;

import org.testng.annotations.Test;

public class Testtt {
	@Test(enabled = true)//(invocationCount = 4)//(priority = 1)
	//public void tes() {
		//Reporter.log("1", true);;
	public void createcontact() {
		System.out.println("create contact");
	}
		@Test//(dependsOnMethods = "createcontact")
		//(priority = 2)
		public void modifycontact() {
			System.out.println("modify contact");
		}
		@Test//(dependsOnMethods = "modifycontact")//(priority = 3)
		public void deletecontact() {
			System.out.println("delete contact");
	}
}
