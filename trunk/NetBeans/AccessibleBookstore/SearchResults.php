<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <title>Αccessible-Βookstore: Αποτελέσματα Αναζήτησης</title>

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
                <li class= "crumb"><a href="index.php" class="crumb">Αρχική σελίδα</a></li>
				<li class= "crumb">></li>
                <li class= "crumb"><a href="SearchResults.php" class="crumb">Αποτελέσματα Αναζήτησης</a></li>
            </ul>         
        </div>  <!-- crumbContainer -->

        <div class="clear"></div>

		<?php
			require_once 'CategoryMenuProducer.php';
			$producer = new CategoryMenuProducer();
			$producer->ProduceCategoryMenu("index.php");
		?>
        

		<div class="centerContentCell">   <!-- centerContent -->
        <div class="centerContent">   <!-- centerContent -->
        <a name="content"></a>
			<?php
				/*require_once 'Utility.php';
				require_once 'Proposal.php';
				require_once 'TopSalling.php';
				require_once 'LatestAdditions.php';
				require_once 'ForeignLanguageBooks.php';
				LatestAdditions();
				Clear();
				TopSalling();
				Clear();
				Proposal();
				Clear();
				ForeignLanguageBooks();*/
			?>
			<div class="post">	<!-- post -->
				<h1><span class="text">ΑΠΟΤΕΛΕΣΜΑΤΑ ΑΝΑΖΗΤΗΣΗΣ: (X αποτελέσματα)</span></h1>
				<div class="postContent"> <!-- postContent -->
					<?php
						require_once 'BookProducer.php';
						$producer = new BookProducer();
						$producer->ProduceLongBook(
							'#', 
							'PASSION', 
							'passion.jpg', 
							'ADA Editors', 
							'#', 
							'LAUREN KATE', 
							'12,90',
							'EN-US',
							'Δεν υπάρχουν κριτικές αναγνωστών για αυτό το προϊόν. Μπορείτε να γράψετε εσείς την πρώτη κριτική κάνοντας κλικ εδώ'
						);
					?>
				</div>			<!-- postContent ends -->
			</div>				<!-- post ends -->
			
			<div class="clear"></div>
        </div>  <!-- centerContent ends -->
    </div>		<!-- mainContent ends -->
	</div>		<!-- centerContentCell ends -->


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
