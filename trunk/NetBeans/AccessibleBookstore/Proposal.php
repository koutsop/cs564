<?php

	function Proposal (){
		echo "
			<div class=\"post\">
				<h1><span class=\"text\">Σας προτείνουμε</span></h1>
					<div class=\"postContent\">
		";	
		
		require_once 'BookProducer.php';
		$producer = new BookProducer();
		$producer->ProduceBook(
			'#', 
			'O ΛΕΥΚΟΣ ΤΟΙΧΟΣ', 
			'o_leukos_toixos.jpg', 
			'Εκδόσεις Μίνωας', 
			'#', 
			'ΙΩΑΝΝΙΔΗΣ ΠΑΥΛΟΣ', 
			'9,90',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'ΤΟ ΤΑΞΙΔΙ ΤΗΣ ΦΩΤΙΑΣ', 
			'to_ta3idi_ths_fwtias.jpg', 
			'Εκδόσεις Ψυχογιός', 
			'#', 
			'ΣΟΦΙΑ ΒΟΪΚΟΥ', 
			'14,99',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'Η ΦΟΝΙΣΣΑ', 
			'h_fonissa.jpg', 
			'Εκδόσεις Λιβάνη', 
			'#', 
			'ΑΛΕΞΑΝΔΡΟΣ ΠΑΠΑΔΙΑΜΑΝΤΗΣ', 
			'1,00',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'Καβάφης - Απαντα', 
			'kabafhs-apanta.jpg', 
			'Εκδόσεις Ψυχογιός', 
			'#', 
			'ΚΩΣΤΑΣ ΚΑΒΑΦΗΣ', 
			'1,00',
			'el'
		);			
		
		echo "<div class=\"clear\"></div>";
		
		$producer->ProduceBook(
			'#', 
			'DUNE', 
			'dune.jpg', 
			'Anubis', 
			'#', 
			'FRANK HERBERT', 
			'14,90',
			'EN-US'
		);			
		
		$producer->ProduceBook(
			'#', 
			'ΟΣΟΙ ΖΩΝΤΑΝΟΙ', 
			'osoi_zvntanoi.jpg', 
			'Εκδόσεις Ψυχογιός', 
			'#', 
			'ΙΩΝ ΔΡΑΓΟΥΜΗΣ', 
			'1,00',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'Βαβυλωνία', 
			'babulwnia.jpg', 
			'Εκδόσεις Μίνωας', 
			'#', 
			'ΔΗΜΗΤΡΙΟΣ ΒΥΖΑΝΤΙΟΣ', 
			'1,00',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'Γυναικοκρατία', 
			'gunaikokratia.jpg', 
			'ΔΗΜΗΤΡΙΟΣ ΒΥΖΑΝΤΙΟΣ', 
			'#', 
			'ΡΕΝΑ ΡΩΣΣΗ-ΖΑΪΡΗ', 
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
