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
	public function ProduceBook ($url, $title, $img, $publisher, $publisherURL, $author, $price) {
		echo "
		   <div class='box'>
				<div class='boxContents'>
					<div class='frame'>
						<div class='imgBookContainer'>
							<a href='$url' title='$title'><img src='images/books/$img' alt=''/></a>
						</div>
						<div class='text'>
							<a class='booLink' href='$url'><strong>$title</strong></a>
							<br />
							<a class='publisher' href='$publisherURL'>Εκδόσεις Ψυχογιός</a>
							<br />
							<strong>Συγγραφέας</strong>: $author 
							<span class='price'>€ $price</span>							

						</div>
						<div class='imgCartContainer'>
								<a  href='#' title='Προσθήκη στο καλάθι'><img src='images/cart.gif' alt=''/></a>
						</div>
					</div>
				</div>
			</div>		
		";
	}

}

?>
