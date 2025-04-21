package model;

public class User {
	private String userName;
	private String gender;
	private Integer age;
	private Double height;
	private Double weight;
	private Double bmiValue;
	
	// 建構子封裝
	public User(String username, String gender, String age, String height, String weight) {
		this.userName = username;
		this.gender = gender;
		this.age = Integer.parseInt(age);
		this.height = Double.parseDouble(height);
		this.weight = Double.parseDouble(weight);
		// 計算 bmi 值
		this.bmiValue = this.weight / Math.pow(this.height/100, 2);
	}
	
	// 方法封裝-getter
	public String getUserName() {
		return userName;
	}

	public String getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

	public Double getHeight() {
		return height;
	}

	public Double getWeight() {
		return weight;
	}

	public Double getBmiValue() {
		return bmiValue;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight="
				+ weight + ", bmiValue=" + bmiValue + "]";
	}
	
	
}
