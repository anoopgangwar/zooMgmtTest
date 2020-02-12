package com.zoo.dto;

import java.util.List;

public class AreaDTO {
	
	String areaId;
	String areaName;
	List<PenDTO> pens;
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public List<PenDTO> getPens() {
		return pens;
	}
	public void setPens(List<PenDTO> pens) {
		this.pens = pens;
	}
	

}
