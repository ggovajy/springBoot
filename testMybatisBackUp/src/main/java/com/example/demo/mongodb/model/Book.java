package com.example.demo.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Document(collection = "ggova")
public class Book {
	
	@Id
	private String _id;
	@JsonSerialize(using = ToStringSerializer.class)
	private String ename;
	@Field("depart")
	@JsonSerialize(using = ToStringSerializer.class)
	private String depart;
	@Field("status")
	@JsonSerialize(using = ToStringSerializer.class)
	private String status;
	@Field("height")
	@JsonSerialize(using = ToStringSerializer.class)
	private String height;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	

}
