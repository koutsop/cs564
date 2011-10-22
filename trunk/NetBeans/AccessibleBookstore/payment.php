<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
	 <link rel="stylesheet" href="css/forms.css" type="text/css" />
	  <link rel="stylesheet" href="css/shoppingcart.css" type="text/css" />
    <title>Αccessible-Βookstore: Διαδικασία Πληρωμής</title>

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
        $producer->ProduceHeader("index.php");
    ?>

    <div class="clear"></div>

    <div id="mainContent">  <!-- mainContent -->    
        
		<div id="crumbContainer">   <!-- crumbContainer -->
            <a href="#" class="skipButton">Μετάβαση στο μενού κατηγορίες</a>
            <a name="crumb"></a>
            <ul class="crumb">
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
            </ul>         
        </div>  <!-- crumbContainer -->

        <div class="clear"></div>

		<?php
			require_once 'CategoryMenuProducer.php';
			$producer = new CategoryMenuProducer();
			$producer->ProduceCategoryMenu("index.php");
		?>
        

        <div class="centerContent">   <!-- centerContent -->
            <a name="content"></a>
            
		<div id="wrapper">	
		<div id="leftdv">
        <div class="post">
            <h1><span class="text">Διαδικασία Πληρωμής</span></h1>
                <div class="postContent">
				<form action="#"> <!-- address form -->
				

                    <div class="box">
                        <div class="boxContents">
						<fieldset>
							<legend>Στοιχεία Αποστολής</legend>
								<p><em>Η συμπλήρωση των πεδίων με * είναι υποχρεωτική.</em></p>
								<p><label for="name">Όνομα:</label></p>
								<p><input id="name" type="text" name="textfield" /></p>
								<p><label for="surname">Επίθετο:</label></p>
								<p><input id="surname" type="text" name="textfield" /></p>
								<p><label for="street">Οδός/Αριθμός:</label></p>
								<p><input id="street" type="text" name="textfield" /></p>
								<p><label for="city">Πόλη:</label></p>
								<p><input id="city" type="text" name="textfield" /></p>
								<p><label for="area">Περιοχή:</label></p>
								<p><input id="area" type="text" name="textfield" /></p>
								<p><label for="postal_code">Ταχυδρομικός κώδικας:</label></p>
								<p><input id="postal_code" type="text" name="textfield" /></p>
								<p><label for="country">Χώρα:</label></p>
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
								<p><label for="phone">Τηλέφωνο:</label></p>
								<p>&nbsp;<input id="phone" type="text" name="textfield" /></p>
								<p><label for="email">Διεύθυνση e-mail:</label> <em>Θα λάβετε e-mail επιβεβαίωσης της κράτησής σας</em></p>
								<p><input id="email" type="text" name="textfield" /></p>
								<p><label for="emailconfirm">Επιβεβαίωση διεύθυνσης e-mail:</label></p>
								<p><input id="emailconfirm" type="text" name="textfield" /></p>
							</fieldset>
                        </div> <!-- close boxContents -->
                    </div> <!-- close box -->
					
					
					<div class="clear"></div>
                    <div class="box">
                        <div class="boxContents">
						<fieldset>
							<legend>Στοιχεία Πληρωμής</legend>
							<p><em>Τα στοιχεία της πιστωτικής σας κάρτας δεν αποθηκεύονται στη βάση δεδομένων μας. Κατά τη συναλλαγή τηρούμε όλα τα πρωτόκολλα ασφαλείας.</em></p>
							<p>
							<img src="./images/card-1.gif" alt=""/>
							<img src="./images/card-2.gif" alt=""/>
							<img src="./images/card-4.gif" alt=""/>
							<img src="./images/card-5.gif" alt=""/>			
							</p>
							<p><label for="credit_card_type">Είδος πιστωτικής κάρτας:</label></p>
							<p><select name="credit_card_type" id="credit_card_type">
							<option>VISA</option>
							<option>VISA Prepaid</option>
							<option>VISA Electron</option>
							<option>MasterCard</option>
							<option>American Express +3.00%</option>
							</select></p>
							<p><label for="cardholder_name">Όνομα κατόχου</label></p>
							<p><input id="cardholder_name" type="text" name="textfield" /></p>
							<p><label for="card_number">Αριθμός κάρτας:</label></p>
							<p><input id="card_number" type="text" name="textfield" /></p>
							<p><label for="expiry_date">Ημερομηνία λήξης:</label></p>
							<p><select name="expiry_date" id="expiry_date_month">
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
								</select>
								<select name="expiry_date" id="expiry_date_year">
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
								</select>
								</p>
							<p><label for="ccv2">CCV2: (κωδικός ασφαλείας)</label></p>
							<!-- TODO: na valo elegxo - na valo link sto erotimatiko -->
							<p><input id="ccv2" type="text" name="textfield" maxlength="3" size="3"/><a href="#" title="ccv πληροφορίες"> ?</a></p>
							</fieldset>
                        </div>
					</div>
						<p>
						<br />
						<input type="checkbox" name="termsAndConditions" value="TermsAndConditions" />
						Αποδέχομαι τους όρους του <a href="#">accessible-bookstore.gr</a></p>
				
				<p class="submit"><input type="submit" value="Αγορά βιβλίου" /></p>
				</form>	<!-- address form end-->
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
								<fieldset>
								<table>
								<tr>
								<th> Τίτλος </th> <th>Τεμάχια </th> <th> Τιμή </th>
								</tr>
								<tr>
								<td><a href="#" title="Steve Jobs: Τα μυστικά"> Steve Jobs: Τα μυστικά </a></td> 
								<td>1</td> 
								<td> 30.99 € </td> 
								</tr>
								<tr>
								<td><a href="#" title="Aleph"> Aleph</a></td> 
								<td>2</td> 
								<td> 20.64 € </td> 
								</tr>
								</table>				
								</fieldset>
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
