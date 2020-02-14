/*INICIO Funcao para formatar valores monetarios*/
function formatCurrencyBR(n, c, d, t) {
    let s, j, i;
    c = isNaN(c = Math.abs(c)) ? 2 : c, d = d == undefined ? "," : d, t = t == undefined ? "." : t, s = n < 0 ? "-" : "", i = parseInt(n = Math.abs(+n || 0).toFixed(c)) + "", j = (j = i.length) > 3 ? j % 3 : 0;
    return s + (j ? i.substr(0, j) + t : "") + i.substr(j).replace(/(\d{3})(?=\d)/g, "$1" + t) + (c ? d + Math.abs(n - i).toFixed(c).slice(2) : "");
}
function currencyFormatDE (num) {
    return num
       .toFixed(0) // always two decimal digits
       .replace(".", ",") // replace decimal point character with ,
       .replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.")// use . as a separator
}
/*FIM - Funcao para formatar valores monetarios*/

//INICIO - Convert CSV
function convertToCSV(objArray) {
    var array = typeof objArray != 'object' ? JSON.parse(objArray) : objArray;
    var str = '';

    for (var i = 0; i < array.length; i++) {
        var line = '';
        for (var index in array[i]) {
            if (line != '') line += ','

            line += array[i][index];
        }

        str += line + '\r\n';
    }

    return str;
}
function exportCSVFile(headers, items, fileTitle) {
	
    if (headers) {
        items.unshift(headers);
    }

    // Convert Object to JSON
    var jsonObject = JSON.stringify(items);

    var csv = this.convertToCSV(jsonObject);

    var exportedFilenmae = fileTitle + '.csv' || 'export.csv';

    var blob = new Blob([csv], { type: 'text/csv;charset=utf-8;' });
    
    if (navigator.msSaveBlob) { // IE 10+
    	
        navigator.msSaveBlob(blob, exportedFilenmae);
        
    } else {
    	
        var link = document.createElement("a");
        
        if (link.download !== undefined) { // feature detection
        	
            // Browsers that support HTML5 download attribute
            var url = URL.createObjectURL(blob);
            
            link.setAttribute("href", url);
            link.setAttribute("download", exportedFilenmae);
            link.style.visibility = 'hidden';
            document.body.appendChild(link);
            link.click();
            document.body.removeChild(link);
            
        }
    }
}
//FIM - Convert CSV

