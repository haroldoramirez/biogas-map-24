
package views.html.senha

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object altera_Scope0 {
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

class altera extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.DynamicForm,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPreenchido:play.data.DynamicForm, token: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.55*/("""
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
        <title>"""),_display_(/*16.17*/Messages("app.title")),format.raw/*16.38*/(""" """),format.raw/*16.39*/("""- """),_display_(/*16.42*/Messages("password.change.page.title")),format.raw/*16.80*/("""</title>
    </head>
<body>
    """),format.raw/*19.20*/("""
    """),format.raw/*20.5*/("""<div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*25.38*/Messages("app.title")),format.raw/*25.59*/("""</strong></h1>
                        <div class="description">
                            <p> """),_display_(/*27.34*/Messages("app.title.cibiogas")),format.raw/*27.64*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-left">
                                <h2>"""),_display_(/*35.38*/Messages("password.change.page.title")),format.raw/*35.76*/("""</h2>
                                <p>"""),_display_(/*36.37*/Messages("password.change.page.description")),format.raw/*36.81*/(""":</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-unlock-alt"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            """),_display_(/*43.30*/form(controllers.routes.SenhaController.runReset(token), 'id -> "formPreenchido")/*43.111*/ {_display_(Seq[Any](format.raw/*43.113*/("""
                                """),_display_(/*44.34*/if(formPreenchido.hasGlobalErrors)/*44.68*/ {_display_(Seq[Any](format.raw/*44.70*/("""
                                    """),format.raw/*45.37*/("""<p align="center" class="error">"""),_display_(/*45.70*/formPreenchido/*45.84*/.globalError.message),format.raw/*45.104*/("""</p>
                                """)))}),format.raw/*46.34*/("""
                                """),format.raw/*47.45*/("""
                                """),_display_(/*48.34*/templates/*48.43*/.bootstrap.senha(formPreenchido("senha"), Messages("password.new"))),format.raw/*48.110*/("""
                                """),format.raw/*49.53*/("""
                                """),_display_(/*50.34*/templates/*50.43*/.bootstrap.senha(formPreenchido("confirm_senha"), Messages("password.confirm"))),format.raw/*50.122*/("""
                                """),format.raw/*51.33*/("""<button type="submit" class="btn">"""),_display_(/*51.68*/Messages("password.register")),format.raw/*51.97*/("""</button>
                            """)))}),format.raw/*52.30*/("""
                            """),format.raw/*53.29*/("""<br>
                            <p class="text-center">"""),_display_(/*54.53*/Messages("register.page.ask")),format.raw/*54.82*/(""" """),format.raw/*54.83*/("""<a href=""""),_display_(/*54.93*/routes/*54.99*/.UsuarioController.formularioDeLogin()),format.raw/*54.137*/("""">"""),_display_(/*54.140*/Messages("login.page.signin.title")),format.raw/*54.175*/("""</a>.</p>
                        </div>
                    </div>
                </div>
                """),_display_(/*58.18*/views/*58.23*/.html.admin.footer()),format.raw/*58.43*/("""
            """),format.raw/*59.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*62.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*63.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*64.19*/routes/*64.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*64.107*/("""" type="text/javascript"></script>
    <script>
        /*
         Fullscreen background
         */
        $.backstretch(""""),_display_(/*69.25*/routes/*69.31*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*69.72*/("""", """),format.raw/*69.75*/("""{"""),format.raw/*69.76*/("""transitionDuration: 240"""),format.raw/*69.99*/("""}"""),format.raw/*69.100*/(""");
        $(document).ready(function()"""),format.raw/*70.37*/("""{"""),format.raw/*70.38*/("""
            """),format.raw/*71.13*/("""$('[data-toggle="tooltip"]').tooltip();
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(formPreenchido:play.data.DynamicForm,token:String): play.twirl.api.HtmlFormat.Appendable = apply(formPreenchido,token)

  def f:((play.data.DynamicForm,String) => play.twirl.api.HtmlFormat.Appendable) = (formPreenchido,token) => apply(formPreenchido,token)

  def ref: this.type = this

}


}

/**/
object altera extends altera_Scope0.altera
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/senha/altera.scala.html
                  HASH: 700305b886e86d5dde6c7366b0a42492c847feb2
                  MATRIX: 775->1|967->54|994->102|1283->364|1298->370|1364->414|1447->470|1462->476|1558->550|1641->606|1656->612|1753->687|1836->743|1851->749|1924->800|2007->856|2022->862|2104->922|2187->978|2202->984|2276->1036|2322->1055|2364->1076|2393->1077|2423->1080|2482->1118|2542->1165|2574->1170|2829->1398|2871->1419|2996->1517|3047->1547|3402->1875|3461->1913|3530->1955|3595->1999|3930->2307|4021->2388|4062->2390|4123->2424|4166->2458|4206->2460|4271->2497|4331->2530|4354->2544|4396->2564|4465->2602|4526->2647|4587->2681|4605->2690|4694->2757|4755->2810|4816->2844|4834->2853|4935->2932|4996->2965|5058->3000|5108->3029|5178->3068|5235->3097|5319->3154|5369->3183|5398->3184|5435->3194|5450->3200|5510->3238|5541->3241|5598->3276|5733->3384|5747->3389|5788->3409|5829->3422|5907->3473|5922->3479|6006->3542|6086->3595|6101->3601|6194->3673|6274->3726|6289->3732|6393->3814|6546->3940|6561->3946|6623->3987|6654->3990|6683->3991|6734->4014|6764->4015|6831->4054|6860->4055|6901->4068|6976->4116|7005->4117
                  LINES: 27->1|33->1|34->4|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|46->16|46->16|49->19|50->20|55->25|55->25|57->27|57->27|65->35|65->35|66->36|66->36|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|75->45|76->46|77->47|78->48|78->48|78->48|79->49|80->50|80->50|80->50|81->51|81->51|81->51|82->52|83->53|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|88->58|88->58|88->58|89->59|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|99->69|99->69|99->69|99->69|99->69|99->69|99->69|100->70|100->70|101->71|102->72|102->72
                  -- GENERATED --
              */
          