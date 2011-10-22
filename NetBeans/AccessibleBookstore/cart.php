﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
	<link rel="stylesheet" href="css/shoppingcart.css" type="text/css" />
    <title>Αccessible-Βookstore: Αρχική Σελίδα</title>

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
           

				<div class="post">
					<h1><span class="text"> Καλάθι αγορών</span></h1>
						<div class="postContent">
						
						<p>Eλέγξτε τα προϊόντα σας και τις ποσότητες και προχωρήστε στην ολοκλήρωση της παραγγελίας</p>
						<div id="topButtons">
							<input class="image" name="buyNowBtn" type="image" src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας" />
							<input class="image" name="continueShoppingBtn" type="image" src="images/continueBtn.png" alt="Συνέχεια αγορών"/>
						</div>
							<div class="box">
							<div> 
								<fieldset>
								<table>
								<tr>
								<th> Βιβλίο </th> <th> Τίτλος </th> <th>Τεμάχια </th> <th> Τιμή </th> <th> Διαγραφή </th>
								</tr>
								<tr>
								<td><img src="./images/books/steve-jobs-book.jpg" alt="Steve Jobs: Τα μυστικά"/></td> 
								<td> Steve Jobs: Τα μυστικά </td> 
								<td><input id="items" type="text" name="textfield" maxlength="3" size="3" value="1"/></td> 
								<td> 30.99 € </td> 
								<td> <input class="image" name="Delete" type="image" src="images/Delete-icon.png" alt="Διαγραφή προϊόντος από το καλάθι"/> </td>
								</tr>
								</table>
														
								</fieldset>
						 </div>
						 <h2> Σύνολο: 30.99 €</h2>
						 </div>

						 <div id="bottomButtons">
						<input class="image" name="buyNowBtn" type="image" src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας" />
						<input class="image" name="continueShoppingBtn" type="image" src="images/continueBtn.png"  alt="Συνέχεια αγορών"/>
					</div>
						</div>
					<div class="clear"></div>
					<div class="postFooter"></div>
					
					
				</div>

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