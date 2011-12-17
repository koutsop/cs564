<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="Accessible bookstore" />
    <meta name="keywords" content="purchase books, electonic, accessible, bookstore" />      
    
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <title>Αccessible-Βookstore: Aleph</title>

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
            <a href="#" class="skipButton">Μετάβαση στο μενού κατηγορίες</a>
            <a name="crumb"></a>
            <ul class="crumb">
                <li class= "crumb"><a href="index.php" class="crumb">Αρχική σελίδα</a></li>
				<li class= "crumb">></li>
                <li class= "crumb"><a href="Literature.php" class="crumb">Λογοτεχνία</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="ForeignLiterature.php" class="crumb">Ξένη Λογοτεχνία (Σελίδα 1)</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="BookView.php" class="crumb"><span lang="EN-US">Aleph</span></a></li>
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
                <h1><span class="text"><span lang="EN-US">Aleph</span></span></h1>
                <div class="postContent"> <!-- postContent -->
                    <div class="box">
                        <div class="boxContents">
                            <div class="bookFrame">
 
                                
                            <div class="bookContentTop">
                                <div class="imgBookContainer">
                                    <span lang="EN-US">    
                                        <img src="images/books/aleph.jpg" alt="Aleph"/>            
                                    </span>
                                </div>
                            <div class="longDescription">
								<div class="bookTitle">
									<strong>Τίτλος</strong>:
									<a href="Aleph.php"><strong><span lang="EN-US">Aleph</span></strong></a>
								</div>
								<div class="clear"></div>
								<div class="publisher">
									<strong>Εκδόσεις</strong>: 
									<a href="#"><span lang="EN-US">Knopf (September 27, 2011)</span></a>
								</div>
								<div class="clear"></div>
								<strong>Συγγραφέας</strong>: <span lang="EN-US">Paulo Coelho</span>
								<div class="clear"></div>
								<span class="floatLeft"><strong>Τιμή</strong>: </span>
								<span class="price">€ 20,64</span>							
							</div>						
                            </div>  
                            <div class="clear"></div> 
                            
                            <br/>
                            <p class="bookRating">
								<em>Βαθμολογία:</em> <img src="images/stars400.png" alt="4 απο 5 αστέρια"/> 
								<a  href="cart2.php" title="Προσθήκη στο καλάθι"><img src="images/cart.gif" alt=""/></a>
								<br/>
								Για να βαθμολογήσετε το βιβλίο πατήστε τον σύνδεσμο βαθμολογία: <a href="">Bαθμολογία</a>
							</p>
							
                            <div class="clear"></div>
                            <h1>Λεπτομέρειες</h1>
                           
                            <div class="details">         
                                <ul>
                                    <li><strong>Σελίδες:</strong> 288</li>
                                    <li><strong>Γλώσσα:</strong> Αγγλικά</li>
                                    <li><strong>ISBN-10:</strong> 0307700186</li>
                                    <li><strong>ISBN-13:</strong> 978-0307700186</li>
                                    <li><strong>Διαστάσεις:</strong> 9 x 5.9 x 1.1 inches</li>
                                </ul>                                 
                            </div>
                            <div class="clear"></div>                                
                            <h1>Περίληψη</h1>
                           
                            <div class="summary">
                               
                                <p>
                                <span lang="EN-US">
                                    In his most personal novel to date, internationally best-selling author Paulo Coelho 
                                    returns with a remarkable journey of self-discovery. Like the main character in his 
                                    much-beloved The Alchemist, Paulo is facing a grave crisis of faith. As he seeks a 
                                    path of spiritual renewal and growth, he decides to begin again: to travel, 
                                    to experiment, to reconnect with people and the landscapes around him.
                                    <br />
									<br />
                                    Setting off to Africa, and then to Europe and Asia via the Trans-Siberian Railway, 
									he initiates a journey to revitalize his energy and passion. Even so, he never 
									expects to meet Hilal. A gifted young violinist, she is the woman Paulo loved 
									five hundred years before—and the woman he betrayed in an act of cowardice so 
									far-reaching that it prevents him from finding real happiness in this life. 
									Together they will initiate a mystical voyage through time and space, 
									traveling a path that teaches love, forgiveness, and the courage to overcome 
									life’s inevitable challenges. Beautiful and inspiring, Aleph invites us to 
									consider the meaning of our own personal journeys: Are we where we want to be, 
									doing what we want to do?
                                </span>
                                </p>
                            </div>
                            <div class="clear"></div> 
							<br />
							<h1>Σχετικά με τον συγγραφέα</h1>
							<p>
								<span lang="EN-US">
									The Brazilian author <strong>Paulo Coelho</strong> was born in 1947 in the city 
									of Rio de Janeiro. Before dedicating his life completely to literature, 
									he worked as theatre director and actor, lyricist and journalist.
									<br />
									<br />
									In 1986, Paulo Coelho did the pilgrimage to Saint James of Compostella, an 
									experience later to be documented in his book The Pilgrimage.
									<br />
									<br />
									In the following year, Coelho published The Alchemist. Slow initial sales 
									convinced his first publisher to drop the novel, but it went on to become 
									one of the best selling Brazilian books of all time.
								</span>
							</p>
							<br />
							<div class="clear"></div>                             
                            
                            
                            
                            
                            <h1>Κριτικές</h1>
                            
							<div class="review">
								
								<div class="userReview">
								<div class="userReviewContainer">
									<div class="reviewLeft">
										<p>
											Χρήστης: <span lang="EN-US"><strong>foufoutos</strong></span> <br />
											18 Μαρτίου 2011
										</p>
									</div>
									<div class="reviewRight">
										<p>
										 Tο βιβλίο ξεφεύγει από το συνηθισμένο οι ανατροπές στο σενάριο κόβουν την ανάσα, καθιστώντας τα διηγήματα του πολύ ξεχωριστά και ενδιαφέροντα 
										</p>
									</div>
								</div>	<!-- userReviewContainer ends -->	
									<div class="clear"></div> 
									<br/>
									<a href="">Αναφορά αυτού του σχόλιου</a>
								</div>	
								
								
								<div class="clear"></div> 

								<div class="userReview">
								<div class="userReviewContainer">
									<div class="reviewLeft">
										<p>
											Χρήστης: <span lang="EN-US"><strong>foufoutos</strong></span> <br />
											18 Μαρτίου 2011
										</p>
									</div>
									<div class="reviewRight">
										<p>Υπέροχο βιβλίο, σε μεταφέρει σε άλλη εποχή</p>
									</div>
								</div>	<!-- userReviewContainer ends -->
									<div class="clear"></div> 
									<br/>
									<a href="">Αναφορά αυτού του σχόλιου</a>
								</div>	

								<div class="clear"></div> 

								<div class="userReview">
								<div class="userReviewContainer">
									<div class="reviewLeft">
										<p>
											Χρήστης: <span lang="EN-US"><strong>foufoutos</strong></span> <br />
											18 Μαρτίου 2011
										</p>
									</div>
									<div class="reviewRight">
										<p>
										 Ο συγγραφέας επέλεξε για καμβά μία φανταστική Αυτοκρατορία, δυσπροσδιόριστη χρονικά, αλλά σκιαγραφημένη με έντονα βυζαντινά χρώματα και με μέσο την προαιώνια σύγκρουση της με το Βασίλειο των Απίστων, ερεύνησε τα κίνητρα του ήρωα και την πάλη του ενάντια στο πεπρωμένο.
										</p>
									</div>
								</div>	<!-- userReviewContainer ends -->
									<div class="clear"></div> 
									<br/>
									<a href="">Αναφορά αυτού του σχόλιου</a>
								</div>	
								
                            </div>	<!-- review ends-->                          
                            <div class="clear"></div>     
							<p>Για να κάνετε κριτική, πατήστε τον σύνδεσμο: <a href="">κριτική</a></p>
                            </div>	<!-- bookFrame ends -->
                        </div>		<!-- boxContent ends -->
                    </div>			<!-- box ends -->	                    
                    <div class="clear"></div>
                </div>			<!-- postContent ends -->
                <div class="clear"></div>
				<div class="gotoTop"><a href="#top">Πήγαινε στην κορυφή</a></div>
				<div class="clear"></div>
                <div class="postFooter"></div>					
            </div>				<!-- post ends -->		
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
