$(document).ready(function(){
	$("#newJoke").click(function(){
				
		 $.ajax({

             url : "/updateJoke",             
             type : "GET",

             success : function(response) {
                 $("#joke").text(response);
             },

             error : function(xhr, status, error) {
                 alert(xhr.responseText);
             }
         });
	});
});