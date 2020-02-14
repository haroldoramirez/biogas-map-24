
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reset_Scope0 {
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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String)(tipoMensagem:String)(username:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
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
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/bootstrap/form-elements.css")),format.raw/*12.116*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*13.108*/("""">
    <title>"""),_display_(/*14.13*/Messages("app.title")),format.raw/*14.34*/(""" """),format.raw/*14.35*/("""- """),_display_(/*14.38*/Messages("reset.page.title")),format.raw/*14.66*/("""</title>
</head>
<body>
    """),format.raw/*17.20*/("""
    """),format.raw/*18.5*/("""<div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*23.38*/Messages("app.title")),format.raw/*23.59*/("""</strong></h1>
                        <div class="description">
                            <p> """),_display_(/*25.34*/Messages("app.title.cibiogas")),format.raw/*25.64*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-messages">
                                """),_display_(/*33.34*/if(tipoMensagem.equals("Sucesso"))/*33.68*/ {_display_(Seq[Any](format.raw/*33.70*/("""
                                    """),format.raw/*34.37*/("""<p align="center" class="success"> """),_display_(/*34.73*/mensagem),format.raw/*34.81*/(""" """),format.raw/*34.82*/("""""""),_display_(/*34.84*/username),format.raw/*34.92*/(""""</p>
                                """)))}),format.raw/*35.34*/("""
                                """),_display_(/*36.34*/if(tipoMensagem.equals("Validado"))/*36.69*/ {_display_(Seq[Any](format.raw/*36.71*/("""
                                    """),format.raw/*37.37*/("""<p align="center" class="success"> """),_display_(/*37.73*/mensagem),format.raw/*37.81*/(""" """),format.raw/*37.82*/("""""""),_display_(/*37.84*/username),format.raw/*37.92*/(""""</p>
                                """)))}),format.raw/*38.34*/("""
                            """),format.raw/*39.29*/("""</div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*42.51*/routes/*42.57*/.Application.index()),format.raw/*42.77*/("""">"""),_display_(/*42.80*/Messages("app.home.title")),format.raw/*42.106*/("""</a>
                        </div>
                    </div>
                </div>
                """),_display_(/*46.18*/views/*46.23*/.html.admin.footer()),format.raw/*46.43*/("""
            """),format.raw/*47.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*50.19*/routes/*50.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*50.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*51.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*52.19*/routes/*52.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*52.107*/("""" type="text/javascript"></script>
    <script>
        /*
         Fullscreen background
         */
        $.backstretch(""""),_display_(/*57.25*/routes/*57.31*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*57.72*/("""", """),format.raw/*57.75*/("""{"""),format.raw/*57.76*/("""transitionDuration: 240"""),format.raw/*57.99*/("""}"""),format.raw/*57.100*/(""");
        $(document).ready(function()"""),format.raw/*58.37*/("""{"""),format.raw/*58.38*/("""
            """),format.raw/*59.13*/("""$('[data-toggle="tooltip"]').tooltip();
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(mensagem:String,tipoMensagem:String,username:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)(tipoMensagem)(username)

  def f:((String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => (tipoMensagem) => (username) => apply(mensagem)(tipoMensagem)(username)

  def ref: this.type = this

}


}

/**/
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:22:32 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/info/reset.scala.html
                  HASH: 45bb3d8aabaf4b295042cd0b7b10420741eb3c0d
                  MATRIX: 774->1|924->56|951->57|1219->299|1233->305|1298->349|1376->401|1390->407|1485->481|1564->533|1579->539|1676->614|1755->666|1770->672|1843->723|1922->775|1937->781|2019->841|2098->893|2113->899|2187->951|2229->966|2271->987|2300->988|2330->991|2379->1019|2435->1062|2467->1067|2722->1295|2764->1316|2889->1414|2940->1444|3295->1772|3338->1806|3378->1808|3443->1845|3506->1881|3535->1889|3564->1890|3593->1892|3622->1900|3692->1939|3753->1973|3797->2008|3837->2010|3902->2047|3965->2083|3994->2091|4023->2092|4052->2094|4081->2102|4151->2141|4208->2170|4382->2317|4397->2323|4438->2343|4468->2346|4516->2372|4646->2475|4660->2480|4701->2500|4742->2513|4820->2564|4835->2570|4919->2633|4999->2686|5014->2692|5107->2764|5187->2817|5202->2823|5306->2905|5459->3031|5474->3037|5536->3078|5567->3081|5596->3082|5647->3105|5677->3106|5744->3145|5773->3146|5814->3159|5889->3207|5918->3208
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|48->17|49->18|54->23|54->23|56->25|56->25|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|70->39|73->42|73->42|73->42|73->42|73->42|77->46|77->46|77->46|78->47|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|90->59|91->60|91->60
                  -- GENERATED --
              */
          