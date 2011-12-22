/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function setTooltipToLeft (){
    $('.tipFooter').css({
        "left"      : -10,
        "float"     : "right",
        "background": "url(images/left.png) no-repeat"
    });     
}

function setTooltipToRight () {
    $('.tipFooter').css({
        "left"      : 10,
        "float"     : "left",
        "background": "url(images/right.png) no-repeat"
    });     
}

function setTooltipPosition (target) {
	
	
    var w = $('#tooltip').width();
    var h = $('#tooltip').height() + 10;    //10 height of bubble triangle
   
    //tooltip at right
    if (target.offsetLeft + $(target).width() + w < $(window).width()) {
        $('#tooltip').css('left', $(target).width() );
        setTooltipToRight();
    }
    else {  //tooltip at left
        $('#tooltip').css('left', -w );
        setTooltipToLeft();   
    }
    
    if (target.offsetTop - h > 0 ) {
        $('#tooltip').css('top', -h );
    }
    else
        $('#tooltip').css('top', -target.offsetTop );
	
    $('.tipFooter').css({
        "position"  : "relative",
        "top"       : 0,
        "display"	: "block",  
        "width"		: 14,
        "height"	: 14
    }); 
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
        $(this).append('<div id="tooltip"><div class="tipHeader"></div><div class="tipBody">' + tip + '</div><div class="tipFooter"></div></div>');     
        
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

