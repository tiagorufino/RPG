/**
 * JS class with the modal functions
 * @author Tiago Rufino
 * Version 1.0
 */

/**
 * Function which configured the modal with all the possible situations
 * @param title
 * 
 */
function configModal(title){
	$.post("atributoModal.html", function(modal){
    	$("#modal-tmp").html(modal);
    	$("#myModal").modal("show");
    	$("#header-modal").html(title);
    });
}

/**
 * Change the value in the modal for the attributes
 * @param value
 * @param count
 * @param operation
 */
function changeAtributesValueInModal(value, first, second, operation){
	var check = parseInt(value.html())
	if (operation==1){
		$("#span_min_result_"+first+"_"+second).hide();
		if (check <9){
			value.html(check+1);
		} else if (check == 9){
			value.html(check+1);
			$("#span_max_result_"+first+"_"+second).show();
		} else {
			$("#span_max_result_"+first+"_"+second).show();
		}
	} else if (operation==0){
		$("#span_max_result_"+first+"_"+second).hide();
		if(check > -9){
			value.html(check-1);
		} else if (check == (-9)){
			value.html(check-1);
			$("#span_min_result_"+first+"_"+second).show();
		} else{
			$("#span_min_result_"+first+"_"+second).show();
		}

	}
}

/**
 * reset the attributes in the modal
 * @param value
 * @param count
 * @returns hide the max and min campus
 */
function reset(value, first, second){
	value.html(0);
	$("#span_max_result_"+first+"_"+second).hide();
	$("#span_min_result_"+first+"_"+second).hide();
}