package com.zoo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoo.criteria.AnimalSearchCriteria;
import com.zoo.dto.AnimalDTO;
import com.zoo.dto.AnimalTypeDTO;
import com.zoo.dto.AreaDTO;
import com.zoo.service.ZooService;

@Controller
@RequestMapping("zoo")
public class ZooController {
	@Autowired
    private ZooService zooService;    

	@GetMapping("/getAnimalType")
    public ResponseEntity<List<AnimalTypeDTO>> getAnimalType(){
        List<AnimalTypeDTO> animalTypeList = zooService.getAnimalType();
        return new ResponseEntity<List<AnimalTypeDTO>>(animalTypeList, HttpStatus.OK);
    }
	
	@GetMapping("/getArea")
    public ResponseEntity<List<AreaDTO>> getArea(){
        List<AreaDTO> areaList = zooService.getArea();
        return new ResponseEntity<List<AreaDTO>>(areaList, HttpStatus.OK);
    }
	
	@GetMapping("/searchAnimal")
    public ResponseEntity<List<AnimalDTO>> searchAnimal(@PathParam(value="animalType") Integer animalType, @PathParam(value="areaId") Integer areaId,
    		@PathParam(value="penId") Integer penId){
		AnimalSearchCriteria searchCriteria = new AnimalSearchCriteria(animalType,areaId,penId);
        List<AnimalDTO> animalList = zooService.searchAnimal(searchCriteria);
        return new ResponseEntity<List<AnimalDTO>>(animalList, HttpStatus.OK);
    }
	   
}
