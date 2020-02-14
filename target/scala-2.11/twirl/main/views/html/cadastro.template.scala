
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cadastro_Scope0 {
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

class cadastro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[validators.UsuarioFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioForm: play.data.Form[validators.UsuarioFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.59*/("""
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
                                <h2>"""),_display_(/*36.38*/Messages("register.page.title")),format.raw/*36.69*/("""</h2>
                                <p>"""),_display_(/*37.37*/Messages("register.page.description")),format.raw/*37.74*/(""":</p>
                            </div>
                            <div class="form-top-right">
                                <i class="fa fa-user-plus"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            """),_display_(/*44.30*/form(routes.UsuarioController.inserir, 'id -> "formPreenchido", 'autocomplete -> "off")/*44.117*/ {_display_(Seq[Any](format.raw/*44.119*/("""
                                """),_display_(/*45.34*/if(usuarioForm.hasGlobalErrors)/*45.65*/ {_display_(Seq[Any](format.raw/*45.67*/("""
                                    """),format.raw/*46.37*/("""<p align="center" class="error">"""),_display_(/*46.70*/usuarioForm/*46.81*/.globalError.message),format.raw/*46.101*/("""</p>
                                """)))}),format.raw/*47.34*/("""
                                """),format.raw/*48.41*/("""
                                """),_display_(/*49.34*/templates/*49.43*/.bootstrap.nome(usuarioForm("nome"), Messages("register.username"))),format.raw/*49.110*/("""
                                """),format.raw/*50.42*/("""
                                """),_display_(/*51.34*/templates/*51.43*/.bootstrap.email(usuarioForm("email"), Messages("register.email"))),format.raw/*51.109*/("""
                                """),format.raw/*52.45*/("""
                                """),_display_(/*53.34*/templates/*53.43*/.bootstrap.senha(usuarioForm("senha"), Messages("register.password"))),format.raw/*53.112*/("""
                                """),format.raw/*54.53*/("""
                                """),_display_(/*55.34*/templates/*55.43*/.bootstrap.senha(usuarioForm("confirm_senha"), Messages("register.confirm.password"))),format.raw/*55.128*/("""
                                """),format.raw/*56.33*/("""<button data-loading-text="Loading..." id="btnRegistrar" type="submit" class="btn">"""),_display_(/*56.117*/Messages("register")),format.raw/*56.137*/("""</button>
                            """)))}),format.raw/*57.30*/("""
                            """),format.raw/*58.29*/("""<br>
                            <p class="text-center">"""),_display_(/*59.53*/Messages("register.page.ask")),format.raw/*59.82*/(""" """),format.raw/*59.83*/("""<a href=""""),_display_(/*59.93*/routes/*59.99*/.UsuarioController.formularioDeLogin()),format.raw/*59.137*/("""">"""),_display_(/*59.140*/Messages("login.page.signin.title")),format.raw/*59.175*/("""</a>.</p>
                        </div>
                    </div>
                </div>
                """),_display_(/*63.18*/views/*63.23*/.html.admin.footer()),format.raw/*63.43*/("""
            """),format.raw/*64.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*67.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*68.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*69.107*/("""" type="text/javascript"></script>
    <script>
        $(document).ready(function() """),format.raw/*71.38*/("""{"""),format.raw/*71.39*/("""

            """),format.raw/*73.13*/("""/*
             Fullscreen background
             */
            $.backstretch(""""),_display_(/*76.29*/routes/*76.35*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*76.76*/("""", """),format.raw/*76.79*/("""{"""),format.raw/*76.80*/("""transitionDuration: 240"""),format.raw/*76.103*/("""}"""),format.raw/*76.104*/(""");

            $('[data-toggle="tooltip"]').tooltip();

            $(".toggle-password").click(function() """),format.raw/*80.52*/("""{"""),format.raw/*80.53*/("""

            """),format.raw/*82.13*/("""$(this).toggleClass("fa-eye fa-eye-slash");
                var input = $($(this).attr("toggle"));
                if (input.attr("type") == "password") """),format.raw/*84.55*/("""{"""),format.raw/*84.56*/("""
                    """),format.raw/*85.21*/("""input.attr("type", "text");
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""" """),format.raw/*86.19*/("""else """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
                    """),format.raw/*87.21*/("""input.attr("type", "password");
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/(""");

            $('#btnRegistrar').on('click', function () """),format.raw/*91.56*/("""{"""),format.raw/*91.57*/("""
                """),format.raw/*92.17*/("""var $btn = $(this).button('loading');
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/(""");
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(usuarioForm:play.data.Form[validators.UsuarioFormData]): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm)

  def f:((play.data.Form[validators.UsuarioFormData]) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm) => apply(usuarioForm)

  def ref: this.type = this

}


}

/**/
object cadastro extends cadastro_Scope0.cadastro
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:23:51 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/cadastro.scala.html
                  HASH: 530a44796df2f74109c0d373dbbf0a5b621a0971
                  MATRIX: 787->1|983->58|1010->106|1299->368|1314->374|1380->418|1463->474|1478->480|1574->554|1657->610|1672->616|1769->691|1852->747|1867->753|1940->804|2023->860|2038->866|2120->926|2203->982|2218->988|2292->1040|2375->1096|2390->1102|2468->1158|2514->1177|2556->1198|2585->1199|2615->1202|2667->1233|2727->1280|2759->1285|3014->1513|3056->1534|3181->1632|3232->1662|3587->1990|3639->2021|3708->2063|3766->2100|4100->2407|4197->2494|4238->2496|4299->2530|4339->2561|4379->2563|4444->2600|4504->2633|4524->2644|4566->2664|4635->2702|4696->2743|4757->2777|4775->2786|4864->2853|4925->2895|4986->2929|5004->2938|5092->3004|5153->3049|5214->3083|5232->3092|5323->3161|5384->3214|5445->3248|5463->3257|5570->3342|5631->3375|5743->3459|5785->3479|5855->3518|5912->3547|5996->3604|6046->3633|6075->3634|6112->3644|6127->3650|6187->3688|6218->3691|6275->3726|6410->3834|6424->3839|6465->3859|6506->3872|6584->3923|6599->3929|6683->3992|6763->4045|6778->4051|6871->4123|6951->4176|6966->4182|7070->4264|7183->4349|7212->4350|7254->4364|7363->4446|7378->4452|7440->4493|7471->4496|7500->4497|7552->4520|7582->4521|7718->4629|7747->4630|7789->4644|7970->4797|7999->4798|8048->4819|8120->4863|8149->4864|8178->4865|8211->4870|8240->4871|8289->4892|8365->4940|8394->4941|8435->4954|8464->4955|8551->5014|8580->5015|8625->5032|8703->5082|8732->5083|8770->5094|8799->5095
                  LINES: 27->1|33->1|34->4|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|50->20|51->21|56->26|56->26|58->28|58->28|66->36|66->36|67->37|67->37|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|78->48|79->49|79->49|79->49|80->50|81->51|81->51|81->51|82->52|83->53|83->53|83->53|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|88->58|89->59|89->59|89->59|89->59|89->59|89->59|89->59|89->59|93->63|93->63|93->63|94->64|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|101->71|101->71|103->73|106->76|106->76|106->76|106->76|106->76|106->76|106->76|110->80|110->80|112->82|114->84|114->84|115->85|116->86|116->86|116->86|116->86|116->86|117->87|118->88|118->88|119->89|119->89|121->91|121->91|122->92|123->93|123->93|124->94|124->94
                  -- GENERATED --
              */
          