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
		'Zaha Hadid', 
		'46,90',
		'EN-US'
	);	
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'Victoria Hislop', 
		'14,90',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'HEADHUNTERS', 
		'headhunters.jpg', 
		'Harvill Secker', 
		'#', 
		'Jo Nesbo', 
		'13,95',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'Victoria Hislop', 
		'46,90',
		'EN-US'
	);	
	
	echo "<div class=\"clear\"></div>";
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'Victoria Hislop', 
		'46,90',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'Victoria Hislop', 
		'46,90',
		'EN-US'
	);	
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'Victoria Hislop', 
		'46,90',
		'EN-US'
	);		
	
	$producer->ProduceBook(
		'#', 
		'THE THREAD', 
		'the_thread.jpg', 
		'Headline', 
		'#', 
		'Victoria Hislop', 
		'46,90',
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
