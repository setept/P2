package com.jihe;

import java.util.HashSet;

class persen {
	String name;
	int age;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		persen other = (persen) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name +":"+age;
	}

	public persen(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		persen p1=new persen("a1", 15);
		persen p2=new persen("a2", 16);
		persen p3=new persen("a3", 18);
		persen p4=new persen("a3", 18);
		HashSet<persen> ts=new HashSet<persen>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		System.out.println(ts);
	}
}
