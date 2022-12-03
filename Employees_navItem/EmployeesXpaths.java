package Employees_navItem;

public class EmployeesXpaths {
	public String employeesNav = "//*[contains(@class,'pc-item')]//*[contains(text(),'Employees')]";
	
	public String addNewBtn= "//*[contains(@class,'user-profile-list')]//*[contains(@href,'add_form')]";
	
	public String first_name_Input = "//input[@name='first_name']";
	
	public String last_name_Input = "//input[@name='last_name']";
	
	public String contact_number_Input = "//input[@name='contact_number']";
	
	public String email_Input = "//input[@name='email']";
	
	public String user_name_Input = "//input[@name='username']";
	
	public String password_Input = "//input[@name='password']";
	
	public String office_shift_dropdown = "//*[contains(@class,'select2-selection')]//*[contains(text(),'Office Shift')]";
	
	//Office Shift Dropdown value 1
	public String office_shift_morningShift = "//*[contains(@class,'select2-result')]//*[contains(text(),'Morning Shift')]";
	
	public String role_dropdown = "//*[contains(@class,'select2-selection')]//*[contains(text(),'Role')]";
	
	public String role_generalManager = "//*[contains(@class,'select2-result')]//*[contains(text(),'General Manager')]";
	
	public String department_dropdown = "//*[contains(@class,'select2-selection')]//*[contains(text(),'Department')]";
	
	public String department_Engineering  =  "//*[contains(@class,'select2-result')]//*[contains(text(),'Engineering')]";
	
	public String designation_dropdown = "//*[contains(@class,'select2-selection')]//*[contains(text(),'Designation')]";
	
	public String designation_projectManager  =  "//*[contains(@class,'select2-results')]//*[contains(text(),'Project Manager')]";
	
	public String basic_salary_Input = "//input[@name='basic_salary']";
	
	public String hourly_rate_input = "//input[@name='hourly_rate']";
	
	public String saveBtn = "//button[@type='submit']//*[contains(text(),'Save')]";
	
}
