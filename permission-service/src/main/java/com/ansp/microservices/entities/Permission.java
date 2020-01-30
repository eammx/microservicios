package com.ansp.microservices.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Permission {
	@Id public String id;
	public String reason;
	public Integer emplooyeeId;
	public LocalDateTime date;
	public String time;
	public LocalDateTime datePermission;
	public String reasonRejection;
	public String status;
	
	
	public Permission() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getEmplooyeeId() {
		return emplooyeeId;
	}
	public void setEmplooyeeId(Integer emplooyeeId) {
		this.emplooyeeId = emplooyeeId;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public LocalDateTime getDatePermission() {
		return datePermission;
	}
	public void setDatePermission(LocalDateTime datePermission) {
		this.datePermission = datePermission;
	}
	public String getReasonRejection() {
		return reasonRejection;
	}
	public void setReasonRejection(String reasonRejection) {
		this.reasonRejection = reasonRejection;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
