package org.practice;

import org.baseclass.BaseClass;
import org.openmrspompages.*;
import org.testng.annotations.*;

public class OpenMrs extends BaseClass {
	
	//1.Login
	@Test
		private void test1() {
			browserLaunch("chrome");
			Wait(10);
			urlLaunch("https://demo.openmrs.org/openmrs/login.htm");
			login l=new login();
			l.LoginOpenMrs("Admin", "Admin123");	
	}
	//2.Register a patient
	@Test
		private void test2() {
			RegisterAPatient r=new RegisterAPatient();
			r.Register();
	}
	//3.Home
	@Test
		private void test3() {
			Homeicon h=new Homeicon();
			h.home();
	}
	//4.Find Patient Record
	@Test
		private void test4() {
			FindPatientRecord f=new FindPatientRecord();
			f.findPatient();
	}
	//5.View Patient Record
	@Test
		private void test5() {
			ViewPatientRecord v=new ViewPatientRecord();
			v.getPatientResult();
	}
	//6.Home
		@Test
			private void test6() {
				Homeicon h=new Homeicon();
				h.home();
		}
	//7.Book an Appointment
	@Test
		private void test7() {
			BookAnAppointment b=new BookAnAppointment();
			b.BookAppointment();
	}
	//8.Home
	@Test
		private void test8() {
			Homeicon h=new Homeicon();
			h.home();
	}
	//9.Capture Vitals
	@Test
		private void test9() {
			CaptureVitals c=new CaptureVitals();
			c.CaptureVital();	
	}
	//10.Home
		@Test
			private void test10() {
				Homeicon h=new Homeicon();
				h.home();
		}
	
	
}
