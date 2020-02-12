package com.zoo.entity;

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

@Entity
@Table(name="pen")
public class Pen {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="id")
	   private Integer id;
	   @Column(name="pen_name")
	   private String penName;
	   @ManyToOne(fetch=FetchType.EAGER)
	   @JoinColumn(name="pen_area")
	   private Area area;
	   @OneToMany(mappedBy = "pen", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	   private Set<Animal> animals;

	/*
	 * @OneToOne(fetch=FetchType.LAZY)
	 * 
	 * @PrimaryKeyJoinColumn private PenAdjacent penAdjacent;
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
	}
	
	/*
	 * public PenAdjacent getPenAdjacent() { return penAdjacent; } public void
	 * setPenAdjacent(PenAdjacent penAdjacent) { this.penAdjacent = penAdjacent; }
	 */
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	   
}
