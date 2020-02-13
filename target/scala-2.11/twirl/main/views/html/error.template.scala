
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
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

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
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
        <title>"""),_display_(/*13.17*/Messages("app.title")),format.raw/*13.38*/(""" """),format.raw/*13.39*/("""- """),_display_(/*13.42*/Messages("app.error")),format.raw/*13.63*/("""</title>
    </head>
<body>
    """),format.raw/*16.20*/("""
    """),format.raw/*17.5*/("""<div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*22.38*/Messages("app.title")),format.raw/*22.59*/("""</strong></h1>
                        <div class="description">
                            <p> """),_display_(/*24.34*/Messages("app.title.cibiogas")),format.raw/*24.64*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-messages">
                                <p align="center" class="error">"""),_display_(/*32.66*/mensagem),format.raw/*32.74*/("""</p>
                            </div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*36.51*/routes/*36.57*/.Application.index()),format.raw/*36.77*/("""">"""),_display_(/*36.80*/Messages("app.home.title")),format.raw/*36.106*/("""</a>
                        </div>
                    </div>
                </div>
                """),_display_(/*40.18*/views/*40.23*/.html.admin.footer()),format.raw/*40.43*/("""
            """),format.raw/*41.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*44.19*/routes/*44.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*44.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*45.19*/routes/*45.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*45.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*46.19*/routes/*46.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*46.107*/("""" type="text/javascript"></script>
    <script>
        $(document).ready(function()"""),format.raw/*48.37*/("""{"""),format.raw/*48.38*/("""

            """),format.raw/*50.13*/("""/*
             Fullscreen background
             */
            $.backstretch(""""),_display_(/*53.29*/routes/*53.35*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*53.76*/("""", """),format.raw/*53.79*/("""{"""),format.raw/*53.80*/("""transitionDuration: 240"""),format.raw/*53.103*/("""}"""),format.raw/*53.104*/(""");
            $('[data-toggle="tooltip"]').tooltip();
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(mensagem:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => apply(mensagem)

  def ref: this.type = this

}


}

/**/
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 16:47:12 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/error.scala.html
                  HASH: daa4905859056976bd3c849b905b7c98ec1f3084
                  MATRIX: 745->1|857->18|884->19|1172->281|1186->287|1251->331|1333->387|1347->393|1442->467|1525->523|1540->529|1637->604|1720->660|1735->666|1808->717|1891->773|1906->779|1980->831|2026->850|2068->871|2097->872|2127->875|2169->896|2229->943|2261->948|2516->1176|2558->1197|2683->1295|2734->1325|3121->1685|3150->1693|3357->1873|3372->1879|3413->1899|3443->1902|3491->1928|3621->2031|3635->2036|3676->2056|3717->2069|3795->2120|3810->2126|3894->2189|3974->2242|3989->2248|4082->2320|4162->2373|4177->2379|4281->2461|4393->2545|4422->2546|4464->2560|4573->2642|4588->2648|4650->2689|4681->2692|4710->2693|4762->2716|4792->2717|4882->2780|4911->2781
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|47->16|48->17|53->22|53->22|55->24|55->24|63->32|63->32|67->36|67->36|67->36|67->36|67->36|71->40|71->40|71->40|72->41|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|81->50|84->53|84->53|84->53|84->53|84->53|84->53|84->53|86->55|86->55
                  -- GENERATED --
              */
          