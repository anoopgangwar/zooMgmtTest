package com.zoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {
	@Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="id")
	   private Integer id;
	   @Column(name="animal_name")
	   private String animalName;	 
	   @ManyToOne(fetch=FetchType.LAZY)
	   @JoinColumn(name = "animal_type")
	   private AnimalType animalType;
	   @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name="pen_id")
	   private Pen pen;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public AnimalType getAnimalType() {
		return animalType;
	}
	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	   
}
