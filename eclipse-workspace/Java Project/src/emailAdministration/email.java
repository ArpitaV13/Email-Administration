package emailAdministration;

import java.util.Scanner;

public class email {
private String firstName;
private String lastName;
private String password;
private String email;
private int defaultPasswordLength=10;
private String department;
private int mailboxCapacity=500;
private String alternateEmail;
private String companySuffix="anycompany.com";
// Constructors-:

public email(String firstName ,String lastName) {
this.firstName=firstName;
this.lastName=lastName;
System.out.println(this.firstName+" "+this.lastName);
this.department=setDepartment();
System.out.println("Department is "+this.department);
this.password=randomPassword(defaultPasswordLength);
//System.out.println("Your password is "+this.password);
email=firstName.toLowerCase()+lastName.toLowerCase()+"."+department+"@"+companySuffix;
//System.out.println(email);

}
private String setDepartment() {
	System.out.print("Hello "+firstName+"!"+"Enter Department code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
	Scanner sc =new Scanner(System.in);
	int depCode=sc.nextInt();
	if(depCode==1) {return "Sales";
	}
	else if(depCode==2) {return "dev";}

else if(depCode==3) {return "Accounts";}
else return "";
}
private String randomPassword(int length) {
String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()";
char[] Password=new char[length];
for(int i=0;i<length;i++) {
	int random=(int) (Math.random() * passwordSet.length());
	Password[i]=passwordSet.charAt(random);
}
return new String(Password);
}
public void setmailboxCapacity(int capacity) {
	this.mailboxCapacity=capacity;
}
public void setAlternateEmail(String altEmail) {
	this.alternateEmail=altEmail;
}
public void setchangePassword(String password) {
	this.password=password;
}
public int getmailboxCapacity() {
	return mailboxCapacity;
}
public String getAlternateEmail() {
	return alternateEmail;
}
public String getchangePassword() {
	return password;
	
}
public String showInfo() {
	return "Name " +firstName +" "+lastName +"  "+"\nCompany Email-" +email+"  "+"\nMailbox Capacity "+mailboxCapacity;
}
}
