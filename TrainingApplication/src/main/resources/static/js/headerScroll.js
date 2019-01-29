/*! jQuery v2.1.4 | (c) 2005, 2015 jQuery Foundation, Inc. | jquery.org/license */

		window.onscroll = function () {
			myFunction();
		}		
		function myFunction() {
		    if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
		    	//alert("dupa");
		    	$(".navbar-inverse").css("background", "#1a1a1a");
		    } else {
		    	
		    	$(".navbar-inverse").css("background","transparent");
		    }
		}