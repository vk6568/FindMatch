package com.findmatch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
public class InterestedProfile {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private Long interestedId;
@Column(name="requestor_id")
private Long requestorId;
@Column(name="acceptor_id")
private Long acceptorId;
private String status;
@Temporal(TemporalType.DATE)
private Date requestDate;
@Temporal(TemporalType.DATE)
private  Date requestProcessedDate;
public Date getRequestProcessedDate() {
	return requestProcessedDate;
}
public void setRequestProcessedDate(Date requestProcessedDate) {
	this.requestProcessedDate = requestProcessedDate;
}
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

public Long getAcceptorId() {
	return acceptorId;
}
public void setAcceptorId(Long acceptorId) {
	this.acceptorId = acceptorId;
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
public void setRequestDate(Date today) {
	this.requestDate = today;
}




}
