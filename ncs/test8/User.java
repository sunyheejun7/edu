package ncs.test8;

public class User {
	private String id,password,name;
	private int age;
	private char gender;
	private String phone;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+password+" "+name+" "+age+" "+gender+"\t"+phone;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof User) {
			User u = (User)obj;
			if(u.id==this.id&&u.age==this.age&&u.gender==this.gender	
					&&u.name==this.name&&u.password==this.password&&u.phone==this.phone)
				return true;
			else
				return false;
		}else		
			return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		User u = new User(id, password, name, age, gender, phone);
		return u;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}




}
