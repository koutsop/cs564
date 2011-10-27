<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of BookDescriptionProducer
 *
 * @author koutsop
 */
class BookDescriptionProducer{
	
	//------------------------------------------------------------
	//otan 8a exoume mono to eikonidio kai tis genikes plirofories
	public function ProduceSortBookDiscription (
						$url, 
						$title, 
						$img,
						$publisher, 
						$publisherURL, 
						$author, 
						$price, 
						$language,
                        $longdesc = "book.html"
		) {
		echo "
		   <div class=\"box\">
				<div class=\"boxContents\">
					<div class=\"bookFrame\">
						<div class=\"imgBookContainer\">
							<span lang=\"$language\">
							<a href=\"$url\"><img src=\"images/books/$img\" alt=\"Τίτλος βιβλίου: $title\" longdesc=\"$longdesc\"/></a>
							</span>
						</div>
						<div class=\"sortDescription\">
							<div class=\"bookTitle\">
								<a href=\"$url\"><strong>$title</strong></a>
							</div>
							<div class=\"clear\"></div>
							<div class=\"publisher\">
								<strong>Εκδόσεις</strong>: 
								<a href=\"$publisherURL\"><span lang=\"$language\">$publisher</span></a>
							</div>
							<div class=\"clear\"></div>
							<strong>Συγγραφέας</strong>: <span lang=\"$language\">$author</span>
							<div class=\"clear\"></div>
							<span class=\"floatLeft\"><strong>Τιμή</strong>: </span>
							<span class=\"price\">€ $price</span>							
						</div>	
						<div class=\"clear\"></div>
						<div class=\"imgCartContainer\">
								<a  href=\"#\"><img src=\"images/cart.gif\" alt=\"Προσθήκη στο καλάθι\"/></a>
						</div>
					</div>
				</div>
			</div>		
		";
	}

	//------------------------------------------------------------
	// otan 8a exoume kai ligo keimeno
	public function ProduceLongBookDiscription (
						$url, 
						$title, 
						$img, 
						$publisher, 
						$publisherURL, 
						$author, 
						$price, 
						$language, 
						$discription,
                        $longdesc = "book.html"			
		) {
		echo "
		   <div class=\"box\">
				<div class=\"boxContents\">
					<div class=\"bookFrame\">
						<div class=\"bookContentTop\">
							<div class=\"imgBookContainer\">
								<span lang=\"$language\">
								<a href=\"$url\"><img src=\"images/books/$img\" alt=\"Τίτλος βιβλίου: $title\" longdesc=\"$longdesc\"/></a>
								</span>
							</div>
							<div class=\"longDescription\">
								<div class=\"bookTitle\">
									<strong>Τίτλος</strong>:
									<a href=\"$url\"><strong><span lang=\"$language\">$title</span></strong></a>
								</div>
								<div class=\"clear\"></div>
								<div class=\"publisher\">
									<strong>Εκδόσεις</strong>: 
									<a href=\"$publisherURL\"><span lang=\"$language\">$publisher</span></a>
								</div>
								<div class=\"clear\"></div>
								<strong>Συγγραφέας</strong>: <span lang=\"$language\">$author</span>
								<div class=\"clear\"></div>
								<span class=\"floatLeft\"><strong>Τιμή</strong>: </span>
								<span class=\"price\">€ $price</span>							
							</div>						
						</div>
						<div class=\"clear\"></div>
						<div class=\"bookContentBottom\">
							<p>$discription</p>
						</div>	
						<div class=\"clear\"></div>
						<div class=\"imgCartContainerlongDescription\">
								<a  href=\"cart.php\" ><img src=\"images/cart.gif\" alt=\"Προσθήκη στο καλάθι\"/></a>
						</div>
						
						
					</div>	<!-- bookFrame ends -->
				
				</div>		<!-- boxContent ends -->
			</div>			<!-- box ends -->	
		";
	}	


	
	//------------------------------------------------------------
	//edw 8a exoume ola plirofories kritikes kai ta lipa.
	public function ProduceDetailedBookDiscription () {
	
	}	


}

?>
