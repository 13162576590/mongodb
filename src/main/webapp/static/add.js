$(function() {
	$.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		if (results) {
			return results[1] || 0;
		}
	}
	
	var id = $.urlParam('id');
	
	if (id) {
		$('#add').html('修改');
		$.ajax({
	        url: 'find',        
	        method: 'GET',
	        data: {
	       	 id: id
	        }
	    }).done(function(data) {
	    	var data = data.data;
	    	$('#id').val(data.id);
	    	$('#name').val(data.name);
			$('#address').val(data.address);
	    }).fail(function() {
	        
	    });
	}
	
	$('#add').on('click', function(){
		var params = {};
		params.name = $('#name').val();
		params.address = $('#address').val();
		
		if (id) {
			params.id= id;
			$.ajax({
		         url: 'update',        
		         method: 'POST',
		         data: params
		     }).done(function(data) {
		    	window.location.href = 'list.html';
		     }).fail(function() {
		         
		     });
		} else {
			 $.ajax({
		         url: 'save',        
		         method: 'POST',
		         data: params
		     }).done(function(data) {
		    	window.location.href = 'list.html';
		     }).fail(function() {
		         
		     });
		}
	});
		 
});