/*-INICIO-RELATORIO----------------------------------------------------------------------------*/
function generateReports(data) {
		
	concatSituacoes = "";
	concatAplicacao = "";
	concatSubstrato = "";
	concatRegiao = "";
	concatEstado = "";
	concatAnoOperacao = "";
	
	quantidadeUnidadesBiodigestor = 0;
	volumeTotalDejetosEfluentesBiodigestor = 0;
	producaoTotalBiogas = 0;
	
	quantidadeUnidadesCompostagem = 0;
	volumeTotalCompostoProduzido = 0;
	volumeTotalEfluenteTratadoCompostagem = 0;
	totalGEEEvitados = 0;
	volumeTotalDeDejetosEfluentes = 0;
	
	let unidadesFiltradas = data;
			
	//Percorrer a lista de unidades data filtradas e realizar os calculos		
    /*Repeticao para percorrer a lista de unidades filtradas*/
    for (let i = 0; i < unidadesFiltradas.length; i++) {
    	    	    	    	
    	if(unidadesFiltradas[i].tecnologia.nome == 'Biodigestor') {
    		
    		quantidadeUnidadesBiodigestor++;
    		volumeTotalDejetosEfluentesBiodigestor = volumeTotalDejetosEfluentesBiodigestor + unidadesFiltradas[i].volumeDejetoTratadoAno;
    		producaoTotalBiogas = producaoTotalBiogas + unidadesFiltradas[i].producaoBiogasAno;
    		
    	} else {
    		
    		quantidadeUnidadesCompostagem++;
    		volumeTotalCompostoProduzido = volumeTotalCompostoProduzido + unidadesFiltradas[i].volumeCompostagemAno;
    		volumeTotalEfluenteTratadoCompostagem = volumeTotalEfluenteTratadoCompostagem + unidadesFiltradas[i].volumeDejetoTratadoAno;
		
    	}
    	
    	//INICIO - Verifica as situacoes do backend
    	if(unidadesFiltradas[i].situacaoDaPlanta.nome == 'Em Operação' && !concatSituacoes.includes("Em Operação")){

    		concatSituacoes= concatSituacoes.concat(operacao);

    	} else if(unidadesFiltradas[i].situacaoDaPlanta.nome == 'Em Construção' && !concatSituacoes.includes("Em Construção")){

    		concatSituacoes= concatSituacoes.concat(construcao);

    	} else if(unidadesFiltradas[i].situacaoDaPlanta.nome == 'Em Reforma' && !concatSituacoes.includes("Reformando")){

    		concatSituacoes= concatSituacoes.concat(reformando);

    	}
    	//FIM - Verifica as situacoes do backend 
    	    		
    	//INICIO - Verifica as regiões do backend
    	if(unidadesFiltradas[i].municipio.estado.regiao == 'Sul' && !concatRegiao.includes("Sul")) {
    				
    		concatRegiao = concatRegiao.concat(sul);
    		
    	} else if (unidadesFiltradas[i].municipio.estado.regiao == 'Norte' && !concatRegiao.includes("Norte")) {
    		
    		concatRegiao = concatRegiao.concat(norte);
    		
    	} else if (unidadesFiltradas[i].municipio.estado.regiao == 'Nordeste' && !concatRegiao.includes("Nordeste")) {
    		
    		concatRegiao = concatRegiao.concat(nordeste);
    		
    	} else if (unidadesFiltradas[i].municipio.estado.regiao == 'Centro-Oeste' && !concatRegiao.includes("Centro-Oeste")) {
    		
    		concatRegiao = concatRegiao.concat(centrooeste);
    		
    	} else if (unidadesFiltradas[i].municipio.estado.regiao == 'Sudeste' && !concatRegiao.includes("Sudeste")) {
    		
    		concatRegiao = concatRegiao.concat(sudeste);
    		
    	}
    	//FIM - Verifica as regiões do backend
    	    	    	    	
    	//INICIO - Verifica Substratos do backend
    	if(unidadesFiltradas[i].fonteDoSubstrato.nome == 'Suinocultura' && !concatSubstrato.includes("Suinocultura")){

    		concatSubstrato = concatSubstrato.concat(substratoRelatorioSuinocultura);

    	} else if(unidadesFiltradas[i].fonteDoSubstrato.nome == 'Bovinocultura de Leite ou Corte' && !concatSubstrato.includes("Bovinocultura de Leite ou Corte")){

    		concatSubstrato = concatSubstrato.concat(substratoRelatorioBovinocultura);

    	} else if(unidadesFiltradas[i].fonteDoSubstrato.nome == 'Suinocultura bovinocultura e/ou avicultura' && !concatSubstrato.includes("Suinocultura, bovinocultura e/ou avicultura")){

    		concatSubstrato = concatSubstrato.concat(substratoRelatorioSuinoculturaBovinoculturaAvicultura);

    	} 
    	//FIM - Verifica Substratos do backend
    	
    	//INICIO - Verifica Aplicacoes 
    	if ( unidadesFiltradas[i].biogasParaEnergiaTermica == true && !concatAplicacao.includes("Térmica") ){

    		concatAplicacao = concatAplicacao.concat(aplicacaoTermicaRelatorio);

    	}

    	if ( unidadesFiltradas[i].biogasParaEnergiaEletrica == true && !concatAplicacao.includes("Elétrica") ){

    		concatAplicacao = concatAplicacao.concat(aplicacaoEletricaRelatorio);

    	}

    	if ( unidadesFiltradas[i].biogasParaEnergiaMecanica == true && !concatAplicacao.includes("Mecânica") ){

    		concatAplicacao = concatAplicacao.concat(aplicacaoMecanicaRelatorio);

    	}
    	
    	if ( unidadesFiltradas[i].biogasParaBiometano == true && !concatAplicacao.includes("Biometano") ){

    		concatAplicacao = concatAplicacao.concat(aplicacaoBiometanoRelatorio);

    	}
    	//FIM - Verifica Aplicacoes 
    	
    	//INICIO - Verifica Estados
    	if(unidadesFiltradas[i].municipio.estado.nome == 'Acre' && !concatEstado.includes("Acre")){

    		concatEstado= concatEstado.concat(acre);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Alagoas' && !concatEstado.includes("Alagoas")){

    		concatEstado= concatEstado.concat(alagoas);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Amapá' && !concatEstado.includes("Amapá")){

    		concatEstado= concatEstado.concat(amapa);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Amazonas' && !concatEstado.includes("Amazonas")){

    		concatEstado= concatEstado.concat(amazonas);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Bahia' && !concatEstado.includes("Bahia")){

    		concatEstado= concatEstado.concat(bahia);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Ceará' && !concatEstado.includes("Ceará")){

    		concatEstado= concatEstado.concat(ceara);
 
    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Distrito Federal' && !concatEstado.includes("Distrito Federal")){

    		concatEstado= concatEstado.concat(distritofederal);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Espírito Santo' && !concatEstado.includes("Espírito Santo")){

    		concatEstado= concatEstado.concat(espiritosanto);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Goiás' && !concatEstado.includes("Goiás")){

    		concatEstado= concatEstado.concat(goias);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Maranhão' && !concatEstado.includes("Maranhão")){

    		concatEstado= concatEstado.concat(maranhao);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Mato Grosso' && !concatEstado.includes("Mato Grosso")){

    		concatEstado= concatEstado.concat(matogrosso);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Mato Grosso do Sul' && !concatEstado.includes("Mato Grosso do Sul")){

    		concatEstado= concatEstado.concat(matogrossodosul);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Minas Gerais' && !concatEstado.includes("Minas Gerais")){

    		concatEstado= concatEstado.concat(minasgerais);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Pará' && !concatEstado.includes("Pará")){

    		concatEstado= concatEstado.concat(para);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Paraná' && !concatEstado.includes("Paraná")){

    		concatEstado= concatEstado.concat(parana);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Paraíba' && !concatEstado.includes("Paraíba")){

    		concatEstado= concatEstado.concat(paraiba);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Pernambuco' && !concatEstado.includes("Pernambuco")){

    		concatEstado= concatEstado.concat(pernambuco);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Piauí' && !concatEstado.includes("Piauí")){

    		concatEstado= concatEstado.concat(piaui);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Rio de Janeiro' && !concatEstado.includes("Rio de Janeiro")){

    		concatEstado= concatEstado.concat(riodejaneiro);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Rio Grande do Norte' && !concatEstado.includes("Rio Grande do Norte")){

    		concatEstado= concatEstado.concat(riograndedonorte);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Rio Grande do Sul' && !concatEstado.includes("Rio Grande do Sul")){

    		concatEstado= concatEstado.concat(riograndedosul);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Rondônia' && !concatEstado.includes("Rondônia")){

    		concatEstado= concatEstado.concat(rondonia);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Roraima' && !concatEstado.includes("Roraima")){

    		concatEstado= concatEstado.concat(roraima);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Santa Catarina' && !concatEstado.includes("Santa Catarina")){

    		concatEstado= concatEstado.concat(santacatarina);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'São Paulo' && !concatEstado.includes("São Paulo")){

    		concatEstado= concatEstado.concat(saopaulo);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Sergipe' && !concatEstado.includes("Sergipe")){

    		concatEstado= concatEstado.concat(sergipe);

    	} else if (unidadesFiltradas[i].municipio.estado.nome == 'Tocantins' && !concatEstado.includes("Tocantins")){

    		concatEstado= concatEstado.concat(tocantins);

    	}
    	//FIM - Verifica Estados
    	    	
    	if(unidadesFiltradas[i].anoDeInicioOperacao == '2003' && !concatAnoOperacao.includes("2003")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2003);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2004' && !concatAnoOperacao.includes("2004")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2004);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2005' && !concatAnoOperacao.includes("2005")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2005);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2006' && !concatAnoOperacao.includes("2006")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2006);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2007' && !concatAnoOperacao.includes("2007")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2007);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2008' && !concatAnoOperacao.includes("2008")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2008);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2009' && !concatAnoOperacao.includes("2009")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2009);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2010' && !concatAnoOperacao.includes("2010")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2010);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2011' && !concatAnoOperacao.includes("2011")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2011);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2012' && !concatAnoOperacao.includes("2012")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2012);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2013' && !concatAnoOperacao.includes("2013")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2013);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2014' && !concatAnoOperacao.includes("2014")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2014);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2015' && !concatAnoOperacao.includes("2015")){
    		
    		concatAnoOperacao = concatAnoOperacao.concat(operacao2015);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2016' && !concatAnoOperacao.includes("2016")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2016);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2017' && !concatAnoOperacao.includes("2017")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2017);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2018' && !concatAnoOperacao.includes("2018")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2018);

    	} else if(unidadesFiltradas[i].anoDeInicioOperacao == '2019' && !concatAnoOperacao.includes("2019")){

    		concatAnoOperacao = concatAnoOperacao.concat(operacao2019);

    	} 

    	totalGEEEvitados = totalGEEEvitados + unidadesFiltradas[i].emissaodeGEEevitado;
    	
    }
    //Final do loop da lista de unidades
    
    if (validadorAno == false) {
    	concatAnoOperacao = "2003 até 2019";
    }
    
    if (validadorSubstrato == false) {
    	concatSubstrato = "Suinocultura, bovinocultura e/ou avicultura";
    }
             
    //Volume total de Dejetos e Efluentes
    volumeTotalDeDejetosEfluentes = volumeTotalDejetosEfluentesBiodigestor + volumeTotalEfluenteTratadoCompostagem;
            			
	//Parametros recebidos pelo filtro selecionado - Modal
	document.getElementById('situacaoUnidades').textContent = concatSituacoes;
	document.getElementById('aplicacaoUnidades').textContent = concatAplicacao;
	document.getElementById('fonteSubstratoUnidades').textContent = concatSubstrato;
	document.getElementById('regiaoUnidades').textContent = concatRegiao;
	document.getElementById('estadoUnidades').textContent = concatEstado;
	document.getElementById('municipioUnidades').textContent = concatMunicipio;
	document.getElementById('periodoRelatorio').textContent = periodoRelatorio;
	document.getElementById('concatAnoOperacao').textContent = concatAnoOperacao;
	
	//Volume total de dejetos e efluentes
	document.getElementById('volumeTotalDeDejetosEfluentes').textContent = currencyFormatDE(volumeTotalDeDejetosEfluentes);
		
	//Total de Emissao GEE Evitados	
	document.getElementById('totalGEEEvitados').textContent = currencyFormatDE(totalGEEEvitados);
	
	//tecnologia compostagem
	document.getElementById('quantidadeUnidadeCompostagem').textContent = quantidadeUnidadesCompostagem;
	document.getElementById('volumeTotalCompostoProduzido').textContent = currencyFormatDE(volumeTotalCompostoProduzido);
	
	//tecnologia biodigestao
	document.getElementById('quantidadeUnidadeBiodigestores').textContent = quantidadeUnidadesBiodigestor;
	document.getElementById('volumeTotalDejetosEfluentesUnidadesBiodigestor').textContent = currencyFormatDE(volumeTotalDejetosEfluentesBiodigestor);
	document.getElementById('producaoTotalBiogasUnidades').textContent = currencyFormatDE(producaoTotalBiogas);
	
	//Relatorio
	document.getElementById('dataEmissaoRelatorio').textContent = day + ' de ' + listaMeses[month] + ' de ' + fullYear;
				    
}
/*-FIM-RELATORIO-------------------------------------------------------------------------------*/

