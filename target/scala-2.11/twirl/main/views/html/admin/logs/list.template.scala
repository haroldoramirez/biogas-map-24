
package views.html.admin.logs

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.avaje.ebean.PagedList[Log],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.PagedList[Log], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*35.2*/header/*35.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*35.38*/("""
"""),format.raw/*36.1*/("""<th rowspan="1" colspan="1" tabindex="0" class=""""),_display_(/*36.50*/key/*36.53*/.replace(".","_")),format.raw/*36.70*/(""" """),format.raw/*36.71*/("""sorting """),_display_(/*36.80*/if(currentSortBy == key){/*36.106*/{if(currentOrder == "asc") "sorting_asc headercor" else "sorting_desc headercor"}}),format.raw/*36.187*/("""">
<a href=""""),_display_(/*37.11*/link(0, key)),format.raw/*37.23*/("""">"""),_display_(/*37.26*/title),format.raw/*37.31*/("""</a>
</th>
""")))};def /*3.2*/usuario/*3.9*/() = {{Http.Context.current().args.get("usuario").asInstanceOf[Usuario]}};def /*9.2*/link/*9.6*/(newPage:Int, newSortBy:String) = {{

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
    routes.LogController.telaLista(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*3.81*/("""


"""),format.raw/*8.42*/("""
"""),format.raw/*30.2*/("""

"""),format.raw/*34.37*/("""
"""),format.raw/*39.2*/("""

"""),_display_(/*41.2*/views/*41.7*/.html.admin.main("Administração - Logs")/*41.47*/ {_display_(Seq[Any](format.raw/*41.49*/("""
    """),format.raw/*42.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.AdminController.painel()),format.raw/*45.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a href=""""),_display_(/*46.27*/routes/*46.33*/.LogController.telaLista()),format.raw/*46.59*/("""" class="btn btn-default">Logs</a>
                <a disabled class="btn btn-default">Lista</a>
            </div>
            <h1 class="font-style"><i class="fa fa-file" aria-hidden="true"></i> Lista de Logs</h1>
        </div>
    </div>
    <div class="col-sm-12">
    """),_display_(/*53.6*/if(currentPage.getTotalRowCount == 0)/*53.43*/ {_display_(Seq[Any](format.raw/*53.45*/("""
        """),format.raw/*54.9*/("""<div class="panel panel-default">
            <div class="panel-heading">
                <form action=""""),_display_(/*56.32*/link(0, "nome")),format.raw/*56.47*/("""" method="GET">
                    <div class="input-group col-lg-3">
                        <input class="form-control" type="search" id="searchbox" name="f" value=""""),_display_(/*58.99*/currentFilter),format.raw/*58.112*/("""" placeholder="Filtrar por mensagem">
                        <span class="input-group-btn">
                            <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary">
                            <a type="button" href=""""),_display_(/*61.53*/routes/*61.59*/.LogController.telaLista()),format.raw/*61.85*/("""" class="btn btn-default">Limpar</a>
                        </span>
                    </div><!-- /input-group -->
                </form>
            </div>
        </div>
        <div class="well well-sm">
            <em>Nenhuma informação encontrada.</em>
        </div>
    """)))}/*70.7*/else/*70.12*/{_display_(Seq[Any](format.raw/*70.13*/("""
        """),format.raw/*71.9*/("""<div class="panel panel-default">
            <div class="panel-heading">
                <form action=""""),_display_(/*73.32*/link(0, "nome")),format.raw/*73.47*/("""" method="GET">
                    <div class="input-group col-lg-3">
                        <input class="form-control" type="search" id="searchbox" name="f" value=""""),_display_(/*75.99*/currentFilter),format.raw/*75.112*/("""" placeholder="Filtrar por mensagem">
                        <span class="input-group-btn">
                            <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary">
                            <a type="button" href=""""),_display_(/*78.53*/routes/*78.59*/.LogController.telaLista()),format.raw/*78.85*/("""" class="btn btn-default">Limpar</a>
                        </span>
                    </div><!-- /input-group -->
                </form>
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table border="1" class="table table-bordered table-hover dataTable">
                        <thead>
                            <tr role="row">
                                """),_display_(/*88.34*/header("dataCadastro", "Data")),format.raw/*88.64*/("""
                                """),_display_(/*89.34*/header("mensagem", "Mensagens")),format.raw/*89.65*/("""
                                """),_display_(/*90.34*/header("so", "Sistema Operacional")),format.raw/*90.69*/("""
                                """),_display_(/*91.34*/header("navegador", "Navegador")),format.raw/*91.66*/("""
                                """),_display_(/*92.34*/header("versao", "Versão")),format.raw/*92.60*/("""
                                """),_display_(/*93.34*/if(usuario.isAdmin)/*93.53*/ {_display_(Seq[Any](format.raw/*93.55*/("""
                                    """),format.raw/*94.37*/("""<td>Ações</td>
                                """)))}),format.raw/*95.34*/("""
                            """),format.raw/*96.29*/("""</tr>
                        </thead>
                        <tbody>
                        """),_display_(/*99.26*/for(log <- currentPage.getList) yield /*99.57*/ {_display_(Seq[Any](format.raw/*99.59*/("""
                            """),format.raw/*100.29*/("""<tr>
                                <td>"""),_display_(/*101.38*/log/*101.41*/.getDataCadastro.getTime.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*101.99*/("""</td>
                                <td><a href=""""),_display_(/*102.47*/routes/*102.53*/.LogController.telaDetalhe(log.getId)),format.raw/*102.90*/("""">"""),_display_(/*102.93*/log/*102.96*/.getMensagem),format.raw/*102.108*/("""</a></td>
                                <td>"""),_display_(/*103.38*/log/*103.41*/.getSo),format.raw/*103.47*/("""</td>
                                <td>"""),_display_(/*104.38*/log/*104.41*/.getNavegador),format.raw/*104.54*/("""</td>
                                <td>"""),_display_(/*105.38*/log/*105.41*/.getVersao),format.raw/*105.51*/("""</td>
                                """),_display_(/*106.34*/if(usuario.isAdmin)/*106.53*/ {_display_(Seq[Any](format.raw/*106.55*/("""
                                    """),format.raw/*107.37*/("""<td><a data-placement="right" data-toggle="tooltip" title="Excluir" class="btn btn-danger btn-xs" href=""""),_display_(/*107.142*/routes/*107.148*/.LogController.remover(log.getId)),format.raw/*107.181*/(""""><span class="fa fa-trash" aria-hidden="true"></span></a></td>
                                """)))}),format.raw/*108.34*/("""
                            """),format.raw/*109.29*/("""</tr>
                        """)))}),format.raw/*110.26*/("""
                        """),format.raw/*111.25*/("""</tbody>
                    </table>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="dataTables_info" id="example2_info" role="status" aria-live="polite">
                            Visualizando """),_display_(/*117.43*/currentPage/*117.54*/.getDisplayXtoYofZ(" até ", " total ")),format.raw/*117.92*/("""</div>
                    </div>
                    <div class="col-sm-6">
                        <div class="dataTables_paginate paging_simple_numbers pull-right">
                            <ul class="pagination">
                                """),_display_(/*122.34*/if(currentPage.hasPrev)/*122.57*/ {_display_(Seq[Any](format.raw/*122.59*/("""
                                    """),format.raw/*123.37*/("""<li class="paginate_button previous">
                                        <a href=""""),_display_(/*124.51*/link(currentPage.getPageIndex - 1, null)),format.raw/*124.91*/("""">Anterior</a>
                                    </li>
                                """)))}/*126.35*/else/*126.40*/{_display_(Seq[Any](format.raw/*126.41*/("""
                                    """),format.raw/*127.37*/("""<li class="paginate_button previous disabled">
                                        <a>Anterior</a>
                                    </li>
                                """)))}),format.raw/*130.34*/("""
                                """),_display_(/*131.34*/if(currentPage.hasNext)/*131.57*/ {_display_(Seq[Any](format.raw/*131.59*/("""
                                    """),format.raw/*132.37*/("""<li class="paginate_button next">
                                        <a href=""""),_display_(/*133.51*/link(currentPage.getPageIndex + 1, null)),format.raw/*133.91*/("""">Próximo</a>
                                    </li>
                                """)))}/*135.35*/else/*135.40*/{_display_(Seq[Any](format.raw/*135.41*/("""
                                    """),format.raw/*136.37*/("""<li class="paginate_button next disabled">
                                        <a>Próximo</a>
                                    </li>
                                """)))}),format.raw/*139.34*/("""
                            """),format.raw/*140.29*/("""</ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*146.6*/("""
    """),format.raw/*147.5*/("""</div>

""")))}),format.raw/*149.2*/("""

"""),format.raw/*151.1*/("""<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*152.33*/("""{"""),format.raw/*152.34*/("""
        """),format.raw/*153.9*/("""$('[data-toggle="tooltip"]').tooltip();
        $('.btn-primary').attr('disabled',true);

        $('#searchbox').keyup(function()"""),format.raw/*156.41*/("""{"""),format.raw/*156.42*/("""
            """),format.raw/*157.13*/("""if($(this).val().length !=0)"""),format.raw/*157.41*/("""{"""),format.raw/*157.42*/("""
                """),format.raw/*158.17*/("""$('.btn-primary').attr('disabled', false);
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/("""
            """),format.raw/*160.13*/("""else
            """),format.raw/*161.13*/("""{"""),format.raw/*161.14*/("""
                """),format.raw/*162.17*/("""$('').attr('disabled', true);
            """),format.raw/*163.13*/("""}"""),format.raw/*163.14*/("""
        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/(""")

        var table = document.getElementsByTagName('table')[0];
        resizableGrid(table);
    """),format.raw/*168.5*/("""}"""),format.raw/*168.6*/(""");
</script>"""))
      }
    }
  }

  def render(currentPage:com.avaje.ebean.PagedList[Log],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((com.avaje.ebean.PagedList[Log],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:20:31 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/logs/list.scala.html
                  HASH: 6a70afeb37c12492c5860898f568c6088d8b1076
                  MATRIX: 799->1|991->934|1005->940|1112->970|1140->971|1216->1020|1228->1023|1266->1040|1295->1041|1331->1050|1366->1076|1470->1157|1510->1170|1543->1182|1573->1185|1599->1190|1633->117|1647->124|1732->326|1743->330|2266->114|2295->196|2325->324|2353->822|2383->932|2411->1202|2440->1205|2453->1210|2502->1250|2542->1252|2574->1257|2761->1417|2776->1423|2822->1448|2932->1531|2947->1537|2994->1563|3295->1838|3341->1875|3381->1877|3417->1886|3549->1991|3585->2006|3781->2175|3816->2188|4096->2441|4111->2447|4158->2473|4458->2756|4471->2761|4510->2762|4546->2771|4678->2876|4714->2891|4910->3060|4945->3073|5225->3326|5240->3332|5287->3358|5757->3801|5808->3831|5869->3865|5921->3896|5982->3930|6038->3965|6099->3999|6152->4031|6213->4065|6260->4091|6321->4125|6349->4144|6389->4146|6454->4183|6533->4231|6590->4260|6713->4356|6760->4387|6800->4389|6858->4418|6928->4460|6941->4463|7021->4521|7101->4573|7117->4579|7176->4616|7207->4619|7220->4622|7255->4634|7330->4681|7343->4684|7371->4690|7442->4733|7455->4736|7490->4749|7561->4792|7574->4795|7606->4805|7673->4844|7702->4863|7743->4865|7809->4902|7943->5007|7960->5013|8016->5046|8145->5143|8203->5172|8266->5203|8320->5228|8634->5514|8655->5525|8715->5563|8996->5816|9029->5839|9070->5841|9136->5878|9252->5966|9314->6006|9424->6097|9438->6102|9478->6103|9544->6140|9754->6318|9816->6352|9849->6375|9890->6377|9956->6414|10068->6498|10130->6538|10239->6628|10253->6633|10293->6634|10359->6671|10564->6844|10622->6873|10779->6999|10812->7004|10852->7013|10882->7015|10975->7079|11005->7080|11042->7089|11201->7219|11231->7220|11273->7233|11330->7261|11360->7262|11406->7279|11490->7334|11520->7335|11562->7348|11608->7365|11638->7366|11684->7383|11755->7425|11785->7426|11822->7435|11852->7436|11980->7536|12009->7537
                  LINES: 27->1|31->35|31->35|33->35|34->36|34->36|34->36|34->36|34->36|34->36|34->36|34->36|35->37|35->37|35->37|35->37|37->3|37->3|37->9|37->9|59->1|61->3|64->8|65->30|67->34|68->39|70->41|70->41|70->41|70->41|71->42|74->45|74->45|74->45|75->46|75->46|75->46|82->53|82->53|82->53|83->54|85->56|85->56|87->58|87->58|90->61|90->61|90->61|99->70|99->70|99->70|100->71|102->73|102->73|104->75|104->75|107->78|107->78|107->78|117->88|117->88|118->89|118->89|119->90|119->90|120->91|120->91|121->92|121->92|122->93|122->93|122->93|123->94|124->95|125->96|128->99|128->99|128->99|129->100|130->101|130->101|130->101|131->102|131->102|131->102|131->102|131->102|131->102|132->103|132->103|132->103|133->104|133->104|133->104|134->105|134->105|134->105|135->106|135->106|135->106|136->107|136->107|136->107|136->107|137->108|138->109|139->110|140->111|146->117|146->117|146->117|151->122|151->122|151->122|152->123|153->124|153->124|155->126|155->126|155->126|156->127|159->130|160->131|160->131|160->131|161->132|162->133|162->133|164->135|164->135|164->135|165->136|168->139|169->140|175->146|176->147|178->149|180->151|181->152|181->152|182->153|185->156|185->156|186->157|186->157|186->157|187->158|188->159|188->159|189->160|190->161|190->161|191->162|192->163|192->163|193->164|193->164|197->168|197->168
                  -- GENERATED --
              */
          