<?php

	function Suggestions (){
		echo "
			<div class=\"post\">
				<h1><span class=\"text\">Σας προτείνουμε</span></h1>
					<div class=\"postContent\">
		";	
		
		require_once 'BookDescriptionProducer.php';
		$producer = new BookDescriptionProducer();
		$producer->ProduceSortBookDiscription(
			'#', 
			'O ΛΕΥΚΟΣ ΤΟΙΧΟΣ', 
			'o_leukos_toixos.jpg', 
			'Μίνωας', 
			'#', 
			'ΙΩΑΝΝΙΔΗΣ ΠΑΥΛΟΣ', 
			'9,90',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'ΤΟ ΤΑΞΙΔΙ ΤΗΣ ΦΩΤΙΑΣ', 
			'to_ta3idi_ths_fwtias.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΣΟΦΙΑ ΒΟΪΚΟΥ', 
			'14,99',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'Η ΦΟΝΙΣΣΑ', 
			'h_fonissa.jpg', 
			'Λιβάνη', 
			'#', 
			'ΑΛΕΞΑΝΔΡΟΣ ΠΑΠΑΔΙΑΜΑΝΤΗΣ', 
			'1,00',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'Καβάφης - Απαντα', 
			'kabafhs-apanta.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΚΩΣΤΑΣ ΚΑΒΑΦΗΣ', 
			'1,00',
			'el'
		);			
		
		echo "<div class=\"clear\"></div>";
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'DUNE', 
			'dune.jpg', 
			'Anubis', 
			'#', 
			'FRANK HERBERT', 
			'14,90',
			'EN-US'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'ΟΣΟΙ ΖΩΝΤΑΝΟΙ', 
			'osoi_zvntanoi.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΙΩΝ ΔΡΑΓΟΥΜΗΣ', 
			'1,00',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'Βαβυλωνία', 
			'babulwnia.jpg', 
			'Μίνωας', 
			'#', 
			'ΔΗΜΗΤΡΙΟΣ ΒΥΖΑΝΤΙΟΣ', 
			'1,00',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'Γυναικοκρατία', 
			'gunaikokratia.jpg', 
			'Πελεκάνος', 
			'#', 
			'ΔΗΜΗΤΡΙΟΣ ΒΥΖΑΝΤΙΟΣ', 
			'3,00',
			'el'
		);
		
		echo "			
					</div>
				<div class=\"clear\"></div>
				<div class=\"postFooter\"></div>
			</div>	
		";		
	}
	
?>
