package login;

import shared.ExcelDataConfig;


public class LoginCreds {

	public static void main(String[] args) throws Exception {

		ExcelDataConfig credsFile = new ExcelDataConfig("C:\\Users\\IT\\Desktop\\testcreds.xlsx");
		
		String username = credsFile.getData(0, 1, 0);
		String password = credsFile.getData(0, 1, 1);
		System.out.println(username + " - " + password);

}
}