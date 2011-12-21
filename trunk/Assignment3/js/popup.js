/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//SETTING UP OUR POPUP  
var popupIsEnabled = false; 

//loading popup 
function loadPopup(id){  
	//loads popup only if it is disabled  
	if(!popupIsEnabled){  
		$(".backgroundPopup").css({"opacity": "0.7"});  
		$(".backgroundPopup").fadeIn("slow");  
		$(id).fadeIn("slow");  
		popupIsEnabled = true;  
	}  
}  

//disabling popup
function disablePopup(id){  
	//disables popup only if it is enabled  
	if(popupIsEnabled){  
		$(".backgroundPopup").fadeOut("slow");  
		$(id).fadeOut("slow");  
		popupIsEnabled = false;  
	}  
} 

//centering popup  
function centerPopup(id){  
	//request data for centering  
	var windowWidth		= document.documentElement.clientWidth;  
	var windowHeight	= document.documentElement.clientHeight;  
	var popupHeight		= $(id).height();  
	var popupWidth		= $(id).width();  
	
	//centering  
	$(id).css({  
		"position": "absolute",  
		"top": windowHeight/2-popupHeight/2,  
		"left": windowWidth/2-popupWidth/2  
	});  
}

