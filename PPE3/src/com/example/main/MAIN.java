package com.example.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.example.constants.CRUDMode;
import com.example.model.Student;
import com.example.utilities.DBUtil;

/*
 * @author Sam Ong
 * 
 */

public class MAIN {

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException{
		boolean willContinue = true;

		// start of the program
		System.out.println("Welcome to an example DB program:");
		while (willContinue) {
			System.out.println("What will you do? (Press A-add, U-update, D-delete, Q-quit");
			char choice = scanner.nextLine().charAt(0);
			
			//choose mode
			CRUDMode mode = choice == 'A' ? CRUDMode.ADD:
						    choice == 'U' ? CRUDMode.UPDATE:
							choice == 'D' ? CRUDMode.DELETE:
							choice == 'Q' ? CRUDMode.QUIT:
							choice == 'L' ? CRUDMode.LIST:
								choice == 'S' ? CRUDMode.SELECT:
											CRUDMode.INVALID;

			switch (mode) {
			case ADD:
				System.out.println("Add!");
				DBUtil.addStudent(retrieveInput(mode));
				break;
			case UPDATE:
				System.out.println("Update!");
				DBUtil.updateStudent(retrieveInput(mode));
				break;
			case DELETE:
				System.out.println("Delete!");
				DBUtil.deleteStudent(retrieveInput(mode));
				break;
			case SELECT:
				System.out.println("LE candidat");
				System.out.println(DBUtil.selStudent());
				break;
			case QUIT:
				System.out.println("GoodBye!");
				willContinue = false;
				break;
			case LIST:
				System.out.println("List of Students:");
				System.out.println(DBUtil.getAllStudents());
				break;
			case INVALID:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

	// @param enum type mode for CRUD operation
	private static Student retrieveInput(CRUDMode mode) {
		Student student = new Student();

		System.out.println("Fill up details:");

		/* This is redundant. Is there a better way of doing this?
		 * Please refactor the way input is being done
		 * Leave the return statement as is 
		 */
		if (mode.equals(CRUDMode.ADD) || mode.equals(CRUDMode.UPDATE)) {
			if(mode.equals(CRUDMode.UPDATE)){
				System.out.println("IncId:"); student.setIncid(scanner.nextLine());
			}
			System.out.println("Id:"); student.setId(scanner.nextLine());
			System.out.println("Name:"); student.setName(scanner.nextLine());
			System.out.println("Address:"); student.setAddress(scanner.nextLine());
			System.out.println("Gender:"); student.setGender(scanner.nextLine());
			System.out.println("Age:"); student.setAge(scanner.nextLine());
		}
		else if(mode.equals(CRUDMode.DELETE)){
			System.out.println("IncId:"); student.setIncid(scanner.nextLine());
		}
		return student;
	}
}
