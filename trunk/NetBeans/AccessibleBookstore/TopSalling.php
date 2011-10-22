<?php

	function TopSalling () {
		echo "
			<div class=\"post\">
				<h1><span class=\"text\">Τα πιο δημοφιλή</span></h1>
					<div class=\"postContent\">
		";	
		
		require_once 'BookProducer.php';
		$producer = new BookProducer();
		$producer->ProduceBook(
			'#', 
			'ΑΓΓΕΛΟΙ 2: ΤΟ ΜΑΡΤΥΡΙΟ', 
			'aggeloi2.jpg', 
			'Εκδόσεις Ψυχογιός', 
			'#', 
			'ΛΟΡΕΝ ΚΕΪΤ', 
			'11,99',
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
			'ΤΟ 3 ΚΑΙ ΤΟ 7', 
			'to_3_kai_to_7.jpg', 
			'Εκδόσεις Λιβάνη', 
			'#', 
			'ΓΙΩΡΓΟΣ ΠΑΠΑΧΡΗΣΤΟΣ', 
			'12,10',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'Η ΠΕΡΙΠΤΩΣΗ ΦΙΝΚΛΕΡ', 
			'h_periptvsh_finkler.jpg', 
			'Εκδόσεις Ψυχογιός', 
			'#', 
			'ΧΑΟΥΑΡΝΤ ΤΖΕΪΚΟΜΠΣΟΝ ', 
			'13,99',
			'el'
		);			
		
		echo "<div class=\"clear\"></div>";
		
		$producer->ProduceBook(
			'#', 
			'1453', 
			'1453.jpg', 
			'Άνουμπις', 
			'#', 
			'ΟΡΕΣΤΗΣ N. ΜΑΝΟΥΣΟΣ', 
			'19,90',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'BLACK OUT', 
			'black_out.jpg', 
			'Εκδόσεις Ψυχογιός', 
			'#', 
			'ΛΙΖΑ ΑΝΓΚΕΡ', 
			'13,99',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'H ΛΥΣΣΑ', 
			'h_lussa.jpg', 
			'Εκδόσεις Μίνωας', 
			'#', 
			'ΑΥΓΟΥΣΤΟΣ ΚΟΡΤΩ', 
			'5,90',
			'el'
		);			
		
		$producer->ProduceBook(
			'#', 
			'ΑΓΑΠΩ ΘΑ ΠΕΙ ΧΑΝΟΜΑΙ', 
			'agapw_8a_pei_xanomai.jpg', 
			'Εκδόσεις Ψυχογιός', 
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