/*-INICIO-PDF----------------------------------------------------------------------------------*/
function downloadRelatorioPdf() {
				
	  let agora = new moment(Date.now()).format('DD-MM-YYYY - HH:mm:ss');

      //Conteudo do Arquivo PDF
      let conteudo = [
          {canvas: [ { type: 'line', x1: 0, y1: 0, x2: 716, y2: 0, lineWidth: 1 } ]},
          ' ',
          {text: 'TDA-Map - RELATÓRIO', style: 'titulo', alignment: 'center'},
          {text: 'MAPA BRASILEIRO DE SISTEMAS DE TRATAMENTO DE DEJETOS ANIMAIS', style: 'negrito', alignment: 'center'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          {text: 'Situação: ' + concatSituacoes, style: 'paragrafo', alignment: 'left'},
          {text: 'Atividade produtiva fonte dos dejetos: ' + concatSubstrato, style: 'paragrafo', alignment: 'left'},
          {text: 'Região: ' + concatRegiao, style: 'paragrafo', alignment: 'left'},
          {text: 'Estado: ' + concatEstado, style: 'paragrafo', alignment: 'left'},
          {text: 'Município: ' + concatMunicipio, style: 'paragrafo', alignment: 'left'},
          {text: 'Ano de instalação das plantas: ' + concatAnoOperacao, style: 'paragrafo', alignment: 'left'},
          {text: 'Período do relatório: ' + periodoRelatorio, style: 'paragrafo', alignment: 'left'},
          {text: 'Volume total de dejetos/efluentes tratados: ' + currencyFormatDE(volumeTotalDeDejetosEfluentes) + ' m³/ano', style: 'paragrafo', alignment: 'left'},
          {text: 'Emissões de gases de efeito estufa (GEE) mitigadas: ' + currencyFormatDE(totalGEEEvitados) + ' m³/ano', style: 'paragrafo', alignment: 'left'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          {text: 'Tecnologia de tratamento de dejetos: Biodigestão ', style: 'negrito', alignment: 'left'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          { ul: [ 'Quantidade de unidades: ' + quantidadeUnidadesBiodigestor, 
        	  'Volume total de dejetos/efluentes tratados: ' + currencyFormatDE(volumeTotalDejetosEfluentesBiodigestor) + ' m³/ano', 
        	  'Produção total de biogás: ' + currencyFormatDE(producaoTotalBiogas) + ' m³/ano',
        	  'Aplicação das unidades: ' + concatAplicacao], style: 'paragrafo', alignment: 'left'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          {text: 'Tecnologia de tratamento de dejetos: Compostagem ', style: 'negrito', alignment: 'left'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          { ul: [ 'Quantidade de unidades: ' + quantidadeUnidadesCompostagem, 'Volume total de dejetos/efluentes tratados: ' + currencyFormatDE(volumeTotalEfluenteTratadoCompostagem) + ' m³/ano'], style: 'paragrafo', alignment: 'left'},
          {text: ' ', style: 'paragrafo', alignment: 'left'},
          {text: ' ', style: 'paragrafoitalico', alignment: 'left'},
      ];

      //Definicao do arquivo PDF e Estilo
      // margin: [left, top, right, bottom]
      let docDefinition = {
          header: function() {
              return [
                  {
                      style: 'table',
                      margin: [62,35,62,35],
                      table: {
                          widths: [100, "*", "*"],
                          headerRows: 1,
                          body: [
                              [
                                 {
                                      // usually you would use a dataUri instead of the name for client-side printing
                                      // sampleImage.jpg however works inside playground so you can play with it
                                      image: cib_logo,
                                      width: 90,
                                      height: 25,
                                      alignment: 'left',
                                      margin: [0, 0, 0, 0],
                                  },
                                  //{text: 'Biogasmap', style: 'topHeader', alignment: 'right'},
                                  {
                                      image: abc_logo,
                                      width: 80,
                                      height: 36,
                                      alignment: 'center',
                                      margin: [0, -10, -3, 3],
                                  },
                                  {
                                      image: ministerio_logo,
                                      width: 195,
                                      height: 36,
                                      alignment: 'right',
                                      margin: [0, -5, -3, 3],
                                  },

                              ]
                          ]
                      },
                      layout: 'noBorders'
                  },
              ]
          },
          footer: function(currentPage, pageCount) {
              return [
//                  {
//                      image: ministerio_logo,
//                      width: 200,
//                      height: 40,
//                      alignment: 'center'
//                  },
            	  {text: 'Ministério da Agricultura, Pecuária e Abastecimento', style: 'footerHeader', alignment: 'center'},
                  {text: 'Centro Internacional de Energias Renováveis : '+ agora , alignment: 'center', style: 'footer'}
              ]
          },
          content: conteudo,
          pageSize: 'A4',
          pageOrientation: 'portrait',
          pageMargins: [62,80,62,80],
          styles: {
              topHeader: {
                  fontSize: 16,
                  bold: true,
                  margin: [0, 6, 0, 30],
                  alignment: 'right'
              },
              titulo: {
                  fontSize: 12,
                  bold: true,
                  margin: [0, 6, 0, 10],
                  alignment: 'center'
              },
              paragrafo: {
                  fontSize: 10,
                  alignment: 'left'
              },
              table: {
                  fontSize: 8,
                  alignment: 'left',
                  color: 'black',
                  margin: [0, 5, 0, 15]
              },
              header: {
                  fontSize: 16,
                  bold: true,
                  margin: [0, 10, 0, 15],
                  alignment: 'left'
              },
              footer: {
                  fontSize: 6,
                  margin: [0, 25, 0, 17],
                  alignment: 'right'
              },
              footerHeader: {
                  fontSize: 13,
                  bold: true,
                  margin: [0, 3, 0, 21],
                  alignment: 'center'
              },
              negrito: {
            	  bold:true,
              },
              paragrafoitalico: {
            	italics: true,  
                fontSize: 10,
                alignment: 'left'
              }
          }
      };
      
      $('#relatorioModal').modal('hide');

      let pdf = pdfMake.createPdf(docDefinition).download('mapa-reports-'+ agora +'.pdf');

  };
/*-FIM-PDF-------------------------------------------------------------------------------------*/

/*-FIM-CSV-------------------------------------------------------------------------------------*/
function downloadRelatorioCsv() {
	
	  let agora = new moment(Date.now()).format('DD-MM-YYYY - HH:mm:ss');
		
	  var headers = {
			  anoDeInicioOperacao: 'anoDeInicioOperacao'.replace(/,/g, ''), // remove commas to avoid errors
			  biogasParaBiometano: "biogasParaBiometano",
			  biogasParaEnergiaEletrica: "biogasParaEnergiaEletrica",
			  biogasParaEnergiaMecanica: "biogasParaEnergiaMecanica",
			  biogasParaEnergiaTermica: "biogasParaEnergiaTermica",
			  codigo: "codigo",
			  emissaodeGEEevitado: "emissaodeGEEevitado",
			  porte: "porte",
			  substrato: "substrato",
			  categoria: "categoria",
			  latitude: "latitude",
			  longitude: "longitude",
			  municipio: "municipio",
			  estado: "estado",
			  regiao: "regiao",
			  producaoBiogasAno: "producaoBiogasAno",
			  producaoBiogasDia: "producaoBiogasDia",
			  situacaoDaPlanta: "situacaoDaPlanta",
			  tecnologia: "tecnologia",
			  volumeCompostagemAno: "volumeCompostagemAno",
			  volumeCompostagemDia: "volumeCompostagemDia",
			  volumeDejetoTratadoAno: "volumeDejetoTratadoAno",
			  volumeDejetoTratadoDia: "volumeDejetoTratadoDia"
			  
		  };

		  itemsNotFormatted = unidades;

		  var itemsFormatted = [];

		  // format the data
		  itemsNotFormatted.forEach((item) => {
		      itemsFormatted.push({
		    	  anoDeInicioOperacao: item.anoDeInicioOperacao.replace(/,/g, ''), // remove commas to avoid errors,
		    	  biogasParaBiometano: item.biogasParaBiometano,
		    	  biogasParaEnergiaEletrica: item.biogasParaEnergiaEletrica,
		    	  biogasParaEnergiaMecanica: item.biogasParaEnergiaMecanica,
		    	  biogasParaEnergiaTermica: item.biogasParaEnergiaTermica,
		    	  codigo: item.codigo,
		    	  emissaodeGEEevitado: item.emissaodeGEEevitado,
		    	  porte: item.escala.porte,
		    	  substrato: item.fonteDoSubstrato.nome,
		    	  categoria: item.fonteDoSubstrato.categoriaDeUnidade.nome,
		    	  latitude: item.latitude,
		    	  longitude: item.longitude,
		    	  municipio: item.municipio.nome,
		    	  estado: item.municipio.estado.sigla,
		    	  regiao: item.municipio.estado.regiao,
		    	  producaoBiogasAno: item.producaoBiogasAno,
		    	  producaoBiogasDia: item.producaoBiogasDia,
		    	  situacaoDaPlanta: item.situacaoDaPlanta.nome,
		    	  tecnologia: item.tecnologia.nome,
		    	  volumeCompostagemAno: item.volumeCompostagemAno,
		    	  volumeCompostagemDia: item.volumeCompostagemDia,
		    	  volumeDejetoTratadoAno: item.volumeDejetoTratadoAno,
		    	  volumeDejetoTratadoDia: item.volumeDejetoTratadoDia
		    	  
		      });
		  });
		  
		  $('#relatorioModal').modal('hide');

		  let fileTitle = 'mapbiogas-reports-csv-' + agora; // or 'my-unique-title'

		  exportCSVFile(headers, itemsFormatted, fileTitle); // call the exportCSVFile() function to process the JSON and trigger the download
}
/*-FIM-CSV-------------------------------------------------------------------------------------*/

function downloadNotaTecnica() {
	 $.ajax({
	        url: 'https://biblioteca.cibiogas.org/biblioteca/trabalho/pdf/nota-tecnica-diagnostico-da-expansao-da-adocao-da-tecnologia-de-tratamento-de-dejetos-animais-(tda)-no-territorio-brasileiro-entre-2010-e-2019.pdf',
	        method: 'GET',
	        xhrFields: {
	            responseType: 'blob'
	        },
	        success: function (data) {
	            var a = document.createElement('a');
	            var url = window.URL.createObjectURL(data);
	            a.href = url;
	            a.download = 'myfile.pdf';
	            document.body.append(a);
	            a.click();
	            a.remove();
	            window.URL.revokeObjectURL(url);
	        }
	    });
}

//Validador de Modal
function abrirModal() {
	
	if (erro == 404) {
		$("#relatorioModalErro").modal('show');
	} else {
		$("#relatorioModal").modal('show');
		erro = 0;
	}

}