import java.util.HashMap;

public class Employee {
	private int eID;
	private String userName;
	private String userPassword;
	private String userFullName;
	private String userAddress;
	private String userGender;
	private String userEducation;
	
	public Employee( String userName, String userPassword, String userFullName, String userAddress,
			String userGender, String userEducation) {
		super();
		
		this.userName = userName;
		this.userPassword = userPassword;
		this.userFullName = userFullName;
		this.userAddress = userAddress;
		this.userGender = userGender;
		this.userEducation = userEducation;

	}//construcor 
	
	//getter setter - Start
	public int getEID() {
		return eID;
	}
	public void setEID(int eID) {
		this.eID = eID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEducation() {
		return userEducation;
	}
	public void setUserEducation(String userEducation) {
		this.userEducation = userEducation;
	}
	//getter setter - end
}//class Employee
