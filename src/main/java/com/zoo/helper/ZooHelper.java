package com.zoo.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.zoo.dto.AnimalDTO;
import com.zoo.dto.AnimalTypeDTO;
import com.zoo.dto.AreaDTO;
import com.zoo.dto.PenDTO;
import com.zoo.entity.Animal;
import com.zoo.entity.AnimalType;
import com.zoo.entity.Area;
import com.zoo.entity.Pen;

@Component
public class ZooHelper {
	
	public static List<AnimalTypeDTO> convertFromAnimalTypeToDTO(List<AnimalType> animalTypeList){
		List<AnimalTypeDTO> animalTypeDTOList = new ArrayList<AnimalTypeDTO>();
		AnimalTypeDTO animalTypeDTO = null;
		for(AnimalType animalType:animalTypeList) {
			animalTypeDTO = new AnimalTypeDTO();
		    animalTypeDTO.setAnimalTypeKey(String.valueOf(animalType.getId()));
			animalTypeDTO.setAnimalTypeValue(animalType.getAnimalTypeDescription()+
					(StringUtils.isEmpty(animalType.getAdditionalAttribute())?"":"("+animalType.getAdditionalAttribute()+")"));
			animalTypeDTOList.add(animalTypeDTO);
		}
		return animalTypeDTOList;
	}
	
	public static List<AreaDTO> convertFromAreaToDTO(List<Area> areaList){		
		List<AreaDTO> areaDTOList = new ArrayList<AreaDTO>();
		List<PenDTO> penDTOList = null;
		AreaDTO areaDTO = null;
		PenDTO penDTO = null;
		for(Area area: areaList) {
			areaDTO = new AreaDTO();
			areaDTO.setAreaId(String.valueOf(area.getId()));
			areaDTO.setAreaName(area.getAreaName());
			penDTOList = new ArrayList<PenDTO>();
			for(Pen pen: area.getPens()) {
				penDTO = new PenDTO();
				penDTO.setPenId(String.valueOf(pen.getId()));
				penDTO.setPenName(pen.getPenName());
				penDTOList.add(penDTO);
			}
			areaDTO.setPens(penDTOList);
			areaDTOList.add(areaDTO);
		}
		return areaDTOList;
	}
	
	public static List<AnimalDTO> convertFromAnimalToDTO(List<Animal> animalList){		
		List<AnimalDTO> animalDTOList = new ArrayList<AnimalDTO>();
		AnimalDTO animalDTO = null;
		for(Animal animal:animalList) {
			animalDTO = new AnimalDTO();
			animalDTO.setId(String.valueOf(animal.getId()));
			animalDTO.setAnimalName(animal.getAnimalName());
			animalDTO.setAreaName(animal.getPen().getArea().getAreaName());
			animalDTO.setPenName(animal.getPen().getPenName());
			animalDTO.setZooName(animal.getPen().getArea().getZoo().getZooName());
			animalDTO.setAnimalType(animal.getAnimalType().getAnimalTypeDescription());
			animalDTOList.add(animalDTO);
		}
		return animalDTOList;
	}

}
