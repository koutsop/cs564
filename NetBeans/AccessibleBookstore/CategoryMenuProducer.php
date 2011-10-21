<?php

/**
 * Description of CategoryMenuProducer
 *
 * @author koutsop
 */
class CategoryMenuProducer {
    //put your code here
    
    public function CategoryMenu($activePage) {
        
    }
    
    //------------------------------------------------------------
    
    public function ProduceCategoryMenuBegin ()
        { echo "<div class='header'> <!-- header -->"; }
        
    //------------------------------------------------------------
    
    public function ProduceCategoryMenuEnd () 
        { echo "</div>"; }
        
    //------------------------------------------------------------
    
    public function ProduceClear () 
        { echo "<div class='clear'></div>"; }
            
}

?>
