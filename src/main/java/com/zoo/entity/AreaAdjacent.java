package com.zoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adjuscent_area_id")
public class AreaAdjacent {
	@Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="id")
	   private Integer id;
	   @Column(name="adjucent_area_description")
	   private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
