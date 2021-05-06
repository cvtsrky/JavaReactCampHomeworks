package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class User implements Entity{
		private int id;
		private String firtName;
		private String lastName;
		private String eMail;
		private String password;
		
		
		public User() {}

		public User(int id, String firtName, String lastName, String eMail, String password) {
			super();
			this.id = id;
			this.firtName = firtName;
			this.lastName = lastName;
			this.eMail = eMail;
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirtName() {
			return firtName;
		}

		public void setFirtName(String firtName) {
			this.firtName = firtName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String geteMail() {
			return eMail;
		}

		public void seteMail(String eMail) {
			this.eMail = eMail;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		};
}
