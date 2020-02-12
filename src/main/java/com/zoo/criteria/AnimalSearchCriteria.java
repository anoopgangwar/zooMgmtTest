package com.zoo.criteria;

public class AnimalSearchCriteria {
	Integer animalType;
	Integer areaId;
	Integer penId;
	
	public AnimalSearchCriteria() {
	
	}
	
	public AnimalSearchCriteria(Integer animalType, Integer areaId, Integer penId) {
		this.animalType = animalType;
		this.areaId = areaId;
		this.penId = penId;
	}
	
	public Integer getAnimalType() {
		return animalType;
	}
	public void setAnimalType(Integer animalType) {
		this.animalType = animalType;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getPenId() {
		return penId;
	}
	public void setPenId(Integer penId) {
		this.penId = penId;
	}
	
	
}
