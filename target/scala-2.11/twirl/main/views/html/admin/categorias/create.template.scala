
package views.html.admin.categorias

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[validators.CategoriaFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categoriaForm: play.data.Form[validators.CategoriaFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Cadastro de Categoria")/*6.48*/ {_display_(Seq[Any](format.raw/*6.50*/("""
    """),format.raw/*7.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.AdminController.painel()),format.raw/*10.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.CategoriaController.telaLista()),format.raw/*11.65*/("""" class="btn btn-default">Categorias</a>
                <a disabled class="btn btn-default">Cadastro</a>
            </div>
            <h1 class="font-style"><i class="fa fa-bookmark" aria-hidden="true"></i> Cadastro de Categoria</h1>
        </div>
    </div>
    <div class="col-sm-4">
        <div class="panel panel-default">
            <div class="panel-heading">Informações</div>
            <div class="panel-body">
            """),_display_(/*21.14*/form(routes.CategoriaController.inserir, 'class -> "form-horizontal", 'id -> "categoriaForm")/*21.107*/ {_display_(Seq[Any](format.raw/*21.109*/("""

                """),_display_(/*23.18*/if(categoriaForm.hasGlobalErrors)/*23.51*/ {_display_(Seq[Any](format.raw/*23.53*/("""
                    """),format.raw/*24.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-9">
                            <p class="alert alert-danger text-center">"""),_display_(/*27.72*/categoriaForm/*27.85*/.globalError.message),format.raw/*27.105*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*30.18*/("""

                    """),format.raw/*32.29*/("""
                """),_display_(/*33.18*/texto(categoriaForm("nome"),
                    label = "Nome:",
                    placeholder = "Insira o nome")),format.raw/*35.51*/("""

                    """),format.raw/*37.31*/("""
                """),format.raw/*38.17*/("""<div class="form-group">
                    <div class="col-sm-offset-2 col-sm-12">
                        <button id="btnSalvar" type="submit" class="btn btn-success">Salvar</button>
                        <a class="btn btn-default" type="button" href=""""),_display_(/*41.73*/routes/*41.79*/.CategoriaController.telaLista()),format.raw/*41.111*/("""">Cancelar</a>
                    </div>
                </div>
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*49.2*/("""

"""),format.raw/*51.1*/("""<script type="text/javascript">
    window.onload = function() """),format.raw/*52.32*/("""{"""),format.raw/*52.33*/("""
        """),format.raw/*53.9*/("""var form = document.getElementById("categoriaForm");
        form.elements[0].focus();
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/(""";
</script>"""))
      }
    }
  }

  def render(categoriaForm:play.data.Form[validators.CategoriaFormData]): play.twirl.api.HtmlFormat.Appendable = apply(categoriaForm)

  def f:((play.data.Form[validators.CategoriaFormData]) => play.twirl.api.HtmlFormat.Appendable) = (categoriaForm) => apply(categoriaForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:49 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/categorias/create.scala.html
                  HASH: 9aad906f2235c5c8e1dbdfc6cea7a8da2eb80f95
                  MATRIX: 802->1|1002->62|1030->111|1057->113|1069->118|1118->159|1157->161|1188->166|1375->326|1390->332|1436->357|1546->440|1561->446|1614->478|2080->917|2183->1010|2224->1012|2270->1031|2312->1064|2352->1066|2401->1087|2642->1301|2664->1314|2706->1334|2817->1414|2867->1444|2912->1462|3049->1578|3099->1610|3144->1627|3429->1885|3444->1891|3498->1923|3607->2001|3648->2014|3713->2049|3742->2051|3833->2114|3862->2115|3898->2124|4016->2215|4044->2216
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|40->10|40->10|40->10|41->11|41->11|41->11|51->21|51->21|51->21|53->23|53->23|53->23|54->24|57->27|57->27|57->27|60->30|62->32|63->33|65->35|67->37|68->38|71->41|71->41|71->41|74->44|75->45|79->49|81->51|82->52|82->52|83->53|85->55|85->55
                  -- GENERATED --
              */
          