
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logout_Scope0 {
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

class logout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*8.130*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/bootstrap/mensagens.css")),format.raw/*9.112*/("""">
    <title>Biblioteca - desconectado</title>
</head>
<body>
    <div class="row">
        <div class="container-fluid">
            <div class="mensagens">
                <div class="panel panel-default">
                    <div class="panel-heading">Biblioteca Digital
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.Application.index),format.raw/*18.59*/("""" class="pull-right">Início</a>
                    </div>
                    <div class="panel-body">
                        <p class="mensagem alert alert-warning text-center">Usuário desconectado!</p>
                    </div>
                    <div class="panel-footer">
                        <div class="panel-footer text-center">&copy <script>document.write(new Date().getFullYear())</script> - """),_display_(/*24.130*/Messages("app.title")),format.raw/*24.151*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
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

/**/
object logout extends logout_Scope0.logout
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:16:57 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/info/logout.scala.html
                  HASH: a156bc314c831a4be87cddefbb37cfa8852ba445
                  MATRIX: 844->0|1114->244|1128->250|1188->289|1266->341|1280->347|1375->421|1453->473|1467->479|1544->535|1880->844|1895->850|1934->868|2371->1277|2414->1298
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|49->18|49->18|49->18|55->24|55->24
                  -- GENERATED --
              */
          