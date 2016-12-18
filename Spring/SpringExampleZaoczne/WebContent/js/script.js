/**
 * 
 */
$(document).ready(function(){
	$("#buttonPOST").click(function(){
		url = "mvc/hello/"+$("#imieI").val()+","+$("#nazw").val()+".json";
		$.post(url, function(data, status){
			alert("Otrzymałem " + JSON.stringify(data) + "\nStatus: " + status);
			$("#imie").text(data.person.imie);
			$("#nazwisko").text(data.person.nazwisko);
		});
	});
	
	$("#buttonPUT").click(function(){
		$.ajax({
			  url: 'mvc/hello/Adam,Tomaszewski.json',
			  type: 'PUT',
			  data: "",
			  success: function(data) {
				  $("#imie").text(data.person.nazwisko);
					$("#nazwisko").text(data.person.imie);
			  }
			});
	});
	
	

});