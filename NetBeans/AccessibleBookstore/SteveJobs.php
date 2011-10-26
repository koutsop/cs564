<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="Accessible bookstore" />
    <meta name="keywords" content="purchase books, electonic accessible bookstore" />      
    
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <title>Αccessible-Βookstore: Steve Jobs</title>

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
                <li class= "crumb"><a href="SearchResults.php" class="crumb">Αποτελέσματα Αναζήτησης</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="SearchResults3.php" class="crumb">Αποτελέσματα Αναζήτησης (Σελίδα 3)</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="SteveJobs.php" class="crumb"><span lang="EN-US">Steve Jobs</span></a></li>
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
                <h1><span class="text"><span lang="EN-US">Steve Jobs</span></span></h1>
                <div class="postContent"> <!-- postContent -->
                    <div class="box">
                        <div class="boxContents">
                            <div class="bookFrame">
 
                                
                            <div class="bookContentTop">
                                <div class="imgBookContainer">
                                    <span lang="EN-US">    
                                        <img src="images/books/steve-jobs-book.jpg" alt="Steve Jobs"/>            
                                    </span>
                                </div>
                            <div class="longDescription">
								<div class="bookTitle">
									<strong>Τίτλος</strong>:
									<a href="SteveJobs.php"><strong><span lang="EN-US">Walter Isaacson</span></strong></a>
								</div>
								<div class="clear"></div>
								<div class="publisher">
									<strong>Εκδόσεις</strong>: 
									<a href="#"><span lang="EN-US">Simon &amp; Schuster (October 24, 2011)</span></a>
								</div>
								<div class="clear"></div>
								<strong>Συγγραφέας</strong>: <span lang="EN-US">Paulo Coelho</span>
								<div class="clear"></div>
								<span class="floatLeft"><strong>Τιμή</strong>: </span>
								<span class="price">€ 30,99</span>							
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
                                    <li><strong>Σελίδες: </strong>656</li>
                                    <li><strong>Γλώσσα: </strong>Αγγλικά</li>
                                    <li><strong>ISBN-10: </strong>1451648537</li>
                                    <li><strong>ISBN-13: </strong>978-1451648539</li>
                                    <li><strong>Διαστάσεις: </strong>9.4 x 6.1 x 2 inches</li>
                                </ul>                                 
                            </div>
                            <div class="clear"></div>                                
                            <h1>Περίληψη</h1>
                           
                            <div class="summary">
                               
                                <p>
                                <span lang="EN-US">
									Based on more than forty interviews with Jobs conducted over two years—as well 
									as interviews with more than a hundred family members, friends, adversaries, 
									competitors, and colleagues—Walter Isaacson has written a riveting story of the 
									roller-coaster life and searingly intense personality of a creative entrepreneur 
									whose passion for perfection and ferocious drive revolutionized six industries: 
									personal computers, animated movies, music, phones, tablet computing, and digital 
									publishing.
                                    <br />
									<br />
									At a time when America is seeking ways to sustain its innovative edge, and when 
									societies around the world are trying to build digital-age economies, Jobs stands 
									as the ultimate icon of inventiveness and applied imagination. He knew that the 
									best way to create value in the twenty-first century was to connect creativity 
									with technology. He built a company where leaps of the imagination were combined 
									with remarkable feats of engineering. 
									
									<br />
									<br />
									Although Jobs cooperated with this book, he asked for no control over what was 
									written nor even the right to read it before it was published. He put nothing 
									off-limits. He encouraged the people he knew to speak honestly. And Jobs speaks 
									candidly, sometimes brutally so, about the people he worked with and competed 
									against. His friends, foes, and colleagues provide an unvarnished view of the 
									passions, perfectionism, obsessions, artistry, devilry, and compulsion for 
									control that shaped his approach to business and the innovative products that 
									resulted.
									<br />
									<br />
									Driven by demons, Jobs could drive those around him to fury and despair. But his 
									personality and products were interrelated, just as Apple’s hardware and software 
									tended to be, as if part of an integrated system. His tale is instructive and 
									cautionary, filled with lessons about innovation, character, leadership, and 
									values.
									<br />
									<br />									
                                </span>
                                </p>
                            </div>
                            <div class="clear"></div> 
							<h1>Σχετικά με τον συγγραφέα</h1>
							<p>
								<span lang="EN-US">
									<strong>Walter Isaacson</strong>, the CEO of the Aspen Institute, has been chairman of 
									CNN and the managing editor of Time magazine. He is the author of Benjamin Franklin: 
									An American Life and of Kissinger: A Biography, and the coauthor of The Wise Men: 
									Six Friends and the World They Made. He lives in Washington, D.C., with his wife and daughter.
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
