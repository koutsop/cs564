/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var activeWonder = null;

function setWonderPosition (wonder, top, left, width, height) {
    var windowWidth		= document.documentElement.clientWidth;  
    var windowHeight	= document.documentElement.clientHeight; 

    $(wonder).css({  
        "position"	: "fixed",  
        "top"		: Math.floor(left*(windowHeight/582)),		//582 image's normal width
        "left"		: Math.floor(top*(windowWidth/1024)),		//1024 image's normal height
        "width"		: (100* (width/1024)).toString() + "%",
        "height"	: (100* (height/582)).toString() + "%",
        "opacity"   : "0.0",
        "z-index"	: 1,
        "background-color" : "grey"
    });  
}

function setWondersPosition (){
    setWonderPosition("#chichenItza", 80, 279, 148, 100);
    setWonderPosition("#greatWallOfChina", 809, 158, 140, 94);
    setWonderPosition("#statueOfChristTheRedeemer", 381, 475, 144, 99);
    setWonderPosition("#colosseum", 384, 160, 148, 89);
    setWonderPosition("#petra", 538, 307, 122, 92);
    setWonderPosition("#tajMahal", 698, 324, 131, 108);
    setWonderPosition("#machuPicchu", 165, 418, 122, 107);
}

function onClick (wonder) { 
    activeWonder = wonder;
    centerPopup(wonder);								//centering with css 
    loadPopup(wonder);									//load popup 				
}

$(document).ready(function(){
    $(".popupClose").click(function()
        {disablePopup(activeWonder);});               //Click the x event!

    $(".backgroundPopup").click(function()
        {disablePopup(activeWonder);});                //Click out event! 

    $(document).keyup(function(e){                      //Pressed Escape event!
        if(e.keyCode == 27 && popupIsEnabled)           //27 key code for ESC buton
            disablePopup(activeWonder);  

    });				

    $(window).resize(function() 
        {setWondersPosition();});
    $("#chichenItza").click(function () 
        {onClick("#chichenItzaPopup");});
    $("#greatWallOfChina").click(function () 
        {onClick("#greatWallOfChinaPopup");});	
    $("#statueOfChristTheRedeemer").click(function () 
        {onClick("#statueOfChristTheRedeemerPopup");});     
    $("#colosseum").click(function () 
        {onClick("#colosseumPopup");});      
    $("#petra").click(function () 
        {onClick("#petraPopup");}); 
    $("#tajMahal").click(function () 
        {onClick("#tajMahalPopup");}); 
    $("#machuPicchu").click(function () 
        {onClick("#machuPicchuPopup");});
        
    $("#chichenItza").hover(
        function (){ $("#chichenItza").css({"opacity" : "0.6"}); }, 
        function (){ $("#chichenItza").css({"opacity" : "0.0"}); }
    );
    $("#greatWallOfChina").hover(
        function (){ $("#greatWallOfChina").css({"opacity" : "0.6"}); }, 
        function (){ $("#greatWallOfChina").css({"opacity" : "0.0"}); }
    );
    $("#statueOfChristTheRedeemer").hover(
        function (){ $("#statueOfChristTheRedeemer").css({"opacity" : "0.6"}); }, 
        function (){ $("#statueOfChristTheRedeemer").css({"opacity" : "0.0"}); }
    );
    $("#colosseum").hover(
        function (){ $("#colosseum").css({"opacity" : "0.6"}); }, 
        function (){ $("#colosseum").css({"opacity" : "0.0"}); }
    );
    $("#petra").hover(
        function (){ $("#petra").css({"opacity" : "0.6"}); }, 
        function (){ $("#petra").css({"opacity" : "0.0"}); }
    );
    $("#tajMahal").hover(
        function (){ $("#tajMahal").css({"opacity" : "0.6"}); }, 
        function (){ $("#tajMahal").css({"opacity" : "0.0"}); }
    );
    $("#machuPicchu").hover(
        function (){ $("#machuPicchu").css({"opacity" : "0.6"}); }, 
        function (){ $("#machuPicchu").css({"opacity" : "0.0"}); }
    );      
});
