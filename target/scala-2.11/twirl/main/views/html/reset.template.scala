
package views.html

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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPreenchido:DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*10.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*11.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*12.135*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/material/fonts.css")),format.raw/*13.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/bootstrap/form-elements.css")),format.raw/*14.120*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*15.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/bootstrap/form-base.css")),format.raw/*16.116*/("""">
        <title>"""),_display_(/*17.17*/Messages("app.title")),format.raw/*17.38*/(""" """),format.raw/*17.39*/("""- """),_display_(/*17.42*/Messages("register.page.title")),format.raw/*17.73*/("""</title>
    </head>
<body>
    """),format.raw/*20.20*/("""
    """),format.raw/*21.5*/("""<div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*26.38*/Messages("app.title")),format.raw/*26.59*/("""</strong></h1>
                        <div class="description">
                            <p> """),_display_(/*28.34*/Messages("app.title.cibiogas")),format.raw/*28.64*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h2>"""),_display_(/*36.38*/Messages("reset.page.title")),format.raw/*36.66*/("""</h2>
                                <p>"""),_display_(/*37.37*/Messages("reset.page.description")),format.raw/*37.71*/(""":</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-unlock"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            """),_display_(/*44.30*/form(routes.SenhaController.resetSenha(), 'id -> "formPreenchido")/*44.96*/ {_display_(Seq[Any](format.raw/*44.98*/("""
                                """),_display_(/*45.34*/if(formPreenchido.hasGlobalErrors)/*45.68*/ {_display_(Seq[Any](format.raw/*45.70*/("""
                                    """),format.raw/*46.37*/("""<p align="center" class="error">"""),_display_(/*46.70*/formPreenchido/*46.84*/.globalError.message),format.raw/*46.104*/("""</p>
                                """)))}),format.raw/*47.34*/("""
                                """),format.raw/*48.42*/("""
                                """),_display_(/*49.34*/templates/*49.43*/.bootstrap.email(formPreenchido("email"), Messages("register.email"))),format.raw/*49.112*/("""
                                """),format.raw/*50.33*/("""<button data-loading-text="Loading..." id="btnReset" type="submit" class="btn">"""),_display_(/*50.113*/Messages("login.page.button.reset")),format.raw/*50.148*/("""</button>
                            """)))}),format.raw/*51.30*/("""
                            """),format.raw/*52.29*/("""<br>
                            <p class="text-center">"""),_display_(/*53.53*/Messages("register.page.ask")),format.raw/*53.82*/(""" """),format.raw/*53.83*/("""<a href=""""),_display_(/*53.93*/routes/*53.99*/.UsuarioController.formularioDeLogin()),format.raw/*53.137*/("""">"""),_display_(/*53.140*/Messages("login.page.signin.title")),format.raw/*53.175*/("""</a>.</p>
                        </div>
                    </div>
                </div>
                """),_display_(/*57.18*/views/*57.23*/.html.admin.footer()),format.raw/*57.43*/("""
            """),format.raw/*58.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*61.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*62.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*63.107*/("""" type="text/javascript"></script>
    <script>
        $(document).ready(function() """),format.raw/*65.38*/("""{"""),format.raw/*65.39*/("""
            """),format.raw/*66.13*/("""/*
             Fullscreen background
             */
            $.backstretch(""""),_display_(/*69.29*/routes/*69.35*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*69.76*/("""", """),format.raw/*69.79*/("""{"""),format.raw/*69.80*/("""transitionDuration: 240"""),format.raw/*69.103*/("""}"""),format.raw/*69.104*/(""");
            $('[data-toggle="tooltip"]').tooltip();

            //$('#btnReset').on('click', function () """),format.raw/*72.54*/("""{"""),format.raw/*72.55*/("""
                """),format.raw/*73.17*/("""//var $btn = $(this).button('loading');
            //"""),format.raw/*74.15*/("""}"""),format.raw/*74.16*/(""");
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(formPreenchido:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(formPreenchido)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (formPreenchido) => apply(formPreenchido)

  def ref: this.type = this

}


}

/**/
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:20:13 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/reset.scala.html
                  HASH: b9bf2eefc85be811513ac0dfaea931e469a7e7c0
                  MATRIX: 750->1|917->29|944->77|1233->339|1248->345|1314->389|1397->445|1412->451|1508->525|1591->581|1606->587|1703->662|1786->718|1801->724|1874->775|1957->831|1972->837|2054->897|2137->953|2152->959|2226->1011|2309->1067|2324->1073|2402->1129|2448->1148|2490->1169|2519->1170|2549->1173|2601->1204|2661->1251|2693->1256|2948->1484|2990->1505|3115->1603|3166->1633|3521->1961|3570->1989|3639->2031|3694->2065|4025->2369|4100->2435|4140->2437|4201->2471|4244->2505|4284->2507|4349->2544|4409->2577|4432->2591|4474->2611|4543->2649|4604->2691|4665->2725|4683->2734|4774->2803|4835->2836|4943->2916|5000->2951|5070->2990|5127->3019|5211->3076|5261->3105|5290->3106|5327->3116|5342->3122|5402->3160|5433->3163|5490->3198|5625->3306|5639->3311|5680->3331|5721->3344|5799->3395|5814->3401|5898->3464|5978->3517|5993->3523|6086->3595|6166->3648|6181->3654|6285->3736|6398->3821|6427->3822|6468->3835|6577->3917|6592->3923|6654->3964|6685->3967|6714->3968|6766->3991|6796->3992|6933->4101|6962->4102|7007->4119|7089->4173|7118->4174|7156->4185|7185->4186
                  LINES: 27->1|33->1|34->4|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|50->20|51->21|56->26|56->26|58->28|58->28|66->36|66->36|67->37|67->37|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|78->48|79->49|79->49|79->49|80->50|80->50|80->50|81->51|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|83->53|87->57|87->57|87->57|88->58|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|95->65|95->65|96->66|99->69|99->69|99->69|99->69|99->69|99->69|99->69|102->72|102->72|103->73|104->74|104->74|105->75|105->75
                  -- GENERATED --
              */
          