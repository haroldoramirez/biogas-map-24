/*-INICIO-BOTOES----------------------------------------------------------------------------------*/

/*-CADA-BOTAO-APERTADO-CHAMA-O-METODO-que-esta-no-arquivo-verificadores.js------------------------*/

//Escala input range
$("#escala").slider({
	  animate: true,
	  range: true, 
	  min: 1, 
	  max: 4, 
	  step: 1,
	  values: [1, 4], 
	  slide: function(event, ui) {},
	  change: function( event, ui ) {
		  
		  validadorEscala = true;
		  
		  //Pequeno e Grande
		  if (($("#escala").slider("values", 0) == 1) && ($("#escala").slider("values", 1) == 2)) {
			  escalaInicialSelecionada = 1;
			  escalaFinalSelecionada = 2500;
			  $("#escala-valores").val("Pequeno");		
		  } else if (($("#escala").slider("values", 0) == 1) && ($("#escala").slider("values", 1) == 3)) {
			  escalaInicialSelecionada = 1;
			  escalaFinalSelecionada = 12500;
			  $("#escala-valores").val("Pequeno e Médio");
		  } else if (($("#escala").slider("values", 0) == 1) && ($("#escala").slider("values", 1) == 4)) {
			  escalaInicialSelecionada = 1;
			  escalaFinalSelecionada = 450000;
			  $("#escala-valores").val("Pequeno, Médio e Grande");
		  } else if (($("#escala").slider("values", 0) == 2) && ($("#escala").slider("values", 1) == 4)) {
			  escalaInicialSelecionada = 2501;
			  escalaFinalSelecionada = 450000;
			  $("#escala-valores").val("Médio e Grande");
		  } else if (($("#escala").slider("values", 0) == 3) && ($("#escala").slider("values", 1) == 4)) {
			  escalaInicialSelecionada = 12501;
			  escalaFinalSelecionada = 450000;
			  $("#escala-valores").val("Grande");
		  } else if (($("#escala").slider("values", 0) == 2) && ($("#escala").slider("values", 1) == 3)) {
			  escalaInicialSelecionada = 2501;
			  escalaFinalSelecionada = 12500;
			  $("#escala-valores").val("Médio");
		  } 
		  		  
		 //Verifica todos os botoes
		 verificaBotoes();
	  }
});

$("#escala-valores").val("Pequeno, Médio e Grande");
 
//Botao Operando
$("#situacaoOperando").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass("btn-default");
		$(this).parent().toggleClass("btn-success");
	}
	else {	
		//Precisa colocar nulo para ajudar na query
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass("btn-success");
		$(this).parent().toggleClass("btn-default");
	}
		
	//Verifica todos os botoes
	verificaBotoes();
});

//Botao Construindo
$("#situacaoConstruindo").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass("btn-default");
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass("btn-success");
		$(this).parent().toggleClass("btn-default");
	}
	
	verificaBotoes();
});

//Botao Reformando
$("#situacaoReformando").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$("#situacaoReformando").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
	
	verificaBotoes();
});

//Botao Categoria/SETOR AGROPECUARIA
$("#categoriaAgropecuaria").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
		
	}
	else {
		$("#categoriaAgropecuaria").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
		
	}
	
	verificaBotoes();
});

//Botao Categoria/SETOR ATERRO
$("#categoriaAterro").change( function() {
	
	if ($(this).is(":checked")) {
		
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		
		$("#categoriaAterro").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
		
	}
	
	verificaBotoes();
});

//Botao Categoria/SETOR ESGOTO
$("#categoriaEsgoto").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
		
	}
	else {
		$("#categoriaEsgoto").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
		
	}
	
	verificaBotoes();
});

//Botao Categoria/SETOR INDUSTRIA
$("#categoriaIndustria").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
		
	}
	else {
		$("#categoriaIndustria").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
		
	}
	
	verificaBotoes();
});

//Botao Categoria/SETOR Codigestao
$("#categoriaCodigestao").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$("#categoriaCodigestao").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
	
	verificaBotoes();
});

//Botao biodigestor
$("#biodigestor").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass("btn-default");
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");	
	}
	
	verificaBotoes();
	
});

//Botao compostagem
$("#compostagem").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass("btn-default");
		$(this).parent().toggleClass("btn-success");	
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

//Botao Aplicacao Termica
$("#aplicacaoTermica").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

//Botao Aplicacao Eletrica
$("#aplicacaoEletrica").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");	
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

