package com.test.ch06;




public class Car {
	private String company = "현대자동차";
	private String model = "그랜저";
	private String color = "검정";	
	private int maxSpeed = 350;
	private int speed;
	private int price;
	private String[] dueDate;
	static int count = 0;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Car.count = count;
	}

	public String[] getDueDate() {

		return dueDate;
	}

	public void setDueDate(String[] dueDate) {
		
		//외부순환 (메모리할당)
		for(int i=0; i < dueDate.length;i++) {
			String value = dueDate[i];
		}
		//내부순환
		for(String value : dueDate) {
			//10명이 요청
			//dueDate가 늦어
		}
		this.dueDate = dueDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car() {
		count++;
	}
	
	public Car(String company) {
		this.company = company;
		count++;
	}

	public Car(String company , String model) {
		this.company = company;
		this.model = model;
		count++;
	}
	public Car(String company , String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		count++;
	}
	public String getCompany() {
		return company;
	}
	

	public void setCompany(String company) {
		this.company = company;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		decisionPriceCase(maxSpeed);
		this.maxSpeed = maxSpeed;
	}

	public void decisionPrice(int maxSpeed) {
		if(maxSpeed < 150 ) {
			this.price = 1000;
		}else if (maxSpeed < 200) {
			this.price = 2000;
		}
		else if (maxSpeed < 250) {
			this.price = 3000;
		}
		else {
			this.price = 0;
		}

		this.maxSpeed = maxSpeed;
}

	public void decisionPriceCase(int maxSpeed) {
		switch(maxSpeed) {
		case 100:
			this.price = 500;
			break;
		case 150:
			this.price = 1000;
			break;
		case 200:
			this.price = 1500;
			break;
		case 250:
			this.price = 2000;
		case 300:
			this.price = 2500;
		case 350:
			this.price = 3000;
			break;
		default:
		}
	}

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public String toString() {
		
		String returnVal="";
		returnVal = "회사 = " +this.company + "\n" +
		", 모델=" + this.model + "\n" +
		", 칼라=" + this.color + "\n" +
		", 최고스피드=" +this.maxSpeed+ "\n" +
		", 스피드=" + this.speed + "\n" +
		", 가격 = " + this.price + "\n" + 
		", 갯수 = " + this.count + "]";

		return returnVal;
	}
	
}
