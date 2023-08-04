package com.gym.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class MemberEnquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int enq_id;
	private String m_name;
	private long contact;
	private float age;
	private String address;
	private String time_slot_expected;
	private String status;
	private String activity;
	private String enq_date;
	
	@OneToOne
	private Member member;

	public int getEnq_id() {
		return enq_id;
	}

	public void setEnq_id(int enq_id) {
		this.enq_id = enq_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTime_slot_expected() {
		return time_slot_expected;
	}

	public void setTime_slot_expected(String time_slot_expected) {
		this.time_slot_expected = time_slot_expected;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getEnq_date() {
		return enq_date;
	}

	public void setEnq_date(String enq_date) {
		this.enq_date = enq_date;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public MemberEnquiry(int enq_id, String m_name, long contact, float age, String address, String time_slot_expected,
			String status, String activity, String enq_date, Member member) {
		super();
		this.enq_id = enq_id;
		this.m_name = m_name;
		this.contact = contact;
		this.age = age;
		this.address = address;
		this.time_slot_expected = time_slot_expected;
		this.status = status;
		this.activity = activity;
		this.enq_date = enq_date;
		this.member = member;
	}

	public MemberEnquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MemberEnquiry [enq_id=" + enq_id + ", m_name=" + m_name + ", contact=" + contact + ", age=" + age
				+ ", address=" + address + ", time_slot_expected=" + time_slot_expected + ", status=" + status
				+ ", activity=" + activity + ", enq_date=" + enq_date + ", member=" + member + "]";
	}
	
	
	

}