//Botao Aplicacao Mecanica
$("#aplicacaoMecanica").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

//Botao Aplicacao Biometano
$("#aplicacaoBiometano").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

/// SUBSTRATOS
  				
// 1 -Botao substrato suinocultura
$("#suinocultura").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");	
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

//2 - Botao substrato Suinocultura, bovinocultura e/ou avicultura
$("#suinoculturaBovinoculturaAvicultura").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});


// 3 - Botao substrato bovinocultura
$("#bovinocultura").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
	}
	else {
		$(this).parent().attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}

	verificaBotoes();
});

$("#estados").change( function() { 
			
	estadoId = $("#estados option:selected").val();
		
	$.getJSON("/municipios/estado/" + estadoId,
			
	function(data) {
		$("#municipios").html("");
		
			var optionMunicipios = ""
			
			optionMunicipios += '<option value="0">Selecione o Município</option> \n';
			
			$.each(data, function(key, val) {
				optionMunicipios += '<option id="municipios' + val.id + '" value= "' + val.id + '">' + val.nome + '</option> \n';
			});
			
			$("#municipios").append(optionMunicipios);
	});
	
	municipioId = 0;

	verificaBotoes();
							
});

$("#municipios").change(function() {
	
	municipioId = $("#municipios option:selected").val();
	concatMunicipio = $("#municipios option:selected").text();
	
	if (municipioId == 0) {
		concatMunicipio = "Todos"
	}
			
	verificaBotoes();
	
});

//Botao 2003
$("#ano2003").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2003").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2004
$("#ano2004").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2004").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2005
$("#ano2005").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2005").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2006
$("#ano2006").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2006").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2007
$("#ano2007").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2007").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2008
$("#ano2008").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2008").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2009
$("#ano2009").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2009").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2010
$("#ano2010").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2010").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2011
$("#ano2011").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2011").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2012
$("#ano2012").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2012").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2013
$("#ano2013").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2013").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2014
$("#ano2014").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2014").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2015
$("#ano2015").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2015").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
			
	verificaBotoes();
	
});

//Botao 2016
$("#ano2016").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");	
						
	}
	else {
		$("#ano2016").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");	
	}
		
	verificaBotoes();

});

//Botao 2017
$("#ano2017").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
			
	}
	else {
		$("#ano2017").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
		
	verificaBotoes();

});


//Botao 2018
$("#ano2018").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");
				
	}
	else {
		$("#ano2018").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");	
	}
		
	verificaBotoes();

});

//Botao 2019
$("#ano2019").change( function() {
	
	if ($(this).is(":checked")) {
		$(this).parent().removeClass('btn-default');
		$(this).parent().toggleClass("btn-success");	
						
	}
	else {
		$("#ano2019").attr("checked", false);
		$(this).parent().removeClass('btn-success');
		$(this).parent().toggleClass("btn-default");
	}
		
	verificaBotoes();

});

//Botoes sidebar

