package com.zoo.dao;

import java.util.List;

import com.zoo.criteria.AnimalSearchCriteria;
import com.zoo.entity.Animal;
import com.zoo.entity.AnimalType;
import com.zoo.entity.Area;

public interface ZooDao {
  List<AnimalType> getAnimalType();
  List<Area> getArea();
  List<Animal> searchAnimal(AnimalSearchCriteria searchCriteria);
  
}
