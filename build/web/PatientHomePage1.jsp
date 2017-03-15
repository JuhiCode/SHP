<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
		<title>Smart health predictor App </title>
		<meta name="description" content="Wiredeiki App">
		<!-- LAtest compiled and minified CSS-->
		<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

	
	</head>
	
	<body>
	<!--Navbar -->
	<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
	<div class="container">
	<div class="navbar-header">
	<button type="button" class="navbar-toogle" data-toogle="collapse" data-target="#navbar-collapse">
		</button>
	<a href="" class="navbar-brand">Smart Health Predictor</a>
	</div><!--navbar header-->
	
	<div class="collapse navbar-collapse" id="navbar-collapse">
	<ul class="nav navbar-nav">
	 <li><a href="PatientMyProfile.jsp">MY PROFILE</a>
	 <li><a href="SearchDoctor.jsp">SEARCH DOCTOR</a>
	 <li><a href="FeedbackPatient.jsp">FEEDBACK</a>
	 <li><a href="loginPage.jsp">LOGOUT</a>
	 
	</ul>
	</div>
	</div><!--End container-->
	</nav><!--End navbar-->
	<!--jumbotron-->
	<div class="jumbotron">
	<div class="container text-center">
	<h1>Disease Prediction</h1>
	<p>Using Data Mining</p>
		</div>
	</div><!-- End jumbotron-->
	
<!--	</div class="container">
	<section>
	<div class="page-header" id="navbar-collapse#feedback">
	<h2>Feedback </h2>
	</div>
	</section>
	</div><!-- End container--> 
	<!-- call to action-->
	<section>
	<div class="container text-center">
	<form action="" class="form-inline">
	<div class="form-group">
	<label for="symptom">Please enter any one symptom  </label>
	<input type="text" class="form-control" id="symptom" placeholder="Symptom">
	<hr>
	</div>
	
	</form>
	</div><!-- End container-->
	<div class="container text-center" id="#next">
	<form action="NextPageOfPatient.html" class="form" >
	<button type="submit" class="btn btn-info">Next</button>
	
	</form>
	</div>
	
    </section>	
	
	<!--jumbotron-->
	<div class="jumbotron">
	<div class="container text-center">
	<h3>Are you experiencing any of these symptoms too?</h3>
	<h4>Please Select:</h4>
		
	  <div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Select
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">fever</a></li>
      <li><a href="#">chills</a></li>
      <li><a href="#">joint Pains</a></li>
    </ul>
  </div><!-- div end dropdown -->
	
		</div><!--End div container -->
		
		<div class="container text-center">
	<form action="" class="form-inline" >
	<button type="submit" class="btn btn-default">Next</button>
	<button type="submit" class="btn btn-default">I have None Of Above Symptoms</button>
	
	<hr>
	</form>
	</div>
	</div><!-- End jumbotron-->
	
	
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</body>
</html>