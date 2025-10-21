package isp;

public class Main {
	
	public static void main(String[] args) {
		GmailAccount kontua = new GmailAccount("aitor", "aitor@gmail.com");
		EmailSender.sendEmail(kontua, "Proba mezua");
	}
}
