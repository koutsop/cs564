<?php
/**
 * Description of header
 *
 * @author koutsop
 */
class HeadProducer {
    public function ProduceHeader ($activePage, $numberOfCartItems = 0) {
        $this->ProduceHeaderBegin();
        $this->produceLogo();
        $this->ProduceStandartFileds($numberOfCartItems);
        $this->ProduceClear();
        $this->ProduceHeaderMenu($activePage);
        $this->ProduceHeaderEnd();
    } 
	
    //------------------------------------------------------------
    
    public function ProduceHeaderBegin () 
        { echo "<div class=\"header\"> <!-- header -->"; }
        
    //------------------------------------------------------------
    
    public function ProduceHeaderEnd () 
        { echo "</div>"; }
        
    //------------------------------------------------------------
    
    public function ProduceClear () 
        { echo "<div class=\"clear\"></div>"; }
    
    //------------------------------------------------------------
    
    public function ProduceLogo () {
         echo"
            <div id=\"logo\">     <!-- logo -->
                <!-- long description-->
                <a href=\"index.php\"><img src=\"images/logo.png\" alt=\"Το λογότυπο του Αccessible-Βookstore\" /></a>
            </div>  <!-- logo ends -->
        ";       
    }
    
    //------------------------------------------------------------
    
    public function ProduceStandartFileds($numberOfCartItems) {
        echo "
            <div id=\"standartFileds\">   <!-- standartFileds -->
                <div class=\"searchStyle\"><!-- search -->
                    <img src=\"./images/leftBg.png\" class=\"leftBg\" alt=\"\" />
                    <div class=\"search\"><!-- search -->
                        <form id=\"simpleSearch\" action=\"index.php\" method=\"post\">
                            <fieldset class=\"hiddenFieldset\">
                                <label for=\"searchBook\">Γρήγορη αναζήτηση βιβλίου</label>
                                <input 
                                    id=\"searchBook\" 
                                    name=\"searchBook\" 
                                    type=\"text\" 
                                    maxlength=\"255\"
                                    value=\"τίτλος, συγγραφέας, εκδότης, ISBN\" 
                                    onfocus=\"doClear(this, 'τίτλος, συγγραφέας, εκδότης, ISBN')\"
                                />
                                <input 
                                    id=\"searchButton\"
                                    name=\"searchButton\"
                                    type=\"image\" 
                                    src=\"./images/search.gif\" 
                                    alt=\"Αναζήτηση\" 
                                />
                            </fieldset>
                        </form>
                        <!-- TODO: na balw to link gia thn anazhthsh -->
                        <span class=\"compositeSearch\"><a href=\"advanced_search.php\">Σύνθετη Αναζήτηση</a></span>
                    </div>  <!-- search ends -->
                    <img src=\"./images/rightBg.png\" class=\"rightBg\" alt=\"\"/>
                </div>  <!-- search ends -->

                <div class=\"shoppingCartStyle\">  <!-- shoppingCart -->
                    <img src=\"./images/leftBg.png\" class=\"leftBg\" alt=\"\"/>
                    <div class=\"shoppingCart\"><!-- cart -->
                                        <p>($numberOfCartItems προϊόντα)</p>
                        <!-- TODO Na bale to swsto link gia to pou 8a paei to kala8i-->
                        <a href=\"#\"><img src=\"./images/shoppingcart.png\" alt=\"Αγορά\"/></a>

                    </div>  <!-- cart ends -->
                    <img src=\"./images/rightBg.png\" class=\"rightBg\" alt=\"\"/>
                </div>  <!-- shoppingCart ends -->

                <div class=\"helpStyle\">
                    <img src=\"./images/leftBg.png\" class=\"leftBg\" alt=\"\"/>
                    <div class=\"help\"><!-- cart -->
                        <!-- TODO Na bale to swsto link gia to pou 8a paei to kala8i-->
                        <p>Bοήθεια</p>
                        <a href=\"#\"><img src=\"images/question_mark.png\" alt=\"Bοήθεια\"/> </a>

                        <!-- <span class=\"helpLink\"> <p>Bοήθεια</p></span> -->
                    </div>  <!-- cart ends -->

                    <img src=\"./images/rightBg.png\" class=\"rightBg\" alt=\"\"/>
                </div>
            </div>  <!-- standartFileds ends -->
        ";    
    }
    
    //------------------------------------------------------------
    
    private function IsActivePage ($activePage, $pageURL, $pageTitle, $isRightElement = false){
        $class = "class='headerMenu'";
		$rightElement = '';
		
		if ($isRightElement)
			$rightElement = "rightElement";
		
        if ($activePage == $pageURL)
            $class = "class='headerMenuSelected'";
		
        echo "<li class=\"headerMenu $rightElement\"><a $class href='$pageURL'>$pageTitle</a></li>\n\t\t";
    }
    
    //------------------------------------------------------------
    
    public function ProduceHeaderMenu ($activePage){              
        echo "
            <div id=\"headerMenuStyle\">    <!-- headerMenuStyle -->
                <a href=\"#crumb\" class=\"skipButton\">Μετάβαση στους συνδέσμους πλοήγησης</a>
                <ul class=\"headerMenu\">\n";    
                    $this->IsActivePage ($activePage, 'index.php', 'Αρχική σελίδα');
                    $this->IsActivePage ($activePage, '#', 'Ο λογαριασμός μου');
                    $this->IsActivePage ($activePage, '#', 'Εγγραφή');
                    $this->IsActivePage ($activePage, '#', 'Ποιοί είμαστε');
                    $this->IsActivePage ($activePage, '#', 'Είσοδος');
                    $this->IsActivePage ($activePage, '#', 'FAQ');
                    $this->IsActivePage ($activePage, '#', 'Site map', true);
        echo " 
                </ul>
            </div>  <!-- headerMenu ends -->          
        ";
    }
    

    
}



?>
