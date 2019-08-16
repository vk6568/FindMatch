package com.findmatch.dto;

import java.util.Date;

public class InterestedProfileDto {
	

private Long interestedId;

private Long requestorId;

private Long acceptorId;
private String status;

private Date requestDate;

private  Date requestProcessedDate;

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
public Date getRequestProcessedDate() {
	return requestProcessedDate;
}
public void setRequestProcessedDate(Date requestProcessedDate) {
	this.requestProcessedDate = requestProcessedDate;
}

}
