package com.zoo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zoo.criteria.AnimalSearchCriteria;
import com.zoo.entity.Animal;
import com.zoo.entity.AnimalType;
import com.zoo.entity.Area;

@Transactional
@Repository
public class ZooDaoImpl implements ZooDao{

	@PersistenceContext
	private EntityManager entityManager;
	    
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<AnimalType> getAnimalType() {
		String hql="from AnimalType";
        List<AnimalType> animalTypeList = (List<AnimalType>) entityManager.createQuery(hql).getResultList();
        return animalTypeList;
	}

	@Override
	public List<Area> getArea() {
		String hql="from Area";
        List<Area> areaList = (List<Area>) entityManager.createQuery(hql).getResultList();
        return areaList;		
	}

	@Override
	public List<Animal> searchAnimal(AnimalSearchCriteria searchCriteria) {
		String hql= prepareSearchHQL(searchCriteria);
        List<Animal> animalList = (List<Animal>) entityManager.createQuery(hql).getResultList();
        return animalList;
	}
	
	private String prepareSearchHQL(AnimalSearchCriteria searchCriteria) {
		String baseHQL = "select a from Animal a inner join a.pen p inner join p.area ar inner join ar.zoo inner join a.animalType at where p.area.id = 1 and p.id = 16"
				+ " and at.id = 2";
		return baseHQL;
	}

}
