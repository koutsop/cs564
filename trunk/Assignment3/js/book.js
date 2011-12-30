/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function getValue(varname) {
    var url = window.location.href;
    var qparts = url.split("?");
    
    if (qparts.length == 0) // Check that there is a querystring, return "" if not
        return "";
    
    var query = qparts[1];
    var vars = query.split("&");
    var value = "";

    for (var i in vars) {
        var parts = vars[i].split("=");
        if (parts[0] == varname) {
            value = parts[1];
            break;
        }
    }
    value = unescape(value);
    value.replace(/\+/g," ");   // Convert "+"s to " "s

    return value;
}

function loadBook() {  
    $("#mybook").booklet({
        name:               "The new Seven Wonders of the World",
        speed:              1500,
        width:              900,
        height:             600,
        startingPage:       0,
        closed:             true,
        covers:             true,
        next:               $('#next_page_button'),          			// selector for element to use as click trigger for next page
        prev:               $('#prev_page_button'),          			// selector for element to use as click trigger for previous page
        manual:             false,
        hovers:             false,                            // enables preview pageturn hover animation, shows a small preview of previous or next page on hover
        overlays:           false
    });
    
    var times = Math.floor((getValue('pageId'))/2);
    if (times > 0)
            $(document).everyTime(1600, function() {$('#mybook').booklet("next");}, times);
   /* $('#mybook').booklet({
        name:               null,             // name of the booklet to display in the document title bar
        width:              800,              // container width
        height:             500,              // container height
        speed:              1500,             // speed of the transition between pages
        direction:          'LTR',            // direction of the overall content organization, default LTR, left to right, can be RTL for languages which read right to left
        startingPage:       0,                // index of the first page to be displayed
        easing:             'easeInOutQuad',  // easing method for complete transition
        easeIn:             'easeInQuad',     // easing method for first half of transition
        easeOut:            'easeOutQuad',    // easing method for second half of transition

        closed:             true,             // start with the book "closed", will add empty pages to beginning and end of book
        closedFrontTitle:   null,             // used with "closed", "menu" and "pageSelector", determines title of blank starting page
        closedFrontChapter: null,             // used with "closed", "menu" and "chapterSelector", determines chapter name of blank starting page
        closedBackTitle:    null,             // used with "closed", "menu" and "pageSelector", determines chapter name of blank ending page
        closedBackChapter:  null,             // used with "closed", "menu" and "chapterSelector", determines chapter name of blank ending page
        covers:             false,            // used with  "closed", makes first and last pages into covers, without page numbers (if enabled)

        pagePadding:        10,               // padding for each page wrapper
        pageNumbers:        true,             // display page numbers on each page

        hovers:             false,            // enables preview pageturn hover animation, shows a small preview of previous or next page on hover
        overlays:           false,            // enables navigation using a page sized overlay, when enabled links inside the content will not be clickable
        tabs:               false,            // adds tabs along the top of the pages
        tabWidth:           60,               // set the width of the tabs
        tabHeight:          20,               // set the height of the tabs
        arrows:             false,            // adds arrows overlayed over the book edges
        cursor:             'pointer',        // cursor css setting for side bar areas

        hash:               false,            // enables navigation using a hash string, ex: #/page/1 for page 1, will affect all booklets with 'hash' enabled
        keyboard:           true,             // enables navigation with arrow keys (left: previous, right: next)
        next:               $bttn_next,       // selector for element to use as click trigger for next page
        prev:               $bttn_prev,       // selector for element to use as click trigger for previous page

        menu:               null,             // selector for element to use as the menu area, required for 'pageSelector'
        pageSelector:       false,            // enables navigation with a dropdown menu of pages, requires 'menu'
        chapterSelector:    false,            // enables navigation with a dropdown menu of chapters, determined by the "rel" attribute, requires 'menu'

        shadows:            true,             // display shadows on page animations
        shadowTopFwdWidth:  166,              // shadow width for top forward anim
        shadowTopBackWidth: 166,              // shadow width for top back anim
        shadowBtmWidth:     50,               // shadow width for bottom shadow

        before:             function(){},     // callback invoked before each page turn animation
        after:              function(){}      // callback invoked after each page turn animation        
    });*/
}


var activeWonder = null;

function onHover (wonder) { 
    activeWonder = wonder;
    centerPopup(wonder);								//centering with css 
    loadPopup(wonder);									//load popup 				
}

//------------------------------------------------------------------------------

function stopVideo () {
    if (popupIsEnabled)
        $('video').each(function (videoIndex)
			{$('video')[videoIndex].pause();});
}

//------------------------------------------------------------------------------
var malakas = 0;
$(document).ready(function(){
    $(".popupClose").click(function() {
        stopVideo();
        disablePopup(activeWonder);
    });                                                 //Click the x event!

    $(".backgroundPopup").click(function() {
        stopVideo();
        disablePopup(activeWonder);
    });                                                 //Click out event! 

    $(document).keyup(function(e){                      //Pressed Escape event!
        if(e.keyCode == 27 && popupIsEnabled) {         //27 key code for ESC buton
            stopVideo();
            disablePopup(activeWonder);  
        }

    });
    
    $("#chichenItzaImg").hover(function (){
        if (malakas != 0)
            onHover("#chichenItzaPopup");
        malakas = 1;
    });

});


