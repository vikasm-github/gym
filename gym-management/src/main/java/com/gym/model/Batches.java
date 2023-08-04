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
public class Batches {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int batch_id;
	private String batch_name;
	private float batch_start_time;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "batches")
	private List<Member> member = new ArrayList<>();



	public Batches() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Batches(int batch_id, String batch_name, float batch_start_time, List<Member> member) {
		super();
		this.batch_id = batch_id;
		this.batch_name = batch_name;
		this.batch_start_time = batch_start_time;
		this.member = member;
	}



	public int getBatch_id() {
		return batch_id;
	}



	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}



	public String getBatch_name() {
		return batch_name;
	}



	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}



	public float getBatch_start_time() {
		return batch_start_time;
	}



	public void setBatch_start_time(float batch_start_time) {
		this.batch_start_time = batch_start_time;
	}



	public List<Member> getMember() {
		return member;
	}



	public void setMember(List<Member> member) {
		this.member = member;
	}



	@Override
	public String toString() {
		return "Batches [batch_id=" + batch_id + ", batch_name=" + batch_name + ", batch_start_time=" + batch_start_time
				+ ", member=" + member + "]";
	}
	
	
	
 
}
