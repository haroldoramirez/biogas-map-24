
package views.html.admin.categorias

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.avaje.ebean.PagedList[Categoria],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.PagedList[Categoria], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*32.2*/header/*32.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    """),format.raw/*33.5*/("""<th rowspan="1" colspan="1" tabindex="0" class=""""),_display_(/*33.54*/key/*33.57*/.replace(".","_")),format.raw/*33.74*/(""" """),format.raw/*33.75*/("""sorting """),_display_(/*33.84*/if(currentSortBy == key){/*33.110*/{if(currentOrder == "asc") "sorting_asc headercor" else "sorting_desc headercor"}}),format.raw/*33.191*/("""">
        <a href=""""),_display_(/*34.19*/link(0, key)),format.raw/*34.31*/("""">"""),_display_(/*34.34*/title),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{

    var sortBy = currentSortBy
    var order = currentOrder

    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }

    // Generate the link
    routes.CategoriaController.telaLista(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

    """),format.raw/*31.41*/("""
"""),format.raw/*36.2*/("""

"""),_display_(/*38.2*/views/*38.7*/.html.admin.main("Administração - Categorias")/*38.53*/ {_display_(Seq[Any](format.raw/*38.55*/("""
    """),format.raw/*39.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*42.27*/routes/*42.33*/.AdminController.painel()),format.raw/*42.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.CategoriaController.telaLista()),format.raw/*43.65*/("""" class="btn btn-default">Categorias</a>
                <a disabled class="btn btn-default">Lista</a>
            </div>
            <h1 class="font-style"><i class="fa fa-bookmark" aria-hidden="true"></i> Lista de Categorias</h1>
        </div>
    </div>
    <div class="col-sm-12">
        """),_display_(/*50.10*/if(currentPage.getTotalRowCount == 0)/*50.47*/ {_display_(Seq[Any](format.raw/*50.49*/("""
            """),format.raw/*51.13*/("""<div class="panel panel-default">
                <div class="panel-heading">
                    <a type="button" href=""""),_display_(/*53.45*/routes/*53.51*/.CategoriaController.telaNovo()),format.raw/*53.82*/("""" class="pull-right btn btn-success">Cadastrar</a>
                    <form action=""""),_display_(/*54.36*/link(0, "nome")),format.raw/*54.51*/("""" method="GET">
                        <div class="input-group col-lg-3">
                            <input class="form-control" type="search" id="searchbox" name="f" value=""""),_display_(/*56.103*/currentFilter),format.raw/*56.116*/("""" placeholder="Filtrar por nome">
                            <span class="input-group-btn">
                                <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary">
                                <a type="button" href=""""),_display_(/*59.57*/routes/*59.63*/.CategoriaController.telaLista()),format.raw/*59.95*/("""" class="btn btn-default">Limpar</a>
                            </span>
                        </div><!-- /input-group -->
                    </form>
                </div>
            </div>
            <div class="well well-sm">
                <em>Nenhuma informação encontrada.</em>
            </div>
        """)))}/*68.11*/else/*68.16*/{_display_(Seq[Any](format.raw/*68.17*/("""
            """),format.raw/*69.13*/("""<div class="panel panel-default">
                <div class="panel-heading">
                    <a type="button" href=""""),_display_(/*71.45*/routes/*71.51*/.CategoriaController.telaNovo),format.raw/*71.80*/("""" class="pull-right btn btn-success">Cadastrar</a>
                    <form action=""""),_display_(/*72.36*/link(0, "nome")),format.raw/*72.51*/("""" method="GET">
                        <div class="input-group col-lg-3">
                            <input class="form-control" type="search" id="searchbox" name="f" value=""""),_display_(/*74.103*/currentFilter),format.raw/*74.116*/("""" placeholder="Filtrar por nome">
                            <span class="input-group-btn">
                                <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary">
                                <a type="button" href=""""),_display_(/*77.57*/routes/*77.63*/.CategoriaController.telaLista()),format.raw/*77.95*/("""" class="btn btn-default">Limpar</a>
                            </span>
                        </div><!-- /input-group -->
                    </form>
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table border="1" class="table table-bordered table-hover dataTable">
                            <thead>
                                <tr role="row">
                                    """),_display_(/*87.38*/header("nome", "Nome")),format.raw/*87.60*/("""
                                """),format.raw/*88.33*/("""</tr>
                            </thead>
                            <tbody>
                                """),_display_(/*91.34*/for(categoria <- currentPage.getList) yield /*91.71*/ {_display_(Seq[Any](format.raw/*91.73*/("""
                                    """),format.raw/*92.37*/("""<tr>
                                        <td><a href=""""),_display_(/*93.55*/routes/*93.61*/.CategoriaController.telaDetalhe(categoria.getId)),format.raw/*93.110*/("""">"""),_display_(/*93.113*/categoria/*93.122*/.getNome),format.raw/*93.130*/("""</a></td>
                                    </tr>
                                """)))}),format.raw/*95.34*/("""
                            """),format.raw/*96.29*/("""</tbody>
                        </table>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="dataTables_info" id="example2_info" role="status" aria-live="polite">
                                Visualizando """),_display_(/*102.47*/currentPage/*102.58*/.getDisplayXtoYofZ(" até ", " total ")),format.raw/*102.96*/("""</div>
                        </div>
                        <div class="col-sm-6">
                            <div class="dataTables_paginate paging_simple_numbers pull-right">
                                <ul class="pagination">
                                    """),_display_(/*107.38*/if(currentPage.hasPrev)/*107.61*/ {_display_(Seq[Any](format.raw/*107.63*/("""
                                        """),format.raw/*108.41*/("""<li class="paginate_button previous">
                                            <a href=""""),_display_(/*109.55*/link(currentPage.getPageIndex - 1, null)),format.raw/*109.95*/("""">Anterior</a>
                                        </li>
                                    """)))}/*111.39*/else/*111.44*/{_display_(Seq[Any](format.raw/*111.45*/("""
                                        """),format.raw/*112.41*/("""<li class="paginate_button previous disabled">
                                            <a>Anterior</a>
                                        </li>
                                    """)))}),format.raw/*115.38*/("""
                                    """),_display_(/*116.38*/if(currentPage.hasNext)/*116.61*/ {_display_(Seq[Any](format.raw/*116.63*/("""
                                        """),format.raw/*117.41*/("""<li class="paginate_button next">
                                            <a href=""""),_display_(/*118.55*/link(currentPage.getPageIndex + 1, null)),format.raw/*118.95*/("""">Próximo</a>
                                        </li>
                                    """)))}/*120.39*/else/*120.44*/{_display_(Seq[Any](format.raw/*120.45*/("""
                                        """),format.raw/*121.41*/("""<li class="paginate_button next disabled">
                                            <a>Próximo</a>
                                        </li>
                                    """)))}),format.raw/*124.38*/("""
                                """),format.raw/*125.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*131.10*/("""
    """),format.raw/*132.5*/("""</div>
""")))}),format.raw/*133.2*/("""

"""),format.raw/*135.1*/("""<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*136.33*/("""{"""),format.raw/*136.34*/("""
        """),format.raw/*137.9*/("""$('.btn-primary').attr('disabled',true);

        $('#searchbox').keyup(function()"""),format.raw/*139.41*/("""{"""),format.raw/*139.42*/("""
            """),format.raw/*140.13*/("""if($(this).val().length !=0)"""),format.raw/*140.41*/("""{"""),format.raw/*140.42*/("""
                """),format.raw/*141.17*/("""$('.btn-primary').attr('disabled', false);
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/("""
            """),format.raw/*143.13*/("""else
            """),format.raw/*144.13*/("""{"""),format.raw/*144.14*/("""
                """),format.raw/*145.17*/("""$('.btn-primary').attr('disabled', true);
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/("""
        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/(""")

        var table = document.getElementsByTagName('table')[0];
        resizableGrid(table);
    """),format.raw/*151.5*/("""}"""),format.raw/*151.6*/(""");
</script>"""))
      }
    }
  }

  def render(currentPage:com.avaje.ebean.PagedList[Categoria],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((com.avaje.ebean.PagedList[Categoria],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:49 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/categorias/list.scala.html
                  HASH: 0f9827025d122fcbed3dbf9367d88cbaf9fe4031
                  MATRIX: 811->1|1009->875|1023->881|1130->911|1162->916|1238->965|1250->968|1288->985|1317->986|1353->995|1388->1021|1492->1102|1540->1123|1573->1135|1603->1138|1629->1143|1667->249|1678->253|2207->120|2236->247|2264->751|2298->873|2326->1159|2355->1162|2368->1167|2423->1213|2463->1215|2495->1220|2682->1380|2697->1386|2743->1411|2853->1494|2868->1500|2921->1532|3243->1827|3289->1864|3329->1866|3370->1879|3519->2001|3534->2007|3586->2038|3699->2124|3735->2139|3940->2316|3975->2329|4263->2590|4278->2596|4331->2628|4668->2947|4681->2952|4720->2953|4761->2966|4910->3088|4925->3094|4975->3123|5088->3209|5124->3224|5329->3401|5364->3414|5652->3675|5667->3681|5720->3713|6230->4196|6273->4218|6334->4251|6473->4363|6526->4400|6566->4402|6631->4439|6717->4498|6732->4504|6803->4553|6834->4556|6853->4565|6883->4573|6999->4658|7056->4687|7394->4997|7415->5008|7475->5046|7776->5319|7809->5342|7850->5344|7920->5385|8040->5477|8102->5517|8220->5616|8234->5621|8274->5622|8344->5663|8566->5853|8632->5891|8665->5914|8706->5916|8776->5957|8892->6045|8954->6085|9071->6183|9085->6188|9125->6189|9195->6230|9412->6415|9474->6448|9656->6598|9689->6603|9728->6611|9758->6613|9851->6677|9881->6678|9918->6687|10029->6769|10059->6770|10101->6783|10158->6811|10188->6812|10234->6829|10318->6884|10348->6885|10390->6898|10436->6915|10466->6916|10512->6933|10595->6987|10625->6988|10662->6997|10692->6998|10820->7098|10849->7099
                  LINES: 27->1|31->32|31->32|33->32|34->33|34->33|34->33|34->33|34->33|34->33|34->33|34->33|35->34|35->34|35->34|35->34|37->6|37->6|59->1|61->5|62->27|64->31|65->36|67->38|67->38|67->38|67->38|68->39|71->42|71->42|71->42|72->43|72->43|72->43|79->50|79->50|79->50|80->51|82->53|82->53|82->53|83->54|83->54|85->56|85->56|88->59|88->59|88->59|97->68|97->68|97->68|98->69|100->71|100->71|100->71|101->72|101->72|103->74|103->74|106->77|106->77|106->77|116->87|116->87|117->88|120->91|120->91|120->91|121->92|122->93|122->93|122->93|122->93|122->93|122->93|124->95|125->96|131->102|131->102|131->102|136->107|136->107|136->107|137->108|138->109|138->109|140->111|140->111|140->111|141->112|144->115|145->116|145->116|145->116|146->117|147->118|147->118|149->120|149->120|149->120|150->121|153->124|154->125|160->131|161->132|162->133|164->135|165->136|165->136|166->137|168->139|168->139|169->140|169->140|169->140|170->141|171->142|171->142|172->143|173->144|173->144|174->145|175->146|175->146|176->147|176->147|180->151|180->151
                  -- GENERATED --
              */
          