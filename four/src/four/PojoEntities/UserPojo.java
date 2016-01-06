package four.PojoEntities;

import com.google.gwt.user.client.rpc.IsSerializable;

import four.Entities.User;


public class UserPojo  implements IsSerializable {

	
		/***************************************
		 *
		 *	This method for the entity 
		 * 
		 ***************************************/	
		
	private String name;
		private String password;
		private String eMail;
		private String LastLoginDate;
		private String LastRegDate;
		
		 public UserPojo(User user){

			this.name=user.getUserName();
			this.eMail=user.geteMail();
			this.password=user.getPassword();
			this.LastRegDate=user.getDateRegist();
			this.LastLoginDate=user.getDateLastLoggin();
		
		}
	
		public UserPojo(){};

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String geteMail() {
			return eMail;
		}

		public void seteMail(String eMail) {
			this.eMail = eMail;
		}

		public String getLastLoginDate() {
			return LastLoginDate;
		}

		public void setLastLoginDate(String lastLoginDate) {
			LastLoginDate = lastLoginDate;
		}

		public String getLastRegDate() {
			return LastRegDate;
		}

		public void setLastRegDate(String lastRegDate) {
			LastRegDate = lastRegDate;
		};
		
		
	
}
