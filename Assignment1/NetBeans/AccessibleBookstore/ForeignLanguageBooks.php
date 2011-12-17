<?php

function ForeignLanguageBooks () {
	echo "
        <div class=\"post\">
            <h1><span class=\"text\">Ξενόγλωσσα Βιβλία</span></h1>
                <div class=\"postContent\">
	";
	
	require_once 'BookDescriptionProducer.php';
	$producer = new BookDescriptionProducer();
	$producer->ProduceSortBookDiscription(
		'#', 
		'PASSION', 
		'passion.jpg', 
		'ADA Editors', 
		'#', 
		'LAUREN KATE', 
		'12,90',
		'EN-US'
	);	
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'VICTORIA HISLOP', 
		'14,90',
		'EN-US'
	);		
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'HEADHUNTERS', 
		'headhunters.jpg', 
		'Harvill Secker', 
		'#', 
		'NESBO JO', 
		'13,95',
		'EN-US'
	);		
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'THE LEOPARD', 
		'the_leopard.jpg', 
		'Random House Canada', 
		'#', 
		'NESBO JO', 
		'8,90',
		'EN-US'
	);	
	
	//echo "<div class=\"clear\"></div>";
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'ABSOLUTE C++', 
		'absolute_C++.jpg', 
		'Headline', 
		'#', 
		'WALTER J.,SAVITCH', 
		'64,90',
		'EN-US'
	);		
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'AFTERWARDS', 
		'afterwards.jpg', 
		'Headline', 
		'#', 
		'ROSAMUND,LUPTON', 
		'10,90',
		'EN-US'
	);	
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'FALL OF GIANTS', 
		'fall_of_giants.jpg', 
		'Dutton Adult', 
		'#', 
		'FOLLETT KEN', 
		'8,90',
		'EN-US'
	);		
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'Objective-C', 
		'objective-C.jpg', 
		'John Wiley and Sons Ltd', 
		'#', 
		'JIVA,DEVOE, BOB,KRESSIN', 
		'31,90',
		'EN-US'
	);	
	
	echo "			
                </div>	<!-- postContent ends -->
			<div class=\"clear\"></div>
			<div class=\"gotoTop\"><a href=\"#top\">Πήγαινε στην κορυφή</a></div>				
            <div class=\"clear\"></div>
            <div class=\"postFooter\"></div>
		</div>	<!-- post ends-->
	";
}
?>
