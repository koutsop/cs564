<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
	<link rel="stylesheet" href="css/forms.css" type="text/css" />
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
        $producer->ProduceHeader("");
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

		<div class="centerContentCell">		<!-- centerContent -->
        <div class="centerContent">			<!-- centerContent -->
        <a name="content"></a>
        
        <div class="post">
            <h1><span class="text"> Σύνθετη Αναζήτηση</span></h1>
                <div class="postContent">
           <div class="box">
                        <div class="boxContents">
						<p><em> Επιλέξτε κριτήρια αναζήτησης:</em></p>
						<p>
                        <form action="SearchResults.php"> <!-- advanced search form -->
								<p><label for="title">Τίτλος:</label></p>
								<p><input id="title" type="text" name="textfield" /></p>
								<p><label for="author">Συγγραφέας:</label></p>
								<p><input id="author" type="text" name="textfield" /></p>
								<p><label for="publisher">Εκδότης:</label></p>
								<p><input id="publisher" type="text" name="textfield" /></p>
								<p><label for="isbn">ISBN:</label></p>
								<p><input id="isbn" type="text" name="textfield" /></p>
								<p><label for="publication_year">Έτος έκδοσης:</label></p>
								<p><select name="publication_year" id="publication_year">
								<option>Χρόνος</option>
								<option>2011</option>
								<option>2010</option>
								<option>2009</option>
								<option>2008</option>
								<option>2007</option>
								<option>2006</option>
								<option>2005</option>
								<option>2004</option>
								<option>2003</option>
								<option>2002</option>
								<option>2001</option>
								<option>2000</option>
								</select></p>
								<p><label for="text">Κείμενο:</label></p>
								<p><input id="text" type="text" name="textfield" /></p>
								<p><label for="category">Κατηγορία:</label></p>
								<p><select name="category" id="category">
								<option value="0">Όλα τα Προϊόντα</option>
								<option value="1" >Βιβλία στα Ελληνικά</option>
								<option value="2" >Ξενόγλωσσα Βιβλία	</option>
								<option value="3" >PC Software</option>
								<option value="4" >Games</option>
								<option value="5,6" >Περιφεριακά Η/Υ - Αναλώσιμα Η/Υ</option>
								<option value="11" >Ηλεκτρονικά</option>
								<option value="7" >Χαρτικά - Είδη Γραφείου</option>							
								</select></p>
								<p class="submit"><input type="submit" value="Αναζήτηση" /></p>
						</form>	<!-- advanced search form -->
						</p>
                    </div>
					</div>
                </div>
            <div class="clear"></div>
            <div class="postFooter"></div>
        </div>

        <div class="clear"></div>

        </div>		<!-- centerContent ends -->
		</div>		<!-- centerContentCell ends -->
    </div>			<!-- mainContent ends -->


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
