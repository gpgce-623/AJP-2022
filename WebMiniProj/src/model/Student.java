package model;

import java.util.ArrayList;

public class Student {
	private String enrollmentNo;
	private String name;
	private String password;
	private String gender;
	private Integer semester;
	private Double cpi;
	private String email;
	private String mobile;
	private String address;
	private String city;
	private String pincode;

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Double getCpi() {
		return cpi;
	}

	public void setCpi(Double cpi) {
		this.cpi = cpi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [enrollmentNo=" + enrollmentNo + ", name=" + name + ", password=" + password + ", gender="
				+ gender + ", semester=" + semester + ", cpi=" + cpi + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public Student(String enrollmentNo, String name, String password, String gender, Integer semester, Double cpi,
			String email, String mobile, String address, String city, String pincode) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.semester = semester;
		this.cpi = cpi;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	public Student() {
	}
}
