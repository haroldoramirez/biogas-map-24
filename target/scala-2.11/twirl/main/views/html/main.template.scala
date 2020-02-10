
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""<!doctype html>
<html ng-app="biogas-map" lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="msapplication-TileColor" content="#3372DF">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="MAPA">
    <meta name="apple-mobile-web-app-title" content="MAPA">

    <title>BIOGASMAP | CIBiogás</title>

    <link rel="icon" sizes="192x192" href="$"""),format.raw/*22.45*/("""{"""),format.raw/*22.46*/("""project"""),format.raw/*22.53*/("""}"""),format.raw/*22.54*/("""/img/ministerios/favicon-mapa.ico">
    <link rel="apple-touch-icon-precomposed" href="$"""),format.raw/*23.53*/("""{"""),format.raw/*23.54*/("""project"""),format.raw/*23.61*/("""}"""),format.raw/*23.62*/("""/img/ministerios/favicon-mapa.ico">
    <link rel="shortcut icon" type="image/png" href="$"""),format.raw/*24.55*/("""{"""),format.raw/*24.56*/("""project"""),format.raw/*24.63*/("""}"""),format.raw/*24.64*/("""/img/ministerios/favicon-mapa.ico">

    <!-- Bootstrap core CSS -->
    <link href="$"""),format.raw/*27.18*/("""{"""),format.raw/*27.19*/("""project"""),format.raw/*27.26*/("""}"""),format.raw/*27.27*/("""/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="$"""),format.raw/*28.18*/("""{"""),format.raw/*28.19*/("""project"""),format.raw/*28.26*/("""}"""),format.raw/*28.27*/("""/material-design/material.css" rel="stylesheet">
    <link rel="stylesheet" media="screen" href="css/material-fonts.css">
    <link rel="stylesheet" media="screen" href="css/material-icons.css">

    <link rel="stylesheet" href="$"""),format.raw/*32.35*/("""{"""),format.raw/*32.36*/("""project"""),format.raw/*32.43*/("""}"""),format.raw/*32.44*/("""/bower_components/font-awesome/css/font-awesome.min.css">

    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*34.51*/("""{"""),format.raw/*34.52*/("""project"""),format.raw/*34.59*/("""}"""),format.raw/*34.60*/("""/OpenLayers3/3.1.0/css/ol.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*35.51*/("""{"""),format.raw/*35.52*/("""project"""),format.raw/*35.59*/("""}"""),format.raw/*35.60*/("""/bower_components/jquery-ui/themes/smoothness/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*36.51*/("""{"""),format.raw/*36.52*/("""project"""),format.raw/*36.59*/("""}"""),format.raw/*36.60*/("""/bower_components/jquery-toast-plugin/dist/jquery.toast.min.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*37.51*/("""{"""),format.raw/*37.52*/("""project"""),format.raw/*37.59*/("""}"""),format.raw/*37.60*/("""/bower_components/bootstrap-multiselect/dist/css/bootstrap-multiselect.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*38.51*/("""{"""),format.raw/*38.52*/("""project"""),format.raw/*38.59*/("""}"""),format.raw/*38.60*/("""/OpenLayers3/css/style.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*39.51*/("""{"""),format.raw/*39.52*/("""project"""),format.raw/*39.59*/("""}"""),format.raw/*39.60*/("""/css/map.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*40.51*/("""{"""),format.raw/*40.52*/("""project"""),format.raw/*40.59*/("""}"""),format.raw/*40.60*/("""/css/template-mdl.css">
    <link rel="stylesheet" type="text/css" href="$"""),format.raw/*41.51*/("""{"""),format.raw/*41.52*/("""project"""),format.raw/*41.59*/("""}"""),format.raw/*41.60*/("""/css/modal.css">

    <!-- DateTimepicker CSS-->
    <link href="$"""),format.raw/*44.18*/("""{"""),format.raw/*44.19*/("""project"""),format.raw/*44.26*/("""}"""),format.raw/*44.27*/("""/bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css" rel="stylesheet">

</head>
<body>
<div id="wait" style="display:none;width:69px;height:89px;border:1px solid black;position:absolute;top:50%;left:50%;padding:2px;"><img src='$"""),format.raw/*48.142*/("""{"""),format.raw/*48.143*/("""project"""),format.raw/*48.150*/("""}"""),format.raw/*48.151*/("""/img/Preloader_3.gif' width="64" height="64" /><br>Loading..</div>
<div class="se-pre-con"></div>
<!-- Inicio do layout MDL -->
<div class="mdl-layout cib-layout mdl-js-layout mdl-layout--fixed-header">

    <!-- 	Menu Superior -->
    <header class="mdl-layout__header mdl-color--deep-green-cibiogas mdl-color-text--white">
        <div class="mdl-layout__header-row">
            <div class="esconde-celular">
                <img class="top-menu-imagem-centro" src="$"""),format.raw/*57.59*/("""{"""),format.raw/*57.60*/("""project"""),format.raw/*57.67*/("""}"""),format.raw/*57.68*/("""/img/cibiogas-branco.png" border="0" alt="cibiogas_logo">
            </div>
            <div class="mdl-layout-spacer"></div>
            <div class="esconde-celular text-center"><strong>TDA-Map<br> MAPA BRASILEIRO DE SISTEMAS DE<br> TRATAMENTO DE DEJETOS ANIMAIS</strong></div>
            <div class="mdl-layout-spacer"></div>
            <div>
                <img class="card-image-top-menu-abc esconde celular" src="$"""),format.raw/*63.76*/("""{"""),format.raw/*63.77*/("""project"""),format.raw/*63.84*/("""}"""),format.raw/*63.85*/("""/img/logos/abc3.png" border="0" alt="logo-abc">
                <img class="card-image-top-menu" src="$"""),format.raw/*64.56*/("""{"""),format.raw/*64.57*/("""project"""),format.raw/*64.64*/("""}"""),format.raw/*64.65*/("""/img/logos-producao-mapa.png" border="0" alt="logo-mapa">
            </div>
        </div>
    </header>
    <!--     Fim menu superior -->

    <!-- 	inicio menu gaveta -->
    <div class="mdl-layout__drawer">
        <nav class="cib-navigation mdl-navigation mdl-color--white">

            <!-- INICIO - Download NOTA Tecnica -->
            <div class="sections-menu">
                <div class="col-md-12">
                    <p style="padding: 0px 6px;" class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title"><b><i class="fa fa-cloud-download" aria-hidden="true"></i> NOTA TÉCNICA</b></p>
                    <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Diagnóstico Tratamento de Dejetos Animais no Brasil</p>
                    <a id="btnNotaTecnica" type="button" class="btn btn-success btn-sm" target="_blank" href="https://mailchi.mp/redbiolac/nota_tecnica_expansao-da-adocao-da-tecnologia-de-tratamento-de-dejetos-animais-no-brasil">
                        <span class="fa fa-file-pdf-o" aria-hidden="true"></span> Download
                    </a>
                </div>
            </div>
            <!-- FIM - Download NOTA Tecnica -->

            <div class="separador"></div>

            <!-- TITULO -->
            <div class="sections-menu">
                <h2 class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-title">Filtros</h2>
            </div>
            <!-- TITULO -->

            <!-- INICIO LOCALIZACAO -->
            <div class="mdl-cell mdl-cell--12-col mdl-cell--12-col-tablet mdl-cell--12-col-phone">
                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Localização</p>
                <select id="estados" name="estado-id" class="form-control input-sm">
                    <option value="0">Selecione o Estado</option>
                    <c:forEach items="$"""),format.raw/*99.40*/("""{"""),format.raw/*99.41*/("""estados"""),format.raw/*99.48*/("""}"""),format.raw/*99.49*/("""" var="estado" varStatus="contador">
                        <option value="$"""),format.raw/*100.41*/("""{"""),format.raw/*100.42*/("""estado.id"""),format.raw/*100.51*/("""}"""),format.raw/*100.52*/("""">$"""),format.raw/*100.55*/("""{"""),format.raw/*100.56*/("""estado.nome"""),format.raw/*100.67*/("""}"""),format.raw/*100.68*/("""</option>
                    </c:forEach>
                </select>
                <div class="separador-invisivel"></div>
                <select disabled id="municipios" name="unidade.municipio.id" class="form-control input-sm">
                    <option value="0">Selecione o Município</option>
                </select>
            </div>
            <!-- FIM LOCALIZACAO -->

            <div class="separador"></div>

            <!-- INICIO TECNOLOGIA -->
            <div class="sections-menu">
                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Tecnologias de tratamento dos dejetos</p>
                <div class="btn-group-wrap">
                    <div class="btn-group" data-toggle="buttons">
                        <label style="width:94px; display:inline-block;" class="btn btn-xs btn-default sidebar-tecnologia">
                            <input id="biodigestor" type="checkbox" value="1">Biodigestão
                        </label>
                        <label style="width:115px; display:inline-block;" class="btn btn-xs btn-default sidebar-tecnologia">
                            <input id="compostagem" type="checkbox" value="2">Compostagem
                        </label>
                    </div>
                </div>
            </div>
            <!-- FIM TECNOLOGIA -->

            <div class="separador"></div>

            <!-- INICIO SECTION PRODUCAO DIARIA -->
            <div class="sections-menu">
                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Porte</p>
                <div class="btn-group-wrap">
                    <div class="btn-group" data-toggle="buttons">
                        <input class="text-center input-sm" type="text" id="escala-valores" readonly="readonly">
                        <div id="escala" class="slider"></div>
                    </div>
                </div>
            </div>
            <!-- FIM SECTION PRODUCAO DIARIA -->

            <div class="separador"></div>

            <!-- INICIO SECTION SUBSTRATO -->
            <div class="sections-menu">
                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Situação</p>

                <div class="btn-group-wrap">
                    <div class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label style="width:61px; display:inline-block;" class="btn btn-xs btn-default sidebar-situacao">
                            <input value="1" id="situacaoOperando" type="checkbox">Operando
                        </label>
                        <label style="width:75px; display:inline-block;" class="btn btn-xs btn-default sidebar-situacao">
                            <input value="2" id="situacaoConstruindo" type="checkbox">Construindo
                        </label>
                        <label style="width:75px; display:inline-block;" class="btn btn-xs btn-default sidebar-situacao">
                            <input value="3" id="situacaoReformando" type="checkbox">Reformando
                        </label>
                    </div>
                </div>
            </div>
            <!-- FIM SECTION SITUACAO -->

            <div class="separador"></div>

            <!-- INICIO ANO -->
            <div class="sections-menu">
                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Início da operação com uso energético do biogás</p>
                <div class="btn-group-wrap">
                    <div class="btn-group" data-toggle="buttons">
                        <label style="width:40px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2003" type="checkbox" value="2003">2003
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2004" type="checkbox" value="2004">2004
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2005" type="checkbox" value="2005">2005
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2006" type="checkbox" value="2006">2006
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2007" type="checkbox" value="2007">2007
                        </label>
                    </div>
                    <div class="btn-group" data-toggle="buttons">
                        <label style="width:40px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2008" type="checkbox" value="2008">2008
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2009" type="checkbox" value="2009">2009
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2010" type="checkbox" value="2010">2010
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2011" type="checkbox" value="2011">2011
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2012" type="checkbox" value="2012">2012
                        </label>
                    </div>
                    <div class="btn-group" data-toggle="buttons">
                        <label style="width:40px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2013" type="checkbox" value="2013">2013
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2014" type="checkbox" value="2014">2014
                        </label>
                        <label style="width:40px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2015" type="checkbox" value="2015">2015
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2016" type="checkbox" value="2016">2016
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2017" type="checkbox" value="2017">2017
                        </label>
                    </div>
                    <div class="btn-group" data-toggle="buttons">

                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2018" type="checkbox" value="2018">2018
                        </label>
                        <label style="width:41px; display:inline-block;" class="btn btn-xs btn-default sidebar-operacao">
                            <input id="ano2019" type="checkbox" value="2019">2019
                        </label>
                    </div>
                </div>
            </div>
            <!-- FIM ANO -->

            <div class="separador"></div>

            <!-- INICIO SECTION SUBSTRATO -->
            <div class="sections-menu">

                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Atividade produtiva fonte dos dejetos</p>

                <div class="btn-group-wrap">
                    <div id="toggle_bovinocultura" class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label id="lbl_bovinocultura" style="width:212px;display:inline-block;" class="btn btn-xs btn-default sidebar-substrato">
                            <input value="3" id="bovinocultura" type="checkbox" autocomplete="off"><abbr style="cursor:default;" title="Bovinocultura de Leite ou Corte">Bovinocultura de Leite ou Corte</abbr>
                        </label>
                    </div>
                </div>

                <div class="btn-group-wrap">
                    <div id="toggle_SuinoculturaBovinoculturaAvicultura" class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label id="lbl_SuinoculturaBovinoculturaAvicultura" style="width:212px;display:inline-block;" class="btn btn-xs btn-default sidebar-substrato">
                            <input value="2" id="suinoculturaBovinoculturaAvicultura" type="checkbox" autocomplete="off"><abbr style="cursor:default;" title="Suinocultura, bovinocultura e/ou avicultura">Suino. bovino. e/ou avicultura</abbr>
                        </label>
                    </div>
                </div>

                <div class="btn-group-wrap">
                    <div id="toggle_suinoculturaLaticinios" class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label id="lbl_suinocultura" style="width:212px; display:inline-block;" class="btn btn-xs btn-default sidebar-substrato">
                            <input value="1" id="suinocultura" type="checkbox" autocomplete="off"><abbr style="cursor:default;" title="Suinocultura">Suinocultura</abbr>
                        </label>
                    </div>
                </div>
            </div>
            <!-- FIM SECTION SUBSTRATO -->

            <div class="separador"></div>

            <!-- INICIO SECTION APLICACAO -->
            <div class="sections-menu">

                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title">Aplicação do biogás produzido na biodigestão</p>

                <div class="btn-group-wrap">
                    <div class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label style="width:105px; display:inline-block;" class="btn btn-xs btn-default sidebar-aplicacao">
                            <input value="false" id="aplicacaoTermica" type="checkbox">Térmica
                        </label>
                        <label style="width:105px; display:inline-block;" class="btn btn-xs btn-default sidebar-aplicacao">
                            <input value="false" id="aplicacaoEletrica" type="checkbox">Elétrica
                        </label>
                    </div>
                    <div class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label style="width:105px; display:inline-block;" class="btn btn-xs btn-default sidebar-aplicacao">
                            <input value="false" id="aplicacaoMecanica" type="checkbox">Mecânica
                        </label>
                        <label style="width:105px; display:inline-block;" class="btn btn-xs btn-default sidebar-situacao">
                            <input value="false" id="aplicacaoBiometano" type="checkbox">GNV/Biometano
                        </label>
                    </div>
                </div>

            </div>
            <!-- FIM SECTION APLICACAO -->

            <div class="separador"></div>

            <!-- INICIO TECNOLOGIA -->
            <div class="sections-menu">
                <p class="mdl-card__supporting-text mdl-card__subtitle-text sidebar-section-title"><b><i class="fa fa-cloud-download" aria-hidden="true"></i> Geração de relatório consolidado</b></p>
                <div class="col-md-12">
                    <button id="button-clear" class="btn btn-default btn-sm">
                        <span class="fa fa-eraser" aria-hidden="true"></span> Limpar
                    </button>
                    <a id="btnRelatorioModal" type="button" class="btn btn-primary btn-sm" data-toggle="modal" onclick="abrirModal()">
                        <span class="fa fa-file-text" aria-hidden="true"></span> Relatório
                    </a>
                </div>
            </div>
            <!-- FIM TECNOLOGIA -->

            <div class="mdl-layout-spacer"></div>
            <div class="separador-invisivel"></div>

        </nav>
    </div>
    <!--    FIM menu gaveta -->

    <!-- 	inicio conteudo -->
    <main class="mdl-layout__content mdl-color--grey-100">
        <section>
            <div id="mapa" tabindex="0">
                <div id="popup" class="ol-popup">
                    <!-- Botao fechar o popup -->
                    <a id="popup-closer" class="ol-popup-closer"></a>
                    <!-- Conteudo do popup -->
                    <div id="popup-content"></div>
                </div>
            </div>
            <div id="mousePosition"></div>
            <div class="esconde-celular" id="legenda"></div>
        </section>
    </main>
    <!-- 	FIM conteudo -->

</div>
<!-- Fim do layout MDL -->

<!-- Modal relatorio -->
<div class="modal fade" id="relatorioModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h5 class="modal-title text-center" id="myModalLabel"><b>TDA-Map - RELATÓRIO</b></h5>
                <p style="margin-bottom: 1px;" class="text-center">MAPA BRASILEIRO DE SISTEMAS DE TRATAMENTO DE DEJETOS ANIMAIS</p>
            </div>
            <div class="modal-body">
                <div class="table-responsive panel">
                    <div class="text-center dados"><h3>Dados do sistema de tratamento de dejetos</h3></div>
                    <div class= "text-left"> <b style="display:inline;">Situação: </b><p style = "display:inline;" id="situacaoUnidades"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Atividade produtiva fonte dos dejetos: </b> <p style = "display:inline;" id="fonteSubstratoUnidades"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Região: </b> <p style = "display:inline;" id="regiaoUnidades"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Estado: </b> <p style = "display:inline;" id="estadoUnidades"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Município: </b> <p style = "display:inline;" id="municipioUnidades"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Ano de instalação das plantas: </b> <p style = "display:inline;" id="concatAnoOperacao"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Período do relatório: </b> <p style = "display:inline;" id="periodoRelatorio"></p><p style = "display:inline;"></p> </div>
                    <div class= "text-left"> <b style="display:inline;">Volume total de dejetos e efluentes tratados: </b> <p style = "display:inline;" id="volumeTotalDeDejetosEfluentes"></p><p style = "display:inline;"> m³/ano</p> </div>
                    <div class= "text-left"> <b style="display:inline;">Emissões de gases de efeito estufa (GEE) mitigadas: </b> <p style = "display:inline;" id="totalGEEEvitados"></p><p style = "display:inline;"> tCO2/ano</p> </div>

                    <div class="text-center dados"><h3>Tecnologia de tratamento de dejetos: Biodigestor</h3></div>
                    <div class="text-left"> <b style="display:inline;">Quantidade de unidades: </b> <p style = "display:inline;" id="quantidadeUnidadeBiodigestores"></p><p style = "display:inline;"></p> </div>
                    <div class="text-left"> <b style="display:inline;">Volume total de dejetos/efluentes tratados: </b> <p style = "display:inline;" id="volumeTotalDejetosEfluentesUnidadesBiodigestor"></p><p style = "display:inline;"> m³/ano</p></div>
                    <div class="text-left"> <b style="display:inline;">Produção total de biogás: </b> <p style = "display:inline;" id="producaoTotalBiogasUnidades"></p><p style = "display:inline;"> m³/ano</p></div>
                    <div class= "text-left"> <b style="display:inline;">Aplicação do biogás: </b> <p style = "display:inline;" id="aplicacaoUnidades"></p><p style = "display:inline;"></p> </div>

                    <div class="text-center dados"><h3>Tecnologia de compostagem</h3></div>
                    <div class="text-left"> <b style="display:inline;">Quantidade de unidades: </b> <p style = "display:inline;" id="quantidadeUnidadeCompostagem"></p><p style = "display:inline;"></p> </div>
                    <div class="text-left"> <b style="display:inline;">Volume total de composto produzido: </b> <p style = "display:inline;" id="volumeTotalCompostoProduzido"></p><p style = "display:inline;"> m³/ano</p></div>

                    <hr>
                    <div class="text-left"><b style="display:inline; ">Data de emissão do relatório: </b> <p style = "display:inline;" id="dataEmissaoRelatorio"></p><p style = "display:inline;"></p>
                        <hr>
                    </div>

                    <div style="padding:20px">
                        <img border="0" alt="logo cib" src="$"""),format.raw/*377.62*/("""{"""),format.raw/*377.63*/("""project"""),format.raw/*377.70*/("""}"""),format.raw/*377.71*/("""/img/CIBiogas_logo.png" class="cib-modal" >
                        <img border="0" alt="logo_ministerio" src="$"""),format.raw/*378.69*/("""{"""),format.raw/*378.70*/("""project"""),format.raw/*378.77*/("""}"""),format.raw/*378.78*/("""/img/ministerio-agricultura-pecuaria-logo.png" class="mapa-modal" style="margin-left:20px">
                    </div>

                    <div class="modal-footer">
                        <button data-loading-text="Loading..." id="btnDownloadRelatorioPdf" onclick="downloadRelatorioPdf()" type="button" class="btn btn-success">
                            <span class="fa fa-file-pdf-o" aria-hidden="true"></span> Download PDF
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- FIM Modal relatorio -->

<!-- Modal Erro -->
<div class="modal fade" id="relatorioModalErro" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title text-center" id="myModalLabelnot">MAPA</h5>
            </div>
            <div class="modal-body">
                <p class="text-center">Nenhuma unidade foi encontrada com os filtros selecionados.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">Fechar</button>
            </div>
        </div>
    </div>
</div>
<!-- FIM Modal Erro -->

<!-- jQUERY / BOOTSTRAP CHARTS JS -->
<script type="text/javascript" src="$"""),format.raw/*412.38*/("""{"""),format.raw/*412.39*/("""project"""),format.raw/*412.46*/("""}"""),format.raw/*412.47*/("""/bower_components/jquery/dist/jquery.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js"></script>

<!--     """),format.raw/*415.24*/(""" """),format.raw/*415.25*/("""-->
<script type="text/javascript" src="$"""),format.raw/*416.38*/("""{"""),format.raw/*416.39*/("""project"""),format.raw/*416.46*/("""}"""),format.raw/*416.47*/("""/bower_components/jquery-csv/src/jquery.csv.min.js"></script>
<script type="text/javascript" src="$"""),format.raw/*417.38*/("""{"""),format.raw/*417.39*/("""project"""),format.raw/*417.46*/("""}"""),format.raw/*417.47*/("""/bower_components/jquery-toast-plugin/dist/jquery.toast.min.js"></script>

<!--     """),format.raw/*419.24*/(""" """),format.raw/*419.25*/("""-->
<script type="text/javascript" src="$"""),format.raw/*420.38*/("""{"""),format.raw/*420.39*/("""project"""),format.raw/*420.46*/("""}"""),format.raw/*420.47*/("""/bower_components/downloadjs/download.min.js"></script>

<!--     """),format.raw/*422.17*/(""" """),format.raw/*422.18*/("""-->
<script type="text/javascript" src="$"""),format.raw/*423.38*/("""{"""),format.raw/*423.39*/("""project"""),format.raw/*423.46*/("""}"""),format.raw/*423.47*/("""/bower_components/pdfmake/build/pdfmake.min.js"></script>
<script type="text/javascript" src="$"""),format.raw/*424.38*/("""{"""),format.raw/*424.39*/("""project"""),format.raw/*424.46*/("""}"""),format.raw/*424.47*/("""/bower_components/pdfmake/build/vfs_fonts.js"></script>

<script type="text/javascript" src="$"""),format.raw/*426.38*/("""{"""),format.raw/*426.39*/("""project"""),format.raw/*426.46*/("""}"""),format.raw/*426.47*/("""/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!--     """),format.raw/*427.23*/(""" """),format.raw/*427.24*/("""-->
<script type="text/javascript" src="$"""),format.raw/*428.38*/("""{"""),format.raw/*428.39*/("""project"""),format.raw/*428.46*/("""}"""),format.raw/*428.47*/("""/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="$"""),format.raw/*429.38*/("""{"""),format.raw/*429.39*/("""project"""),format.raw/*429.46*/("""}"""),format.raw/*429.47*/("""/material-design/material.js"></script>
<script type="text/javascript" src="$"""),format.raw/*430.38*/("""{"""),format.raw/*430.39*/("""project"""),format.raw/*430.46*/("""}"""),format.raw/*430.47*/("""/bower_components/proj4/dist/proj4.js"></script>

<script type="text/javascript" src="$"""),format.raw/*432.38*/("""{"""),format.raw/*432.39*/("""project"""),format.raw/*432.46*/("""}"""),format.raw/*432.47*/("""/OpenLayers3/3.1.0/build/ol.js"></script>
<script type="text/javascript" src="https://epsg.io/29191.js"></script>
<script type="text/javascript" src="https://epsg.io/31981.js"></script>
<script type="text/javascript" src="https://epsg.io/900913.js"></script>

<!-- """),format.raw/*437.18*/(""" """),format.raw/*437.19*/("""-->
<script type="text/javascript" src="$"""),format.raw/*438.38*/("""{"""),format.raw/*438.39*/("""project"""),format.raw/*438.46*/("""}"""),format.raw/*438.47*/("""/bower_components/moment/min/moment.min.js"></script>

<!-- Mapa -->
<script type="text/javascript" src="$"""),format.raw/*441.38*/("""{"""),format.raw/*441.39*/("""project"""),format.raw/*441.46*/("""}"""),format.raw/*441.47*/("""/js/mapa/variaveis.js"></script>
<script type="text/javascript" src="$"""),format.raw/*442.38*/("""{"""),format.raw/*442.39*/("""project"""),format.raw/*442.46*/("""}"""),format.raw/*442.47*/("""/js/mapa/relatorios.js"></script>
<script type="text/javascript" src="$"""),format.raw/*443.38*/("""{"""),format.raw/*443.39*/("""project"""),format.raw/*443.46*/("""}"""),format.raw/*443.47*/("""/js/mapa/servicos.js"></script>
<script type="text/javascript" src="$"""),format.raw/*444.38*/("""{"""),format.raw/*444.39*/("""project"""),format.raw/*444.46*/("""}"""),format.raw/*444.47*/("""/js/mapa/botoes.js"></script>
<script type="text/javascript" src="$"""),format.raw/*445.38*/("""{"""),format.raw/*445.39*/("""project"""),format.raw/*445.46*/("""}"""),format.raw/*445.47*/("""/js/mapa/popup.js"></script>
<script type="text/javascript" src="$"""),format.raw/*446.38*/("""{"""),format.raw/*446.39*/("""project"""),format.raw/*446.46*/("""}"""),format.raw/*446.47*/("""/js/mapa/verificadores.js"></script>
<script type="text/javascript" src="$"""),format.raw/*447.38*/("""{"""),format.raw/*447.39*/("""project"""),format.raw/*447.46*/("""}"""),format.raw/*447.47*/("""/js/mapa/mapa.js"></script>

<!-- Controles para o mapa -->
<script type="text/javascript" src="$"""),format.raw/*450.38*/("""{"""),format.raw/*450.39*/("""project"""),format.raw/*450.46*/("""}"""),format.raw/*450.47*/("""/OpenLayers3/js/controle/mouseposition.js"></script>

<!-- Ferramentas -->
<script type="text/javascript" src="$"""),format.raw/*453.38*/("""{"""),format.raw/*453.39*/("""project"""),format.raw/*453.46*/("""}"""),format.raw/*453.47*/("""/OpenLayers3/js/ferramenta/legenda.js"></script>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Feb 10 17:22:39 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/main.scala.html
                  HASH: 406c1a059c82344349391f495f7b43285c8db862
                  MATRIX: 1079->260|1719->872|1748->873|1783->880|1812->881|1928->969|1957->970|1992->977|2021->978|2139->1068|2168->1069|2203->1076|2232->1077|2346->1163|2375->1164|2410->1171|2439->1172|2558->1263|2587->1264|2622->1271|2651->1272|2909->1502|2938->1503|2973->1510|3002->1511|3139->1620|3168->1621|3203->1628|3232->1629|3342->1711|3371->1712|3406->1719|3435->1720|3579->1836|3608->1837|3643->1844|3672->1845|3816->1961|3845->1962|3880->1969|3909->1970|4064->2097|4093->2098|4128->2105|4157->2106|4264->2185|4293->2186|4328->2193|4357->2194|4450->2259|4479->2260|4514->2267|4543->2268|4645->2342|4674->2343|4709->2350|4738->2351|4832->2417|4861->2418|4896->2425|4925->2426|5221->2693|5251->2694|5287->2701|5317->2702|5815->3172|5844->3173|5879->3180|5908->3181|6359->3604|6388->3605|6423->3612|6452->3613|6583->3716|6612->3717|6647->3724|6676->3725|8632->5653|8661->5654|8696->5661|8725->5662|8831->5739|8861->5740|8899->5749|8929->5750|8961->5753|8991->5754|9031->5765|9061->5766|27191->23867|27221->23868|27257->23875|27287->23876|27428->23988|27458->23989|27494->23996|27524->23997|28957->25401|28987->25402|29023->25409|29053->25410|29238->25580|29268->25581|29338->25622|29368->25623|29404->25630|29434->25631|29562->25730|29592->25731|29628->25738|29658->25739|29771->25837|29801->25838|29871->25879|29901->25880|29937->25887|29967->25888|30062->25961|30092->25962|30162->26003|30192->26004|30228->26011|30258->26012|30382->26107|30412->26108|30448->26115|30478->26116|30601->26210|30631->26211|30667->26218|30697->26219|30791->26297|30821->26298|30891->26339|30921->26340|30957->26347|30987->26348|31117->26449|31147->26450|31183->26457|31213->26458|31319->26535|31349->26536|31385->26543|31415->26544|31531->26631|31561->26632|31597->26639|31627->26640|31921->26917|31951->26918|32021->26959|32051->26960|32087->26967|32117->26968|32252->27074|32282->27075|32318->27082|32348->27083|32447->27153|32477->27154|32513->27161|32543->27162|32643->27233|32673->27234|32709->27241|32739->27242|32837->27311|32867->27312|32903->27319|32933->27320|33029->27387|33059->27388|33095->27395|33125->27396|33220->27462|33250->27463|33286->27470|33316->27471|33419->27545|33449->27546|33485->27553|33515->27554|33641->27651|33671->27652|33707->27659|33737->27660|33878->27772|33908->27773|33944->27780|33974->27781
                  LINES: 37->8|51->22|51->22|51->22|51->22|52->23|52->23|52->23|52->23|53->24|53->24|53->24|53->24|56->27|56->27|56->27|56->27|57->28|57->28|57->28|57->28|61->32|61->32|61->32|61->32|63->34|63->34|63->34|63->34|64->35|64->35|64->35|64->35|65->36|65->36|65->36|65->36|66->37|66->37|66->37|66->37|67->38|67->38|67->38|67->38|68->39|68->39|68->39|68->39|69->40|69->40|69->40|69->40|70->41|70->41|70->41|70->41|73->44|73->44|73->44|73->44|77->48|77->48|77->48|77->48|86->57|86->57|86->57|86->57|92->63|92->63|92->63|92->63|93->64|93->64|93->64|93->64|128->99|128->99|128->99|128->99|129->100|129->100|129->100|129->100|129->100|129->100|129->100|129->100|406->377|406->377|406->377|406->377|407->378|407->378|407->378|407->378|441->412|441->412|441->412|441->412|444->415|444->415|445->416|445->416|445->416|445->416|446->417|446->417|446->417|446->417|448->419|448->419|449->420|449->420|449->420|449->420|451->422|451->422|452->423|452->423|452->423|452->423|453->424|453->424|453->424|453->424|455->426|455->426|455->426|455->426|456->427|456->427|457->428|457->428|457->428|457->428|458->429|458->429|458->429|458->429|459->430|459->430|459->430|459->430|461->432|461->432|461->432|461->432|466->437|466->437|467->438|467->438|467->438|467->438|470->441|470->441|470->441|470->441|471->442|471->442|471->442|471->442|472->443|472->443|472->443|472->443|473->444|473->444|473->444|473->444|474->445|474->445|474->445|474->445|475->446|475->446|475->446|475->446|476->447|476->447|476->447|476->447|479->450|479->450|479->450|479->450|482->453|482->453|482->453|482->453
                  -- GENERATED --
              */
          