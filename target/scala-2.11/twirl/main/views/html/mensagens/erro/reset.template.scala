
package views.html.mensagens.erro

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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*8.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*9.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*10.135*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/material/fonts.css")),format.raw/*11.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/bootstrap/form-elements.css")),format.raw/*12.120*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*13.112*/("""">
        <title>"""),_display_(/*14.17*/Messages("app.title")),format.raw/*14.38*/(""" """),format.raw/*14.39*/("""- """),_display_(/*14.42*/Messages("reset.page.title")),format.raw/*14.70*/("""</title>
    </head>
    <body>
            <!-- Top content -->
        <div class="top-content">

            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>"""),_display_(/*24.42*/Messages("app.title")),format.raw/*24.63*/("""</strong></h1>
                            <div class="description">
                                <p>
                                    """),_display_(/*27.38*/Messages("app.title.cibiogas")),format.raw/*27.68*/("""
                                """),format.raw/*28.33*/("""</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                            <div class="form-top">
                                <div class="form-top-messages">

                                    """),_display_(/*37.38*/if(tipoMensagem.equals("Invalido"))/*37.73*/ {_display_(Seq[Any](format.raw/*37.75*/("""
                                        """),format.raw/*38.41*/("""<p align="center" class="error">
                                            """),_display_(/*39.46*/mensagem),format.raw/*39.54*/("""
                                        """),format.raw/*40.41*/("""</p>
                                    """)))}),format.raw/*41.38*/("""

                                    """),_display_(/*43.38*/if(tipoMensagem.equals("Erro"))/*43.69*/ {_display_(Seq[Any](format.raw/*43.71*/("""
                                        """),format.raw/*44.41*/("""<p align="center" class="error">
                                            """),_display_(/*45.46*/mensagem),format.raw/*45.54*/("""
                                        """),format.raw/*46.41*/("""</p>
                                    """)))}),format.raw/*47.38*/("""

                                """),format.raw/*49.33*/("""</div>
                            </div>
                            <div class="form-bottom-messages">
                                <a class="btn" href=""""),_display_(/*52.55*/routes/*52.61*/.Application.index()),format.raw/*52.81*/("""">"""),_display_(/*52.84*/Messages("app.home.title")),format.raw/*52.110*/("""</a>
                            </div>
                        </div>
                    </div>
                    """),_display_(/*56.22*/views/*56.27*/.html.admin.footer()),format.raw/*56.47*/("""
                """),format.raw/*57.17*/("""</div>
            </div>
        </div>

        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*61.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*62.101*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*63.23*/routes/*63.29*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*63.111*/("""" type="text/javascript"></script>
        <script>
            /*
             Fullscreen background
             */
            $.backstretch(""""),_display_(/*68.29*/routes/*68.35*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*68.76*/("""");
    </script>
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
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 16:51:24 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/erro/reset.scala.html
                  HASH: 654e40caac3d8a95714f4e2d98b1ceab867f5f56
                  MATRIX: 767->1|900->39|927->40|1215->302|1229->308|1294->352|1376->408|1390->414|1485->488|1568->544|1583->550|1680->625|1763->681|1778->687|1851->738|1934->794|1949->800|2031->860|2114->916|2129->922|2203->974|2249->993|2291->1014|2320->1015|2350->1018|2399->1046|2748->1368|2790->1389|2959->1531|3010->1561|3071->1594|3459->1955|3503->1990|3543->1992|3612->2033|3717->2111|3746->2119|3815->2160|3888->2202|3954->2241|3994->2272|4034->2274|4103->2315|4208->2393|4237->2401|4306->2442|4379->2484|4441->2518|4627->2677|4642->2683|4683->2703|4713->2706|4761->2732|4907->2851|4921->2856|4962->2876|5007->2893|5098->2957|5113->2963|5197->3026|5281->3083|5296->3089|5390->3161|5474->3218|5489->3224|5593->3306|5766->3452|5781->3458|5843->3499
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|55->24|55->24|58->27|58->27|59->28|68->37|68->37|68->37|69->38|70->39|70->39|71->40|72->41|74->43|74->43|74->43|75->44|76->45|76->45|77->46|78->47|80->49|83->52|83->52|83->52|83->52|83->52|87->56|87->56|87->56|88->57|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|99->68|99->68|99->68
                  -- GENERATED --
              */
          