
package views.html.admin.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[validators.UsuarioAdminFormData],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioForm: play.data.Form[validators.UsuarioAdminFormData], papeis:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.85*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Usuários")/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
"""),format.raw/*7.1*/("""<div class="col-md-12">
    <div class="page-header header-biogas">
        <div class="btn-group btn-breadcrumb pull-right">
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.AdminController.painel()),format.raw/*10.54*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.UsuarioController.telaLista()),format.raw/*11.59*/("""" class="btn btn-default">Usuários</a>
            <a disabled class="btn btn-default">Editar</a>
        </div>
        <h1 class="font-style"><i class="fa fa-user" aria-hidden="true"></i> Cadastro de Usuário</h1>
    </div>
</div>
<!--Tela de Cadastro-->
<div class="container">
"""),_display_(/*19.2*/form(routes.UsuarioController.inserirAdmin, 'class -> "form-horizontal", 'id -> "usuarioForm", 'autocomplete -> "off")/*19.120*/ {_display_(Seq[Any](format.raw/*19.122*/("""
    """),format.raw/*20.5*/("""<!-- Row start -->
    <div class="row">
        <div class="col-md-12 col-sm-6 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading clearfix">
                    <i class="icon-calendar"></i>
                    <h3 class="panel-title">Informações</h3>
                </div>

                <div class="panel-body">

                    """),_display_(/*31.22*/if(usuarioForm.hasGlobalErrors)/*31.53*/ {_display_(Seq[Any](format.raw/*31.55*/("""
                    """),format.raw/*32.21*/("""<div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-10">
                            <p class="alert alert-danger text-center">"""),_display_(/*35.72*/usuarioForm/*35.83*/.globalError.message),format.raw/*35.103*/("""</p>
                        </div>
                    </div>
                    """)))}),format.raw/*38.22*/("""

                    """),format.raw/*40.29*/("""
                    """),_display_(/*41.22*/texto(usuarioForm("nome"),
                    label = "Nome:",
                    placeholder = "Insira o nome completo")),format.raw/*43.60*/("""

                    """),format.raw/*45.30*/("""
                    """),_display_(/*46.22*/texto(usuarioForm("email"),
                    label = "Email:",
                    placeholder = "Insira o email")),format.raw/*48.52*/("""

                    """),format.raw/*50.30*/("""
                    """),_display_(/*51.22*/textoSenha(usuarioForm("senha"),
                    label = "Senha:",
                    placeholder = "Insira a senha")),format.raw/*53.52*/("""

                    """),format.raw/*55.31*/("""
                    """),_display_(/*56.22*/radiobotao(usuarioForm("papel"),
                    label = "Papéis:",
                    buttonNameList = papeis)),format.raw/*58.45*/("""

                """),format.raw/*60.17*/("""</div>
            </div>
        </div>
    </div>
    <!-- Row end -->

    <hr >
    """),format.raw/*67.15*/("""
    """),format.raw/*68.5*/("""<div class="form-group">
        <div class="col-md-12">
            <button data-loading-text="Loading..." id="btnSalvar" type="submit" class="btn btn-success" autocomplete="off">Salvar</button>
            <a class="btn btn-default" type="button" href=""""),_display_(/*71.61*/routes/*71.67*/.UsuarioController.telaLista()),format.raw/*71.97*/("""">Cancelar</a>
        </div>
    </div>
    """)))}),format.raw/*74.6*/("""

"""),format.raw/*76.1*/("""</div>

""")))}),format.raw/*78.2*/("""

"""),format.raw/*80.1*/("""<script type="text/javascript">

    window.onload = function() """),format.raw/*82.32*/("""{"""),format.raw/*82.33*/("""
        """),format.raw/*83.9*/("""var form = document.getElementById("usuarioForm");
        form.elements[0].focus();

        $('#btnSalvar').on('click', function () """),format.raw/*86.49*/("""{"""),format.raw/*86.50*/("""
            """),format.raw/*87.13*/("""var $btn = $(this).button('loading');
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/(""");

        $(".toggle-password").click(function() """),format.raw/*90.48*/("""{"""),format.raw/*90.49*/("""

            """),format.raw/*92.13*/("""$(this).toggleClass("fa-eye fa-eye-slash");
            var input = $($(this).attr("toggle"));
            if (input.attr("type") == "password") """),format.raw/*94.51*/("""{"""),format.raw/*94.52*/("""
                """),format.raw/*95.17*/("""input.attr("type", "text");
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/(""" """),format.raw/*96.15*/("""else """),format.raw/*96.20*/("""{"""),format.raw/*96.21*/("""
                """),format.raw/*97.17*/("""input.attr("type", "password");
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/(""");
    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""";

</script>"""))
      }
    }
  }

  def render(usuarioForm:play.data.Form[validators.UsuarioAdminFormData],papeis:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(usuarioForm,papeis)

  def f:((play.data.Form[validators.UsuarioAdminFormData],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (usuarioForm,papeis) => apply(usuarioForm,papeis)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:40:21 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/usuarios/create.scala.html
                  HASH: 8e378d268fa8545b4f300e3eb3f81543d388494f
                  MATRIX: 816->1|1038->84|1066->133|1093->135|1105->140|1153->180|1192->182|1219->183|1394->331|1409->337|1455->362|1561->441|1576->447|1627->477|1935->759|2063->877|2104->879|2136->884|2552->1273|2592->1304|2632->1306|2681->1327|2923->1542|2943->1553|2985->1573|3100->1657|3150->1687|3199->1709|3343->1832|3393->1863|3442->1885|3580->2002|3630->2033|3679->2055|3822->2177|3872->2209|3921->2231|4058->2347|4104->2365|4220->2463|4252->2468|4535->2724|4550->2730|4601->2760|4677->2806|4706->2808|4745->2817|4774->2819|4866->2883|4895->2884|4931->2893|5093->3027|5122->3028|5163->3041|5236->3087|5265->3088|5344->3139|5373->3140|5415->3154|5588->3299|5617->3300|5662->3317|5730->3357|5759->3358|5788->3359|5821->3364|5850->3365|5895->3382|5967->3426|5996->3427|6032->3436|6061->3437|6096->3444|6125->3445
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|40->10|40->10|40->10|41->11|41->11|41->11|49->19|49->19|49->19|50->20|61->31|61->31|61->31|62->32|65->35|65->35|65->35|68->38|70->40|71->41|73->43|75->45|76->46|78->48|80->50|81->51|83->53|85->55|86->56|88->58|90->60|97->67|98->68|101->71|101->71|101->71|104->74|106->76|108->78|110->80|112->82|112->82|113->83|116->86|116->86|117->87|118->88|118->88|120->90|120->90|122->92|124->94|124->94|125->95|126->96|126->96|126->96|126->96|126->96|127->97|128->98|128->98|129->99|129->99|130->100|130->100
                  -- GENERATED --
              */
          