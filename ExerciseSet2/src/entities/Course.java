package entities;

import java.util.Objects;

public class Course {

	private int id;
	private String user;
	
	

	public Course(int id, String user) {
		this.id = id;
		this.user = user;
	}

	
	public int getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return id == other.id && Objects.equals(user, other.user);
	}
	
	
	
}
