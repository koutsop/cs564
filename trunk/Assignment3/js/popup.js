/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//SETTING UP OUR POPUP  
var popupIsEnabled = false; 

//------------------------------------------------------------------------------

function loadPopup(id){  
	//loads popup only if it is disabled  
	if(!popupIsEnabled){  
		$(".backgroundPopup").css({"opacity": "0.8"});  
		$(".backgroundPopup").fadeIn("slow");  
		$(id).fadeIn("slow");  
		popupIsEnabled = true;  
	}  
}  

//------------------------------------------------------------------------------

function disablePopup(id){  
	
	if(popupIsEnabled){  
		$(".backgroundPopup").fadeOut("slow");  
		$(id).fadeOut("slow");  
		popupIsEnabled = false;  
	}  
} 

//------------------------------------------------------------------------------

function centerPopup(id){  
	//request data for centering  
	var windowWidth		= window.outerWidth;
	var windowHeight	= window.outerHeight;
	var popupHeight		= $(id).height();  
	var popupWidth		= $(id).width();  
	
	//centering  
	$(id).css({  
		"position"  : "fixed",  
		"top"       : windowHeight/2-popupHeight/2,  
		"left"      : windowWidth/2-popupWidth/2,
        "opacity"   : "1",
        "z-index"   : "2147483647"
	});  
}

$(document).ready(function(){
	$(".popupClose").hover(
		function (){
			$(".popupClose").css({
				"border-color"	: "red",
				"background"	: "transparent url(images/close_icon_double.png) 0 -20px"
			});
		}, 
		function (){
			$(".popupClose").css({
				"border-color"	: "black",
				"background"	: "url(images/close_icon_double.png) 0 0"
			});
		});
});
