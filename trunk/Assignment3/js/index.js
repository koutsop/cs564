/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var activeWonder = null;

//------------------------------------------------------------------------------

function postData (id) {
    document.goToPage.pageId.value = id ;
    document.goToPage.submit() ;    
}

//------------------------------------------------------------------------------

function setWonderPosition (wonder, top, left, width, height) {
    var windowWidth		= document.documentElement.clientWidth;  
    var windowHeight	= document.documentElement.clientHeight; 

    $(wonder).css({  
        "position"	: "fixed",  
        "top"		: Math.floor(left*(windowHeight/582)),		//582 image's normal width
        "left"		: Math.floor(top*(windowWidth/1024)),		//1024 image's normal height
        "width"		: (100* (width/1024)).toString() + "%",
        "height"	: (100* (height/582)).toString() + "%",
        "z-index"	: 1,
        "background-color" : "rgba(105, 105, 105, rgba(105, 105, 105, 0.0))"
    });  
}

//------------------------------------------------------------------------------

function setWondersPosition (){
    setWonderPosition("#chichenItza", 80, 279, 148, 100);
    setWonderPosition("#greatWallOfChina", 809, 158, 140, 94);
    setWonderPosition("#statueOfChristTheRedeemer", 381, 475, 144, 99);
    setWonderPosition("#colosseum", 384, 160, 148, 89);
    setWonderPosition("#petra", 538, 307, 122, 92);
    setWonderPosition("#tajMahal", 698, 324, 131, 108);
    setWonderPosition("#machuPicchu", 165, 418, 122, 107);
}

//------------------------------------------------------------------------------

function stopVideo () {
    if (popupIsEnabled)
        $('video').each(function (videoIndex)
			{$('video')[videoIndex].pause();});
}

//------------------------------------------------------------------------------

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

    $(window).resize(function() { setWondersPosition(); });
    $("#chichenItza").click(function ()                 { postData(481); });
    $("#greatWallOfChina").click(function ()            { postData(482); });	
    $("#statueOfChristTheRedeemer").click(function ()   { postData(483); });     
    $("#colosseum").click(function ()                   { postData(484); });      
    $("#petra").click(function ()                       { postData(485); }); 
    $("#tajMahal").click(function ()                    { postData(486); }); 
    $("#machuPicchu").click(function ()                 { postData(487); });
        
    $("#chichenItza").hover(
        function (){$("#chichenItza").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#chichenItza").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );
    $("#greatWallOfChina").hover(
        function (){$("#greatWallOfChina").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#greatWallOfChina").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );
    $("#statueOfChristTheRedeemer").hover(
        function (){$("#statueOfChristTheRedeemer").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#statueOfChristTheRedeemer").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );
    $("#colosseum").hover(
        function (){$("#colosseum").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#colosseum").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );
    $("#petra").hover(
        function (){$("#petra").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#petra").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );
    $("#tajMahal").hover(
        function (){$("#tajMahal").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#tajMahal").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );
    $("#machuPicchu").hover(
        function (){$("#machuPicchu").css({"background-color" : "rgba(105, 105, 105, 0.6)"});}, 
        function (){$("#machuPicchu").css({"background-color" : "rgba(105, 105, 105, 0.0)"});}
    );      
});
