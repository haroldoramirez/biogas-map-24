
package views.html.admin.usuarios

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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.avaje.ebean.PagedList[Usuario],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.PagedList[Usuario], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*32.2*/header/*32.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    """),format.raw/*33.5*/("""<th rowspan="1" colspan="1" tabindex="0" class=""""),_display_(/*33.54*/key/*33.57*/.replace(".","_")),format.raw/*33.74*/(""" """),format.raw/*33.75*/("""sorting """),_display_(/*33.84*/if(currentSortBy == key){/*33.110*/{if(currentOrder == "asc") "sorting_asc headercor" else "sorting_desc headercor"}}),format.raw/*33.191*/("""">
        <a href=""""),_display_(/*34.19*/link(0, key)),format.raw/*34.31*/("""">"""),_display_(/*34.34*/title),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.6*/link/*6.10*/(newPage:Int, newSortBy:String) = {{

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
        routes.UsuarioController.telaLista(newPage, sortBy, order, currentFilter)

    }};
Seq[Any](format.raw/*1.119*/("""

    """),format.raw/*5.46*/("""
    """),format.raw/*27.6*/("""

    """),format.raw/*31.41*/("""
"""),format.raw/*36.2*/("""

"""),_display_(/*38.2*/views/*38.7*/.html.admin.main("Administração - Usuários")/*38.51*/ {_display_(Seq[Any](format.raw/*38.53*/("""
    """),format.raw/*39.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*42.27*/routes/*42.33*/.AdminController.painel()),format.raw/*42.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.UsuarioController.telaLista()),format.raw/*43.63*/("""" class="btn btn-default">Usuários</a>
                <a disabled class="btn btn-default">Lista</a>
            </div>
            <h1 class="font-style"><i class="fa fa-users" aria-hidden="true"></i> Lista de Usuário</h1>
        </div>
    </div>
    <div class="col-sm-12">
        """),_display_(/*50.10*/if(currentPage.getTotalRowCount == 0)/*50.47*/ {_display_(Seq[Any](format.raw/*50.49*/("""
            """),format.raw/*51.13*/("""<div class="panel panel-default">
                <div class="panel-heading">
                    <a type="button" href=""""),_display_(/*53.45*/routes/*53.51*/.UsuarioController.telaNovo()),format.raw/*53.80*/("""" class="pull-right btn btn-success">Cadastrar</a>
                    <a type="button" class="pull-right btn btn-link" data-toggle="modal" href="#modalCsv">Exportar</a>
                    <form action=""""),_display_(/*55.36*/link(0, "nome")),format.raw/*55.51*/("""" method="GET">
                        <div class="input-group col-lg-3">
                            <input class="form-control" type="search" id="searchbox" name="f" value=""""),_display_(/*57.103*/currentFilter),format.raw/*57.116*/("""" placeholder="Filtrar por nome">
                            <span class="input-group-btn">
                                <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary">
                                <a type="button" href=""""),_display_(/*60.57*/routes/*60.63*/.UsuarioController.telaLista()),format.raw/*60.93*/("""" class="btn btn-default">Limpar</a>
                            </span>
                        </div><!-- /input-group -->
                    </form>
                </div>
            </div>
            <div class="well well-sm">
                <em>Nenhuma informação encontrada.</em>
            </div>
        """)))}/*69.11*/else/*69.16*/{_display_(Seq[Any](format.raw/*69.17*/("""
            """),format.raw/*70.13*/("""<div class="panel panel-default">
                <div class="panel-heading">
                    <a type="button" href=""""),_display_(/*72.45*/routes/*72.51*/.UsuarioController.telaNovo()),format.raw/*72.80*/("""" class="pull-right btn btn-success">Cadastrar</a>
                    <a type="button" class="pull-right btn btn-link" data-toggle="modal" href="#modalCsv">Exportar</a>
                    <form action=""""),_display_(/*74.36*/link(0, "nome")),format.raw/*74.51*/("""" method="GET">
                        <div class="input-group col-lg-3">
                            <input class="form-control" type="search" id="searchbox" name="f" value=""""),_display_(/*76.103*/currentFilter),format.raw/*76.116*/("""" placeholder="Filtrar por nome">
                            <span class="input-group-btn">
                                <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary">
                                <a type="button" href=""""),_display_(/*79.57*/routes/*79.63*/.UsuarioController.telaLista()),format.raw/*79.93*/("""" class="btn btn-default">Limpar</a>
                            </span>
                        </div><!-- /input-group -->
                    </form>
                </div>
                <div class="panel-body">
                        <div class="table-responsive">
                            <table border="1" class="table table-bordered table-hover dataTable">
                                <thead>
                                    <tr role="row">
                                        """),_display_(/*89.42*/header("nome", "Nome")),format.raw/*89.64*/("""
                                        """),_display_(/*90.42*/header("email", "Email")),format.raw/*90.66*/("""
                                        """),_display_(/*91.42*/header("validado", "Confirmado")),format.raw/*91.74*/("""
                                        """),format.raw/*92.41*/("""<th>Papel</th>
                                        <th>Status</th>
                                        """),_display_(/*94.42*/header("ultimoAcesso", "Último Acesso")),format.raw/*94.81*/("""
                                        """),_display_(/*95.42*/header("dataCadastro", "Membro Desde")),format.raw/*95.80*/("""
                                    """),format.raw/*96.37*/("""</tr>
                                </thead>
                                <tbody>
                                """),_display_(/*99.34*/for(usuario <- currentPage.getList) yield /*99.69*/ {_display_(Seq[Any](format.raw/*99.71*/("""
                                    """),format.raw/*100.37*/("""<tr class=""""),_display_(/*100.49*/{if(usuario.isAdmin) "warning"}),format.raw/*100.80*/("""">
                                        <td><a href=""""),_display_(/*101.55*/routes/*101.61*/.UsuarioController.telaDetalhe(usuario.getId)),format.raw/*101.106*/("""">"""),_display_(/*101.109*/usuario/*101.116*/.getNome),format.raw/*101.124*/("""</a></td>
                                        <td>"""),_display_(/*102.46*/usuario/*102.53*/.getEmail),format.raw/*102.62*/("""</td>
                                        """),_display_(/*103.42*/if(usuario.isVerificado)/*103.66*/ {_display_(Seq[Any](format.raw/*103.68*/("""
                                            """),format.raw/*104.45*/("""<td class="text-success">Sim</td>
                                        """)))}/*105.43*/else/*105.48*/{_display_(Seq[Any](format.raw/*105.49*/("""
                                            """),format.raw/*106.45*/("""<td class="text-danger">Não</td>
                                        """)))}),format.raw/*107.42*/("""

                                        """),_display_(/*109.42*/if(usuario.isAdmin)/*109.61*/ {_display_(Seq[Any](format.raw/*109.63*/("""
                                            """),format.raw/*110.45*/("""<td><span class="label label-danger">Administrador</span></td>
                                        """)))}),format.raw/*111.42*/("""
                                        """),_display_(/*112.42*/if(usuario.isGerente)/*112.63*/ {_display_(Seq[Any](format.raw/*112.65*/("""
                                            """),format.raw/*113.45*/("""<td><span class="label label-warning">Gerente</span></td>
                                        """)))}),format.raw/*114.42*/("""
                                        """),_display_(/*115.42*/if(usuario.isUsuario)/*115.63*/ {_display_(Seq[Any](format.raw/*115.65*/("""
                                            """),format.raw/*116.45*/("""<td><span class="label label-default">Usuário</span></td>
                                        """)))}),format.raw/*117.42*/("""

                                        """),_display_(/*119.42*/if(usuario.isAtivo)/*119.61*/ {_display_(Seq[Any](format.raw/*119.63*/("""
                                            """),format.raw/*120.45*/("""<td class="text-success">Ativo</td>
                                        """)))}/*121.43*/else/*121.48*/{_display_(Seq[Any](format.raw/*121.49*/("""
                                            """),format.raw/*122.45*/("""<td class="text-danger">Bloqueado</td>
                                        """)))}),format.raw/*123.42*/("""
                                        """),format.raw/*124.41*/("""<td>"""),_display_(/*124.46*/usuario/*124.53*/.getUltimoAcesso.getTime.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*124.111*/("""</td>
                                        <td>"""),_display_(/*125.46*/usuario/*125.53*/.getDataCadastro.format("dd MMMM yyyy")),format.raw/*125.92*/("""</td>
                                    </tr>
                                """)))}),format.raw/*127.34*/("""
                                """),format.raw/*128.33*/("""</tbody>
                            </table>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="dataTables_info" id="example2_info" role="status" aria-live="polite">
                                    Visualizando """),_display_(/*134.51*/currentPage/*134.62*/.getDisplayXtoYofZ(" até ", " total ")),format.raw/*134.100*/("""</div>
                            </div>
                            <div class="col-sm-6">
                                <div class="dataTables_paginate paging_simple_numbers pull-right">
                                    <ul class="pagination">
                                        """),_display_(/*139.42*/if(currentPage.hasPrev)/*139.65*/ {_display_(Seq[Any](format.raw/*139.67*/("""
                                            """),format.raw/*140.45*/("""<li class="paginate_button previous">
                                                <a href=""""),_display_(/*141.59*/link(currentPage.getPageIndex - 1, null)),format.raw/*141.99*/("""">Anterior</a>
                                            </li>
                                        """)))}/*143.43*/else/*143.48*/{_display_(Seq[Any](format.raw/*143.49*/("""
                                            """),format.raw/*144.45*/("""<li class="paginate_button previous disabled">
                                                <a>Anterior</a>
                                            </li>
                                        """)))}),format.raw/*147.42*/("""
                                        """),_display_(/*148.42*/if(currentPage.hasNext)/*148.65*/ {_display_(Seq[Any](format.raw/*148.67*/("""
                                            """),format.raw/*149.45*/("""<li class="paginate_button next">
                                                <a href=""""),_display_(/*150.59*/link(currentPage.getPageIndex + 1, null)),format.raw/*150.99*/("""">Próximo</a>
                                            </li>
                                        """)))}/*152.43*/else/*152.48*/{_display_(Seq[Any](format.raw/*152.49*/("""
                                            """),format.raw/*153.45*/("""<li class="paginate_button next disabled">
                                                <a>Próximo</a>
                                            </li>
                                        """)))}),format.raw/*156.42*/("""
                                    """),format.raw/*157.37*/("""</ul>
                                </div>
                            </div>
                        </div>
                </div>
            </div>
        """)))}),format.raw/*163.10*/("""
    """),format.raw/*164.5*/("""</div>

<div id="modalCsv" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabelCsv">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">"""),_display_(/*171.42*/Messages("app.title")),format.raw/*171.63*/("""</h4>
            </div>

                <div class="modal-body">
                    <p>Deseja exportar todos os usuarios para arquivo CSV?</p>
                    <p>Ao Selecionar "Exportar" o processo de download vai iniciar em seguinda.</p>
                </div>
                <br>
                <div class="modal-footer">
                    <a type="button" class="btn btn-default custom-close" target="_blank" href=""""),_display_(/*180.98*/routes/*180.104*/.UsuarioController.exportar()),format.raw/*180.133*/("""">Exportar</a>
                </div>

        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
""")))}),format.raw/*186.2*/("""

"""),format.raw/*188.1*/("""<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*189.33*/("""{"""),format.raw/*189.34*/("""
        """),format.raw/*190.9*/("""$('.btn-primary').attr('disabled',true);

        $('#searchbox').keyup(function()"""),format.raw/*192.41*/("""{"""),format.raw/*192.42*/("""
            """),format.raw/*193.13*/("""if($(this).val().length !=0)"""),format.raw/*193.41*/("""{"""),format.raw/*193.42*/("""
                """),format.raw/*194.17*/("""$('.btn-primary').attr('disabled', false);
            """),format.raw/*195.13*/("""}"""),format.raw/*195.14*/("""
            """),format.raw/*196.13*/("""else
            """),format.raw/*197.13*/("""{"""),format.raw/*197.14*/("""
                """),format.raw/*198.17*/("""$('.btn-primary').attr('disabled', true);
            """),format.raw/*199.13*/("""}"""),format.raw/*199.14*/("""
        """),format.raw/*200.9*/("""}"""),format.raw/*200.10*/(""")

        var table = document.getElementsByTagName('table')[0];
        resizableGrid(table);
    """),format.raw/*204.5*/("""}"""),format.raw/*204.6*/(""");
</script>"""))
      }
    }
  }

  def render(currentPage:com.avaje.ebean.PagedList[Usuario],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((com.avaje.ebean.PagedList[Usuario],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:49 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/usuarios/list.scala.html
                  HASH: 82717160d903d7c268ba56a7ab450341db04965f
                  MATRIX: 807->1|1003->955|1017->961|1124->991|1156->996|1232->1045|1244->1048|1282->1065|1311->1066|1347->1075|1382->1101|1486->1182|1534->1203|1567->1215|1597->1218|1623->1223|1661->263|1673->267|2268->118|2301->257|2333->831|2367->953|2395->1239|2424->1242|2437->1247|2490->1291|2530->1293|2562->1298|2749->1458|2764->1464|2810->1489|2920->1572|2935->1578|2986->1608|3300->1895|3346->1932|3386->1934|3427->1947|3576->2069|3591->2075|3641->2104|3873->2309|3909->2324|4114->2501|4149->2514|4437->2775|4452->2781|4503->2811|4840->3130|4853->3135|4892->3136|4933->3149|5082->3271|5097->3277|5147->3306|5379->3511|5415->3526|5620->3703|5655->3716|5943->3977|5958->3983|6009->4013|6539->4516|6582->4538|6651->4580|6696->4604|6765->4646|6818->4678|6887->4719|7026->4831|7086->4870|7155->4912|7214->4950|7279->4987|7426->5107|7477->5142|7517->5144|7583->5181|7623->5193|7676->5224|7761->5281|7777->5287|7845->5332|7877->5335|7895->5342|7926->5350|8009->5405|8026->5412|8057->5421|8132->5468|8166->5492|8207->5494|8281->5539|8376->5615|8390->5620|8430->5621|8504->5666|8610->5740|8681->5783|8710->5802|8751->5804|8825->5849|8961->5953|9031->5995|9062->6016|9103->6018|9177->6063|9308->6162|9378->6204|9409->6225|9450->6227|9524->6272|9655->6371|9726->6414|9755->6433|9796->6435|9870->6480|9967->6558|9981->6563|10021->6564|10095->6609|10207->6689|10277->6730|10310->6735|10327->6742|10408->6800|10487->6851|10504->6858|10565->6897|10678->6978|10740->7011|11102->7345|11123->7356|11184->7394|11505->7687|11538->7710|11579->7712|11653->7757|11777->7853|11839->7893|11965->8000|11979->8005|12019->8006|12093->8051|12327->8253|12397->8295|12430->8318|12471->8320|12545->8365|12665->8457|12727->8497|12852->8603|12866->8608|12906->8609|12980->8654|13209->8851|13275->8888|13469->9050|13502->9055|13952->9477|13995->9498|14453->9928|14470->9934|14522->9963|14673->10083|14703->10085|14796->10149|14826->10150|14863->10159|14974->10241|15004->10242|15046->10255|15103->10283|15133->10284|15179->10301|15263->10356|15293->10357|15335->10370|15381->10387|15411->10388|15457->10405|15540->10459|15570->10460|15607->10469|15637->10470|15765->10570|15794->10571
                  LINES: 27->1|31->32|31->32|33->32|34->33|34->33|34->33|34->33|34->33|34->33|34->33|34->33|35->34|35->34|35->34|35->34|37->6|37->6|59->1|61->5|62->27|64->31|65->36|67->38|67->38|67->38|67->38|68->39|71->42|71->42|71->42|72->43|72->43|72->43|79->50|79->50|79->50|80->51|82->53|82->53|82->53|84->55|84->55|86->57|86->57|89->60|89->60|89->60|98->69|98->69|98->69|99->70|101->72|101->72|101->72|103->74|103->74|105->76|105->76|108->79|108->79|108->79|118->89|118->89|119->90|119->90|120->91|120->91|121->92|123->94|123->94|124->95|124->95|125->96|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|130->101|130->101|130->101|131->102|131->102|131->102|132->103|132->103|132->103|133->104|134->105|134->105|134->105|135->106|136->107|138->109|138->109|138->109|139->110|140->111|141->112|141->112|141->112|142->113|143->114|144->115|144->115|144->115|145->116|146->117|148->119|148->119|148->119|149->120|150->121|150->121|150->121|151->122|152->123|153->124|153->124|153->124|153->124|154->125|154->125|154->125|156->127|157->128|163->134|163->134|163->134|168->139|168->139|168->139|169->140|170->141|170->141|172->143|172->143|172->143|173->144|176->147|177->148|177->148|177->148|178->149|179->150|179->150|181->152|181->152|181->152|182->153|185->156|186->157|192->163|193->164|200->171|200->171|209->180|209->180|209->180|215->186|217->188|218->189|218->189|219->190|221->192|221->192|222->193|222->193|222->193|223->194|224->195|224->195|225->196|226->197|226->197|227->198|228->199|228->199|229->200|229->200|233->204|233->204
                  -- GENERATED --
              */
          