//------------------------------------------------------------LIMPAR--------------------------------------------------------------------
//Botao de limpar do menu sidebar
$("#button-clear").click( function() {
			
	if ($("#situacaoOperando").is(":checked")) {		
		  $("#situacaoOperando").parent().removeClass("btn-success active");
		  $("#situacaoOperando").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#situacaoConstruindo").is(":checked")) {		
		  $("#situacaoConstruindo").parent().removeClass("btn-success active");
		  $("#situacaoConstruindo").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#situacaoReformando").is(":checked")) {		
		  $("#situacaoReformando").parent().removeClass("btn-success active");
		  $("#situacaoReformando").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#categoriaAgropecuaria").is(":checked")) {		
		  $("#categoriaAgropecuaria").parent().removeClass("btn-success active");
		  $("#categoriaAgropecuaria").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#categoriaAterro").is(":checked")) {		
		  $("#categoriaAterro").parent().removeClass("btn-success active");
		  $("#categoriaAterro").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#categoriaCodigestao").is(":checked")) {		
		  $("#categoriaCodigestao").parent().removeClass("btn-success active");
		  $("#categoriaCodigestao").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#categoriaIndustria").is(":checked")) {		
		  $("#categoriaIndustria").parent().removeClass("btn-success active");
		  $("#categoriaIndustria").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#categoriaEsgoto").is(":checked")) {		
		  $("#categoriaEsgoto").parent().removeClass("btn-success active");
		  $("#categoriaEsgoto").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#aplicacaoTermica").is(":checked")) {		
		  $("#aplicacaoTermica").parent().removeClass("btn-success active");
		  $("#aplicacaoTermica").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#aplicacaoEletrica").is(":checked")) {		
		  $("#aplicacaoEletrica").parent().removeClass("btn-success active");
		  $("#aplicacaoEletrica").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#aplicacaoMecanica").is(":checked")) {		
		  $("#aplicacaoMecanica").parent().removeClass("btn-success active");
		  $("#aplicacaoMecanica").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#aplicacaoBiometano").is(":checked")) {		
		  $("#aplicacaoBiometano").parent().removeClass("btn-success active");
		  $("#aplicacaoBiometano").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
		
	if ($("#avicultura").is(":checked")) {		
		  $("#avicultura").parent().removeClass("btn-success active");
		  $("#avicultura").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#bovinocultura").is(":checked")) {		
		  $("#bovinocultura").parent().removeClass("btn-success active");
		  $("#bovinocultura").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#suinoculturaBovinoculturaAvicultura").is(":checked")) {		
		  $("#suinoculturaBovinoculturaAvicultura").parent().removeClass("btn-success active");
		  $("#suinoculturaBovinoculturaAvicultura").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#suinocultura").is(":checked")) {		
		  $("#suinocultura").parent().removeClass("btn-success active");
		  $("#suinocultura").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
		
	if ($("#biodigestor").is(":checked")) {		
		  $("#biodigestor").parent().removeClass("btn-success active");
		  $("#biodigestor").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#compostagem").is(":checked")) {		
		  $("#compostagem").parent().removeClass("btn-success active");
		  $("#compostagem").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2003").is(":checked")) {		
		  $("#ano2003").parent().removeClass("btn-success active");
		  $("#ano2003").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2004").is(":checked")) {		
		  $("#ano2004").parent().removeClass("btn-success active");
		  $("#ano2004").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2005").is(":checked")) {		
		  $("#ano2005").parent().removeClass("btn-success active");
		  $("#ano2005").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2006").is(":checked")) {		
		  $("#ano2006").parent().removeClass("btn-success active");
		  $("#ano2006").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2007").is(":checked")) {		
		  $("#ano2007").parent().removeClass("btn-success active");
		  $("#ano2007").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2008").is(":checked")) {		
		  $("#ano2008").parent().removeClass("btn-success active");
		  $("#ano2008").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2009").is(":checked")) {		
		  $("#ano2009").parent().removeClass("btn-success active");
		  $("#ano2009").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2010").is(":checked")) {		
		  $("#ano2010").parent().removeClass("btn-success active");
		  $("#ano2010").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2011").is(":checked")) {		
		  $("#ano2011").parent().removeClass("btn-success active");
		  $("#ano2011").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2012").is(":checked")) {		
		  $("#ano2012").parent().removeClass("btn-success active");
		  $("#ano2012").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2013").is(":checked")) {		
		  $("#ano2013").parent().removeClass("btn-success active");
		  $("#ano2013").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2014").is(":checked")) {		
		  $("#ano2014").parent().removeClass("btn-success active");
		  $("#ano2014").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2015").is(":checked")) {		
		  $("#ano2015").parent().removeClass("btn-success active");
		  $("#ano2015").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2016").is(":checked")) {		
		  $("#ano2016").parent().removeClass("btn-success active");
		  $("#ano2016").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2017").is(":checked")) {		
		  $("#ano2017").parent().removeClass("btn-success active");
		  $("#ano2017").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2018").is(":checked")) {		
		  $("#ano2018").parent().removeClass("btn-success active");
		  $("#ano2018").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 
	
	if ($("#ano2019").is(":checked")) {		
		  $("#ano2019").parent().removeClass("btn-success active");
		  $("#ano2019").parent().toggleClass("btn-default");	
		  $( this ).prop('checked', false);
	} 

	$("#estados").val("0");
	$("#municipios").val("0");
		
	$("#escala").slider({
		  animate: true,
		  range: true, 
		  min: 1, 
		  max: 4, 
		  step: 1,
		  values: [1, 4], 
		  slide: function(event, ui) {
			  $("#escala-valores").val(ui.values[0] + " - " + ui.values[1]);
		  }
	});
		
	$("#escala-valores").val("Pequeno, Médio e Grande");
			
	//Busca todas as unidades
	location.reload();
		
});
/*-FIM-BOTOES----------------------------------------------------------------------------------*/