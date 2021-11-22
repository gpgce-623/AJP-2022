
public class Student {
	private String enrollmentNo;
	private String name;
	private Double cpi;

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

	public Double getCpi() {
		return cpi;
	}

	public void setCpi(Double cpi) {
		this.cpi = cpi;
	}

	@Override
	public String toString() {
		return "Student [enrollmentNo=" + enrollmentNo + ", name=" + name + ", cpi=" + cpi + "]";
	}

	public Student(String enrollmentNo, String name, Double cpi) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.name = name;
		this.cpi = cpi;
	}

	public Student() {
	}
}
