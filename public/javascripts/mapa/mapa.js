//INICIO - Monta o mapa e os pontos na tela - funcao que executa depois que a pagina estiver carregada
$(document).ready(function() {
	
	//----------------------
	function openDrawer() {
		let drawer = document.querySelector('.mdl-layout__drawer');			
		drawer.classList.add("is-visible");
	}
	
	function carregarLegenda() {
		//Abre a Legenda
		openLegenda();
	}
		
	setTimeout(openDrawer, 500);
	setTimeout(carregarLegenda, 550);
	//----------------------
	
	let zoomslider  = new ol.control.ZoomSlider();
	let scaleline  = new ol.control.ScaleLine();
	
	let container = document.getElementById('popup');
						
	let camadaBase1 = new ol.layer.Tile({
		id : "Camada Base - Ruas",
		title : "Camada Base - Ruas",
		camadaBase : true,
		source: new ol.source.BingMaps({
			key: 'AhEGPA8tz-KzW-PGgFwn-R4N1efXldwyKmjqmTvK0aXW1ZYcAxRjwMBggWsKFaKQ',
			imagerySet: 'road'
		})
	});
	
	let camadaBase2 = new ol.layer.Tile({
		title : "Camada Base - OSM",
		camadaBase : true,
		source: new ol.source.MapQuest({ layer: 'osm' })
	});

	let layerStm = new ol.layer.Group({
		layers: [camadaBase1],
		camadaBase : true,
		title: 'Camadas Bases'
	});
	
	overlay = new ol.Overlay(({
		element: container,
		  autoPan: true,
		  autoPanAnimation: {
		    duration: 250
		  }
	}));
		
	//Zoom
	let viewport = document.getElementById('mapa');
	
    //Zoom
    function getMinZoom() {
    //Menor zoom    	
    	let width = viewport.clientWidth;
        return Math.ceil(Math.LOG2E * Math.log(width / 256));
    }
	
    //Zoom
    let initialZoom = getMinZoom();
	
	//Carregamento do Mapa
	map = new ol.Map({
		target: 'mapa',
		layers: [layerStm],
		view: 
			new ol.View({
				//para mostrar no Brasil
				center: ol.proj.transform([-50.000, -18.000], 'EPSG:4326', 'EPSG:3857'),
		        minZoom: initialZoom,
		        zoom: 4
         	}),
         overlays: [overlay]         	
	});
		
	//Adicionar barra de zoom
	map.addControl(zoomslider);
	
	//Adicionar informacoes de KM
	//map.addControl(scaleline);
			
	//Arquivo OpenLayers3/js/ferramenta/legenda.js
	addLegenda($("#legenda"), true);
	
	//Arquivo OpenLayers3/js/controle/mouseposition.js
	addMousePositionControl(4, "EPSG:4326", document.getElementById("mousePosition"));
		
	//Busca todas as unidades - Arquivo /js/servicos.js
	getTodasAsUnidades();
});
//FIM - Monta o mapa na tela - funcao que executa depois que a pagina estiver carregada

//Monta os pontos no mapa com os dados filtrados - o parametro data é um array com as unidades filtradas vindas do backend
function getFeatureMap(data) {
			
	layerPequeno = new ol.layer.Group({ visibleLayerSwitch: true, title: "Pequeno Porte", icon: iconPequeno });
	layerMedio = new ol.layer.Group({ visibleLayerSwitch: true, title: "Médio Porte",icon: iconMedio });
	layerGrande = new ol.layer.Group({ visibleLayerSwitch: true, title: "Grande Porte", icon: iconGrande });
	
	//Percorre todas as unidaes do data
	$.each(data, function(i, item) {
		
		//Adiciona a latitude e a longitude
		let iconFeature = new ol.Feature({
			geometry: new ol.geom.Point(ol.proj.transform([item.longitude,item.latitude], 'EPSG:4326', 'EPSG:3857')),
			id: i
		});
		
		//Seta o estilo baseado no intervalo/porte
		iconFeature.setStyle(getIconFeature(item.escala.intervalo));
		
		let vectorSourceUnidade = new ol.source.Vector({
			visibleLayerSwitch: false,
			features: [iconFeature]
		});

		let vectorLayerUnidade = new ol.layer.Vector({
			visibleLayerSwitch: false,
			source: vectorSourceUnidade
		});
		
		switch(item.escala.intervalo) {	
		
	    case 1:
	    	
	    	layerPequeno.getLayers().push(vectorLayerUnidade);	    	
	    	break;
	    	
	    case 2:
	    	
	    	layerMedio.getLayers().push(vectorLayerUnidade);	    
	    	break;
	    	
	    case 3:
	    	
	    	layerGrande.getLayers().push(vectorLayerUnidade);	    	
	    	break;
	    	
	    default:
	    	
	        {}
	    
		}
		
	});
	
	map.addLayer(layerPequeno);
	map.addLayer(layerMedio);
	map.addLayer(layerGrande);

	//Arquivo /js/popup.js
	addPopup();	
	
}

//Seta os estilos dos pontos - verde - amarelo - azul dependendo do porte
function getIconFeature(porte) {
	
	switch(porte) {
	
    case 1:
    	return new ol.style.Style({
    		image: new ol.style.Icon(({
    			anchor: [0.5, 46],
    			anchorXUnits: 'fraction',
    			anchorYUnits: 'pixels',
    			opacity: 0.75,
    			offset:[-18,-9],
    			size: [66,66],    			
    			src: iconPequeno
    		}))
    	});        
    case 2:
    	return new ol.style.Style({
    		image: new ol.style.Icon(({
    			anchor: [0.5, 46],
    			anchorXUnits: 'fraction',
    			anchorYUnits: 'pixels',
    			opacity: 0.75,
    			offset:[-18,-9],
    			size: [66,66],    			
    			src: iconMedio
    		}))
    	});        
    case 3:
    	return new ol.style.Style({
    		image: new ol.style.Icon(({
    			anchor: [0.5, 46],
    			anchorXUnits: 'fraction',
    			anchorYUnits: 'pixels',
    			opacity: 0.75,
    			offset:[-18,-9],
    			size: [66,66],
    			src: iconGrande
    		}))
    	});
    
    default:
        {}
	}
	
}
