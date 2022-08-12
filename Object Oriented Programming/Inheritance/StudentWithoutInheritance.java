package com.saransh.inheritance;

//We can see a lot of code duplication between person and this class
//so we will use inheritance to address this, refer class Student

public class StudentWithoutInheritance {

		private String name;
		private String email;
		private String phoneNumber;
		private String CollegeName;
		private int Year;
		
		
		
		public StudentWithoutInheritance(String name, String email, String phoneNumber, String collegeName, int year) {
			
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.CollegeName = collegeName;
			this.Year = year;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getCollegeName() {
			return CollegeName;
		}
		public void setCollegeName(String CollegeName) {
			this.CollegeName = CollegeName;
		}
		public int getYear() {
			return Year;
		}
		public void setYear(int year) {
			Year = year;
		}
		
		
		
}


