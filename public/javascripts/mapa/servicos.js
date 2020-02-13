/*-INICIO-SERVICOS-----------------------------------------------------------------------------*/
// BUSCA TODAS AS UNIDADES POR AGROPECUARIA
function getTodasAsUnidades() {
			
	map.removeLayer(layerPequeno);
	map.removeLayer(layerMedio);		
	map.removeLayer(layerGrande);	
	
	$.get("/getTodasAsUnidades", function(data) {
        
    	//Recebe os dados do back-end
		unidades = data;
				
		//monta os pontos no mapa
		getFeatureMap(unidades);
		
		//carrega o modal de reports com as unidades filtradas
		generateReports(unidades);
		
		erro = 0;
		
		concatMunicipio = "Todos";
		//$("#wait").css("display", "none");
    }).fail(function(data, textStatus, xhr) {
 
         console.log("error", data.status);
    });
}

//BUSCA TODAS AS UNIDADES COM FILTROS
function getUnidadesByFilters(validadorSituacao,
		validadorAplicacao,
		validadorSubstrato,
		validadorTecnologia,
		validadorAno,
		validadorCategoria,
		validadorEstado,
		validadorMunicipio,
		validadorEscala,
		situacaoOperando,
		situacaoConstruindo, 
		situacaoReformando, 
		categoriaAgropecuaria, 
		categoriaAterro, 
		categoriaEsgoto, 
		categoriaIndustria, 
		categoriaCodigestao, 
		aplicacaoTermica, 
		aplicacaoEletrica, 
		aplicacaoMecanica, 
		aplicacaoBiometano, 
		substratoSuinocultura, 
		substratoSuinoculturaBovinoculturaAvicultura, 
		substratoBovinocultura, 
		biodigestor, 
		compostagem, 
		estadoId,
		municipioId,
		ano2003,
		ano2004, 
		ano2005,
		ano2006, 
		ano2007, 	
		ano2008, 
		ano2009, 
		ano2010, 
		ano2011, 
		ano2012, 		
		ano2013, 
		ano2014, 
		ano2015, 
		ano2016,
		ano2017, 		
		ano2018, 
		ano2019, 
		escalaInicial, 
		escalaFinal) {
	
	map.removeLayer(layerPequeno);
	map.removeLayer(layerMedio);		
	map.removeLayer(layerGrande);
	
	$.get("/getUnidadesFiltradas", {
		
		//Parametros para o back-end
		validadorSituacao:						validadorSituacao,
		validadorAplicacao:						validadorAplicacao,
		validadorSubstrato,						validadorSubstrato,
		validadorTecnologia:					validadorTecnologia,
		validadorAno:							validadorAno,
		validadorCategoria:						validadorCategoria,
		validadorEstado: 						validadorEstado, 
		validadorMunicipio:						validadorMunicipio,
		validadorEscala: 						validadorEscala, 
		situacaoOperando:     	  				situacaoOperando, 
	    situacaoConstruindo:  	  				situacaoConstruindo, 
	    situacaoReformando:   	  				situacaoReformando,
		categoriaAgropecuaria:     	  			categoriaAgropecuaria, 
		categoriaAterro:  	  				    categoriaAterro, 
		categoriaEsgoto:   	  					categoriaEsgoto,
		categoriaIndustria:     				categoriaIndustria,
		categoriaCodigestao: 					categoriaCodigestao,
	    aplicacaoTermica:         				aplicacaoTermica,
		aplicacaoEletrica:        				aplicacaoEletrica,
		aplicacaoMecanica:        			    aplicacaoMecanica,
		aplicacaoBiometano:       				aplicacaoBiometano,
		substratoSuinocultura:    				substratoSuinocultura,
		substratoSuinoculturaBovinoculturaAvicultura:      				substratoSuinoculturaBovinoculturaAvicultura, 
		substratoBovinocultura:   				substratoBovinocultura,
	    biodigestor:              				biodigestor,
	    compostagem:              				compostagem,
		estado:									estadoId,
		municipio:								municipioId,
		ano2003: 								ano2003,
		ano2004: 								ano2004, 
		ano2005: 								ano2005,
		ano2006: 								ano2006, 
		ano2007: 								ano2007,
		ano2008: 								ano2008, 
		ano2009: 								ano2009,
		ano2010: 								ano2010, 
		ano2011: 								ano2011, 
		ano2012: 								ano2012, 		
		ano2013: 								ano2013,
		ano2014: 								ano2014,
		ano2015: 								ano2015, 
		ano2016: 								ano2016,
		ano2017: 								ano2017,		
		ano2018: 								ano2018,
		ano2019: 								ano2019, 
		escalaInicial:                          escalaInicial,
		escalaFinal:							escalaFinal

	}
	, function(data) {
				
		//Recebe os dados do back-end
		unidades = data;
				
		//monta os pontos no mapa
		getFeatureMap(unidades);
		
		let unidadesFiltradas = data;
				
		//carrega o modal de reports com as unidades filtradas
		generateReports(unidades);
		
		erro = 0;
		validadorEscala = false;
		
	}).fail(function(data, textStatus, xhr) {
		
	    erro = data.status;
	    $.toast({
	        heading: 'MAPA',
	        text: 'Nenhuma unidade encontrada.',
	        position: 'bottom-center',
	        stack: false
	    })
		
	});
	     	
}

/*-FIM-SERVICOS---------------------------------------------------------------------------------*/