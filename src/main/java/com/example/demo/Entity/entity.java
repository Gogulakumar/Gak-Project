package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="GAK")
public class entity {
	@Id	
	@Column(name="eid")	
	private int eid;	
	@Column(name="sname")	
	private String sname;	
	@Column(name="email")
	private String email;	
	@Column(name="category")	
	private String category;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public entity(int eid, String sname, String email, String category) {
		super();
		this.eid = eid;
		this.sname = sname;
		this.email = email;
		this.category = category;
	}
	public entity() {

	}
	
}