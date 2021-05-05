package entities;

import java.util.Date;

import abstracts.Entity;

public class Gamer implements Entity{
		private int id;
		private String firtsName;
		private String lastName;
		private String emailAddress;
		private String nationalId;
		private Date dateOfBirth;
		
		public Gamer() {
			
		}
		
		public Gamer(int id, String firtsName, String lastName, String emailAddress, String nationalId,
				Date dateOfBirth) {			
			this.id = id;
			this.firtsName = firtsName;
			this.lastName = lastName;
			this.emailAddress = emailAddress;
			this.nationalId = nationalId;
			this.dateOfBirth = dateOfBirth;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirtsName() {
			return firtsName;
		}

		public void setFirtsName(String firtsName) {
			this.firtsName = firtsName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public String getNationalId() {
			return nationalId;
		}

		public void setNationalId(String nationalId) {
			this.nationalId = nationalId;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
}
