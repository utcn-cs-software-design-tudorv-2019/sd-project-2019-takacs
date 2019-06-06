package model;

import javax.persistence.*;

@Entity
@Table(name = "password")
public class Password {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "text", nullable = false)
    private String passwordText;

    @Column(name = "complexity", nullable = false)
    private String passwordComplexity;

    
    
    public Password() {}



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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((passwordComplexity == null) ? 0 : passwordComplexity.hashCode());
		result = prime * result + ((passwordText == null) ? 0 : passwordText.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Password other = (Password) obj;
		if (id != other.id)
			return false;
		if (passwordComplexity == null) {
			if (other.passwordComplexity != null)
				return false;
		} else if (!passwordComplexity.equals(other.passwordComplexity))
			return false;
		if (passwordText == null) {
			if (other.passwordText != null)
				return false;
		} else if (!passwordText.equals(other.passwordText))
			return false;
		return true;
	}
    
}
