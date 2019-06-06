package model;

import javax.persistence.*;

@Entity
@Table(name = "user")

public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpassword", referencedColumnName = "id")
    private Password idpassword;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idaccount", referencedColumnName = "idaccount")
    private Account idaccount;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iduser")
    private Site site;
    
    public User() {}

	public User(String name, Password idpassword, Account idaccount) {
		super();
		this.name = name;
		this.idpassword = idpassword;
		this.idaccount = idaccount;
	}

	public User(String name, Password idpassword, Account idaccount, Site site) {
		super();
		this.name = name;
		this.idpassword = idpassword;
		this.idaccount = idaccount;
		this.site = site;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((idaccount == null) ? 0 : idaccount.hashCode());
		result = prime * result + ((idpassword == null) ? 0 : idpassword.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (idaccount == null) {
			if (other.idaccount != null)
				return false;
		} else if (!idaccount.equals(other.idaccount))
			return false;
		if (idpassword == null) {
			if (other.idpassword != null)
				return false;
		} else if (!idpassword.equals(other.idpassword))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		return true;
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

	public Account getIdaccount() {
		return idaccount;
	}

	public void setIdaccount(Account idaccount) {
		this.idaccount = idaccount;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
    
}