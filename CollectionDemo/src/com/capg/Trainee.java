package com.capg;

public class Trainee {
	
	String name;
	String age;
	long phoneNo;
	
	public Trainee() {
		
	}

	public Trainee(String name, String age, long phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}
	
}
