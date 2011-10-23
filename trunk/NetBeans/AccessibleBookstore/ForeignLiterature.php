<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <title>Αccessible-Βookstore: Ξένη Λογοτεχνία</title>

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
                <li class= "crumb"><a href="index.php" class="crumb">Αρχική σελίδα</a></li>
				<li class= "crumb">></li>
                <li class= "crumb"><a href="Literature.php" class="crumb">Λογοτεχνία</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="ForeignLiterature.php" class="crumb">Ξένη Λογοτεχνία</a></li>
            </ul>         
        </div>  <!-- crumbContainer -->

        <div class="clear"></div>

		<?php
			//require_once 'CategoryMenuProducer.php';
			//$producer = new CategoryMenuProducer();
			//$producer->ProduceCategoryMenu("Literature.php");
		?>
        
       <div class="leftContent">   <!-- leftContent -->
            <div class="titleBox"><strong>Κατηγορίες</strong></div>
            <a href="#" class="skipButton">Μετάβαση στο περιεχόμενο</a>
            <a name="categoryMenu"></a>
            <ul class="categoryMenu">
                <li> <a href="#" class="categoryMenu">Όλα τα βιβλία</a></li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Μυθιστόρημα</a>          </li>
                <li class="categoryMenu"> 
                    <dl class="categoryMenu">
                        <dd class="categoryMenu"><a href="Literature.php" class="categoryMenu">Λογοτεχνία</a></dd>
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Ελληνική Λογοτεχνία</a></dt>
                        <dt class="categoryMenuSelected">Ξένη Λογοτεχνία</dt>                        
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Κλασσική Λογοτεχνία</a></dt>
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Παιδική Λογοτεχνία</a></dt>
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Δοκίμια</a></dt>
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Μυθιστόρημα</a></dt>
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Μυθιστόρημα</a></dt>
                    </dl>
                </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Επιστ.Φαντασία</a>       </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Fantasy</a>              </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Ιστορία</a>              </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Βιογραφίες</a>           </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Μονογραφίες</a>          </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Μυστικισμός</a>          </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Τεχνολογία</a>           </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Διάφορα</a>              </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Δοκίμιο</a>              </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Χιούμορ</a>              </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Εκπαίδευση</a>           </li>
                <li class="categoryMenu"><a href="#" class="categoryMenu">Manga</a>                </li>           
            </ul>
        </div>  <!-- leftContent ends -->        
        

	<div class="centerContentCell">   <!-- centerContent -->
        <div class="centerContent">   <!-- centerContent -->
        <a name="content"></a>
            <div class="post">	<!-- post -->
                    <h1><span class="text">Ξένη Λογοτεχνία</span></h1>
                    <div class="postContent"> <!-- postContent -->
                            <div class="searchResultsContent">				
                                    <?php
                                            require_once 'Utility.php';
                                            require_once 'BookDescriptionProducer.php';
                                            $producer = new BookDescriptionProducer();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
													'PASSION', 
													'passion.jpg', 
													'ADA Editors', 
													'#', 
													'LAUREN KATE', 
													'12,90',
													'EN-US',
                                            		'Υπάρχει κάτι μυστηριώδες και ταυτόχρονα οικείο σχετικά με τον Ντάνιελ..'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                   	'#', 
													'THE THREAD', 
													'the_thread.jpg', 
													'Headline', 
													'#', 
													'VICTORIA HISLOP', 
													'14,90',
													'EN-US',
                                                    'Μετά την απίστευτη εκδοτική και τηλεοπτική επιτυχία με «Το Νησί»...'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
													'HEADHUNTERS', 
													'headhunters.jpg', 
													'Harvill Secker', 
													'#', 
													'NESBO JO', 
													'13,95',
													'EN-US',
                                            		'Ο υποψήφιος ήταν τρομοκρατιμένος.Φορούσε ένα γκρι κοστούμι...'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                   	'#', 
													'THE LEOPARD', 
													'the_leopard.jpg', 
													'Random House Canada', 
													'#', 
													'NESBO JO', 
													'8,90',
													'EN-US',
                                                    'Ο Χάρυ Χολ επιστρέφει, και αυτή τη φορά από πολύ πολύ μακρυά'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
													'Aleph', 
													'aleph.jpg', 
													'Alfred A. Knopf', 
													'#', 
													'Paolo Coelho', 
													'20,64',
													'EN-US',
                                                    'Μετέτρεψε τη ζωή σου. Ξαναγράψε το πεπρωμένο σου.Μερικά βιβλία τα διαβάζεις.Το Άλεφ το ζείς.'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
													'AFTERWARDS', 
													'afterwards.jpg', 
													'Headline', 
													'#', 
													'ROSAMUND,LUPTON', 
													'10,90',
													'EN-US',
                                            		'Είμαι η μητέρα σου και θα σε προστατεύω πάντα. Ο μάυρος καπνός λεκιάζει τον γαλανό καλοκαιρινό ουρανό...'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                   '#', 
													'FALL OF GIANTS', 
													'fall_of_giants.jpg', 
													'Dutton Adult', 
													'#', 
													'FOLLETT KEN', 
													'8,90',
													'EN-US',
                                            		'Ένα εκπληκτικό μυθιστόρημα που ακολουθεί πέντε οικογένειες μέσα από το δράμα που βίωσαν τον Α΄ Παγκόσμιο πόλεμο.'
                                            );

                                    ?>						
                            </div>
                            <div class="clear"></div>
                            <div class="searchResultsPages">
                                    <strong>Σελίδες: &nbsp;</strong>
                                    <a href="SearchResults.php"><strong>1</strong></a>&nbsp;
                                    <a href="SearchResults2.php">2</a>&nbsp;
                                    <a href="SearchResults3.php">3</a>&nbsp;
                                    <a href="#">4</a>&nbsp;
                                    <a href="#">5</a>
                                    <br/>
                                    Σελίδα 1 απο 5&nbsp;&nbsp;&nbsp;
                                    <a href="SearchResults2.php">&lt;Επόμενη Σελιδα&gt;</a>
                            </div>
                            <div class="clear"></div>
                    </div>			<!-- postContent ends -->
                    <div class="clear"></div>
                    <div class="gotoTop"><a href="#top">Πήγαινε στην κορυφή</a></div>
                    <div class="clear"></div>
                    <div class="postFooter"></div>					
            </div>				<!-- post ends -->		
            <div class="clear"></div>
        </div>  <!-- centerContent ends -->
	</div>		<!-- centerContentCell ends -->
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
