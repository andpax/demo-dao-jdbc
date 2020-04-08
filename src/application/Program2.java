package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id;
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: deapartment findById =====");
		System.out.print("Enter id for find test: ");
		id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		System.out.println(dep);
		
		
		
		sc.close();
		
	}

}
