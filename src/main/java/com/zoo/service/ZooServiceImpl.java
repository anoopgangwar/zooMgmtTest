package com.zoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.criteria.AnimalSearchCriteria;
import com.zoo.dao.ZooDao;
import com.zoo.dto.AnimalDTO;
import com.zoo.dto.AnimalTypeDTO;
import com.zoo.dto.AreaDTO;
import com.zoo.entity.Animal;
import com.zoo.entity.AnimalType;
import com.zoo.entity.Area;
import com.zoo.helper.ZooHelper;

@Service
public class ZooServiceImpl implements ZooService{
     
	@Autowired
	private ZooDao zooDao;
	
	@Autowired
	private ZooHelper zooHelper;
	
	@Override
	public List<AnimalTypeDTO> getAnimalType() {
		// TODO Auto-generated method stub
		List<AnimalType> animalTypeList = zooDao.getAnimalType();
		return zooHelper.convertFromAnimalTypeToDTO(animalTypeList);
	}

	@Override
	public List<AreaDTO> getArea() {
		// TODO Auto-generated method stub
		List<Area> areaList = zooDao.getArea();
		return zooHelper.convertFromAreaToDTO(areaList);
	}

	@Override
	public List<AnimalDTO> searchAnimal(AnimalSearchCriteria searchCriteria) {
		List<Animal> animalList = zooDao.searchAnimal(searchCriteria);
		return zooHelper.convertFromAnimalToDTO(animalList);
	}

}
