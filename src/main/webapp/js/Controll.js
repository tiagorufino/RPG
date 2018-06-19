/**
 * Rest controll class
 * @author Tiago Rufino
 * @returns
 */


/**
 * Login Function
 * @type GET
 * @return result
 */
function login(){
	
	$.ajax({
	    type: "GET",
	    contentType: "application/json; charset=utf-8",
	    dataType: "json",
	    url: 'http://localhost:8080/RPG/rest/service/login?login='+$('#login').val()+'&password='+$('#password').val(),
	    success: function (data) {
	    	$('#result').html(data.result);
	    	if (data.result==""){
	    		document.cookie="result="+data.result+";";
	    		window.location.href = "http://localhost:8080/RPG/pages/main.html";
	    	} 
	    },
	    error: function (xhr) {
	        SecurityControl.trataError(xhr);
	    }
	})
}

/**
 * Attributes function. (will be changed for ficha function where will upload all the information
 * @Type GET
 * @param title
 * @returns object (call a new function for organize this.
 */
function atributos(title){
	
	$.ajax({
		type: "GET",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		url: 'http://localhost:8080/RPG/rest/service/loadAtributos',
		success: function (data) {
			setForm(data);
			configModal(title);
		},
		error: function (xhr) {
			SecurityControl.trataError(xhr);
		}
	});
}	


function setForm(data){
	$('#tipoPayerValue').val(data.tipoPlayer);
	$('#result').val(data.result);
	
	$('#fisicoTitulo').html("Físico");
	
	$('#forca').html(data.atributos.fisico.forca);
	if(data.atributos.fisico.forca==10){
		$("#span_max_result_1_1").show();
		$("#span_min_result_1_1").hide();
	} else if (data.atributos.fisico.forca==(-10)){
		$("#span_min_result_1_1").show();
		$("#span_max_result_1_1").hide();
	} else {
		$("#span_max_result_1_1").hide();
		$("#span_min_result_1_1").hide();
	}
	$('#forcaTitulo').html("Força");
	$('#destreza').html(data.atributos.fisico.destreza);
	if(data.atributos.fisico.destreza==10){
		$("#span_max_result_1_2").show();
		$("#span_min_result_1_2").hide();
	} else if (data.atributos.fisico.destreza==(-10)){
		$("#span_min_result_1_2").show();
		$("#span_max_result_1_2").hide();
	} else {
		$("#span_min_result_1_2").hide();
		$("#span_max_result_1_2").hide();
	}
	$('#destrezaTitulo').html("Destreza");
	$('#vigor').html(data.atributos.fisico.vigor);
	if(data.atributos.fisico.vigor==10){
		$("#span_max_result_1_3").show();
		$("#span_min_result_1_3").hide();
	} else if(data.atributos.fisico.vigor==-(-10)){
		$("#span_min_result_1_3").show();
		$("#span_max_result_1_3").hide();
	} else {
		$("#span_min_result_1_3").hide();
		$("#span_max_result_1_3").hide();
	}
	$('#vigorTitulo').html("Vigor");

	//segunda coluna
	$('#manipulacao').html(data.atributos.social.manipulacao);
	if(data.atributos.social.manipulacao==10){
		$("#span_max_result_2_1").show();
		$("#span_min_result_2_1").hide();
	} else if(data.atributos.social.manipulacao==(-10)){
		$("#span_min_result_2_1").show();
		$("#span_max_result_2_1").hide();
	} else {
		$("#span_min_result_2_1").hide();
		$("#span_max_result_2_1").hide();
	}
	$('#manipulacaoTitulo').html("Manipulação");
	$('#carisma').html(data.atributos.social.carisma);
	if(data.atributos.social.carisma==10){
		$("#span_max_result_2_2").show();
		$("#span_min_result_2_2").hide();
	} else if(data.atributos.social.carisma==(-10)){
		$("#span_min_result_2_2").show();
		$("#span_max_result_2_2").hide();
	} else {
		$("#span_min_result_2_2").hide();
		$("#span_max_result_2_2").hide();
	}
	$('#carismaTitulo').html("Carisma");
	$('#aparencia').html(data.atributos.social.aparencia);
	if(data.atributos.social.aparencia==10){
		$("#span_max_result_2_3").show();
		$("#span_min_result_2_3").hide();
	} else if (data.atributos.social.aparencia==(-10)){
		$("#span_min_result_2_3").show();
		$("#span_max_result_2_3").hide();
	} else {
		$("#span_min_result_2_3").hide();
		$("#span_max_result_2_3").hide();
	}
	$('#aparenciaTitulo').html("Aparência");
	
	//terceira coluna
	$('#percepcao').html(data.atributos.mental.percepcao);
	if(data.atributos.mental.percepcao==10){
		$("#span_max_result_3_1").show();
		$("#span_min_result_3_1").hide();
	} else if (data.atributos.mental.percepcao==(-10)){
		$("#span_min_result_3_1").show();
		$("#span_max_result_3_1").hide();
	} else {
		$("#span_min_result_3_1").hide();
		$("#span_max_result_3_1").hide();
	}
	$('#percepcaoTitulo').html("Percepção");
	$('#inteligencia').html(data.atributos.mental.inteligencia);
	if(data.atributos.mental.inteligencia==10){
		$("#span_max_result_3_2").show();
		$("#span_min_result_3_2").hide();
	} else if (data.atributos.mental.inteligencia==(-10)){
		$("#span_min_result_3_2").show();
		$("#span_max_result_3_2").hide();
	} else {
		$("#span_min_result_3_2").hide();
		$("#span_max_result_3_2").hide();
	}
	$('#inteligenciaTitulo').html("Inteligência");
	$('#raciocinio').html(data.atributos.mental.raciocinio);
	if(data.atributos.mental.raciocinio==10){
		$("#span_max_result_3_3").hide();
		$("#span_min_result_3_3").show();
	} else if (data.atributos.mental.raciocinio==(-10)){
		$("#span_min_result_3_3").hide();
		$("#span_max_result_3_3").show();
	} else {
		$("#span_min_result_3_3").hide();
		$("#span_max_result_3_3").hide();
	}
	$('#raciocinioTitulo').html("Raciocínio");
}