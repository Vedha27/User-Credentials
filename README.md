
User Credentials:

 In a typical application, the  password will not be stored directly in the database as it will be more prone to attack. The password of users will always be stored in an encrypted format. Hence implement a typical user authorization technique for login.


Strictly adhere to the Object-Oriented Specifications given in  the problem statement. All class
names,attribute names and method names should be the the sames as specified in the problem  statement.

Create a class name User class with the following private attributes  and include appropriate getters and setters:

Create a Default Constructor and Parameterized Constructor as User(Integer id, String username, String password)for the class.

Attributes	Datatype
id 	Integer
username	String
password	String


Create a class a named  UserBO class  to validate the username and password with the following  methods.

Method Description

Method 	Description
User[ ] getUser( )	This method returns a predefined array of users.
private String encrypted Password(String password)	This method accepts a single argument of  type String.
It returns the encrypted password by replacing it with t  its next  ASCII character.
For example, A is replaced with B. 
String  validate(String username, String password)	This method takes username and password entered by the user as arguments. The password has to be encrypted. The username and encrypted password has to compared with the predefined user list.
It returns valid or invalid user.

Create a driver class named Main  to  test the above class:

ID	Username	Password	Encrypted Password
1	   Louis 	   ABCDEF	    BCDEFG
2	  Messie	   Me123	    Nf234
3	  Steve	    Stev111	    Rufw222
4	  Kallis	   12345	    23456
5	  Wipro	     acegi	    bdfhj


Sample Input1:                                                               Sample Input2:
	Enter your username: Louis				                                           Enter your username:Kalis
	Enter your password: ABCDEF				                                           Enter your password:120v45
Sample output1:				                                                         Sample Output2:
 	Login Successfully					                                                 Invalid username or password

	



