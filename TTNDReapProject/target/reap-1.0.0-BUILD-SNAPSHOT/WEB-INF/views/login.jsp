<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <title>Bootstrap Case</title>
 
    <meta charset="utf-8">
    <title>Home </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
<!--Less styles -->
   <!-- Other Less css file //different less files has different color scheam
	<link rel="stylesheet/less" type="text/css" href="themes/less/simplex.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/classified.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/amelia.less">  MOVE DOWN TO activate
	-->
	<!--<link rel="stylesheet/less" type="text/css" href="themes/less/bootshop.less">
	<script src="themes/js/less.js" type="text/javascript"></script> -->
	
<!-- Bootstrap style --> 
    <link id="callCss" rel="stylesheet" href="themes/bootshop/bootstrap.min.css" media="screen"/>
    <link href="themes/css/base.css" rel="stylesheet" media="screen"/>
<!-- Bootstrap style responsive -->	
	<link href="themes/css/bootstrap-responsive.min.css" rel="stylesheet"/>
	<link href="themes/css/font-awesome.css" rel="stylesheet" type="text/css">
<!-- Google-code-prettify -->	
	<link href="themes/js/google-code-prettify/prettify.css" rel="stylesheet"/>
<!-- fav and touch icons -->
    <link rel="shortcut icon" href="themes/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="themes/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="themes/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="themes/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="themes/images/ico/apple-touch-icon-57-precomposed.png">
	<style type="text/css" id="enject"></style>
  
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="style.css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	
	
	
	
	
	<style type="text/css" id="enject"></style>
  
	<style type="text/css">
.style1 {
	float: left;
	margin-top: 11px;
	margin-bottom:12px;
	
}
.style2 {
	margin-left: 0px;
}
</style>

<script type="text/javascript">
 function validate()
{
if(signup.password.value.length<6)
{
 alert("Password length should be altleast 6");
 signup.password.focus();
 return false
}
if( !(signup.password.value==signup.repassword.value) )
{
 alert("Password Fields Differ");
 signup.password.focus();
 return false
}

return true;
}
</script>



</head>

<body style="background-color:#CCCCFF;background-image:url('img/background.jpg')">
 <nav class="navbar navbar-default" style="position:fixed;width:100%" >
  <div class="container-fluid" >
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="style1" >
          <img style="max-width:150px;margin-left:80px; margin-top: -7px;"
             src="WEB-INF/img/logo.png" class="style2"> &nbsp;
			 <img style="max-width:500px; margin-top: -7px;"
             src="WEB-INFimg/reapo.png" width="604">
             
             

             
             
             
	
    </div>
    <div class="navbar-collapse collapse" id="navbar-main">
            
    
                <form class="navbar-form navbar-right" role="search"  method="post" name="login" action="userLogin">
                    <div class="form-group">
                        <input type="email" class="form-control" name="userName" placeholder="Username" style="height:30px" required autofocus>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" placeholder="Password" style="height:30px" required>
                    </div>
                    <button type="submit" class="btn btn-default" style="background-color:#337ab7;color:white;">Sign In</button>
						<div style="color:red">${error}</div>

                </form>
                
                
                
                
                
    </div>
    
    </div>
    </nav>
  
  <<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm" style="left: 30%; top: 150px; height: 450px;width:45.5%" >
            <legend><a href="http://www.jquery2dotnet.com"><i class="glyphicon glyphicon-globe"></i></a> Sign up!</legend>
            <form action="#" method="post" name="signup" class="form" role="form" onsubmit="return validate()" style="width: 511px; height: 288px">
            <div class="row">
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" name="firstname" placeholder="First Name" type="text" required autofocus />
                </div>
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" name="lastname" placeholder="Last Name" type="text" required />
                </div>
            </div>
            <input class="form-control" name="youremail" placeholder="Your Email" type="email" required  />
            <input class="form-control" name="password" placeholder="New Password" type="password" required />
            <input class="form-control" name="repassword" placeholder="Re-Enter Password" type="password" required />
            
            <select class="form-control" required name="service">
            
       <option value="volvo" selected="selected" disabled="disabled">--Service--</option>
       <option value="saab">Technology</option>
      <option value="mercedes">TTND</option>
  </select>

   <select class="form-control" name="practice" required>
      <option value="volvo" selected="selected" disabled="disabled">--Practice--</option>
  </select>
   <select class="form-control" name="role" required>
      <option value="volvo" selected="selected" disabled="disabled">--Role--</option>
  </select>
            <label for="">
                Birth Date</label>
            <div class="row">
                <div class="col-xs-4 col-md-4">
                 <input type="date" name="bday" class="form-control"  required style="width: 258%; height: 30px" required>
  
                </div>
                
                </div>
            <label class="radio-inline">
                <input type="radio" name="sex" id="inlineCheckbox1" value="male" required checked="checked"/>
                Male
            </label>
            <label class="radio-inline">
                <input type="radio" name="sex" id="inlineCheckbox2" value="female" />
                Female
            </label>
            <br />
            <br />
            <button class="btn btn-lg btn-primary btn-block" type="submit">
                Sign up</button>
            </form>
        </div>
    </div>
</div>
  
  
</body>


</html>