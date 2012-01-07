/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var prevId = 0;
var idsArray = []; // the recognized ids
var activeWonder = null;

//------------------------------------------------------------------------------

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
    value = value.replace(/\+/g," ");   // Convert "+"s to " "s
    value = value.replace('#',"");      // Convert "#" to ""
    return value;
}

//------------------------------------------------------------------------------

function loadBook() {  
    $("#mybook").booklet({
        name:               "The new Seven Wonders of the World",
        speed:              1500,
        width:              900,
        height:             600,
        startingPage:       0,
        closed:             true,
        covers:             true,
        next:               $('#next_page_button'),     // selector for element to use as click trigger for next page
        prev:               $('#prev_page_button'),     // selector for element to use as click trigger for previous page
        manual:             false,
        hovers:             false,                      // enables preview pageturn hover animation, shows a small preview of previous or next page on hover
        overlays:           false
    });
	loadMultimedia();
    
    var times = Math.floor(( (prevId = getValue('pageId'))-479)/2);
    if (times > 0)
            $(document).everyTime(1600, function() {$('#mybook').booklet("next");}, times);
}

function updateURL () {
	window.location.hash = "new pageId=" + prevId;
}

//------------------------------------------------------------------------------

function loadMultimedia() {
	$.ajax({
		type: "GET",
		url: "data.xml",
		dataType: "xml",
		success: parseXml
	});
}

//------------------------------------------------------------------------------

function parseXml(xml) {

	$(xml).find("multimedia").each(function() {
		switch($(this).attr('for')) {
			case 'chichenItza': 
				$("#chichenItzaVideo").attr('src', $(this).find("video").text()); 
				break;
			case 'greatWallOfChina': 
				$("#greatWallOfChinaVideo").attr('src', $(this).find("video").text()); 
				break;
				case 'statueOfChristTheRedeemer': 
				$("#statueOfChristTheRedeemerVideo").attr('src', $(this).find("video").text()); 
			break;
			case 'colosseum': 
				$("#colosseumVideo").attr('src', $(this).find("video").text()); 
				break;
			case 'petra': 
				$("#petraVideo").attr('src', $(this).find("video").text()); 
				break;
			case 'tajMahal': 
				$("#tajMahalVideo").attr('src', $(this).find("video").text()); 
				break;
			case 'machuPicchu': 
				$("#machuPicchuVideo").attr('src', $(this).find("video").text()); 
				break;			
		}
	});
}

//------------------------------------------------------------------------------

function onClick (wonder) { 
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

function processChunk(i)  {
    $.ajax({
        type: "GET",
        url: "http://www.csd.uoc.gr/~hy564/idsBook.php",
        data: "",
        contentType: "application/json; charset=utf-8",
        dataType: "json",	
        success: function (data) {processJson(data, i);} 
    });			  
}

//------------------------------------------------------------------------------

function getNumberOfFlip (dif) {
    if (dif % 2 != 0)
        ++dif;
    return dif / 2;
}

//------------------------------------------------------------------------------

function processJson(data, idx) {		
    $.each(data, function(i, item){
        idsArray = item;
    });		

    // if the new id is the same as the previous id, do not change the contents of the page
    if(idsArray[0] != prevId) {
        if (idsArray[0] < prevId)
            $(document).everyTime(1600, function() {$('#mybook').booklet("prev");}, getNumberOfFlip(prevId - idsArray[0]));
        else
            $(document).everyTime(1600, function() {$('#mybook').booklet("next");}, getNumberOfFlip(idsArray[0] - prevId));
        prevId = idsArray[0];
		updateURL();
    }
}

//------------------------------------------------------------------------------

$(document).ready(function(){
    jQuery.support.cors = true;
    $(document).everyTime("10s", processChunk, 0);
    
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
    
    $("#prev_page_button").click(function (){
        if (prevId == 480)
            return;
        
        if (prevId == 481)
            prevId = 480;
        else
            prevId = parseInt(prevId) - 2;
		updateURL();
    });
    $("#next_page_button").click(function (){
        if (prevId == 489)
            return;

        if (prevId == 480)
            prevId = 481;
        else
            prevId = parseInt(prevId) + 2;
		updateURL();
    });
    
    
    $("#chichenItzaImg").click(function (){
        onClick("#chichenItzaPopup");
    });
    
    $("#greatWallOfChinaImg").click(function (){
        onClick("#greatWallOfChinaPopup");
    });    
    
    $("#statueOfChristTheRedeemerImg").click(function (){
        onClick("#statueOfChristTheRedeemerPopup");
    });     
    
    $("#colosseumImg").click(function (){
        onClick("#colosseumPopup");
    });       
    
    $("#petraImg").click(function (){
        onClick("#petraPopup");
    });  

    $("#tajMahalImg").click(function (){
        onClick("#tajMahalPopup");
    });  
    
    $("#machuPicchuImg").click(function (){
        onClick("#machuPicchuPopup");
    });  
});


