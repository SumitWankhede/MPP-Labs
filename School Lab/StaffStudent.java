package cs.app;

public class StaffStudent extends Student{
	private String dateOfCourseJoining;
	private Staff staffMember;
	
	public StaffStudent(Staff member, String dateOfCourseJoining, double gPA) {
		super(member.getName(), member.getPhone(), member.getAge(), gPA);
		this.dateOfCourseJoining = dateOfCourseJoining;
		staffMember = member;
	}

	public String getDateOfCourseJoining() {
		return dateOfCourseJoining;
	}

	public void setDateOfCourseJoining(String dateOfCourseJoining) {
		this.dateOfCourseJoining = dateOfCourseJoining;
	}

	public Staff getStaffMember() {
		return staffMember;
	}
	
}
