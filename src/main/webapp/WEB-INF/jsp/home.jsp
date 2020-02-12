<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zoo Test</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script type="text/javascript" src="script/zoo.js"></script>
  <script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
  <style>
  
  </style>
  <script>
  $(document).ready(function() {
	  $("#submitBtn").click(function(){
		  searchAnimal();
	  });
	  });
  
  function loadAnimalType(){
	  $.getJSON("/zoo/getAnimalType",function(data){
	   console.log(data)
	  });	  
  }
  
  function loadArea(){
	  $.getJSON("/zoo/getArea",function(data){
	   console.log(data)
	  });	  
  }
  
  function searchAnimal(){
	  $.getJSON("/zoo/searchAnimal",function(data){
	   console.log(data)
	  });	  
  }
  </script>
</head>
<body>
  <div class="container">
  <h2>Zoo Management Application</h2>
  
  <form class="form-inline" >
    <div class="form-group">
      <label for="email">Select Animal Type:</label>
      <select class="form-control">
       <option>birds</option>
      </select>
    </div>
    <div class="form-group">
      <label for="pwd">Select Area:</label>
      <select class="form-control">
       <option>area 1</option>
      </select>
    </div>
    <div class="form-group">
      <label for="pwd">Select Pen:</label>
      <select class="form-control">
       <option>pen 1</option>
      </select>
    </div>
   
    <input type="button" id="submitBtn" class="btn btn-default" value="Search"/>
    <div class="row">&nbsp;</div>
    <div class="row">
    	<div class="col-sm-2" style="background-color:lavender;">Animal Name</div>
    	<div class="col-sm-2" style="background-color:lavender;">Animal Type</div>
    	<div class="col-sm-2" style="background-color:lavender;">Zoo Name</div>
    	<div class="col-sm-2" style="background-color:lavender;">Area Name</div>
    	<div class="col-sm-2" style="background-color:lavender;">Pen Name</div>
    </div>
    <div id="mainArea">
    </div>
  </form>
</div>

</body>
</html>