package com.gym.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int member_id;
//	private int enq_id;
	private String admission_date;
	private String start_date;
//	private int package_id;
	private int valid_days;
	private char valid_payment;
	private String comment;
	private float discount;
//	private int batch_id;
	
	
	
	@OneToOne
	@JsonIgnore
	private MemberEnquiry memberenquiry;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Package packages;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Batches batches;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "member")
	private List<Transactions> member = new ArrayList<>();

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(int member_id, String admission_date, String start_date, int valid_days, char valid_payment,
			String comment, float discount, MemberEnquiry memberEnquiry, Package packages, Batches batches) {
		super();
		this.member_id = member_id;
		this.admission_date = admission_date;
		this.start_date = start_date;
		this.valid_days = valid_days;
		this.valid_payment = valid_payment;
		this.comment = comment;
		this.discount = discount;
		this.memberenquiry = memberEnquiry;
		this.packages = packages;
		this.batches = batches;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getAdmission_date() {
		return admission_date;
	}

	public void setAdmission_date(String admission_date) {
		this.admission_date = admission_date;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public int getValid_days() {
		return valid_days;
	}

	public void setValid_days(int valid_days) {
		this.valid_days = valid_days;
	}

	public char getValid_payment() {
		return valid_payment;
	}

	public void setValid_payment(char valid_payment) {
		this.valid_payment = valid_payment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public MemberEnquiry getMemberEnquiry() {
		return memberenquiry;
	}

	public void setMemberEnquiry(MemberEnquiry memberEnquiry) {
		this.memberenquiry = memberEnquiry;
	}

	public Package getPackages() {
		return packages;
	}

	public void setPackages(Package packages) {
		this.packages = packages;
	}

	public Batches getBatches() {
		return batches;
	}

	public void setBatches(Batches batches) {
		this.batches = batches;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", admission_date=" + admission_date + ", start_date=" + start_date
				+ ", valid_days=" + valid_days + ", valid_payment=" + valid_payment + ", comment=" + comment
				+ ", discount=" + discount + ", memberEnquiry=" + memberenquiry + ", packages=" + packages
				+ ", batches=" + batches + "]";
	}
	
	
	
	
	
}
