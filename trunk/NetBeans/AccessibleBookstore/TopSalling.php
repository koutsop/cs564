<?php

	function TopSalling () {
		echo "
			<div class=\"post\">
				<h1><span class=\"text\">Τα πιο δημοφιλή</span></h1>
					<div class=\"postContent\">
		";	
		
		require_once 'BookDescriptionProducer.php';
		$producer = new BookDescriptionProducer();
		$producer->ProduceSortBookDiscription(
			'#', 
			'ΑΓΓΕΛΟΙ 2: ΤΟ ΜΑΡΤΥΡΙΟ', 
			'aggeloi2.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΛΟΡΕΝ ΚΕΪΤ', 
			'11,99',
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
			'ΤΟ 3 ΚΑΙ ΤΟ 7', 
			'to_3_kai_to_7.jpg', 
			'Λιβάνη', 
			'#', 
			'ΓΙΩΡΓΟΣ ΠΑΠΑΧΡΗΣΤΟΣ', 
			'12,10',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'Η ΠΕΡΙΠΤΩΣΗ ΦΙΝΚΛΕΡ', 
			'h_periptvsh_finkler.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΧΑΟΥΑΡΝΤ ΤΖΕΪΚΟΜΠΣΟΝ ', 
			'13,99',
			'el'
		);			
		
		//echo "<div class=\"clear\"></div>";
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'1453', 
			'1453.jpg', 
			'Άνουμπις', 
			'#', 
			'ΟΡΕΣΤΗΣ N. ΜΑΝΟΥΣΟΣ', 
			'19,90',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'BLACK OUT', 
			'black_out.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΛΙΖΑ ΑΝΓΚΕΡ', 
			'13,99',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'H ΛΥΣΣΑ', 
			'h_lussa.jpg', 
			'Μίνωας', 
			'#', 
			'ΑΥΓΟΥΣΤΟΣ ΚΟΡΤΩ', 
			'5,90',
			'el'
		);			
		
		$producer->ProduceSortBookDiscription(
			'#', 
			'ΑΓΑΠΩ ΘΑ ΠΕΙ ΧΑΝΟΜΑΙ', 
			'agapw_8a_pei_xanomai.jpg', 
			'Ψυχογιός', 
			'#', 
			'ΡΕΝΑ ΡΩΣΣΗ-ΖΑΪΡΗ', 
			'13,99',
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
