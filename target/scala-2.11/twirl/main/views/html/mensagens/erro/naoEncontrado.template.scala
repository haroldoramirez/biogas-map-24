
package views.html.mensagens.erro

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object naoEncontrado_Scope0 {
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

class naoEncontrado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(titulo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*8.105*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*9.130*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*10.131*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/material/fonts.css")),format.raw/*11.107*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*12.108*/("""">
    <title>"""),_display_(/*13.13*/Messages("app.title")),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""- """),_display_(/*13.38*/Messages("app.error.found")),format.raw/*13.65*/("""</title>
</head>
<body>
        <!-- Top content -->
    <div class="top-content">

        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*23.38*/Messages("app.title")),format.raw/*23.59*/("""</strong></h1>
                        <div class="description">
                            <p>
                                """),_display_(/*26.34*/Messages("app.title.cibiogas")),format.raw/*26.64*/("""
                            """),format.raw/*27.29*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-messages">
                                <p class="mensagem alert alert-danger text-center">"""),_display_(/*35.85*/Messages("app.error.found")),format.raw/*35.112*/(""" """),format.raw/*35.113*/("""-> '"""),_display_(/*35.118*/titulo),format.raw/*35.124*/("""'</p>
                            </div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*39.51*/routes/*39.57*/.Application.index()),format.raw/*39.77*/("""">"""),_display_(/*39.80*/Messages("app.home.title")),format.raw/*39.106*/("""</a>
                        </div>
                    </div>
                </div>
                """),_display_(/*43.18*/views/*43.23*/.html.admin.footer()),format.raw/*43.43*/("""
            """),format.raw/*44.13*/("""</div>
        </div>

    </div>

    <script src=""""),_display_(/*49.19*/routes/*49.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*49.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*50.19*/routes/*50.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*50.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*51.107*/("""" type="text/javascript"></script>
    <script>
            /*
             Fullscreen background
             */
            $.backstretch(""""),_display_(/*56.29*/routes/*56.35*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*56.76*/("""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(titulo:String): play.twirl.api.HtmlFormat.Appendable = apply(titulo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (titulo) => apply(titulo)

  def ref: this.type = this

}


}

/**/
object naoEncontrado extends naoEncontrado_Scope0.naoEncontrado
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 16:51:24 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/erro/naoEncontrado.scala.html
                  HASH: c28db7ed56a98547401582d680b3aa8e86dba6ee
                  MATRIX: 776->1|887->17|914->18|1182->260|1196->266|1261->310|1339->362|1353->368|1448->442|1527->494|1542->500|1639->575|1718->627|1733->633|1806->684|1885->736|1900->742|1974->794|2016->809|2058->830|2087->831|2117->834|2165->861|2478->1147|2520->1168|2677->1298|2728->1328|2785->1357|3191->1736|3240->1763|3270->1764|3303->1769|3331->1775|3539->1956|3554->1962|3595->1982|3625->1985|3673->2011|3803->2114|3817->2119|3858->2139|3899->2152|3979->2205|3994->2211|4078->2274|4158->2327|4173->2333|4266->2405|4346->2458|4361->2464|4465->2546|4634->2688|4649->2694|4711->2735
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|54->23|54->23|57->26|57->26|58->27|66->35|66->35|66->35|66->35|66->35|70->39|70->39|70->39|70->39|70->39|74->43|74->43|74->43|75->44|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|87->56|87->56|87->56
                  -- GENERATED --
              */
          