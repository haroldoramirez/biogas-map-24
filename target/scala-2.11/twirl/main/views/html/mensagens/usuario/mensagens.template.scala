
package views.html.mensagens.usuario

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mensagens_Scope0 {
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

class mensagens extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String)(tipoMensagem:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*9.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/bootstrap/mensagens.css")),format.raw/*10.116*/("""">
        <title>"""),_display_(/*11.17*/Messages("app.title")),format.raw/*11.38*/(""" """),format.raw/*11.39*/("""- """),_display_(/*11.42*/Messages("app.messages.title")),format.raw/*11.72*/("""</title>
    </head>
    <body>
        <div class="row">
            <div class="container-fluid">
                <div class="mensagens">
                    <div class="panel panel-"""),_display_(/*17.46*/tipoMensagem),format.raw/*17.58*/("""">
                        <div class="panel-heading">
                            <a type="button" href=""""),_display_(/*19.53*/routes/*19.59*/.UsuarioController.telaLista()),format.raw/*19.89*/("""" class="pull-right btn btn-default btn-xs">
                                <span class="glyphicon glyphicon-arrow-left"></span> """),_display_(/*20.87*/Messages("app.messages.back.title")),format.raw/*20.122*/("""
                            """),format.raw/*21.29*/("""</a>
                            <h1 class="panel-title">"""),_display_(/*22.54*/Messages("app.messages.title")),format.raw/*22.84*/("""</h1>
                        </div>
                        <div class="panel-body">
                            <p class="text-"""),_display_(/*25.45*/tipoMensagem),format.raw/*25.57*/(""" """),format.raw/*25.58*/("""text-center">"""),_display_(/*25.72*/mensagem),format.raw/*25.80*/("""</p>
                        </div>
                        <div class="panel-footer text-center">&copy <script>document.write(new Date().getFullYear())</script> - """),_display_(/*27.130*/Messages("app.title")),format.raw/*27.151*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(mensagem:String,tipoMensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)(tipoMensagem)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => (tipoMensagem) => apply(mensagem)(tipoMensagem)

  def ref: this.type = this

}


}

/**/
object mensagens extends mensagens_Scope0.mensagens
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:21:22 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/usuario/mensagens.scala.html
                  HASH: 1d24df69f3663349d97529b60915af502a33ca2e
                  MATRIX: 778->1|911->39|938->40|1228->304|1242->310|1302->349|1384->405|1398->411|1493->485|1576->541|1591->547|1669->603|1715->622|1757->643|1786->644|1816->647|1867->677|2079->862|2112->874|2246->981|2261->987|2312->1017|2470->1148|2527->1183|2584->1212|2669->1270|2720->1300|2877->1430|2910->1442|2939->1443|2980->1457|3009->1465|3202->1630|3245->1651
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|48->17|48->17|50->19|50->19|50->19|51->20|51->20|52->21|53->22|53->22|56->25|56->25|56->25|56->25|56->25|58->27|58->27
                  -- GENERATED --
              */
          