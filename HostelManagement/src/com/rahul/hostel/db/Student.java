package com.rahul.hostel.db;

public class Student {

	private int sid;
	private String name;
	private String dob;
	private int age;
	private String collage;
	private String address;
	private long phoneNo;
	private String email;
	private String password;
	private String dateOfJoin;
	private String dateOfLeave;
	private int rid;
	private int roomNo;
	private double fees;
	private boolean access;
	private String photo;

	public Student() {

	}
	
	public Student(int sid) {
		this.sid = sid;
	}

	public Student(int sid, String name, String dob, int age, String collage, String address, long phoneNo,
			String email, String password, String dateOfJoin, String dateOfLeave, int rid, int roomNo, double fees,
			String photo, boolean access) {
		this.sid = sid;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.collage = collage;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.dateOfJoin = dateOfJoin;
		this.dateOfLeave = dateOfLeave;
		this.rid = rid;
		this.roomNo = roomNo;
		this.fees = fees;
		this.photo = photo;
		this.access = access;
	}

	
	
	public Student(int sid, String name, String dob, int age, String collage, String address, long phoneNo,
			String email, String password, String dateOfJoin, boolean access, String photo) {
		super();
		this.sid = sid;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.collage = collage;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.dateOfJoin = dateOfJoin;
		this.access = access;
		this.photo = photo;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getDateOfLeave() {
		return dateOfLeave;
	}

	public void setDateOfLeave(String dateOfLeave) {
		this.dateOfLeave = dateOfLeave;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public boolean isAccess() {
		return access;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + ", age=" + age + ", collage=" + collage
				+ ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email + ", password=" + password
				+ ", dateOfJoin=" + dateOfJoin + ", dateOfLeave=" + dateOfLeave + ", rid=" + rid + ", roomNo=" + roomNo
				+ ", fees=" + fees + ", access=" + access + ", photo=" + photo + "]";
	}

	
	
}
