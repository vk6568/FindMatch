package com.findmatch.response;


import java.util.Date;
import java.util.List;

public class InterestResponse {
private Long requestorId;

private Date requestedDate;
private String status;
private int statusCode;
private String statusMessage;
private List<InterestResponse> response;

public List<InterestResponse> getResponse() {
	return response;
}
public void setResponse(List<InterestResponse> response) {
	this.response = response;
}
public Long getRequestorId() {
	return requestorId;
}
public void setRequestorId(Long requestorId) {
	this.requestorId = requestorId;
}


public Date getRequestedDate() {
	return requestedDate;
}
public void setRequestedDate(Date date) {
	this.requestedDate = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getStatusMessage() {
	return statusMessage;
}
public void setStatusMessage(String statusMessage) {
	this.statusMessage = statusMessage;
}


}
