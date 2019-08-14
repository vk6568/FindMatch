package com.findMatch.entity;

import java.util.Date;

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
private Long requestorId;
private Long accepectedId;
private String status;
@Temporal(TemporalType.DATE)
private Date requestSentDate;
@Temporal(TemporalType.DATE)
private Date requestProcessedDate;

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
public Long getAccepectedId() {
	return accepectedId;
}
public void setAccepectedId(Long accepectedId) {
	this.accepectedId = accepectedId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getRequestSentDate() {
	return requestSentDate;
}
public void setRequestSentDate(Date requestSentDate) {
	this.requestSentDate = requestSentDate;
}
public Date getAcceptedDate() {
	return requestProcessedDate;
}
public void setRequestProcessedDate(Date requestProcessedDate) {
	this.requestProcessedDate = requestProcessedDate;
}



}
