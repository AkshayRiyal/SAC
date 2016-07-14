<!DOCTYPE html>
<html lang="en">
<head>
  <title>REAP-Dashboard</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="style.css" />
 <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<style type="text/css">
#style1 {
	 float: left;
	 margin-top: 11px;
	 margin-bottom:12px;	
         float:right;
        }
#style2 {
	margin-left: 0px;
        padding-left :0px;
        }
.pad    {
        padding:10px;
        }
#list li{
         float:right;
		 margin:4px;
         }

#list1 li
       {
	    float:right;
        }		 
		 
</style>
</head>
<body>
   <div class="navbar navbar-default navbar-static-top" role="navigation" style="position:fixed; width:100%; margin-left:0;">
      <div class="container-fluid" >
              <!-- Brand and toggle get grouped for better mobile display -->
        <div class="row">
                  <img style="max-width:150px;  margin-left:0; margin-top:10px;" src="img/logo.png">
                  <img style="max-width:500px; margin-top: 10px;" src="img/reapo.png" width="604">
		       <ul id="list" style="list-style:none; margin-right:40px; margin-top:-40px">
	            <li><span class="dropdown" >
                          <img src="img/sumit.png" class="img-thumbnail  btn  dropdown-toggle" data-toggle="dropdown" width="45" height="45">          
                           <div class="dropdown-menu dropdown-menu-right" style="height:259px; width:600px; margin-top:21px">
                              <div  style="float:left; margin-left:45px;"><h3 >Your Profile</h3></div>
							  <div class="row col-md-12" style="height:200px margin-right:0px;">
							     <div class="col-md-4" style="margin-left:20px;"><img src="img/sumit.png" style="height:75%" width="75%"></div>
								 <div class="col-md-8" style="float:right; margin-top:-140px">
							        <div class="col-md-12 container-fluid">
									     <table class="table table-hover">
                                             <thead>
                                            </thead>
                                              <tbody>
                                                  <tr>
                                                     <td>Name :</td>
                                                     <td>Sumit Sharma</td>
                                                  </tr>
                                                  <tr>
                                                     <td>Service Line</td>
                                                     <td>intern</td>
                                                  </tr>
                                                  <tr>
                                                     <td>Practice</td>
                                                     <td>intern</td>
                                                  </tr>
												  <tr>
                                                     <td>Email-ID</td>
                                                     <td>sumit.sharma@tothenew.com</td>
                                                  </tr>

                                              </tbody>
                                         </table>
									</div>
								 </div> 
								 
							  <div class="col-md-8" ></div>
							  <div class="col-md-4" >
							  <p style="font-weight:bold;" style="align-left;"> <a href="#" class="btn btn-small btn-default" style="background-image:url('img/background.png');color:white;align:right;">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LOG-OUT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></p>
		             </div>
							  </div>
							  
							</div>  
                        </span>
				</li>
				<li><button type="button" class="btn btn-Default" style="width: 37px; height:37px;"><img src="img/ico-bell.png"></button></li>
				<li><a href="#"><button type="button" class="btn btn-secondary" style="width: 80px"><img src="img/ico-idea.png">Idea</button></a></li>
				<li><a href="#"><button type="button" class="btn btn-secondary"><img src="img/ico-dashboard.png">Certificate</button></a></li>
				<li><a href="badge.html"><button type="button" class="btn btn-secondary" style="margin-left:6;"><img src="img/ico-badge.png">Badges</button></a></li>
				<li><a href="dashboard.html"><button type="button" class="btn btn-secondary"><img src="img/ico-dashboard.png">Dashboard</button></a></li>
        </div>
      </div>
    </div>
    <br/><br/><br/>
 
     <div class="container-fluid">
        
           <br/>&nbsp;&nbsp; <br/>
      
          <div class="col-md-9">
           <div class="panel panel-primary" >
               <div class="panel-heading">
                  <img src="img/badge.png"> Recognize Karma
			    </div>
                <div class="panel-body">
	               <input type="text" value="Select a newer" > 
	               <span class="dropdown">&nbsp;&nbsp;&nbsp;&nbsp;
	                     <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Select a Badge
                            <span class="caret"></span></button>
                                 <ul class="dropdown-menu">
                                    <li><img src="img/gbadge.png"> Gold(0)</li>
                                    <li><img src="img/sbadge.png"> Silver(0)</li>
                                    <li><img src="img/bbadge.png"> Bronze(0)</li>
                                </ul>
	                        </span>
	                     <span class="dropdown">&nbsp;&nbsp;&nbsp;&nbsp;
	                         <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Select a Karma
                             <span class="caret"></span></button>
                                   <ul class="dropdown-menu">
                                       <li>Extra Miler</li>
                                       <li>Knowledge Sharing</li>
                                       <li>Mentorship</li>
		                       <li>Pat on the back</li>
		                       <li>Customer Delight</li>
                                   </ul>
	                         </span> <br/><br/>
	                         <div class="form-group">
                                 <label for="comment">Reason:</label>
                                 <textarea class="form-control" rows="5" id="comment" placeholder="Please select a karma" style="resize:none;"></textarea>
                             </div>
		            		 <button type="button" class="btn btn-primary" style="float:right;">Recognize</button>            
                             </div>
							 
						</span>  
						
        	</div>
			
    <div class="panel panel-primary">
         <div class="panel-heading">
                 <div style="margin-bottom:10px; margin-right:-180px">
                   <img src="img/wicon.png"> Wall of fame
                         <ul style="float:right; list-style:none;" id="list">
                       <li>
                             <span class="dropdown">
                             <img src="img/images.jpg" style="width:13%; height:13%;" class="dropdown-toggle" type="button" data-toggle="dropdown">
                             <span class="caret"></span></img>
                                   <ul class="dropdown-menu">
                                        <li>Service Lines</li>
                                        <li>Analytics</li>
                                        <li>Analytics-SEA</li>
					<li>Digital Marketing</li>
					<li>Digital Marketing India</li>

                                   </ul>
                             </span>
                            </li>
                       <li>
                     <span class="dropdown">
	                         <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Practices
                                     <span class="caret"></span>
                                 </button>
                                  <ul class="dropdown-menu">
                                        <li>Service Lines</li>
                                        <li>Analytics</li>
                                        <li>Analytics-SEA</li>
					<li>Digital Marketing</li>
					<li>Digital Marketing India</li>
                                   </ul>
			</span>&nbsp;&nbsp;&nbsp;
                    </li>
                     <li>
                        <span class="dropdown" >
	                     <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Service Lines
                                <span class="caret"></span></button>
                                   <ul class="dropdown-menu">
                                        <li>Service Lines</li>
                                        <li>Analytics</li>
                                        <li>Analytics-SEA</li>
					<li>Digital Marketing</li>
					<li>Digital Marketing India</li>                                     

                                   </ul>
	                 </span>   &nbsp;&nbsp;&nbsp;   
	             </li>
                      <li>
                       <input type="text" class="form-control" id="inputSuccess2" value="Search" style="width:80%">
                     </li>                    
                    </ul>
              </div>   
         </div>



                <div class="panel-body">

                  <div style="height:200px"></div>
	              				
         	</div>
               
       </div>
   </div>
             <div class="col-md-3">
	          <div class="panel panel-primary">
              <div class="panel-heading"><img src="img/badge.png"> MY BADGES</div>
       <div class="panel-body">
	              <div class="col-md-5 pad">
				       <img src="img/sumit.png" class="img-thumbnail align-center" width="150" height="400" >
				  </div>
				  <div class="col-md-7">
				       <strong>Sumit Sharma</strong>
					    <table class="table">
							 <tr>
							         <td><img src="img/gbadge.png"></td>
								 <td><img src="img/sbadge.png"></td>
								 <td><img src="img/bbadge.png"></td>
							 </tr>
							   <tr>
							         <td>0</td>
								 <td>0</td>
								 <td>0</td>
							 </tr>
						</table>	 
				  </div>
	   </div>
     </div>
     
	   <ul class="nav nav-tabs">
    <li class="active" style="width:50%;"><a data-toggle="tab" href="#home">NEWER BOARD</a></li>
    <li style="width:50%;""><a data-toggle="tab" href="#menu1">IDEAS</a></li>    
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active"><br/>
         <div class="col-md-5 pad">
				       <img src="img/akshay.jpg" class="img-thumbnail align-center" width="100px" height="100px" >
				  </div>
				  <div class="col-md-7">
				       <strong>Akshay Riyal</strong>
					    <table class="table">
							 <tr>
							     <td><img src="img/gbadge.png"></td>
								 <td><img src="img/sbadge.png"></td>
								 <td><img src="img/bbadge.png"></td>
							 </tr>
							 <tr>
							     <td>0</td>
								 <td>0</td>
								 <td>0</td>
							 </tr>
						</table>	 
				  </div>
    
	
	
	
         <div class="col-md-5 pad">
				       <img src="img/cpic.jpg" width="100px" height="88" >
				  </div>
				  <div class="col-md-7">
				       <strong>Chandan</strong>
					    <table class="table">
							 <tr>
							     <td><img src="img/gbadge.png"></td>
								 <td><img src="img/sbadge.png"></td>
								 <td><img src="img/bbadge.png"></td>
							 </tr>
							 <tr>
							     <td>0</td>
								 <td>0</td>
								 <td>0</td>
							 </tr>
						</table>	 
				  </div>
    
	
	
	
	<br>
	<br/>
         <div class="col-md-5 pad">
				       <img src="img/sumit.png" class="img-thumbnail align-center" width="85" height="100px" >
				  </div>
				  <div class="col-md-7">
				       <strong>Sumit Sharma</strong>
					    <table class="table">
							 <tr>
							     <td><img src="img/gbadge.png"></td>
								 <td><img src="img/sbadge.png"></td>
								 <td><img src="img/bbadge.png"></td>
							 </tr>
							 <tr>
							     <td>0</td>
								 <td>0</td>
								 <td>0</td>
							 </tr>
						</table>	 
				  </div>
   
	</div>
	 
    <div id="menu1" class="tab-pane fade">
      <h3></h3>
      
    </div>
  </div>
	 </div>
            </div>
     




    
          
</body>
</html>

