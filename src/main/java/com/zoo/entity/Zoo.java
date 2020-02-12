package com.zoo.entity;

import java.util.Date;
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

@Entity
@Table(name="zoo")
public class Zoo {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="id")
   private Integer id;
   @Column(name="zoo_name")
   private String zooName;
   @OneToMany(mappedBy = "zoo",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private Set<Area> areas;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getZooName() {
		return zooName;
	}
	public void setZooName(String zooName) {
		this.zooName = zooName;
	}
   
}
