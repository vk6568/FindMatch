package com.findmatch.response;


import java.util.Date;
import java.util.List;

public class InterestResponseSent {

	private Long acceptorId;

	public Long getAcceptorId() {
		return acceptorId;
	}
	public void setAcceptorId(Long acceptorId) {
		this.acceptorId = acceptorId;
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

	
	private Date requestedDate;
	private String status;
	private int statusCode;
	private String statusMessage;
	private List<InterestResponseSent> response;

	public List<InterestResponseSent> getResponse() {
		return response;
	}
	public void setResponse(List<InterestResponseSent> response) {
		this.response = response;
	}
}
