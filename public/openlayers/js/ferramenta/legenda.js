function addLegenda(div, auto) {
	
	//Pontos do mapa
	let iconPequeno = 'assets/images/verde.png';
	let iconMedio = 'assets/images/amarelo.png';
	let iconGrande = 'assets/images/azul.png';

	let html = '';

	html += '<div id="conteiner-layerSwitch" title="Produção de Biogás">';
	html += '<p class="mdl-card__subtitle-text" style="font-size: 12px;"><img src="'+iconPequeno+'" border="0" alt="icon_pequeno"> <b>Pequeno</b> (< 2.500 m³/dia)</p>';
	html += '<hr>';
	html += '<p class="mdl-card__subtitle-text" style="font-size: 12px;"><img src="'+iconMedio+'" border="0" alt="icon_medio"> <b>Médio</b> (2.501 a 12.500 m3/dia)</p>';
	html += '<hr>';
	html += '<p class="mdl-card__subtitle-text" style="font-size: 12px;"><img src="'+iconGrande+'" border="0" alt="icon_grande"> <b>Grande</b> ( > 12.501 m3/dia)</p>';

	html += '</div>';

	div.html(html);

	//instanciar dialog
	$("#conteiner-layerSwitch").dialog({ 
		position: {my: 'right bottom', at: 'right bottom-100', of: window},
		width : 231, 
		autoOpen : false, 
		resizable: false,
		draggable: true,
		dialogClass: 'legenda-dialog'});
		
}

//Abre o modal de camadas
function openLegenda() {
	
	$(".ui-dialog-titlebar-close").addClass("btn btn-success");

	$(".ui-dialog-titlebar-close").html('<span class="glyphicon glyphicon-remove"></span> ');
	
	$("#conteiner-layerSwitch").dialog("open");

}