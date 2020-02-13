
package views.html.admin.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,play.data.Form[validators.UsuarioAdminFormData],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, usuarioForm: play.data.Form[validators.UsuarioAdminFormData], papeis:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Usuário")/*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""
"""),format.raw/*7.1*/("""<div class="col-md-12">
    <div class="page-header header-biogas">
        <div class="btn-group btn-breadcrumb pull-right">
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.AdminController.painel()),format.raw/*10.54*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.UsuarioController.telaLista()),format.raw/*11.59*/("""" class="btn btn-default">Usuários</a>
            <a disabled class="btn btn-default">Editar</a>
        </div>
        <h1 class="font-style"><i class="fa fa-user" aria-hidden="true"></i> Editar Usuário</h1>
    </div>
</div>
<div class="container">
"""),_display_(/*18.2*/form(routes.UsuarioController.editar(id), 'class -> "form-horizontal", 'id -> "usuarioForm", 'autocomplete -> "off")/*18.118*/ {_display_(Seq[Any](format.raw/*18.120*/("""
    """),format.raw/*19.5*/("""<div class="row">
        <div class="col-md-12 col-sm-6 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading">Editar Usuário</div>
                <div class="panel-body">

                    """),_display_(/*25.22*/if(usuarioForm.hasGlobalErrors)/*25.53*/ {_display_(Seq[Any](format.raw/*25.55*/("""
                    """),format.raw/*26.21*/("""<div class="form-group">
                        <label class="col-md-2 control-label"></label>
                        <div class="col-md-10">
                            <p class="alert alert-danger text-center">"""),_display_(/*29.72*/usuarioForm/*29.83*/.globalError.message),format.raw/*29.103*/("""</p>
                        </div>
                    </div>
                    """)))}),format.raw/*32.22*/("""

                    """),format.raw/*34.29*/("""
                    """),_display_(/*35.22*/texto(usuarioForm("nome"),
                    label = "Nome Completo:",
                    placeholder = "Insira o nome")),format.raw/*37.51*/("""


                    """),format.raw/*40.30*/("""
                    """),_display_(/*41.22*/texto(usuarioForm("email"),
                    label = "Email:",
                    placeholder = "Insira o email")),format.raw/*43.52*/("""

                    """),format.raw/*45.30*/("""
                    """),_display_(/*46.22*/textoSenha(usuarioForm("senha"),
                    label = "Senha:",
                    placeholder = "Insira a senha")),format.raw/*48.52*/("""

                    """),format.raw/*50.37*/("""
                    """),_display_(/*51.22*/radiobotao(usuarioForm("papel"),
                    label = "Papéis:",
                    buttonNameList = papeis)),format.raw/*53.45*/("""

                """),format.raw/*55.17*/("""</div>
            </div>
        </div>
    </div>

    <hr >
    """),format.raw/*61.15*/("""
    """),format.raw/*62.5*/("""<div class="form-group">
        <div class="col-md-12">
            <button data-loading-text="Loading..." id="btnSalvar" type="submit" class="btn btn-success" autocomplete="off">Salvar</button>
            <a class="btn btn-default" type="button" href=""""),_display_(/*65.61*/routes/*65.67*/.UsuarioController.telaLista()),format.raw/*65.97*/("""">Cancelar</a>
        </div>
    </div>
    """)))}),format.raw/*68.6*/("""
"""),format.raw/*69.1*/("""</div>
""")))}),format.raw/*70.2*/("""


"""),format.raw/*73.1*/("""<script type="text/javascript">

    window.onload = function() """),format.raw/*75.32*/("""{"""),format.raw/*75.33*/("""
        """),format.raw/*76.9*/("""var form = document.getElementById("usuarioForm");
        form.elements[0].focus();

        $('#btnSalvar').on('click', function () """),format.raw/*79.49*/("""{"""),format.raw/*79.50*/("""
            """),format.raw/*80.13*/("""var $btn = $(this).button('loading');
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/(""");

    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""";

</script>"""))
      }
    }
  }

  def render(id:Long,usuarioForm:play.data.Form[validators.UsuarioAdminFormData],papeis:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(id,usuarioForm,papeis)

  def f:((Long,play.data.Form[validators.UsuarioAdminFormData],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (id,usuarioForm,papeis) => apply(id,usuarioForm,papeis)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:40:21 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/usuarios/edit.scala.html
                  HASH: 16483892d02d11427d023b24f8dc4427634d98f9
                  MATRIX: 817->1|1049->94|1077->143|1104->145|1116->150|1158->184|1197->186|1224->187|1399->335|1414->341|1460->366|1566->445|1581->451|1632->481|1911->734|2037->850|2078->852|2110->857|2379->1099|2419->1130|2459->1132|2508->1153|2750->1368|2770->1379|2812->1399|2927->1483|2977->1513|3026->1535|3170->1658|3221->1690|3270->1712|3408->1829|3458->1860|3507->1882|3650->2004|3700->2042|3749->2064|3886->2180|3932->2198|4027->2275|4059->2280|4342->2536|4357->2542|4408->2572|4484->2618|4512->2619|4550->2627|4580->2630|4672->2694|4701->2695|4737->2704|4899->2838|4928->2839|4969->2852|5042->2898|5071->2899|5106->2907|5134->2908
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|40->10|40->10|40->10|41->11|41->11|41->11|48->18|48->18|48->18|49->19|55->25|55->25|55->25|56->26|59->29|59->29|59->29|62->32|64->34|65->35|67->37|70->40|71->41|73->43|75->45|76->46|78->48|80->50|81->51|83->53|85->55|91->61|92->62|95->65|95->65|95->65|98->68|99->69|100->70|103->73|105->75|105->75|106->76|109->79|109->79|110->80|111->81|111->81|113->83|113->83
                  -- GENERATED --
              */
          