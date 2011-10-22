<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of BookProducer
 *
 * @author koutsop
 */
class BookProducer {
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
						<div class=\"text\">
							<a class=\"booLink\" href=\"$url\"><strong>$title</strong></a>
							<br />
							<a class=\"publisher\" href=\"$publisherURL\"><span lang=\"$language\">$publisher</span></a>
							<br />
							<strong>Συγγραφέας</strong>: <span lang=\"$language\">$author</span>
							<br />
							<span class=\"price\">€ $price</span>							
						</div>
						<div class=\"imgCartContainer\">
								<a  href=\"#\" title=\"Προσθήκη στο καλάθι\"><img src=\"images/cart.gif\" alt=\"\"/></a>
						</div>
					</div>
				</div>
			</div>		
		";
	}

}

?>
