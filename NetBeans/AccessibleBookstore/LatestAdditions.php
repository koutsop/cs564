<?php

function LatestAdditions (){
	echo "
        <div class='post'>
            <h1><span class='text'>Τελευταίες Προσθήκες</span></h1>
                <div class='postContent'>
	";
	require_once 'BookProducer.php';
	$producer = new BookProducer();
	$producer->ProduceBook('
		#', 
		'ΜΑΤΩΜΕΝΑ ΙΧΝΗ', 
		'matwmena_ixnh.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΧΕΝΙΝΓΚ ΜΑΝΚΕΛ', 
		'11,99'
	);

	$producer->ProduceBook('
		#', 
		'ΤΟ ΘΑΥΜΑ ΤΗΣ ΡΟΔΟΥ', 
		'to_8auma_ths_rodou.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΦΡΑΝΣΗ ΣΤΑΘΑΤΟΥ', 
		'2,99'
	);

	$producer->ProduceBook('
		#', 
		'ΦΕΥΓΩ', 
		'feugw.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΚΩΣΤΙΑ ΚΟΝΤΟΛΕΩΝ', 
		'9,49'
	);

	$producer->ProduceBook('
		#', 
		'ΧΩΡΙΣ ΧΕΙΡΟΚΡΟΤΗΜΑ', 
		'xwris_xeirokrothma.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΛΕΝΑ ΜΑΝΤΑ', 
		'15,99'
	);
	
	echo "<div class='clear'></div>";
	
	$producer->ProduceBook('
		#', 
		'ΚΟΜΜΕΝΑ ΛΟΥΛΟΥΔΙΑ', 
		'kommena_louloudia.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΝΙΚΟΛ-ΑΝΝΑ ΜΑΝΙΑΤΗ', 
		'12,99'
	);

	$producer->ProduceBook('
		#', 
		'ΑΜΝΗΣΙΑ', 
		'amnhsia.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΣΤΙΒ ΓΟΥΑΤΣΟΝ', 
		'12,99'
	);

	$producer->ProduceBook('
		#', 
		'ΠΟΣΟ ΚΟΣΤΙΖΕΙ Η ΒΡΟΧΗ;', 
		'poso_kostizei_h_broxh.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΧΡΥΣΗΙΔΑ ΔΗΜΟΥΛΙΔΟΥ', 
		'11,49'
	);

	$producer->ProduceBook('
		#', 
		'ΤΟ ΦΘΙΝΟΠΩΡΟ ΤΗΣ ΜΑΓΙΣΣΑΣ', 
		'to_f8inopwro_ths_magissas.jpg', 
		'Εκδόσεις Ψυχογιός', 
		'#', 
		'ΚΑΙΤΗ ΟΙΚΟΝΟΜΟΥ', 
		'15,99'
	);
	
	echo "			
                </div>
            <div class='clear'></div>
            <div class='postFooter'></div>
        </div>	
	";
}

?>
