<?php

/**
 * Description of FooterProducer
 *
 * @author koutsop
 */
class FooterProducer {
	public function ProduceFooter (){
		echo "
			<div class=\"footer\"> <!-- footer -->
				<div class=\"leftFooter\">    <!-- leftFooter -->
				<!-- TODO: edw xriazetai na balw sto alt megalo keimeno h\" na baloume longdisc -->
					<img src=\"images/wcag1AA.gif\" alt=\"Πιστοποίηση\"/>
				</div>  <!-- leftFooter ends -->

				<div class=\"centerFooter\">  <!-- centerFooter -->
					<div id=\"footerMenu\">   <!-- footerMenu -->
						<a href=\"\">Ιδιωτική Σύμβαση Πελάτη  </a>&nbsp; | &nbsp;
						<a href=\"\">Ασφάλεια συναλλαγών      </a>&nbsp; | &nbsp;
						<a href=\"\">Λοιπές Πληροφορίες       </a>&nbsp; | &nbsp;
						<a href=\"\">Τα βιβλιοπωλεία μας      </a>&nbsp; | &nbsp;
						<a href=\"\">Επικοινωνήστε Μαζί Μας   </a>
					</div>  <!-- footerMenu ends -->
					<br />
					<br />
					<span lang=\"EN-US\">Copyright 2011 CS-564. - Design For All S.A.</span>
				</div>      <!-- centerFooter -->

				<div class=\"rightFooter\"> <!-- rightFooter -->
					<div id=\"followUsOn\">    <!-- followUsOn -->
						<a href=\"\"><img src=\"images/rss.gif\" alt=\"Τα τελευταία νέα μας μέσο RSS\"/></a>
						<a href=\"http://www.facebook.com\"><img src=\"images/facebook_logo.png\" alt=\"Η σελίδας μας στο facebook\"/></a>
						<a href=\"http://twitter.com/\"><img src=\"images/twitter_logo.png\" alt=\"Ακολουθείσθε μας στο twitter\"/></a>
					</div>  <!-- followUsOn ends -->
				</div>  <!-- rightFooter ends -->
			</div>  <!-- footer ends -->		
		";
	}
}
?>

