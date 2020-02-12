package com.zoo.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="area")
public class Area {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="id")
   private Integer id;
   @Column(name="area_name")
   private String areaName;
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name = "area_zoo")
   private Zoo zoo;
	/*
	 * @OneToOne(fetch=FetchType.LAZY)
	 * 
	 * @PrimaryKeyJoinColumn private AreaAdjacent areaAdjacent;
	 */
   @OneToMany(mappedBy = "area", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   @Fetch(FetchMode.SUBSELECT)
   private Set<Pen> pens;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Set<Pen> getPens() {
		return pens;
	}
	public void setPens(Set<Pen> pens) {
		this.pens = pens;
	}
	public Zoo getZoo() {
		return zoo;
	}
	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	
	
	   
   
}
