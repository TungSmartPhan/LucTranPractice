package LucTranPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Employees_navItem.EmployeesXpaths;
import LoginXpaths.LoginXpaths;
import MyAccountXpaths.UAM_MyAccountXpaths;
import MyProfileXpaths.MyProfileXpaths;

public class AutoInputPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suri\\eclipse-workspace\\WebDriver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Access the Page
		String baseUrl = "https://app.hrsale.com/erp/staff-list";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//LoginPage - Inherit từ file LoginXpaths.java from import LucTranPractice.LoginXpaths.LoginXpaths;
		LoginXpaths loginPage = new LoginXpaths();
		
		//LoginPage - Employee button
		String employeeBtn = loginPage.employeeBtn;
		driver.findElement(By.xpath(employeeBtn)).click();
		
//		Thread.sleep(3000);
		
		//LoginPage - Login button
		String loginBtn = loginPage.loginBtn;
		driver.findElement(By.xpath(loginBtn)).click();
		
		//Dashboard Page - Inherit từ file UAM_MyAccountXpaths.java from import MyAccountXpaths.UAM_MyAccountXpaths;
		UAM_MyAccountXpaths myAccount = new UAM_MyAccountXpaths();
		
		//Dashboard - My Account
		String myAccountDropdown = myAccount.myAccount;
		driver.findElement(By.xpath(myAccountDropdown)).click();
		//My Account - Dropdown item
		String myAccountBtn = myAccount.myAccountBtn;
		driver.findElement(By.xpath(myAccountBtn)).click();
		
		
		//my-profile Page - Inherit từ file MyProfileXpaths.java from import MyAccountXpaths.UAM_MyAccountXpaths;
		MyProfileXpaths myProfile = new MyProfileXpaths();
		
		//my-profile Basic Infomation
		String basicInformation = myProfile.basicInformationBtn;
		driver.findElement(By.xpath(basicInformation)).click();
		
		//Employees Page - Inherit từ file EmployeesXpaths.java
		EmployeesXpaths employees = new EmployeesXpaths();
		
		//employees-tab : staff-list
		String employeeTab = employees.employeesNav;
		driver.findElement(By.xpath(employeeTab)).click();
		//employees-addnewBtn
		String addNew = employees.addNewBtn;
		driver.findElement(By.xpath(addNew)).click();
		//employees-firstname
		String firstName = employees.first_name_Input;
		driver.findElement(By.xpath(firstName)).sendKeys("Tung");
		//employees-lastname
		String lastName = employees.last_name_Input;
		driver.findElement(By.xpath(lastName)).sendKeys("Phan");
		//employees-contactNumber
		String contactNumber = employees.contact_number_Input;
		driver.findElement(By.xpath(contactNumber)).sendKeys("0899555112");
		//employees-email
		String email = employees.email_Input;
		driver.findElement(By.xpath(email)).sendKeys("tung_phan@outlook.com");
		//employees-username
		String username = employees.user_name_Input;
		driver.findElement(By.xpath(username)).sendKeys("TungSmartPhan");
		//employees-password
		String password = employees.password_Input;
		driver.findElement(By.xpath(password)).sendKeys("Test@1234");
		//employees-office_shift dropdown
		String office_shift = employees.office_shift_dropdown;
		driver.findElement(By.xpath(office_shift)).click();
		//employees-office_shift value item 1
		String morningShift = employees.office_shift_morningShift;
		driver.findElement(By.xpath(morningShift)).click();
		//employees-role dropdown
		String role= employees.role_dropdown;
		driver.findElement(By.xpath(role)).click();
		//employees-role dropdown value 1
		String generalManager = employees.role_generalManager;
		driver.findElement(By.xpath(generalManager)).click();
		//employees-department dropdown
		String department = employees.department_dropdown;
		driver.findElement(By.xpath(department)).click();
		//employees-department dropdown value 1
		String engineering = employees.department_Engineering;
		driver.findElement(By.xpath(engineering)).click();
		//employees-Designation dropdown
		String designation = employees.designation_dropdown;
		driver.findElement(By.xpath(designation)).click();
		//employees-Designation dropdown value 1
		String projectManager = employees.designation_projectManager;
		driver.findElement(By.xpath(projectManager)).click();
		//employees-basic salary
		String basicSalary = employees.basic_salary_Input;
		driver.findElement(By.xpath(basicSalary)).sendKeys("1000000");
		//employees-hourly rate
		String hourlyRate = employees.hourly_rate_input;
		driver.findElement(By.xpath(hourlyRate)).sendKeys("8");
		//employees-addnewBtn
		String saveBtn = employees.saveBtn;
		driver.findElement(By.xpath(saveBtn)).click();
	}

}
