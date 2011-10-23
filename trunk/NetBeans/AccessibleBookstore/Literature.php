<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <title>Αccessible-Βookstore: Λογοτεχνία</title>

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
            </ul>         
        </div>  <!-- crumbContainer -->

        <div class="clear"></div>

		<?php
			//require_once 'CategoryMenuProducer.php';
			//$producer = new CategoryMenuProducer();
			//$producer->ProduceCategoryMenu("");
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
                        <dd class="categoryMenuSelected">Λογοτεχνία</dd>
                        <dt class="categoryMenu"><a href="#" class="categoryMenu">Ελληνική Λογοτεχνία</a></dt>
                        <dt class="categoryMenu"><a href="ForeignLiterature.php" class="categoryMenu">Ξένη Λογοτεχνία</a></dt>                        
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
                    <h1><span class="text">Λογοτεχνία</span></h1>
                    <div class="postContent"> <!-- postContent -->
                            <div class="searchResultsContent">				
                                    <?php
                                            require_once 'Utility.php';
                                            require_once 'BookDescriptionProducer.php';
                                            $producer = new BookDescriptionProducer();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
                                                    'Αγαπώ θα πει χάνομαι', 
                                                    'agapw_8a_pei_xanomai.jpg', 
                                                    'ΨΥΧΟΓΙΟΣ', 
                                                    '#', 
                                                    'Ρώση - Ζαϊρη Ρένα', 
                                                    '12,90',
                                                    'EN-US',
                                                    'H Αλεξάνδρα, η Μαρίνα και η Ελίνα μεγαλώνουν σε ένα αρχοντικό όπου βασιλεύει η αδιαφορία. Έχουν τα πάντα αλλά τους λείπει το πιο βασικό: η αγάπη.'
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
                                                    'Το θαύμα της Ρόδου', 
                                                    'to_8auma_ths_rodou.jpg', 
                                                    'ΨΥΧΟΓΙΟΣ', 
                                                    '#', 
                                                    'Σταθάτου Φράνση', 
                                                    '7,34',
                                                    'EN-US',
                                                    'Ρόδος, τρεις αιώνες προ Χριστού. Μια εποχή ταραγμένη. Πώς να ζούσαν οι άνθρωποι τότε στο πανέμορφο νησί;'
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
                                                    'Πόσο κοστίζει η βροχή;', 
                                                    'poso_kostizei_h_broxh.jpg', 
                                                    'ΨΥΧΟΓΙΟΣ', 
                                                    '#', 
                                                    'Δημουλίδου Χρύσα', 
                                                    '13,21',
                                                    'EN-US',
                                                    '"Με ρωτάς τι χρώμα έχει ο έρωτας". "Και λοιπόν;" "Είναι χλωμός". "Μα μου είπαν πως έχει χρώμα κόκκινο". "Σε γελάσανε. Απλώς τον βάφουνε μ αυτό το χρώμα".'
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
                                                    'Όσοι ζωντανοί', 
                                                    'osoi_zvntanoi.jpg', 
                                                    'Πελεκάνος', 
                                                    '#', 
                                                    'Δραγούμης Ίων', 
                                                    '7,19',
                                                    'EN-US',
                                                    'Στο "Όσοι ζωντανοί" ο Ίων Δραγούμης εκφράζει τις προσωπικές του απόψεις για την εξωτερική πολιτική της Ελλάδας '
                                            );
                                            Clear();
                                            $producer->ProduceLongBookDiscription(
                                                    '#', 
                                                    'Η λύσσα', 
                                                    'h_lussa.jpg', 
                                                    'Μίνωας', 
                                                    '#', 
                                                    'Κορτώ Αύγουστος', 
                                                    '11,30',
                                                    'EN-US',
                                                    'Σε ένα απομονωμένο χωριό της Πίνδου ξεσπά μια επιδημία λύσσας. Παγιδευμένος στο χιόνι και στην αρρώστια, που κατασπαράζει το χωριό'
                                            );

                                    ?>						
                            </div>
                            <div class="clear"></div>
                            <div class="searchResultsPages">
                                    <strong>Σελίδες: &nbsp;</strong>
                                    <a href="#"><strong>1</strong></a>&nbsp;
                                    <a href="#">2</a>&nbsp;
                                    <a href="#">3</a>&nbsp;
                                    <a href="#">4</a>&nbsp;
                                    <a href="#">5</a>
                                    <br/>
                                    Σελίδα 1 απο 5&nbsp;&nbsp;&nbsp;
                                    <a href="#">&lt;Επόμενη Σελιδα&gt;</a>
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
