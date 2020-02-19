<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<title>Stock Exchange</title>
<style>
	.carousel-inner img {
      width: 100%;
      height: 100%;
  }
</style>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-dark">
<a href="#" class="navbar-brand"><img src="resources/images/logo.png" alt="logo" height="50px" width="80px"></a>
<button type="button" class="navbar-toggler bg-light" data-toggle="collapse" data-target="#nav">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse justify-content-between" id="nav">
<ul class="navbar-nav">
<li class="nav-item" >
<a href="supplier" class="nav-link text-white">Home</a>
</li>
<li class="nav-item" >
<a href="userhome" class="nav-link text-white">User</a>
</li>
<li class="nav-item" >
<a href="supplierhome" class="nav-link text-white">Supplier</a>
</li>
<li class="nav-item" >
<a href="product-home" class="nav-link text-white">Product</a>
</li>
<li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle text-white" href="#" id="navbardrop" data-toggle="dropdown">
        Shop by Category 
        
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="category-home?category='electronics'">Electronics</a>
        <a class="dropdown-item" href="category-home?category='mobile'">Mobiles</a>
        <a class="dropdown-item" href="category-home?category='kitchen'">Kitchen</a>
        <a class="dropdown-item" href="category-home?category='clothing'">Clothing</a>
        <a class="dropdown-item" href="category-home?category='accesories'">Accesories</a>
      </div>
    </li>
</ul>
<ul class="navbar-nav">
 <li class="nav-item">
              <a class="nav-link btn btn-success text-white mx-3" href="#"> Login</a>
          </li>
</ul>
</div>
</nav>
