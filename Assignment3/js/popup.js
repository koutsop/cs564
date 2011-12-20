/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//SETTING UP OUR POPUP  
var popupIsEnabled = false; 

//loading popup with jQuery magic!  
function loadPopup(){  
	//loads popup only if it is disabled  
	if(!popupIsEnabled){  
		$("#backgroundPopup").css({"opacity": "0.7"});  
		$("#backgroundPopup").fadeIn("slow");  
		$("#popupContact").fadeIn("slow");  
		popupIsEnabled = true;  
	}  
}  

//disabling popup with jQuery magic!  
function disablePopup(){  
	//disables popup only if it is enabled  
	if(popupIsEnabled){  
		$("#backgroundPopup").fadeOut("slow");  
		$("#popupContact").fadeOut("slow");  
		popupIsEnabled = false;  
	}  
} 

//centering popup  
function centerPopup(){  
	//request data for centering  
	var windowWidth		= document.documentElement.clientWidth;  
	var windowHeight	= document.documentElement.clientHeight;  
	var popupHeight		= $("#popupContact").height();  
	var popupWidth		= $("#popupContact").width();  
	
	//centering  
	$("#popupContact").css({  
		"position": "absolute",  
		"top": windowHeight/2-popupHeight/2,  
		"left": windowWidth/2-popupWidth/2  
	});  
	
	//only need force for IE6  
	$("#backgroundPopup").css({"height": windowHeight});  
}

