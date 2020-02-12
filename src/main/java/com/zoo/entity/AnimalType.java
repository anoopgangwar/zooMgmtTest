package com.zoo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ch.qos.logback.classic.spi.STEUtil;

@Entity
@Table(name="animal_type")
public class AnimalType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="animal_type_desc")
	private String animalTypeDescription;
	@Column(name="additional_attribute")
	private String additionalAttribute;
	@OneToMany(mappedBy = "animalType",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Animal> animals;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnimalTypeDescription() {
		return animalTypeDescription;
	}
	public void setAnimalTypeDescription(String animalTypeDescription) {
		this.animalTypeDescription = animalTypeDescription;
	}
	public String getAdditionalAttribute() {
		return additionalAttribute;
	}
	public void setAdditionalAttribute(String additionalAttribute) {
		this.additionalAttribute = additionalAttribute;
	}
	public Set<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}
	   
}
