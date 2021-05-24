package JavaProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
@NoArgsConstructor
public class Employer extends User {

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "website")
	private String webSite;

	@Column(name = "phone_number")
	private String phoneNumber;

	public Employer(int id, String email, String password, String companyName, String webSite, String phoneNumber) {
		this.setId(0);
		this.setEmail(email);
		this.setPassword(password);
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
