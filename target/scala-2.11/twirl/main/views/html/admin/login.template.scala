
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioForm:DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.27*/("""
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
        <title>"""),_display_(/*17.17*/Messages("app.title")),format.raw/*17.38*/(""" """),format.raw/*17.39*/("""- """),_display_(/*17.42*/Messages("login.page.title")),format.raw/*17.70*/("""</title>
    </head>
    <body>
        """),format.raw/*20.24*/("""
        """),format.raw/*21.9*/("""<div class="top-content">
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>"""),_display_(/*26.42*/Messages("app.title")),format.raw/*26.63*/("""</strong></h1>
                            <div class="description">
                                <p> """),_display_(/*28.38*/Messages("app.title.cibiogas")),format.raw/*28.68*/("""</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h2>"""),_display_(/*36.42*/Messages("login.page.title")),format.raw/*36.70*/("""</h2>
                                    <p>"""),_display_(/*37.41*/Messages("login.page.description")),format.raw/*37.75*/(""":</p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-key"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                """),_display_(/*44.34*/form(routes.UsuarioController.autenticar, 'id -> "usuarioForm", 'autocomplete -> "off")/*44.121*/ {_display_(Seq[Any](format.raw/*44.123*/("""
                                    """),_display_(/*45.38*/if(usuarioForm.hasGlobalErrors)/*45.69*/ {_display_(Seq[Any](format.raw/*45.71*/("""
                                        """),format.raw/*46.41*/("""<p align="center" class="error">"""),_display_(/*46.74*/usuarioForm/*46.85*/.globalError.message),format.raw/*46.105*/("""</p>
                                    """)))}),format.raw/*47.38*/("""
                                    """),format.raw/*48.46*/("""
                                    """),_display_(/*49.38*/templates/*49.47*/.bootstrap.email(usuarioForm("email"), Messages("login.username"))),format.raw/*49.113*/("""
                                    """),format.raw/*50.49*/("""
                                    """),_display_(/*51.38*/templates/*51.47*/.bootstrap.senha(usuarioForm("senha"), Messages("login.password"))),format.raw/*51.113*/("""
                                    """),format.raw/*52.37*/("""<button data-loading-text="Loading..." id="btnAutenticar" type="submit" class="btn">"""),_display_(/*52.122*/Messages("login")),format.raw/*52.139*/("""</button>
                                """)))}),format.raw/*53.34*/("""
                                """),format.raw/*54.33*/("""<br>
                            </div>
                        </div>
                    </div>
                    """),_display_(/*58.22*/views/*58.27*/.html.admin.footer()),format.raw/*58.47*/("""
                """),format.raw/*59.17*/("""</div>
            </div>
        </div>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*62.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*63.23*/routes/*63.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*63.101*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*64.23*/routes/*64.29*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*64.111*/("""" type="text/javascript"></script>
        <script>
            $(document).ready(function() """),format.raw/*66.42*/("""{"""),format.raw/*66.43*/("""

                """),format.raw/*68.17*/("""/*
                 Fullscreen background
                 */
                $.backstretch(""""),_display_(/*71.33*/routes/*71.39*/.Assets.versioned("images/cib/udcib.webp")),format.raw/*71.81*/("""", """),format.raw/*71.84*/("""{"""),format.raw/*71.85*/("""transitionDuration: 240"""),format.raw/*71.108*/("""}"""),format.raw/*71.109*/(""");

                $('[data-toggle="tooltip"]').tooltip();

                $(".toggle-password").click(function() """),format.raw/*75.56*/("""{"""),format.raw/*75.57*/("""

                    """),format.raw/*77.21*/("""$(this).toggleClass("fa-eye fa-eye-slash");

                    var input = $($(this).attr("toggle"));

                    if (input.attr("type") == "password") """),format.raw/*81.59*/("""{"""),format.raw/*81.60*/("""
                        """),format.raw/*82.25*/("""input.attr("type", "text");
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/(""" """),format.raw/*83.23*/("""else """),format.raw/*83.28*/("""{"""),format.raw/*83.29*/("""
                        """),format.raw/*84.25*/("""input.attr("type", "password");
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""");

                $('#btnAutenticar').on('click', function () """),format.raw/*88.61*/("""{"""),format.raw/*88.62*/("""
                    """),format.raw/*89.21*/("""var $btn = $(this).button('loading');
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/(""");
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/(""");
        </script>
    </body>
</html>"""))
      }
    }
  }

  def render(usuarioForm:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm) => apply(usuarioForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/login.scala.html
                  HASH: 3d2fd699fb78435567f871756c6b185e20b3a4fd
                  MATRIX: 756->1|920->26|947->74|1236->336|1251->342|1317->386|1400->442|1415->448|1511->522|1594->578|1609->584|1706->659|1789->715|1804->721|1877->772|1960->828|1975->834|2057->894|2140->950|2155->956|2229->1008|2312->1064|2327->1070|2405->1126|2451->1145|2493->1166|2522->1167|2552->1170|2601->1198|2669->1253|2705->1262|2980->1510|3022->1531|3155->1637|3206->1667|3593->2027|3642->2055|3715->2101|3770->2135|4126->2464|4223->2551|4264->2553|4329->2591|4369->2622|4409->2624|4478->2665|4538->2698|4558->2709|4600->2729|4673->2771|4738->2817|4803->2855|4821->2864|4909->2930|4974->2979|5039->3017|5057->3026|5145->3092|5210->3129|5323->3214|5362->3231|5436->3274|5497->3307|5643->3426|5657->3431|5698->3451|5743->3468|5833->3531|5848->3537|5932->3600|6016->3657|6031->3663|6125->3735|6209->3792|6224->3798|6328->3880|6449->3973|6478->3974|6524->3992|6645->4086|6660->4092|6723->4134|6754->4137|6783->4138|6835->4161|6865->4162|7009->4278|7038->4279|7088->4301|7279->4464|7308->4465|7361->4490|7437->4538|7466->4539|7495->4540|7528->4545|7557->4546|7610->4571|7690->4623|7719->4624|7764->4641|7793->4642|7885->4706|7914->4707|7963->4728|8045->4782|8074->4783|8117->4798|8146->4799
                  LINES: 27->1|33->1|34->4|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|50->20|51->21|56->26|56->26|58->28|58->28|66->36|66->36|67->37|67->37|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|78->48|79->49|79->49|79->49|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|84->54|88->58|88->58|88->58|89->59|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|96->66|96->66|98->68|101->71|101->71|101->71|101->71|101->71|101->71|101->71|105->75|105->75|107->77|111->81|111->81|112->82|113->83|113->83|113->83|113->83|113->83|114->84|115->85|115->85|116->86|116->86|118->88|118->88|119->89|120->90|120->90|121->91|121->91
                  -- GENERATED --
              */
          