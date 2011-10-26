<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="Accessible bookstore" />
    <meta name="keywords" content="purchase books, electonic accessible bookstore" />          
    <link rel="stylesheet" href="css/style.css" type="text/css" />
	<link rel="stylesheet" href="css/shoppingcart.css" type="text/css" />
    <title>Αccessible-Βookstore: Καλάθη Αγορών</title>

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
        $producer->ProduceHeader("", 1);
    ?>

    <div class="clear"></div>

    <div id="mainContent">  <!-- mainContent -->    
        
		<div id="crumbContainer">   <!-- crumbContainer -->
            <a href="#categoryMenu" class="skipButton">Μετάβαση στο μενού κατηγορίες</a>
            <a name="crumb"></a>
            <ul class="crumb">
                <li class= "crumb"><a href="index.php" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="cart.php" class="crumb">Καλάθη Αγορών</a></li>
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
           

				<div class="post">
					<h1><span class="text"> Καλάθι αγορών</span></h1>
						<div class="postContent">
						
						<p>Eλέγξτε τα προϊόντα σας και τις ποσότητες και προχωρήστε στην ολοκλήρωση της παραγγελίας</p><br></br>
						<div class="shoppingCartButtons">
							<!--  <input class="image" name="buyNowBtn" type="image" src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας" /> -->
							<!--  <input class="image" name="continueShoppingBtn" type="image" src="images/continueBtn.png" alt="Συνέχεια αγορών"/> -->
							<div class="leftdv">
							<a href="#"><img src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας"/></a>
							</div>
							<!--  <div class="clear"></div> --> 
							<div class="rightdv">
							<a href="#"><img src="images/continueBtn.png" alt="Συνέχεια αγορών"/></a>
							</div>
						</div>
                      
                        <div class="clear"></div>
                        <br />
                        
						<div class="box">
							<div> 
								<fieldset>
								<table summary="Ο παρακάτω πίνακας περιγράφει τα προϊόντα που έχετε επιλέξει προς αγορά, και άλλα χαρακτηριστικά τους. 
								Συγκεκριμένα τα χαρακτηριστικά που περιγράφονται είναι: Εξώφυλλο βιβλίου, Τίτλος, Τεμάχια, Τιμή, και επιλογή
								διαγραφής του κάθε προϊόντος.">
								<tr>
                                    <th id="b"> Βιβλίο </th> 
                                    <th id="t"> Τίτλος </th> 
                                    <th id="no">Τεμάχια </th> 
                                    <th id="p"> Τιμή </th> 
                                    <th id="del"> Διαγραφή </th>
								</tr>
								<tr>
								<td headers="b"><a href="SteveJobs.php" title="Η επίσημη βιογραφία του Steve Jobs">
								<img class="book_img" src="./images/books/steve-jobs-book.jpg" 
								alt="Εξώφυλλο:Η επίσημη βιογραφία του Steve Jobs.Η ζωή του όπως αυτός περιγράφει."/>
								</a></td> 
								<td headers="t" align="center"><a href="SteveJobs.php" title="Η επίσημη βιογραφία του Steve Jobs"> 
								 Η επίσημη βιογραφία του Steve Jobs </a></td> 
								<td headers="no" align="center">
                                    <input id="items" type="text" name="textfield" maxlength="3" size="3" value="1"/>
                                    <br />
                                    <a href="" style="font-size: 11px;">ανανέωση</a>
                                </td> 
                                <td headers="p" align="center"> 30.99 € </td> 
								<td headers="del" align="center"> 
								<!--<input class="image" name="Delete" type="image" src="images/Delete-icon.png" alt="Διαγραφή προϊόντος από το καλάθι"/>  -->
								<a href="#" align="center"><img  src="images/Delete-icon.png" alt="Διαγραφή προϊόντος από το καλάθι."/></a>	
								</td>
								</tr>
								</table>
														
								</fieldset>
						 </div>
						 <h2> Σύνολο: 30.99 €</h2>
						 </div>
        <div class="clear"></div>
						<!--   <div id="bottomButtons">
						<input class="image" name="buyNowBtn" type="image" src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας" />
						<input class="image" name="continueShoppingBtn" type="image" src="images/continueBtn.png"  alt="Συνέχεια αγορών"/>
					</div> -->
					<div class="shoppingCartButtons">
							<!--  <input class="image" name="buyNowBtn" type="image" src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας" /> -->
							<!--  <input class="image" name="continueShoppingBtn" type="image" src="images/continueBtn.png" alt="Συνέχεια αγορών"/> -->
							<div class="leftdv">
							<a href="payment.php"><img src="images/buyNowButton.png" alt="Ολοκλήρωση Παραγγελίας"/></a>
							</div>
							<!--  <div class="clear"></div> --> 
							<div class="rightdv">
							<a href="index.php"><img src="images/continueBtn.png" alt="Συνέχεια αγορών"/></a>
							</div>
						</div>
						</div>
					<div class="clear"></div>
					<div class="postFooter"></div>
					
					
				</div>

        <div class="clear"></div>
        </div>  <!-- centerContent ends -->
		</div>	<!-- centerContentCell ends -->
    </div>		<!-- mainContent ends -->


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