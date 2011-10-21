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

        <div class="leftContent">   <!-- leftContent -->
            <div class="titleBox"><strong>Κατηγορίες</strong></div>
            <a href="#" class="skipButton">Μετάβαση στο περιεχόμενο</a>
            <a name="categoryMenu"></a>
            <ul class="categoryMenu">
                <!--    To categoryMenuSelected den prepei na uparxei mesa sthn arxikh selida 
                        8a epilegete mono otan exoume epile3ei mia katigoria.
                        Sthn arxikh selida 8a ginetai link ?
                -->
                <li class="categoryMenuSelected">Όλα τα βιβλία</li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Μυθιστόρημα</a>          </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Κλασσική Λογοτεχνία</a>  </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Επιστ.Φαντασία</a>       </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Fantasy</a>              </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Ιστορία</a>              </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Βιογραφίες</a>           </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Μονογραφίες</a>          </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Μυστικισμός</a>          </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Τεχνολογία</a>           </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Διάφορα</a>              </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Παιδική Λογοτεχνία</a>   </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Δοκίμιο</a>              </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Χιούμορ</a>              </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Εκπαίδευση</a>           </li>
                <li class="categoryMenu"><a href="index.html" class="categoryMenu">Manga</a>                </li>           
            </ul>
        </div>  <!-- leftContent ends -->


        <div class="centerContent">   <!-- centerContent -->
            <a name="content"></a>
            

        <div class="post">
            <h1><span class="text">Τελευταίες Προσθήκες</span></h1>
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
    <? require_once 'footer.php';?>
    <div class="clear"></div>
    
</div>  <!-- main_container ends -->
</body>

</html>
