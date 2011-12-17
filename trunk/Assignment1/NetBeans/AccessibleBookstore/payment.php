<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="Accessible bookstore" />
    <meta name="keywords" content="purchase books, electonic accessible bookstore" />          
    <link rel="stylesheet" href="css/style.css" type="text/css" />
	<link rel="stylesheet" href="css/forms.css" type="text/css" />			
	<link rel="stylesheet" href="css/shoppingcart.css" type="text/css" />
    <title>Αccessible-Βookstore: Λάθη Στην Διαδικασία Πληρωμής</title>

    <script type="text/JavaScript">
    <!--
	    function doClear(theText, defaultValue) {
		    if (theText.value == defaultValue)
			    theText.value = "";
	    }
    //-->
    </script>
</head>

<body>
<div id="main_container">   <!-- main_container -->
    <a name="top"></a>
  

    <?php 
        require_once 'HeadProducer.php';  
        $producer = new HeadProducer();
        $producer->ProduceHeader("", 2);
    ?>

    <div class="clear"></div>

    <div id="mainContent">  <!-- mainContent -->    
        
		<div id="crumbContainer">   <!-- crumbContainer -->
            <a href="#categoryMenu" class="skipButton">Μετάβαση στο μενού κατηγορίες</a>
            <a name="crumb"></a>
            <ul class="crumb">
                <li class= "crumb"><a href="index.php" class="crumb">Αρχική σελίδα</a></li>
				<li class= "crumb">></li>
                <li class= "crumb"><a href="Literature.php" class="crumb">Λογοτεχνία</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="ForeignLiterature.php" class="crumb">Ξένη Λογοτεχνία (Σελίδα 1)</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="BookView.php" class="crumb"><span lang="EN-US">Aleph</span></a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="cart2.php" class="crumb">Καλάθι Αγορών</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="payment.php" class="crumb">Διαδικασία Πληρωμής</a></li>
            </ul>         
        </div>  <!-- crumbContainer -->

        <div class="clear"></div>

		<?php
			require_once 'CategoryMenuProducer.php';
			$producer = new CategoryMenuProducer();
			$producer->ProduceCategoryMenu("index.php");
		?>
        

		<div class="centerContentCell">		<!-- centerContent -->
        <div class="centerContent">			<!-- centerContent -->
        <a name="content"></a>
            
		<div id="wrapper">	
		<div id="leftdv">
        <div class="post">
            <h1><span class="text">Διαδικασία Πληρωμής</span></h1>
                <div class="postContent">
					<div class="box">
						<div class="boxContents">
							<form action="payment2.php#errors" method="post"> <!-- address form -->
								<fieldset>
									<legend>Στοιχεία Αποστολής</legend>
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="name">Όνομα<span class="required"> (Υποχρεωτικό) </span></label></p> <br/></div>
                                        <div class="rightFormLayer"><p><input id="name" type="text" name="textfield" accesskey="1"/></p></div>
                                    </div>
                                    <div class="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="surname">Επίθετο<span class="required"> (Υποχρεωτικό) </span></label></p> </div>
                                        <div class="rightFormLayer"><p><input id="surname" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="street">Οδός/Αριθμός<span class="required"> (Υποχρεωτικό) </span></label></p> <br/></div>
                                        <div class="rightFormLayer"><p><input id="street" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="city">Πόλη<span class="required"> (Υποχρεωτικό) </span></label></p>  <br/></div>
                                        <div class="rightFormLayer"><p><input id="city" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="area">Περιοχή<span class="required"> (Υποχρεωτικό) </span></label></p> <br/></div>
                                        <div class="rightFormLayer"><p><input id="area" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="postal_code">Ταχυδρομικός κώδικας</label></p> <br/><br/></div>
                                        <div class="rightFormLayer"><p><input id="postal_code" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="country">Χώρα<span class="required"> (Υποχρεωτικό) </span></label></p> <br/></div>
                                        <div class="rightFormLayer">
                                            <p><select name="country" id="country">
                                            <option>Χώρα</option>
                                            <option>Γαλλία</option>
                                            <option>Γερμανία</option>
                                            <option>Ελλάδα</option>
                                            <option>Ηνωμένο Βασίλειο</option>
                                            <option>Μάλτα</option>
                                            <option>Ιρλανδία</option>
                                            <option>Ισλανδία</option>
                                            <option>Ιταλία</option>
                                            <option>Πολωνία</option>
                                            <option>Ρωσία</option>
                                            <option>Τσεχία</option>
                                            <option>Φιλανδία</option>
                                            </select></p>
                                        </div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="phone">Τηλέφωνο</label></p><br/></div>
                                        <div class="rightFormLayer"><p><input id="phone" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"></div>
                                        <div class="rightFormLayer"></div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="email">Διεύθυνση e-mail<span class="required"> (Υποχρεωτικό) </span></label> <em>Θα λάβετε e-mail επιβεβαίωσης της κράτησής σας</em></p></div>
                                        <div class="rightFormLayer"><p><input id="email" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class ="clear"></div>
                                    
                                    <br />
                                    <div class="formLayer">
                                        <div class="leftFormLayer"><p><label for="emailconfirm">Επιβεβαίωση διεύθυνσης e-mail<span class="required"> (Υποχρεωτικό) </span></label></p></div>
                                        <div class="rightFormLayer"><p><input id="emailconfirm" type="text" name="textfield" /></p></div>
                                    </div>
                                    <div class ="clear"></div>
                                                                 
								</fieldset>
								<div class="clear"></div>
								<p><br /></p>
								
								<fieldset>
									<legend>Στοιχεία Πληρωμής</legend>
										<p><em>Τα στοιχεία της πιστωτικής σας κάρτας δεν αποθηκεύονται στη βάση δεδομένων μας.
												<br />Κατά τη συναλλαγή τηρούμε όλα τα πρωτόκολλα ασφαλείας.</em></p>
										<p>
										<img src="./images/card-1.gif" alt=""/>
										<img src="./images/card-2.gif" alt=""/>
										<img src="./images/card-4.gif" alt=""/>
										<img src="./images/card-5.gif" alt=""/>			
										</p>

										<div class="formLayer">
											<div class="leftFormLayer"><p><label for="credit_card_type">Είδος πιστωτικής κάρτας<span class="required"> (Υποχρεωτικό) </span></label></p></div>
											<div class="rightFormLayer">
												<p>
													<select name="credit_card_type" id="credit_card_type">
														<option>VISA</option>
														<option>VISA Prepaid</option>
														<option>VISA Electron</option>
														<option>MasterCard</option>
														<option>American Express</option>
													</select>
												</p>
											</div>
										</div>
										<div class ="clear"></div>

										 <div class="formLayer">
											<div class="leftFormLayer"><p><label for="cardholder_name">Όνομα κατόχου<span class="required"> (Υποχρεωτικό) </span></label></p></div>
											<div class="rightFormLayer"><p><input id="cardholder_name" type="text" name="textfield" accesskey="2"/></p></div>
										</div>
										<div class ="clear"></div>                                   

										<div class="formLayer">
											<div class="leftFormLayer"><p><label for="card_number">Αριθμός κάρτας<span class="required"> (Υποχρεωτικό) </span></label></p></div>
											<div class="rightFormLayer"><p><input id="card_number" type="text" name="textfield" /></p></div>
										</div>
										<div class ="clear"></div>

										<div class="formLayer">
											<div class="leftFormLayer"><p><label for="expiry_date">Ημερομηνία λήξης<span class="required"> (Υποχρεωτικό) </span></label></p></div>
											<div class="rightFormLayer">            
												<p><select id="expiry_date">
													<optgroup label="Month">
															<option>Μήνας</option>
															<option>01</option>
															<option>02</option>
															<option>03</option>
															<option>04</option>
															<option>05</option>
															<option>06</option>
															<option>07</option>
															<option>08</option>
															<option>09</option>
															<option>10</option>
															<option>11</option>
															<option>12</option>
													</optgroup>
													<optgroup label="Year">
															<option>Χρόνος</option>
															<option>2011</option>
															<option>2012</option>
															<option>2013</option>
															<option>2014</option>
															<option>2015</option>
															<option>2016</option>
															<option>2017</option>
															<option>2018</option>
															<option>2019</option>
															<option>2020</option>
															<option>2021</option>
															<option>2022</option>
													</optgroup>	
													</select>
												</p></div>
										</div>  
										<div class ="clear"></div>

										<div class="formLayer">
											<div class="leftFormLayer"><p><label for="ccv2">CCV2 (κωδικός ασφαλείας)<span class="required"> (Υποχρεωτικό) </span></label></p></div>
											<div class="rightFormLayer"><p><input id="ccv2" type="text" name="textfield" maxlength="3" size="3"/><a href="#" title="ccv πληροφορίες"> [help]</a></p></div>
										</div>
										<div class ="clear"></div>  
								</fieldset>
								<div class ="clear"></div>  
								
								<p> 
									<br />
									<input type="checkbox" name="termsAndConditions" value="TermsAndConditions" style="float: left;"/>
									Αποδέχομαι τους όρους του <a href="#">accessible-bookstore.gr</a>
								</p>
								<div class ="clear"></div> 
				
								<p class="submit"><input type="submit" value="Αγορά βιβλίου" /></p>
							</form>	<!-- address form end-->
                        </div> <!-- close boxContents -->
                    </div> <!-- close box -->
				</div> <!-- close postContent -->
			<div class="clear"></div>	
			<div class="postFooter"></div>
        </div> <!-- post ends -->
		</div> <!-- leftdv ends-->
		<!--<div class="clear"></div>-->
				<div id="rightdv">
				<div class="post">
            <h1><span class="text">Στοιχεία Παραγγελίας</span></h1>
                <div class="postContent">
			<div class="box">
							<div> 
							
								<table summary="Ο παρακάτω πίνακας περιγράφει τα προϊόντα που έχετε επιλέξει προς αγορά, και άλλα χαρακτηριστικά τους. 
								Συγκεκριμένα τα χαρακτηριστικά που περιγράφονται είναι: Τίτλος, Τεμάχια, και Τιμή του κάθε προϊόντος.">
								<tr>
								<th id="t"> Τίτλος </th> <th id="no">Τεμάχια </th> <th id="p"> Τιμή </th>
								</tr>
								<tr>
								<td headers="t"><a href="SteveJobs.php" title="Η επίσημη βιογραφία του Steve Jobs"> Η επίσημη βιογραφία του Steve Jobs </a></td> 
								<td headers="no">1</td> 
								<td headers="p"> 30.99 € </td> 
								</tr>
								<tr>
								<td headers="t"><a href="Aleph.php" title="Aleph"> Aleph</a></td> 
								<td headers="no">2</td> 
								<td headers="p"> 20.64 € </td> 
								</tr>
								</table>				

						 </div>
						 <h2> Σύνολο: 51.63 €</h2>
			</div> <!-- box ends-->
			</div> <!-- postContent ends-->
            <div class="clear"></div>
            <div class="postFooter"></div>			
			</div> <!-- post ends -->
			</div> <!--rightdv ends-->

        </div> <!-- wrapper ends-->

     		
			<div class="clear"></div>
        </div>  <!-- centerContent ends -->
		</div>	<!-- centerContentCell ends -->
    </div>  <!-- mainContent ends -->


    <div class="clear"></div>
    <?php 
		require_once 'FooterProducer.php';
		$producer = new FooterProducer();
		$producer->ProduceFooter();
	?>
    <div class="clear"></div>
    
</div>  <!-- main_container ends -->
</body>

</html>
