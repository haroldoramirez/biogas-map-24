function addPopup() {
	
	//Botao ao fechar o popup
	$('#popup-closer').click(function() {
		
		overlay.setPosition(undefined);
		$('#popup-closer').blur();
		
		return false;
	});
		
	//Evento ao clicar no ponto do mapa
	map.on('click', function(evt) {
			
		//
		var feature = map.forEachFeatureAtPixel(evt.pixel, function(feature, layer) {
			
			return feature;
			
		});
				
		//Verificador quando clickado no ponto do mapa
		if (feature) {
												
			//Coordenada para carregar o popup com a fecha em cima do click
			let coordinate = evt.coordinate;
								      		      			  									
			//Tempo da animacao
			let pan = ol.animation.pan({duration: 250, source: map.getView().getCenter()});
			 	  		    		    		  
		    //Mostra o popup
		    overlay.setPosition(coordinate);

			//Animacao antes de ir para o centro
			map.beforeRender(pan);	
			
			//Ao clickar no ponto ele seta para o centro
			//Nao setar no centro e sim mais para baixo sempre!
			map.getView().setCenter(coordinate);
			
			//[-6319337.890442375, 670156.7452234807] - Acre
			//[-6157238.706685981, -1207098.0435911962] - Matro Grosso
			//map.getView().setCenter([-6157238.706685981, -1207098.0435911962]);
						
			//Chama a funcao que abre o popup
			popupUnidade(feature.get('id'));
			
		} else {
			//fecha caso exista 1 click em qualquer regiao do mapa
			overlay.setPosition(undefined);
			$('#popup-closer').blur();
		}

	});
	
}

