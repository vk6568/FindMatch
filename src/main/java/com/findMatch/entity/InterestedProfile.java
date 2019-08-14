package com.findMatch.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InterestedProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long interestedId;
	private Long requestorId;
	private Long accepectorId;
	private String status;
	private Date requestDate;
	private Date acceptedDate;
	

	public Long getInterestedId() {
		return interestedId;
	}

	public void setInterestedId(Long interestedId) {
		this.interestedId = interestedId;
	}

	public Long getRequestorId() {
		return requestorId;
	}

	public void setRequestorId(Long requestorId) {
		this.requestorId = requestorId;
	}

	public Long getAccepectorId() {
		return accepectorId;
	}

	public void setAccepectorId(Long accepectorId) {
		this.accepectorId = accepectorId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getAcceptedDate() {
		return acceptedDate;
	}

	public void setAcceptedDate(Date acceptedDate) {
		this.acceptedDate = acceptedDate;
	}

}
