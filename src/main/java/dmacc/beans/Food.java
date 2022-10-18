package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */
@Entity
public class Food {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int calories;
	private double fat;
	private double carbs;
	private double protein;
	
	public Food() {
		super();
	}

	public Food(long id, String name, int calories, double fat, double carbs, double protein) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
	}

	public Food(String name, int calories, double fat, double carbs, double protein) {
		super();
		this.name = name;
		this.calories = calories;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", calories=" + calories + ", fat=" + fat + ", carbs=" + carbs
				+ ", protein=" + protein + "]";
	}
	
}
