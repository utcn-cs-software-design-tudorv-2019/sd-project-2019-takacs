package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Builder
@Getter
@Setter
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpassword", referencedColumnName = "id")
    private Password idpassword;
    

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "iduser")
    private Site site;


	public User(String name, Password idpassword) {
		super();
		this.name = name;
		this.idpassword = idpassword;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Password getIdpassword() {
		return idpassword;
	}


	public void setIdpassword(Password idpassword) {
		this.idpassword = idpassword;
	}


	public Site getSite() {
		return site;
	}


	public void setSite(Site site) {
		this.site = site;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
