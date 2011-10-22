<?php

function ForeignLanguageBooks () {
	echo "
        <div class=\"post\">
            <h1><span class=\"text\">Ξενόγλωσσα Βιβλία</span></h1>
                <div class=\"postContent\">
	";
	
	require_once 'BookProducer.php';
	$producer = new BookProducer();
	$producer->ProduceBook(
		'#', 
		'PASSION', 
		'passion.jpg', 
		'ADA Editors', 
		'#', 
		'LAUREN KATE', 
		'12,90',
		'EN-US'
	);	
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'VICTORIA HISLOP', 
		'14,90',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'HEADHUNTERS', 
		'headhunters.jpg', 
		'Harvill Secker', 
		'#', 
		'NESBO JO', 
		'13,95',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'THE LEOPARD', 
		'the_leopard.jpg', 
		'Random House Canada', 
		'#', 
		'NESBO JO', 
		'8,90',
		'EN-US'
	);	
	
	echo "<div class=\"clear\"></div>";
	
	$producer->ProduceBook(
		'#', 
		'ABSOLUTE C++', 
		'absolute_C++.jpg', 
		'Headline', 
		'#', 
		'WALTER J.,SAVITCH', 
		'64,90',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'AFTERWARDS', 
		'afterwards.jpg', 
		'Headline', 
		'#', 
		'ROSAMUND,LUPTON', 
		'10,90',
		'EN-US'
	);	
	
	$producer->ProduceBook(
		'#', 
		'FALL OF GIANTS', 
		'fall_of_giants.jpg', 
		'Dutton Adult', 
		'#', 
		'FOLLETT KEN', 
		'8,90',
		'EN-US'
	);		
	
	$producer->ProduceBook(
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
                </div>
            <div class=\"clear\"></div>
            <div class=\"postFooter\"></div>
        </div>	
	";
}
?>
