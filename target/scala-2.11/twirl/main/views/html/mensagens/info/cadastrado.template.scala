
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cadastrado_Scope0 {
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

class cadastrado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
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
    <title>"""),_display_(/*14.13*/Messages("app.title")),format.raw/*14.34*/(""" """),format.raw/*14.35*/("""- """),_display_(/*14.38*/Messages("register.success")),format.raw/*14.66*/("""</title>
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
                                """),_display_(/*33.34*/if(username == null)/*33.54*/ {_display_(Seq[Any](format.raw/*33.56*/("""
                                    """),format.raw/*34.37*/("""<p align="center" class="error">
                                        """),_display_(/*35.42*/Messages("register.error")),format.raw/*35.68*/("""
                                    """),format.raw/*36.37*/("""</p>
                                """)))}/*37.36*/else/*37.41*/{_display_(Seq[Any](format.raw/*37.42*/("""
                                    """),format.raw/*38.37*/("""<div align="center">
                                        <p class="success">"""),_display_(/*39.61*/Messages("register.success")),format.raw/*39.89*/(""" """),format.raw/*39.90*/("""""""),_display_(/*39.92*/username),format.raw/*39.100*/("""". <br>"""),_display_(/*39.108*/Messages("register.success.verify")),format.raw/*39.143*/("""</p>
                                    </div>
                                """)))}),format.raw/*41.34*/("""
                            """),format.raw/*42.29*/("""</div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*45.51*/routes/*45.57*/.Application.index()),format.raw/*45.77*/("""">"""),_display_(/*45.80*/Messages("app.home.title")),format.raw/*45.106*/("""</a>
                        </div>
                    </div>
                </div>
                """),_display_(/*49.18*/views/*49.23*/.html.admin.footer()),format.raw/*49.43*/("""
            """),format.raw/*50.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*53.19*/routes/*53.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*53.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*54.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*55.19*/routes/*55.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*55.107*/("""" type="text/javascript"></script>
    <script>
        /*
         Fullscreen background
         */
        $.backstretch(""""),_display_(/*60.25*/routes/*60.31*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*60.72*/("""", """),format.raw/*60.75*/("""{"""),format.raw/*60.76*/("""transitionDuration: 240"""),format.raw/*60.99*/("""}"""),format.raw/*60.100*/(""");
        $(document).ready(function()"""),format.raw/*61.37*/("""{"""),format.raw/*61.38*/("""
            """),format.raw/*62.13*/("""$('[data-toggle="tooltip"]').tooltip();
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object cadastrado extends cadastrado_Scope0.cadastrado
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:22:40 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/info/cadastrado.scala.html
                  HASH: ab12f67c31064abcf8a70bf62d07f2f48c7ede2a
                  MATRIX: 770->1|883->19|910->20|1178->262|1192->268|1257->312|1335->364|1349->370|1444->444|1523->496|1538->502|1635->577|1714->629|1729->635|1802->686|1881->738|1896->744|1978->804|2057->856|2072->862|2146->914|2188->929|2230->950|2259->951|2289->954|2338->982|2394->1025|2426->1030|2681->1258|2723->1279|2848->1377|2899->1407|3254->1735|3283->1755|3323->1757|3388->1794|3489->1868|3536->1894|3601->1931|3658->1971|3671->1976|3710->1977|3775->2014|3883->2095|3932->2123|3961->2124|3990->2126|4020->2134|4056->2142|4113->2177|4225->2258|4282->2287|4456->2434|4471->2440|4512->2460|4542->2463|4590->2489|4720->2592|4734->2597|4775->2617|4816->2630|4894->2681|4909->2687|4993->2750|5073->2803|5088->2809|5181->2881|5261->2934|5276->2940|5380->3022|5533->3148|5548->3154|5610->3195|5641->3198|5670->3199|5721->3222|5751->3223|5818->3262|5847->3263|5888->3276|5963->3324|5992->3325
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|48->17|49->18|54->23|54->23|56->25|56->25|64->33|64->33|64->33|65->34|66->35|66->35|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|72->41|73->42|76->45|76->45|76->45|76->45|76->45|80->49|80->49|80->49|81->50|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|93->62|94->63|94->63
                  -- GENERATED --
              */
          