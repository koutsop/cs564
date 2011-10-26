<?php

function LatestAdditions (){
	echo "
        <div class=\"post\">
            <h1><span class=\"text\">Τελευταίες Προσθήκες</span></h1>
                <div class=\"postContent\">
	";
	require_once 'BookDescriptionProducer.php';
	$producer = new BookDescriptionProducer();
	$producer->ProduceSortBookDiscription(
		'#', 
		'ΜΑΤΩΜΕΝΑ ΙΧΝΗ', 
		'matwmena_ixnh.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΧΕΝΙΝΓΚ ΜΑΝΚΕΛ', 
		'11,99',
		'el'
	);

	$producer->ProduceSortBookDiscription(
		'#', 
		'ΤΟ ΘΑΥΜΑ ΤΗΣ ΡΟΔΟΥ', 
		'to_8auma_ths_rodou.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΦΡΑΝΣΗ ΣΤΑΘΑΤΟΥ', 
		'2,99',
		'el'
	);

	$producer->ProduceSortBookDiscription(
		'#', 
		'ΦΕΥΓΩ', 
		'feugw.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΚΩΣΤΙΑ ΚΟΝΤΟΛΕΩΝ', 
		'9,49',
		'el'
	);

	$producer->ProduceSortBookDiscription(
		'#', 
		'ΧΩΡΙΣ ΧΕΙΡΟΚΡΟΤΗΜΑ', 
		'xwris_xeirokrothma.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΛΕΝΑ ΜΑΝΤΑ', 
		'15,99',
		'el'
	);
	
	//echo "<div class=\"clear\"></div>";
	
	$producer->ProduceSortBookDiscription(
		'#', 
		'ΚΟΜΜΕΝΑ ΛΟΥΛΟΥΔΙΑ', 
		'kommena_louloudia.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΝΙΚΟΛ-ΑΝΝΑ ΜΑΝΙΑΤΗ', 
		'12,99',
		'el'
	);

	$producer->ProduceSortBookDiscription(
		'#', 
		'ΑΜΝΗΣΙΑ', 
		'amnhsia.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΣΤΙΒ ΓΟΥΑΤΣΟΝ', 
		'12,99',
		'el'
	);

	$producer->ProduceSortBookDiscription(
		'#', 
		'ΠΟΣΟ ΚΟΣΤΙΖΕΙ Η ΒΡΟΧΗ;', 
		'poso_kostizei_h_broxh.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΧΡΥΣΗΙΔΑ ΔΗΜΟΥΛΙΔΟΥ', 
		'11,49',
		'el'
	);

	$producer->ProduceSortBookDiscription(
		'#', 
		'ΤΟ ΦΘΙΝΟΠΩΡΟ ΤΗΣ ΜΑΓΙΣΣΑΣ', 
		'to_f8inopwro_ths_magissas.jpg', 
		'Ψυχογιός', 
		'#', 
		'ΚΑΙΤΗ ΟΙΚΟΝΟΜΟΥ', 
		'15,99',
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
