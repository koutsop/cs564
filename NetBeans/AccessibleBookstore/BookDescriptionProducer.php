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
	public function ProduceBook ($url, $title, $img, $publisher, $publisherURL, $author, $price, $language) {
		echo "
		   <div class=\"box\">
				<div class=\"boxContents\">
					<div class=\"frame\">
						<div class=\"imgBookContainer\">
							<span lang=\"$language\">
							<a href=\"$url\" title=\"$title\"><img src=\"images/books/$img\" alt=\"\"/></a>
							</span>
						</div>
		";
		$this->ProduceText($url, $title, $publisher, $publisherURL, $author, $price, $language, 'text');
		echo "		
						<div class=\"imgCartContainer\">
								<a  href=\"#\" title=\"Προσθήκη στο καλάθι\"><img src=\"images/cart.gif\" alt=\"\"/></a>
						</div>
					</div>
				</div>
			</div>		
		";
	}
	
	//------------------------------------------------------------
	//edw 8a exoume ola plirofories kritikes kai ta lipa.
	public function ProduceDetailedBookDiscription () {
	
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
						$paragraph
		) {
		echo "
		   <div class=\"box\">
				<div class=\"boxContents\">
					<div class=\"frame\">
						<div class=\"imgBookContainer\">
							<span lang=\"$language\">
							<a href=\"$url\" title=\"$title\"><img src=\"images/books/$img\" alt=\"\"/></a>
							</span>
						</div>
		";
		$this->ProduceText($url, $title, $publisher, $publisherURL, $author, $price, $language, 'textLong');
		echo "		
						<div class=\"paragraph\"><p>$paragraph</p></div>
						<div class=\"imgCartContainer\">
								<a  href=\"#\" title=\"Προσθήκη στο καλάθι\"><img src=\"images/cart.gif\" alt=\"\"/></a>
						</div>
						
					</div>
				</div>
			</div>		
		";
	}	
	
	//------------------------------------------------------------
	
	public function ProduceText ($url, $title, $publisher, $publisherURL, $author, $price, $language, $class){
		echo "
						<div class=\"$class\">
							<a class=\"booLink\" href=\"$url\"><strong>$title</strong></a>
							<div class=\"clear\"></div>
							<div class=\"publisher\">
								<strong>Εκδόσεις</strong>: 
								<a href=\"$publisherURL\"><span lang=\"$language\">$publisher</span></a>
							</div>
							<div class=\"clear\"></div>
							<strong>Συγγραφέας</strong>: <span lang=\"$language\">$author</span>
							<div class=\"clear\"></div>
							<spane class=\".floatLeft\"><strong>Τιμή</strong>: </span>
							<span class=\"price\">€ $price</span>							
						</div>			
		";
	}

}

?>
