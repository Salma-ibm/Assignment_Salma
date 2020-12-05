package day4;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.ProductPage;
import com.clearcode.po.CustomerPage;

import dataProvider.LoginData;

public class TestSuite1_Assign extends TestSetup{

//	@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
    @Test(dataProvider="createStudent", dataProviderClass=LoginData.class) 
//      @Test
	public void CreateCCGroup(String headerdesc, String cgname, String description,String cg, String cfname, String clname, String cemail,String ctelephone,String cpwd,String cconfirmpwd) throws InterruptedException {
		wdu.type(HomePage.username_ip, "admin");
		wdu.type(HomePage.pwd_ip, "admin@123");
		Thread.sleep(3000);
		wdu.click(HomePage.login_btn);
		wdu.mouseOver(CustomerPage.cust_button);
		wdu.click(CustomerPage.custgrp_button);
		wdu.click(CustomerPage.add_button);
		wdu.type(CustomerPage.cgname_ip, cgname);
		wdu.type(CustomerPage.desc_ip, description);
		wdu.click(CustomerPage.radio_button);
		wdu.click(CustomerPage.save_button);
//		System.out.println("Success: You have modified customer groups! ×");
//     	System.out.println(cgname);
		wdu.assertText1(CustomerPage.title_ip, "Success: You have modified customer groups! ×");
		wdu.mouseOver(CustomerPage.cust_button);
		wdu.click(CustomerPage.custl_button);
		wdu.click(CustomerPage.addcust_button);
		wdu.selectByVisibleText(CustomerPage.cg_ip, cg);
		wdu.type(CustomerPage.cfname_ip, cfname);
		wdu.type(CustomerPage.clname_ip, clname);
		wdu.type(CustomerPage.cemail_ip, cemail);
		wdu.type(CustomerPage.ctelephone_ip, ctelephone);
		wdu.type(CustomerPage.cpwd_ip, cpwd);
		wdu.type(CustomerPage.cconfirmpwd_ip, cconfirmpwd);
		wdu.click(CustomerPage.csave_button);
        wdu.assertText1(CustomerPage.ctitle_ip, " Warning: E-Mail Address is already registered!      ");
//		wdu.assertTitle("Success: You have modified customer groups! ×");
//     	System.out.println("Success: You have modified customer groups! ×");
//     	System.out.println(cgname);
    //	wdu.exit();
     	
     	
	
	
//	@Test(dataProvider="createStudent",dataProviderClass=LoginData.class)
//////    @Test
//    public void CreateCustomer(String headerdesc, String cg, String cfname, String clname, String cemail,String ctelephone,String cpwd,String cconfirmpwd) throws InterruptedException {
//    	wdu.type(HomePage.username_ip, "admin");
//		wdu.type(HomePage.pwd_ip, "admin@123");
//		Thread.sleep(3000);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(CustomerPage.cust_button);
//		wdu.click(CustomerPage.custl_button);
//		wdu.click(CustomerPage.addcust_button);
//		wdu.selectByVisibleText(CustomerPage.cg_ip, cg);
//		wdu.type(CustomerPage.cfname_ip, cfname);
//		wdu.type(CustomerPage.clname_ip, clname);
//		wdu.type(CustomerPage.cemail_ip, cemail);
//		wdu.type(CustomerPage.ctelephone_ip, ctelephone);
//		wdu.type(CustomerPage.cpwd_ip, cpwd);
//		wdu.type(CustomerPage.cconfirmpwd_ip, cconfirmpwd);
//		wdu.click(CustomerPage.csave_button);
//////    wdu.assertText(CustomerPage.ctitle_ip, "Success: You have modified customers!  ");
//////		wdu.assertTitle("Success: You have modified customers!  ");
////   	System.out.println("Success: You have modified customers!  ");
////   	System.out.println(cfname);
////   	wdu.exit();
		    
//	}
//	
}
}

    //String user, String pwd, String title, String fname, String lname