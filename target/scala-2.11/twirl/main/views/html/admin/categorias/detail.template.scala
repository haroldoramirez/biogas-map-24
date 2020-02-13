
package views.html.admin.categorias

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object detail_Scope0 {
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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Categoria,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categoria: Categoria):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*3.2*/usuario/*3.9*/() = {{
    Http.Context.current().args.get("usuario").asInstanceOf[Usuario]
}};
Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/views/*9.7*/.html.admin.main("Administração - Detalhe da Categoria")/*9.63*/ {_display_(Seq[Any](format.raw/*9.65*/("""
    """),format.raw/*10.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*13.27*/routes/*13.33*/.AdminController.painel()),format.raw/*13.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a href=""""),_display_(/*14.27*/routes/*14.33*/.CategoriaController.telaLista()),format.raw/*14.65*/("""" class="btn btn-default">Categorias</a>
                <a disabled class="btn btn-default">Detalhe</a>
            </div>
            <h1 class="font-style"><i class="fa fa-bookmark" aria-hidden="true"></i> Detalhe da Categoria</h1>
        </div>
    </div>
<div class="container">
    <div class="row">
        <div class="col-md-12 col-sm-6 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading">Informações
                    <div class="btn-group pull-right">
                        <button class="btn btn-primary btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Opções <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*30.43*/routes/*30.49*/.CategoriaController.telaLista()),format.raw/*30.81*/("""">Voltar</a></li>
                            <li><a href=""""),_display_(/*31.43*/routes/*31.49*/.CategoriaController.telaEditar(categoria.getId)),format.raw/*31.97*/("""">Editar</a></li>
                            """),_display_(/*32.30*/if(usuario.isAdmin)/*32.49*/ {_display_(Seq[Any](format.raw/*32.51*/("""
                                """),format.raw/*33.33*/("""<li role="separator" class="divider"></li>
                                <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                            """)))}),format.raw/*35.30*/("""
                        """),format.raw/*36.25*/("""</ul>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Título</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*42.69*/categoria/*42.78*/.getNome),format.raw/*42.86*/("""</p>
                    </div>
                    <hr>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora de Cadastro</label>
                        <p type="date" class="display-block margin-left-027em">"""),_display_(/*47.81*/categoria/*47.90*/.getDataCadastro.format("dd MMMM yyyy")),format.raw/*47.129*/("""</p>
                    </div>
                    """),_display_(/*49.22*/if(categoria.getDataAlteracao != null)/*49.60*/{_display_(Seq[Any](format.raw/*49.61*/("""
                    """),format.raw/*50.21*/("""<hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Data/Hora de Alteração</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*53.73*/categoria/*53.82*/.getDataAlteracao.format("dd MMMM yyyy")),format.raw/*53.122*/("""</p>
                        </div>
                    """)))}),format.raw/*55.22*/("""
                """),format.raw/*56.17*/("""</div>
            </div>
        </div>
    </div>
</div>
    <div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">"""),_display_(/*66.46*/Messages("app.title")),format.raw/*66.67*/("""</h4>
                </div>
                <div class="modal-body">
                    <p class="text-center">Deseja remover a categoria <b>""""),_display_(/*69.76*/categoria/*69.85*/.getNome),format.raw/*69.93*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                    """),_display_(/*72.22*/form(routes.CategoriaController.remover(categoria.getId))/*72.79*/ {_display_(Seq[Any](format.raw/*72.81*/("""
                        """),format.raw/*73.25*/("""<input id="btnRemover" type="submit" value="Remover" class="btn btn-danger">
                    """)))}),format.raw/*74.22*/("""
                """),format.raw/*75.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
""")))}))
      }
    }
  }

  def render(categoria:Categoria): play.twirl.api.HtmlFormat.Appendable = apply(categoria)

  def f:((Categoria) => play.twirl.api.HtmlFormat.Appendable) = (categoria) => apply(categoria)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:15:28 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/categorias/detail.scala.html
                  HASH: bf7e0b69eff9728abbdd50d3130832be55f01608
                  MATRIX: 767->1|882->26|896->33|1004->23|1032->111|1060->130|1087->132|1099->137|1163->193|1202->195|1234->200|1421->360|1436->366|1482->391|1592->474|1607->480|1660->512|2551->1376|2566->1382|2619->1414|2706->1474|2721->1480|2790->1528|2864->1575|2892->1594|2932->1596|2993->1629|3215->1820|3268->1845|3606->2156|3624->2165|3653->2173|3978->2471|3996->2480|4057->2519|4137->2572|4184->2610|4223->2611|4272->2632|4546->2879|4564->2888|4626->2928|4714->2985|4759->3002|5266->3482|5308->3503|5480->3648|5498->3657|5527->3665|5652->3763|5718->3820|5758->3822|5811->3847|5940->3945|5985->3962
                  LINES: 27->1|31->3|31->3|34->1|36->5|38->8|39->9|39->9|39->9|39->9|40->10|43->13|43->13|43->13|44->14|44->14|44->14|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|65->35|66->36|72->42|72->42|72->42|77->47|77->47|77->47|79->49|79->49|79->49|80->50|83->53|83->53|83->53|85->55|86->56|96->66|96->66|99->69|99->69|99->69|102->72|102->72|102->72|103->73|104->74|105->75
                  -- GENERATED --
              */
          