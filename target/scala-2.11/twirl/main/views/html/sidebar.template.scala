
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sidebar_Scope0 {
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

class sidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- 	inicio menu gaveta -->
<div class="mdl-layout__drawer">
    <nav class="cib-navigation mdl-navigation mdl-color--white">

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
                <c:forEach items="$"""),format.raw/*16.36*/("""{"""),format.raw/*16.37*/("""estados"""),format.raw/*16.44*/("""}"""),format.raw/*16.45*/("""" var="estado" varStatus="contador">
                    <option value="$"""),format.raw/*17.37*/("""{"""),format.raw/*17.38*/("""estado.id"""),format.raw/*17.47*/("""}"""),format.raw/*17.48*/("""">$"""),format.raw/*17.51*/("""{"""),format.raw/*17.52*/("""estado.nome"""),format.raw/*17.63*/("""}"""),format.raw/*17.64*/("""</option>
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
<!--    FIM menu gaveta -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object sidebar extends sidebar_Scope0.sidebar
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/sidebar.scala.html
                  HASH: 33329462865c5e1e3811fa601255acb2ec7efa79
                  MATRIX: 831->0|1608->749|1637->750|1672->757|1701->758|1802->831|1831->832|1868->841|1897->842|1928->845|1957->846|1996->857|2025->858
                  LINES: 32->1|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|48->17
                  -- GENERATED --
              */
          