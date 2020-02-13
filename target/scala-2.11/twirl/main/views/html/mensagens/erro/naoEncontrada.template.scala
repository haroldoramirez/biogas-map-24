
package views.html.mensagens.erro

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object naoEncontrada_Scope0 {
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

class naoEncontrada extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*8.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*9.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*10.135*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/material/fonts.css")),format.raw/*11.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*12.112*/("""">
        <title>"""),_display_(/*13.17*/Messages("app.title")),format.raw/*13.38*/(""" """),format.raw/*13.39*/("""- """),_display_(/*13.42*/Messages("app.404")),format.raw/*13.61*/("""</title>
    </head>
    <body>
            <!-- Top content -->
        <div class="top-content">

            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>"""),_display_(/*23.42*/Messages("app.title")),format.raw/*23.63*/("""</strong></h1>
                            <div class="description">
                                <p>
                                    """),_display_(/*26.38*/Messages("app.title.cibiogas")),format.raw/*26.68*/("""
                                """),format.raw/*27.33*/("""</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-top">
                            <div class="form-top-messages">
                                <p align="center" class="error">"""),_display_(/*34.66*/Messages("app.error.found")),format.raw/*34.93*/(""" """),format.raw/*34.94*/("""-> """"),_display_(/*34.99*/url),format.raw/*34.102*/(""""</p>
                            </div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*38.51*/routes/*38.57*/.Application.index()),format.raw/*38.77*/("""">"""),_display_(/*38.80*/Messages("app.home.title")),format.raw/*38.106*/("""</a>
                        </div>
                    </div>
                    """),_display_(/*41.22*/views/*41.27*/.html.admin.footer()),format.raw/*41.47*/("""
                """),format.raw/*42.17*/("""</div>
            </div>

        </div>

        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*47.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*48.101*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*49.111*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("javascripts/busca.js")),format.raw/*50.70*/("""" type="text/javascript"></script>
        <script>
                /*
                 Fullscreen background
                 */
                $.backstretch(""""),_display_(/*55.33*/routes/*55.39*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*55.80*/("""");
        </script>
    </body>
</html>"""))
      }
    }
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}


}

/**/
object naoEncontrada extends naoEncontrada_Scope0.naoEncontrada
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 16:54:34 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/erro/naoEncontrada.scala.html
                  HASH: 19db327413594cd557dc2c15bc4f28aa7eac2d8f
                  MATRIX: 776->1|884->14|911->15|1199->277|1213->283|1278->327|1360->383|1374->389|1469->463|1552->519|1567->525|1664->600|1747->656|1762->662|1835->713|1918->769|1933->775|2007->827|2053->846|2095->867|2124->868|2154->871|2194->890|2543->1212|2585->1233|2754->1375|2805->1405|2866->1438|3201->1746|3249->1773|3278->1774|3310->1779|3335->1782|3543->1963|3558->1969|3599->1989|3629->1992|3677->2018|3788->2102|3802->2107|3843->2127|3888->2144|3980->2209|3995->2215|4079->2278|4163->2335|4178->2341|4272->2413|4356->2470|4371->2476|4475->2558|4559->2615|4574->2621|4636->2662|4825->2824|4840->2830|4902->2871
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|54->23|54->23|57->26|57->26|58->27|65->34|65->34|65->34|65->34|65->34|69->38|69->38|69->38|69->38|69->38|72->41|72->41|72->41|73->42|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|86->55|86->55|86->55
                  -- GENERATED --
              */
          