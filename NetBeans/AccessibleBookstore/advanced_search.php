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
	
    <title>Αccessible-Βookstore: Σύνθετη Αναζήτηση</title>

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
            <a href="#categoryMenu" class="skipButton">Μετάβαση στο μενού κατηγορίες</a>
            <a name="crumb"></a>
            <ul class="crumb">
                <li class= "crumb"><a href="index.php" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="advanced_search.php" class="crumb">Σύνθετη Αναζήτηση</a></li>
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
            <h1><span class="text">Σύνθετη Αναζήτηση</span></h1>
			<div class="postContent">
				<div class="box">
					<div class="boxContents">
						<form action="SearchResults.php" method="post" > <!-- advanced search form -->
							<fieldset>
								<legend>Επιλέξτε κριτήρια αναζήτησης:</legend>
								
								<div class="formLayer">
									<div class="leftFormLayer" style="min-width: 155px"><p><label for="title">Τίτλος:</label></p></div>
									<div class="rightFormLayer"><p><input id="title"  name="textfield" type="text" accesskey="T"/></p></div>
								</div>
								<div class="clear"></div> 

								<div class="formLayer">
									<div class="leftFormLayer"><p><label for="author">Συγγραφέας:</label></p></div>
									<div class="rightFormLayer"><p><input id="author" type="text" name="textfield" /></p></div>
								</div>
								<div class="clear"></div>                                    

								<div class="formLayer">
									<div class="leftFormLayer"><p><label for="publisher">Εκδότης:</label></p></div>
									<div class="rightFormLayer"><p><input id="publisher" type="text" name="textfield" /></p></div>
								</div>
								<div class="clear"></div>

								<div class="formLayer">
									<div class="leftFormLayer"><p><label for="isbn">ISBN:</label></p></div>
									<div class="rightFormLayer"><p><input id="isbn" type="text" name="textfield" /></p></div>
								</div>
								<div class="clear"></div>

								<div class="formLayer">
									<div class="leftFormLayer"><p><label for="publication_year">Έτος έκδοσης:</label></p></div>
									<div class="rightFormLayer">
										<p>
											<select name="publication_year" id="publication_year">
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
										</select>
										</p>                                            
									</div>
								</div>
								<div class="clear"></div>                                

								<div class="formLayer">
									<div class="leftFormLayer"><p><label for="text">Κείμενο:</label></p></div>
									<div class="rightFormLayer"><p><input id="text" type="text" name="textfield" /></p></div>
								</div>
								<div class="clear"></div>         

								<div class="formLayer">
									<div class="leftFormLayer"><p><label for="category">Κατηγορία:</label></p></div>
									<div class="rightFormLayer">
										<p>
											<select name="category" id="category">
											<option value="0">Όλα τα βιβλία</option>
											<option value="1" >Μυθιστόρημα</option>
											<option value="2" >Λογοτεχνία</option>
											<option value="3" >Επιστ.Φαντασία</option>
											<option value="4" >Ιστορία</option>
											<option value="5" >Βιογραφίες</option>
											<option value="6" >Μονογραφίες</option>	
											<option value="7" >Μυστικισμός</option>	
											<option value="8" >Τεχνολογία</option>	
											<option value="9" >Διάφορα</option>	
											<option value="10" >Χιούμορ</option>	
											<option value="11" >Εκπαίδευση</option>		
											</select>
										</p>                                            
									</div>
								</div>
								<div class="clear"></div>                                             
								<p class="submit"><input type="submit" value="Αναζήτηση" /></p>
							</fieldset>
							<div class="clear"></div>
						</form>	<!-- advanced search form -->
					</div>	<!-- boxContents ends -->
				</div>	<!-- box ends -->
			</div>	<!-- postContent ends -->
			
			
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
