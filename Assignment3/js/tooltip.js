/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var arrowsSize = 28;

function setTooltipToLeft (){
    $('.tipFooter').css({
        "left"      : -10,
        "float"     : "right",
        "background": "url(images/left.png) no-repeat",
        "position"  : "relative",
        "top"       : 0,
        "display"	: "block",  
        "width"		: arrowsSize,
        "height"	: arrowsSize        
    });     
}

function setTooltipToRight () {
    $('.tipFooter').css({
        "left"      : 10,
        "float"     : "left",
        "background": "url(images/right.png) no-repeat",
        "position"  : "relative",
        "top"       : 0,
        "display"	: "block",  
        "width"		: arrowsSize,
        "height"	: arrowsSize        
    });     
}

function setTooltipToLeftHor (h){
    $('.rightTipBody').css({
        "position"  : "absolute",
        "top"       : h/2 - arrowsSize/2,          //edw na to ala3w
        "display"	: "block",  
        "width"		: arrowsSize,
        "height"	: arrowsSize,
        "left"      : 200,          //oso to width pou 8a exei to tooltip
        "float"     : "left",
        "background": "url(images/rightHorizontal.png) no-repeat"      
    });     
}

function setTooltipToRightHor (h) {
    $('.leftTipBody').css({
        "position"  : "absolute",
        "top"       : h/2 - arrowsSize/2,          //edw na to ala3w
        "display"	: "block",  
        "width"		: arrowsSize,
        "height"	: arrowsSize,
        "left"      : -arrowsSize, //oso to mege8os tou icon
        "float"     : "left",
        "background": "url(images/leftHorizontal.png) no-repeat"      
    });         
}

function setTooltipPosition (target) {
	var isRight = false;
    var w       = $('#tooltip').width();
    var h       = $('#tooltip').height();
   
    //tooltip at right
    if (target.offsetLeft + $(target).width() + w < $(window).width())
        isRight = true;

    if (target.offsetTop - (h+arrowsSize) > 0 ) {   //xwraei sto para8iro
        $('#tooltip').css('top', -(h+arrowsSize) );
        if (isRight) {
            $('#tooltip').css('left', $(target).width());
            setTooltipToRight();
        }
        else {
            $('#tooltip').css('left', -w);
            setTooltipToLeft(); 
        }
        
    }
    else {  //problhma den xwraei
        $('#tooltip').css('top', -((h - $(target).height())/2) ); 
        if (isRight) {
            $('#tooltip').css('left', $(target).width() + arrowsSize);
            setTooltipToRightHor(h);
        }
        else {
            $('#tooltip').css('left', -w -arrowsSize);
            setTooltipToLeftHor(h); 
        }        
    } 
}

$(document).ready(function() {
	
	$('.myTooltip').live("mouseover", function () {$('#tooltip').fadeIn('slow');});
    //Select all anchor tag with rel set to tooltip
    $('.myTooltip').mouseover(function(e) {  
        //Grab the title attribute's value and assign it to a variable
        var tip = $(this).attr('title');    
         
        //Remove the title attribute's to avoid the native tooltip from the browser
        $(this).attr('title','');
         
        //Append the tooltip template and its value
        $(this).append(
            '<div id="tooltip">\
                <div class="tipHeader"></div>\
                <div class="tipCenter">\
                    <div class="leftTipBody"></div>\
                    <div class="tipBody">'
                        + tip +
                    '</div>\
                    <div class="rightTipBody"></div>\
                </div>\
                <div class="tipFooter"></div>\
            </div></div>');        
        
        setTooltipPosition(e.currentTarget);    
    }).mousemove(function(e) {
        //Keep changing the X and Y axis for the tooltip, thus, the tooltip move along with the mouse
        //$('#tooltip').css('top', e.pageY + 10 );
        //$('#tooltip').css('left', e.pageX + 20 );
         
    }).mouseout(function() {
        //Put back the title attribute's value
        $(this).attr('title',$('.tipBody').html());
     
        //Remove the appended tooltip template
        $(this).children('div#tooltip').remove();
    });
 
});

