<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="el"  lang="el">
<head>
    <meta http-equiv ="Content-Language" content="el" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <title>Αccessible-Βookstore: Αρχική Σελίδα</title>

    <script type="text/JavaScript">
    <!--
	    function doClear(theText, defaultValue) {
		    if (theText.value == defaultValue)
			    theText.value = "";
	    }
    //-->
    </script>
</head>

<body>
<div id="main_container">   <!-- main_container -->
    <a name="top"></a>
  

    <?php 
        require_once 'HeadProducer.php';  
        $producer = new HeadProducer();
        $producer->ProduceHeader("index.php");
    ?>

    <div class="clear"></div>

    <div id="mainContent">  <!-- mainContent -->    
        
		<div id="crumbContainer">   <!-- crumbContainer -->
            <a href="#" class="skipButton">Μετάβαση στο μενού κατηγορίες</a>
            <a name="crumb"></a>
            <ul class="crumb">
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
                <li class= "crumb">></li>
                <li class= "crumb"><a href="index.html" class="crumb">Αρχική σελίδα</a></li>
            </ul>         
        </div>  <!-- crumbContainer -->

        <div class="clear"></div>

		<?php
			require_once 'CategoryMenuProducer.php';
			$producer = new CategoryMenuProducer();
			$producer->ProduceCategoryMenu("index.php");
		?>
        

        <div class="centerContent">   <!-- centerContent -->
            <a name="content"></a>
            

        <div class="post">
            <h1><span class="text">Τελευταίες Προσθήκες</span></h1>
                <div class="postContent">
                    <div class="box">
                        <div class="boxContents">
							<div class="frame">
								<a href="#" title="ΜΑΤΩΜΕΝΑ ΙΧΝΗ"><img src="images/books/matwmena_ixnh.jpg" alt=""/></a>
								<div class="text">
									
									<strong style="font: left"><a class="booLink" href="#">ΜΑΤΩΜΕΝΑ ΙΧΝΗ</a></strong>
									<br />
									<a class="booLink" href="#">ΜΑΤΩΜΕΝΑ ΙΧΝΗ</a>
									<br />
									<span style="float:left">
									<strong>Συγγραφέας</strong>: ΧΕΝΙΝΓΚ ΜΑΝΚΕΛ 
									€ 11,99</span>
								</div>
							</div>
                        </div>
                    </div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                    <div class="clear"></div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                </div>
            <div class="clear"></div>
            <div class="postFooter"></div>
        </div>

        <div class="clear"></div>
        
        <div class="post">
            <h1><span class="text"> Το Accesible-Bookstore Προτείνε</span></h1>
                <div class="postContent">
                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>

                    <div class="box">
                        <div class="boxContents">
                            <p>eisai enas malakas kai den 3ereis ti les kai ti kaneis</p>
                        </div>
                    </div>
                    
                </div>
            <div class="clear"></div>
            <div class="postFooter"></div>
        </div>

        <div class="clear"></div>

        </div>  <!-- centerContent ends -->
    </div>  <!-- mainContent ends -->


    <div class="clear"></div>
    <?php 
		require_once 'FooterProducer.php';
		$producer = new FooterProducer();
		$producer->ProduceFooter();
	?>
    <div class="clear"></div>
    
</div>  <!-- main_container ends -->
</body>

</html>
