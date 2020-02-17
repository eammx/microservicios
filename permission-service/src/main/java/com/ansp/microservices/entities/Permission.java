package com.ansp.microservices.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
@Entity
public class Permission {
	@ApiModelProperty
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public Integer id;
	@ApiModelProperty
	public String reason;
	@ApiModelProperty
	public Integer emplooyeeId;
	@ApiModelProperty
	public LocalDateTime date;
	@ApiModelProperty
	public String time;
	@ApiModelProperty
	public LocalDateTime datePermission;
	@ApiModelProperty
	public String reasonRejection;
	@ApiModelProperty
	public String status;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
