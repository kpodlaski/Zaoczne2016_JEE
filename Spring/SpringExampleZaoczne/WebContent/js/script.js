/**
 * 
 */
$(document).ready(function(){
	$("button").click(function(){
		$.post("mvc/hello/Adam,Tomaszewski.json", function(data, status){
			alert("Otrzymałem " + data.info + "\nStatus: " + status);
		});
	});

});