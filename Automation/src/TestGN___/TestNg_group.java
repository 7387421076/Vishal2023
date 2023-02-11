package TestGN___;

import org.testng.annotations.Test;

public class TestNg_group {
	@Test(groups="whatsapp")
	public void TC1() {
		System.out.println("running TC1");
	}
	@Test(groups="facbook")
	public void TC2() {
		System.out.println("running TC2");
	}
	@Test(groups="filpkart")
	public void TC3() {
		System.out.println("running TC3");
	}
	@Test(groups= "whatsapp")
	public void TC4() {
		System.out.println("running TC4");
	}
	@Test(groups="Facbbok")
	public void TC5() {
		System.out.println("running TC5");
	}
	@Test(groups= "filpkart")
	public void TC6() {
		System.out.println("running TC6");
	}
}
