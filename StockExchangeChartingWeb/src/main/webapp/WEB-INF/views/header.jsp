<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <a href="home">Home</a>|
<a href="company">Company</a>|
<a href="ipo">IPO</a>|
<a href="ipo">IPO</a>| -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" (click)="toggleNavbar()">
            <span class="navbar-toggler-icon"></span>
          </button>
        <div class="collapse navbar-collapse">
        
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a href="home" class="nav-link">Home</a>
            </li>
            <li class="nav-item">
                <a href="user-home" class="nav-link">Manage User</a>
            </li>
            <li class="nav-item">
              <a href="company-home" class="nav-link">Manage Company</a>
          </li>
            <li class="nav-item">
                <a href="ipo-home" class="nav-link text-white">Manage IPO</a>
            </li>
            <li class="nav-item">
              <a href="stocks-home" class="nav-link text-white mx-3">Manage StockExchanges</a>
          </li>
            
        </ul>
    </div>
</nav>
