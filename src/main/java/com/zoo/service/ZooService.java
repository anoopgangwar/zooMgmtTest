package com.zoo.service;

import java.util.List;

import com.zoo.criteria.AnimalSearchCriteria;
import com.zoo.dto.AnimalDTO;
import com.zoo.dto.AnimalTypeDTO;
import com.zoo.dto.AreaDTO;

public interface ZooService {
	List<AnimalTypeDTO> getAnimalType();
	List<AreaDTO> getArea();
	List<AnimalDTO> searchAnimal(AnimalSearchCriteria searchCriteria);
}
