package four.Entities;

import java.io.Serializable;

import javax.persistence.*;

import four.PojoEntities.UserPojo;


/*************************************************
 * Entity implementation class for Entity: User
 *
 **************************************************/

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long User_id ;
	
	private String userName;
	private String eMail;
	private String password;
	
	@Column (length=1000)
	private String dateRegist;
	private String dateLastLoggin;
	private String userip;
	
	
	private static final long serialVersionUID = 1L;

	public User(UserPojo up){

		this.userName=up.getName();
		this.eMail=up.geteMail();
		this.password=up.getPassword();
		this.dateLastLoggin=up.getLastLoginDate();
		this.dateRegist=up.getLastRegDate();
	}
	
	public User() {};

	public String getUserip() {
		return userip;
	}

	public void setUserip(String userip) {
		this.userip = userip;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	}

	public String getDateRegist() {
		return dateRegist;
	}

	public void setDateRegist(String dateRegist) {
		this.dateRegist = dateRegist;
	}

	public String getDateLastLoggin() {
		return dateLastLoggin;
	}

	public void setDateLastLoggin(String dateLastLoggin) {
		this.dateLastLoggin = dateLastLoggin;
	}

	public long getUser_id() {
		return User_id;
	}
   
}
