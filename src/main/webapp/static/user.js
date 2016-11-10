$(function() {
	 $.ajax({
         url: 'find/all',        
         method: 'GET'
     }).done(function(data) {
    	 var $userTmpl = _.template($('#user-tpl').html());
         $('.user-list').html($userTmpl({
             data: data.data
         }));
     }).fail(function() {
         
     });
	 
		$('#table').on('click', '.delete', function(){
			var $this = $(this);
			 $.ajax({
		         url: 'delete',        
		         method: 'POST',
		         data: {
		        	 id: $this.data('userid')
		         }
		     }).done(function(data) {
		    	 $this.closest('.user-row').remove();
		     }).fail(function() {
		         
		     });
		});
		
		$('#table').on('click', '.update', function(){
			var $this = $(this);
			window.location.href="add.html?id="+$this.data('userid');	
		});
	 
});
