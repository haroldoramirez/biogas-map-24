
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario : Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/lang/*2.6*/() = {{Http.Context.current().lang().code()}};def /*3.2*/agente/*3.8*/() = {{request().getHeader(Http.HeaderNames.USER_AGENT)}};
Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.50*/("""
"""),format.raw/*3.64*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="msapplication-TileColor" content="#3372DF">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="MAPA">
    <meta name="apple-mobile-web-app-title" content="MAPA">

    <title>"""),_display_(/*16.13*/Messages("app.title")),format.raw/*16.34*/(""" """),format.raw/*16.35*/("""| CIBiogás</title>

    <link rel="icon" sizes="192x192" href=""""),_display_(/*18.45*/routes/*18.51*/.Assets.versioned("images//ministerios/favicon-mapa.ico")),format.raw/*18.108*/("""">
    <link rel="apple-touch-icon-precomposed" href=""""),_display_(/*19.53*/routes/*19.59*/.Assets.versioned("images/ministerios/favicon-mapa.ico")),format.raw/*19.115*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.versioned("images/ministerios/favicon-mapa.ico")),format.raw/*20.117*/("""">

    """),_display_(/*22.6*/styles()),format.raw/*22.14*/("""

"""),format.raw/*24.1*/("""</head>
<body>
"""),format.raw/*26.25*/("""
"""),format.raw/*27.1*/("""<div class="mdl-layout cib-layout mdl-js-layout mdl-layout--fixed-header">

    """),format.raw/*29.22*/("""
    """),format.raw/*30.5*/("""<header class="mdl-layout__header mdl-color--deep-green-cibiogas mdl-color-text--white">
        <div class="mdl-layout__header-row">
            <div class="esconde-celular">
                <img class="top-menu-imagem-centro" src=""""),_display_(/*33.59*/routes/*33.65*/.Assets.versioned("images/cibiogas-branco.png")),format.raw/*33.112*/("""">
            </div>
            <div class="mdl-layout-spacer"></div>
            <div class="esconde-celular text-center"><strong>BIOGASMAP<br></strong></div>
            <div class="mdl-layout-spacer"></div>
            <div>
                <img class="card-image-top-menu" src=""""),_display_(/*39.56*/routes/*39.62*/.Assets.versioned("images/logos-producao-mapa.png")),format.raw/*39.113*/("""">
            </div>
        </div>
    </header>
    """),format.raw/*43.26*/("""

    """),_display_(/*45.6*/sidebar()),format.raw/*45.15*/("""

    """),format.raw/*47.24*/("""
    """),format.raw/*48.5*/("""<index class="mdl-layout__content mdl-color--grey-100">
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
    </index>
    """),format.raw/*62.21*/("""

"""),format.raw/*64.1*/("""</div>
"""),format.raw/*65.22*/("""

"""),_display_(/*67.2*/javascripts()),format.raw/*67.15*/("""
"""),format.raw/*68.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 15:42:18 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/index.scala.html
                  HASH: 126a6b2eea438a7b45c413368dc0bc0c846efbda
                  MATRIX: 746->1|843->22|854->26|911->72|924->78|1010->20|1038->70|1066->134|1093->135|1629->644|1671->665|1700->666|1791->730|1806->736|1885->793|1967->848|1982->854|2060->910|2144->967|2159->973|2237->1029|2272->1038|2301->1046|2330->1048|2373->1087|2401->1088|2509->1185|2541->1190|2802->1424|2817->1430|2886->1477|3198->1762|3213->1768|3286->1819|3369->1895|3402->1902|3432->1911|3466->1936|3498->1941|4091->2522|4120->2524|4155->2552|4184->2555|4218->2568|4246->2569
                  LINES: 27->1|31->2|31->2|31->3|31->3|32->1|33->2|34->3|35->4|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|55->24|57->26|58->27|60->29|61->30|64->33|64->33|64->33|70->39|70->39|70->39|74->43|76->45|76->45|78->47|79->48|93->62|95->64|96->65|98->67|98->67|99->68
                  -- GENERATED --
              */
          