package com.gym.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int package_id;
	private String package_name;
	private int package_days;
	private float package_amt;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "packages")
	private List<Member> member = new ArrayList<>();



	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Package(int package_id, String package_name, int package_days, float package_amt, List<Member> member) {
		super();
		this.package_id = package_id;
		this.package_name = package_name;
		this.package_days = package_days;
		this.package_amt = package_amt;
		this.member = member;
	}



	public int getPackage_id() {
		return package_id;
	}



	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}



	public String getPackage_name() {
		return package_name;
	}



	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}



	public int getPackage_days() {
		return package_days;
	}



	public void setPackage_days(int package_days) {
		this.package_days = package_days;
	}



	public float getPackage_amt() {
		return package_amt;
	}



	public void setPackage_amt(float package_amt) {
		this.package_amt = package_amt;
	}



	public List<Member> getMember() {
		return member;
	}



	public void setMember(List<Member> member) {
		this.member = member;
	}



	@Override
	public String toString() {
		return "Package [package_id=" + package_id + ", package_name=" + package_name + ", package_days=" + package_days
				+ ", package_amt=" + package_amt + ", member=" + member + "]";
	}
	
	
	
	
}
