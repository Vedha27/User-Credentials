package com.UserCredentials;

import java.util.Scanner;

class User{
	private Integer id;
	private String userName;
	private String password;
	
	public User() {
		
	}

	public User(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

 	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

class UserBO{
		
		private User[] getUsers(){
			User[] users=new User[5];
			users[0]=new User(1,"Louis","BCDEFG");
			users[1]=new User(2,"Messie","Nf234");
			users[2]=new User(3,"Steve","Rufw222");
			users[3]=new User(4,"Kalis","Nf234");
			users[4]=new User(5,"Wipro","Nf234");
			 
			return users;
			
		}
		
		private String encryptPassword(String password) {
			String res="";
			
			for (int i=0;i<password.length();i++) {
				res=res+(char)(password.charAt(i)+1);
				}
			return res;
		}
		
		public String validate(String userName, String password) {
			User[] users=getUsers();
			
			for(int i=0;i<users.length;i++) {
				String name=users[i].getUserName();
				String pwd=users[i].getPassword();
				if(name.equals(name) && pwd.equals(encryptPassword(password))){
					return "Log in Successfully";
				}
			}
			return "Invalid usrname or password";
		}
}


public class Main {

	public static void main(String[] args) {
		UserBO u=new UserBO();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Your Username:");
		String uName=scan.nextLine();
		System.out.println("Enter your Password:");
		String pwd=scan.nextLine();
		System.out.println(u.validate(uName, pwd));
		scan.close();
	}

}









