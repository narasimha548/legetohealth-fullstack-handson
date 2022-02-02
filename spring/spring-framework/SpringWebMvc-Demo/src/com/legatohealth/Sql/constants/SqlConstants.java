package com.legatohealth.Sql.constants;

public class SqlConstants {
	
	public static String insertQuery="INSERT INTO USERS (NAME, PASSWORD,AGE) VALUES(?,?,?)";
	
	public static String updateQuery=" UPDATE USERS SET NAME=?,PASSWORD=?,AGE=? WHERE USERID=? ";
	
	public static String deleteQuery="DELETE FROM USERS WHERE USERID=?";
	
	public static String   fetchById="SELECT *  FROM USERS WHERE USERID=?";
	
	public static String  fetchAll="SELECT * FROM USERS";

}
