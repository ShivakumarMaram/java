package DAY_10;

import java.util.*;

class EmployeIdInvalidException extends Exception{
	public EmployeIdInvalidException(String message) {
		super(message);
	}
}

public class Employee {
	public static void  searchCheck(int search) throws EmployeIdInvalidException{
		
	
	if(search<0 || search>999) {
		throw new EmployeIdInvalidException("Invalid employee id");
	}else {
		System.out.println("Valid employee id");
	}
}

	public static void main(String[] args) {
		try {
			searchCheck(10000);
		}catch(EmployeIdInvalidException e) {
		System.out.println(e.getMessage());
		

	}
	}

	}

