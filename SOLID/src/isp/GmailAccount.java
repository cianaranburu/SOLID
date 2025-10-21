package isp;

public class GmailAccount implements iEmail{
	 String name, emailAddress;
	
	 public GmailAccount(String name, String emailAddress) {
		 this.name = name;
		 this.emailAddress = emailAddress;
	 }
	 
	 public String getName() {
		 return name;
	 }

	 @Override
	 public String getEmail() {
		 return emailAddress;
	 }
}