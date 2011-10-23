<?php

/**
 * Description of CategoryMenuProducer
 *
 * @author koutsop
 */
class CategoryMenuProducer {
    //put your code here
    
    public function ProduceCategoryMenu($selectedCategory) {
        $this->ProduceCategoryMenuBegin();
		$this->ProduceTitleBox();
		$this->ProduceMenu($selectedCategory);
		$this->ProduceCategoryMenuEnd();
    }
    
    //------------------------------------------------------------
    
    public function ProduceCategoryMenuBegin ()
        { echo "<div class=\"leftContent\">   <!-- leftContent -->"; }
        
    //------------------------------------------------------------
    
    public function ProduceCategoryMenuEnd () 
        { echo "</div>"; }
        
 	public function ProduceTitleBox () {
		echo "
			<div class=\"titleBox\"><strong>Κατηγορίες</strong></div>
			<a href=\"#\" class=\"skipButton\">Μετάβαση στο περιεχόμενο</a>
			<a name=\"categoryMenu\"></a>
		";
	}

	
	private function ProduceCategory ($selectedCategory, $pageURL, $pageTitle) {
		if ($selectedCategory == $pageURL)
			echo "<li class=\"categoryMenuSelected\">$pageTitle</li>\t\t\n";
		else
			echo "<li class=\"categoryMenu\"><a href=\"$pageURL\" class=\"categoryMenu\">$pageTitle</a></li>\t\t\n";
			
	}
	
	//------------------------------------------------------------
	
	public function ProduceMenu($selectedCategory) {
		echo "<ul class=\"categoryMenu\">";
				$this->ProduceCategory($selectedCategory, "#", "Όλα τα βιβλία");	
				$this->ProduceCategory($selectedCategory, "#", "Μυθιστόρημα");	
				$this->ProduceCategory($selectedCategory, "Literature.php", "Λογοτεχνία");
				/*$this->ProduceCategory($selectedCategory, "#", "Κλασσική Λογοτεχνία");*/
				$this->ProduceCategory($selectedCategory, "#", "Επιστ.Φαντασία");
				$this->ProduceCategory($selectedCategory, "#", "Fantasy");
				$this->ProduceCategory($selectedCategory, "#", "Ιστορία");
				$this->ProduceCategory($selectedCategory, "#", "Βιογραφίες");
				$this->ProduceCategory($selectedCategory, "#", "Μονογραφίες");
				$this->ProduceCategory($selectedCategory, "#", "Μυστικισμός");
				$this->ProduceCategory($selectedCategory, "#", "Τεχνολογία");
				$this->ProduceCategory($selectedCategory, "#", "Διάφορα");
				/*$this->ProduceCategory($selectedCategory, "#", "Παιδική Λογοτεχνία");*/
				$this->ProduceCategory($selectedCategory, "#", "Χιούμορ");
				$this->ProduceCategory($selectedCategory, "#", "Εκπαίδευση");
				$this->ProduceCategory($selectedCategory, "#", "Manga");
		echo "</ul>";
	}
}

?>