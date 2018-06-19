/**
 * 
 */

function uploadFicha(data){
	
	$('#forcaValue').val(data.atributos.fisico.forca);
	$('#destrezaValue').val(data.atributos.fisico.destreza);
	$('#vigorValue').val(data.atributos.fisico.vigor);
	$('#total').val(data.atributos.total);
	
}