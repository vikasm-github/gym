package com.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trans_id;
//	private int member_id;
	private String tran_date;
	private String sart_date;
	private String to_date;
	private String trans_mode;
	private float totalAmt;
	private float amtPaid;
	private char status;
	private String comment;
	private float dicount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Member member;
	

}