//Popup quando clickado no ponto do mapa
function popupUnidade(id) {
			
	let json = unidades[id];
			
	if ( json != undefined ) {	
		
		let porte = "";
		var html = "";
		let style = "";		
		let valorEstimado = "";

		switch(json.escala.intervalo) {
		
	    case 1:
	    	porte = "Pequeno";
	        break;
	        
	    case 2:
	        porte = "Médio";
	        break;
	        
	    case 3:
	        porte = "Grande"
	        break;	  
	        
	    default:
	    	
	        {}
	    
		}	
				
		if(json.valorEstimado == true){
			valorEstimado = '<span class="label label-warning pull-right popup-label">Valor Estimado</span>';
		}
		
		html += '<table style="margin-bottom: -11px;" class="table table-hover table-nao-pula-linha">';
		
		html += '	<thead>';
		html += '		<tr>';
		html += '			<th colspan="6"><div class="text-center"><h5 style="font-size: 13px;">Dados do sistema de tratamento de dejetos: Código ' + json.codigo + '</h5></div></th>';
		html += '		</tr>';
		html += '	</thead>';
		
		html += '	<tbody>'; 
		
		html += '		<tr>';
		html += ' 			<td style="font-size: 13px;"><div class="row col-md-7 text-left"><b>Situação: </b>' + json.situacaoDaPlanta.nome + ' </div></td>';		
		html += '		</tr>';
		
		html += '		<tr>';
		html += '			<td style="font-size: 13px;"> <div class="row col-md-7 text-left"><b>Município: </b>' + json.municipio.nome + '</div> ';
		html += ' 			<div class="pull-right col-md-5 text-left"><b>Estado: </b>' + json.municipio.estado.nome + ' </div> </td> ';		
		html += 		'</tr>'
					
		html += '		<tr>';
		html += '			<td style="font-size: 13px;"> <div class="row col-md-7 text-left"><b>Setor: </b>' + json.fonteDoSubstrato.categoriaDeUnidade.nome + '</div> ';
		html += ' 			<div class="pull-right col-md-5 text-left"><b>Porte: </b>' + porte + ' </div> </td> ';		
		html += 		'</tr>'
			
		
		html += '		<tr>';
		html += '			<td style="font-size: 13px;"> <div class="alignleft"><b>Atividade produtiva fonte dos dejetos: </b>' + json.fonteDoSubstrato.nome + '</div> ';		
		html += 		'</tr>'
							
		html += '		<tr>';
		html += '			<td style="font-size: 13px;"> <div class="alignleft"><b>Volumes de Dejetos Tratados:</b></div>';	
		html += '			<div class="col-md-7 text-left">' + currencyFormatDE(json.volumeDejetoTratadoDia) + ' m³/dia</div>';
		html += ' 			<div class="col-md-5 text-left">' + currencyFormatDE(json.volumeDejetoTratadoAno) + ' m³/ano</div> </td>';		
		html += 		'</tr>'
			
		html += '                <tr>';
        html += '                        <td style="font-size: 13px;"> <div class="text-left"><b>Emissões de Gases de Efeito Estufa (GEE) mitigadas: </b> ' + currencyFormatDE(json.emissaodeGEEevitado) + ' tCO2/ano' + '</div> </td> ';        
        html += '                </tr>'
                                                                                                                        
        if(json.tecnologia.id == 1) {
                
                html += '        <thead>';
                html += '                <tr>';
                html += '                        <th colspan="6"><div class="text-center"><h5 style="font-size: 13px;"><i class="fa fa-envira" aria-hidden="true"></i> Tecnologia de tratamento de dejetos: ' + json.tecnologia.nome + '</h5></div></th>';
                html += '                </tr>';
                html += '        </thead>';
                

                html += '                <tr>';
                html += '                        <td style="font-size: 13px;"> <div class="text-left"><b> Produção diária de biogás: </b>' + currencyFormatDE(json.producaoDiaria) + ' m³/dia' + '</div> </td> ';        
                html += '                </tr>'
                        
                html += '                <tr>';
                html += '                        <td style="font-size: 13px;"> <div class="text-left"><b> Produção anual de biogás: </b> ' + currencyFormatDE(json.producaoAnual) + ' m³/ano' + '</div> </td> ';
                html += '                </tr>'

                        
        } else if (json.tecnologia.id == 2) {
                
                html += '        <thead>';
                html += '                <tr>';
                html += '                        <th colspan="6"><div style="font-size: 13px;" class="text-center"><h5 style="font-size: 13px;"><i class="fa fa-envira" aria-hidden="true"></i> Tecnologia de tratamento de dejetos: ' + json.tecnologia.nome + '</h5></div></th>';
                html += '                </tr>';
                html += '        </thead>';
                
                html += '                <tr>';
                html += '                        <td style="font-size: 13px;" > <div text-left"><b> Volume de composto produzido: </b> ' + currencyFormatDE(json.volumeCompostagemDia) + ' m³/dia' + '</div> </td>';
                html += '                </tr>'
                        
                html += '                <tr>';
                html += '                        <td style="font-size: 13px;"> <div class="text-left"><b> Volume de composto produzido: </b> '+ currencyFormatDE(json.volumeCompostagemAno) + ' m³/ano' + '</div> </td> ';
                html += '                </tr>'
        }

		html += '		<tr>';
		html += '			<td style="font-size: 13px;"> <div class="row col-md-7 text-left"><b>Início da operação com uso energético do biogás: </b>' + json.anoDeInicioOperacao + '</div> ';	
		html += 		'</tr>'
			
        html += '	<thead>';
		html += '		<tr>';
		html += '			<th colspan="6"><div class="text-center"><h5 style="font-size: 13px;"><i class="fa fa-cogs" aria-hidden="true"></i> Aplicação Energética</h5></div></th>';
		html += '		</tr>';
		html += '	</thead>';
		
		html += '		<tr> <td>';		
		
		if(json.biogasParaEnergiaTermica != true) {
			
			style = "my-btn-default"
				
		} else {
			
			style ="btn-success"; 
		}
		
		html += '<button style="cursor:default;" type="button" class="btn btn-xs ' + style + '"><i class="fa fa-fire" aria-hidden="true"></i> Energia Térmica </button>';

		if(json.biogasParaEnergiaEletrica != true) {
			
			style = "my-btn-default"
				
		}else {
			
			style ="btn-success"; 
		}		
		html += '<button style="cursor:default;" type="button" class="btn btn-xs ' + style + '"><i class="fa fa-bolt" aria-hidden="true"></i> Energia Elétrica </button>';

		if(json.biogasParaEnergiaMecanica != true) {
			
			style = "my-btn-default"
				
		}else {
			
			style ="btn-success"; 
		}
		
		html += '			<button style="cursor:default;" type="button" class="btn btn-xs ' + style + '"><i class="fa fa-cogs" aria-hidden="true"></i> Energia Mecânica</button>';
		
		if(json.biogasParaBiometano != true) {
			
			style = "my-btn-default"
				
		}else {
			
			style ="btn-success";
			
		}
		
		html += '		<button style="cursor:default;" type="button" class="btn btn-xs ' + style + '"><i class="fa fa-envira" aria-hidden="true"></i> Biometano/GNV </button>';
		html += 		'</tr>'	
        
		let dataAlteracaoUnidade = new Date(json.dataAlteracao.time);
		let dataFormatada = dataAlteracaoUnidade.getDate() + "/" + (dataAlteracaoUnidade.getMonth() + 1) + "/" + dataAlteracaoUnidade.getFullYear();
			
		html += '                <tr>';
        html += '                        <td style="font-size: 13px;"> <div class="text-left"><b> Data de Atualização: </b> ' + dataFormatada + ' ' + '</div> </td> ';        
        html += '                </tr>'
        			
		html += '</tbody>'
		html += '</table>'		
	}	
	
	$("#popup-content").html(html);
	
}