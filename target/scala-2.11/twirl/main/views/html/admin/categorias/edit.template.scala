
package views.html.admin.categorias

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,play.data.Form[validators.CategoriaFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, categoriaForm: play.data.Form[validators.CategoriaFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Editar Categoria")/*6.43*/ {_display_(Seq[Any](format.raw/*6.45*/("""
    """),format.raw/*7.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.AdminController.painel()),format.raw/*10.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.CategoriaController.telaLista()),format.raw/*11.65*/("""" class="btn btn-default">Categorias</a>
                <a disabled class="btn btn-default">Editar</a>
            </div>
            <h1 class="font-style"><i class="fa fa-bookmark" aria-hidden="true"></i> Editar Categoria</h1>
        </div>
    </div>
    <div class="col-sm-4">
        <div class="panel panel-default">
            <div class="panel-heading">Informações</div>
            <div class="panel-body">
            """),_display_(/*21.14*/form(routes.CategoriaController.editar(id), 'class -> "form-horizontal", 'id -> "categoriaForm")/*21.110*/ {_display_(Seq[Any](format.raw/*21.112*/("""

                """),_display_(/*23.18*/if(categoriaForm.hasGlobalErrors)/*23.51*/ {_display_(Seq[Any](format.raw/*23.53*/("""
                    """),format.raw/*24.21*/("""<div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-9">
                            <p class="alert alert-danger text-center">"""),_display_(/*27.72*/categoriaForm/*27.85*/.globalError.message),format.raw/*27.105*/("""</p>
                        </div>
                    </div>
                """)))}),format.raw/*30.18*/("""

                  """),format.raw/*32.27*/("""
                """),_display_(/*33.18*/texto(categoriaForm("nome"),
                    label = "Nome:",
                    placeholder = "Insira o nome")),format.raw/*35.51*/("""

                    """),format.raw/*37.31*/("""
                """),format.raw/*38.17*/("""<div class="form-group">
                    <div class="col-sm-offset-2 col-sm-12">
                        <button id="btnSalvar" type="submit" class="btn btn-primary">Editar</button>
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

  def render(id:Long,categoriaForm:play.data.Form[validators.CategoriaFormData]): play.twirl.api.HtmlFormat.Appendable = apply(id,categoriaForm)

  def f:((Long,play.data.Form[validators.CategoriaFormData]) => play.twirl.api.HtmlFormat.Appendable) = (id,categoriaForm) => apply(id,categoriaForm)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:15:28 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/categorias/edit.scala.html
                  HASH: 1b4acd9efbe764c83c2949e5bb0eca0943dcfaea
                  MATRIX: 803->1|1013->72|1041->121|1068->123|1080->128|1124->164|1163->166|1194->171|1381->331|1396->337|1442->362|1552->445|1567->451|1620->483|2079->915|2185->1011|2226->1013|2272->1032|2314->1065|2354->1067|2403->1088|2644->1302|2666->1315|2708->1335|2819->1415|2867->1443|2912->1461|3049->1577|3099->1609|3144->1626|3429->1884|3444->1890|3498->1922|3607->2000|3648->2013|3713->2048|3742->2050|3833->2113|3862->2114|3898->2123|4016->2214|4044->2215
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|40->10|40->10|40->10|41->11|41->11|41->11|51->21|51->21|51->21|53->23|53->23|53->23|54->24|57->27|57->27|57->27|60->30|62->32|63->33|65->35|67->37|68->38|71->41|71->41|71->41|74->44|75->45|79->49|81->51|82->52|82->52|83->53|85->55|85->55
                  -- GENERATED --
              */
          