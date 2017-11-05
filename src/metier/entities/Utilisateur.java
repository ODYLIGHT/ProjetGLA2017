package metier.entities;

import java.io.Serializable;

public class Utilisateur implements Serializable {

	private Long id;
	private String profil = "";
	private String login = "";
	private String password = "";
	private String email = "";
	private Boolean status = false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Utilisateur(String profil, String login, String password, String email, Boolean status) {
		super();
		this.profil = profil;
		this.login = login;
		this.password = password;
		this.email = email;
		this.status = status;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", profil=" + profil + ", login=" + login + ", password=" + password
				+ ", email=" + email + ", status=" + status + "]";
	}
	
	
	
	

}
