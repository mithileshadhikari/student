package student.student.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="student_data")
public class Student implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentid;
	
	
	@Column(length=30,name="name")
	private String name;
	
		@Column(name="feesAmount")
	private double feesAmt;
	
	
	@Column(length=30,name="marks")
	private float marks;
	
	
	@Column(length=30,name="address")
	private String address;
	
	
	@Column(length=30,name="number")
	private String number;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, double feesAmt, float marks, String address, String number) {
		super();
		this.name = name;
		this.feesAmt = feesAmt;
		this.marks = marks;
		this.address = address;
		this.number = number;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFeesAmt() {
		return feesAmt;
	}

	public void setFeesAmt(double feesAmt) {
		this.feesAmt = feesAmt;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Course [studentid=" + studentid + ", name=" + name + ", feesAmt=" + feesAmt + ", marks=" + marks
				+ ", address=" + address + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, feesAmt, marks, name, number, studentid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(feesAmt) == Double.doubleToLongBits(other.feesAmt)
				&& Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number) && studentid == other.studentid;
	}

	
	
}
