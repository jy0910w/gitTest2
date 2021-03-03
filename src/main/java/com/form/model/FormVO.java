package com.form.model;

import util.Tools;

public class FormVO implements java.io.Serializable {
	private Integer form_id;
	private String form_title;
	private String form_contact_name;
	private String form_email;
	private String form_phone;
	private String form_type;
	private String form_content;
	private java.sql.Timestamp form_time ;
	private Integer form_status;
	private String form_solution;
	private Integer admin_id;
	private Integer parking_lot_id;
	private int pp;
	
	@Override
	public String toString() {
		return "FormVO [form_id=" + form_id + ", form_title=" + form_title + ", form_contact_name=" + form_contact_name
				+ ", form_email=" + form_email + ", form_phone=" + form_phone + ", form_type=" + form_type
				+ ", form_content=" + form_content + ", form_time=" + Tools.correctTimestamp(form_time) + ", form_status=" + form_status
				+ ", form_solution=" + form_solution + ", admin_id=" + admin_id + ", parking_lot_id=" + parking_lot_id
				+ "]";
	}
	public FormVO() {
		
	}
	public Integer getForm_id() {
		return form_id;
	}
	public void setForm_id(Integer form_id) {
		this.form_id = form_id;
	}
	public String getForm_title() {
		return form_title;
	}
	public void setForm_title(String form_title) {
		this.form_title = form_title;
	}
	public String getForm_contact_name() {
		return form_contact_name;
	}
	public void setForm_contact_name(String form_contact_name) {
		this.form_contact_name = form_contact_name;
	}
	public String getForm_email() {
		return form_email;
	}
	public void setForm_email(String form_email) {
		this.form_email = form_email;
	}
	public String getForm_phone() {
		return form_phone;
	}
	public void setForm_phone(String form_phone) {
		this.form_phone = form_phone;
	}
	public String getForm_type() {
		return form_type;
	}
	public void setForm_type(String form_type) {
		this.form_type = form_type;
	}
	public String getForm_content() {
		return form_content;
	}
	public void setForm_content(String form_content) {
		this.form_content = form_content;
	}
	public java.sql.Timestamp getForm_time() {
		return form_time;
	}
	public void setForm_time(java.sql.Timestamp form_time) {
		this.form_time = form_time;
	}
	public Integer getForm_status() {
		return form_status;
	}
	public void setForm_status(Integer form_status) {
		this.form_status = form_status;
	}
	public String getForm_solution() {
		return form_solution;
	}
	public void setForm_solution(String form_solution) {
		this.form_solution = form_solution;
	}
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public Integer getParking_lot_id() {
		return parking_lot_id;
	}
	public void setParking_lot_id(Integer parking_lot_id) {
		this.parking_lot_id = parking_lot_id;
	}
	

}
