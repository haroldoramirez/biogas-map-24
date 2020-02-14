
package views.html.mensagens.erro

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object naoAutorizado_Scope0 {
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

class naoAutorizado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*7.105*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*8.130*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*9.131*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/material/fonts.css")),format.raw/*10.107*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*11.108*/("""">
    <title>"""),_display_(/*12.13*/Messages("app.title")),format.raw/*12.34*/(""" """),format.raw/*12.35*/("""- """),_display_(/*12.38*/Messages("app.error.access")),format.raw/*12.66*/("""</title>
</head>
<body>
        <!-- Top content -->
    <div class="top-content">

        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*22.38*/Messages("app.title")),format.raw/*22.59*/("""</strong></h1>
                        <div class="description">
                            <p>
                                """),_display_(/*25.34*/Messages("app.title.cibiogas")),format.raw/*25.64*/("""
                            """),format.raw/*26.29*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-messages">
                                <p align="center" class="error">"""),_display_(/*34.66*/Messages("app.error.access")),format.raw/*34.94*/("""</p>
                            </div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*38.51*/routes/*38.57*/.UsuarioController.formularioDeLogin()),format.raw/*38.95*/("""">"""),_display_(/*38.98*/Messages("login")),format.raw/*38.115*/("""</a>
                        </div>
                    </div>
                </div>
                """),_display_(/*42.18*/views/*42.23*/.html.admin.footer()),format.raw/*42.43*/("""
            """),format.raw/*43.13*/("""</div>
        </div>

    </div>

    <script src=""""),_display_(/*48.19*/routes/*48.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*48.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*49.19*/routes/*49.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*49.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*50.19*/routes/*50.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*50.107*/("""" type="text/javascript"></script>
    <script>
            /*
             Fullscreen background
             */
            $.backstretch(""""),_display_(/*55.29*/routes/*55.35*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*55.76*/("""");
    </script>
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
object naoAutorizado extends naoAutorizado_Scope0.naoAutorizado
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/erro/naoAutorizado.scala.html
                  HASH: 37e3d7cc000afa4b05ac63f91916b151b6fb5c0b
                  MATRIX: 858->0|1126->242|1140->248|1205->292|1283->344|1297->350|1392->424|1470->476|1484->482|1580->557|1659->609|1674->615|1747->666|1826->718|1841->724|1915->776|1957->791|1999->812|2028->813|2058->816|2107->844|2420->1130|2462->1151|2619->1281|2670->1311|2727->1340|3114->1700|3163->1728|3370->1908|3385->1914|3444->1952|3474->1955|3513->1972|3643->2075|3657->2080|3698->2100|3739->2113|3819->2166|3834->2172|3918->2235|3998->2288|4013->2294|4106->2366|4186->2419|4201->2425|4305->2507|4474->2649|4489->2655|4551->2696
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|53->22|53->22|56->25|56->25|57->26|65->34|65->34|69->38|69->38|69->38|69->38|69->38|73->42|73->42|73->42|74->43|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|86->55|86->55|86->55
                  -- GENERATED --
              */
          