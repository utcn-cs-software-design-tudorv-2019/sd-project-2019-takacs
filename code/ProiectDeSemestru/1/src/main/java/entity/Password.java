package entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "password")
public class Password implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "text", nullable = false)
    private String passwordText;

    @Column(name = "complexity", nullable = false)
    private String passwordComplexity;

    @OneToOne(mappedBy = "address")
    private User user;

	public Password(String passwordText, String passwordComplexity) {
		super();
		this.passwordText = passwordText;
		this.passwordComplexity = passwordComplexity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPasswordText() {
		return passwordText;
	}

	public void setPasswordText(String passwordText) {
		this.passwordText = passwordText;
	}

	public String getPasswordComplexity() {
		return passwordComplexity;
	}

	public void setPasswordComplexity(String passwordComplexity) {
		this.passwordComplexity = passwordComplexity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
