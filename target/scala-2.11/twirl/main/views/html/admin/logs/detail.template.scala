
package views.html.admin.logs

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Log,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(log: Log):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*3.2*/usuario/*3.9*/() = {{
    Http.Context.current().args.get("usuario").asInstanceOf[Usuario]
}};
Seq[Any](format.raw/*1.12*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/views/*9.7*/.html.admin.main("Administração - Detalhe do Log")/*9.57*/ {_display_(Seq[Any](format.raw/*9.59*/("""
"""),format.raw/*10.1*/("""<div class="col-md-12">
    <div class="page-header header-biogas">
        <div class="btn-group btn-breadcrumb pull-right">
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.AdminController.painel()),format.raw/*13.54*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
            <a href=""""),_display_(/*14.23*/routes/*14.29*/.LogController.telaLista()),format.raw/*14.55*/("""" class="btn btn-default">Logs</a>
            <a disabled class="btn btn-default">Detalhe</a>
        </div>
        <h1 class="font-style"><i class="fa fa-file" aria-hidden="true"></i> Detalhe do Log</h1>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-12 col-sm-6 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading">Informações
                    <div class="btn-group pull-right">
                        <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Opções <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*30.43*/routes/*30.49*/.LogController.telaLista()),format.raw/*30.75*/("""">Voltar</a></li>
                            """),_display_(/*31.30*/if(usuario.isAdmin)/*31.49*/ {_display_(Seq[Any](format.raw/*31.51*/("""
                                """),format.raw/*32.33*/("""<li role="separator" class="divider"></li>
                                <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                            """)))}),format.raw/*34.30*/("""
                        """),format.raw/*35.25*/("""</ul>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Mensagem</label>
                        <p class="display-block margin-left-027em">"""),_display_(/*41.69*/log/*41.72*/.getMensagem),format.raw/*41.84*/("""</p>
                    </div>
                    """),_display_(/*43.22*/if(log.getSo)/*43.35*/ {_display_(Seq[Any](format.raw/*43.37*/("""
                    """),format.raw/*44.21*/("""<hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Sistema Operacional</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*47.73*/log/*47.76*/.getSo),format.raw/*47.82*/("""</p>
                        </div>
                    """)))}),format.raw/*49.22*/("""
                    """),_display_(/*50.22*/if(log.getNavegador)/*50.42*/ {_display_(Seq[Any](format.raw/*50.44*/("""
                    """),format.raw/*51.21*/("""<hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Navegador</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*54.73*/log/*54.76*/.getNavegador),format.raw/*54.89*/("""</p>
                        </div>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(log.getVersao)/*57.39*/ {_display_(Seq[Any](format.raw/*57.41*/("""
                    """),format.raw/*58.21*/("""<hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Versão</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*61.73*/log/*61.76*/.getVersao),format.raw/*61.86*/("""</p>
                        </div>
                    """)))}),format.raw/*63.22*/("""
                    """),format.raw/*64.21*/("""<hr>
                    <div class="item-form width-600 margin-bottom-15">
                        <label class="display-block strong">Data/Hora</label>
                        <p type="date" class="display-block margin-left-027em">"""),_display_(/*67.81*/log/*67.84*/.getDataCadastro.getTime.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*67.142*/("""</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    <div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">"""),_display_(/*79.46*/Messages("app.title")),format.raw/*79.67*/("""</h4>
                </div>
                <div class="modal-body">
                    <p class="text-center">Deseja remover o log <b>""""),_display_(/*82.70*/log/*82.73*/.getMensagem),format.raw/*82.85*/(""""</b>?</p>
                </div>
                <div class="modal-footer">
                    """),_display_(/*85.22*/form(routes.LogController.remover(log.getId))/*85.67*/ {_display_(Seq[Any](format.raw/*85.69*/("""
                        """),format.raw/*86.25*/("""<input id="btnRemover" type="submit" value="Remover" class="btn btn-danger">
                    """)))}),format.raw/*87.22*/("""
                """),format.raw/*88.17*/("""</div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>

""")))}))
      }
    }
  }

  def render(log:Log): play.twirl.api.HtmlFormat.Appendable = apply(log)

  def f:((Log) => play.twirl.api.HtmlFormat.Appendable) = (log) => apply(log)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:49 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/logs/detail.scala.html
                  HASH: 061c4625294c621b63d97693c531b9311759ee1f
                  MATRIX: 755->1|858->14|872->21|980->11|1008->99|1036->118|1063->120|1075->125|1133->175|1172->177|1200->178|1375->326|1390->332|1436->357|1542->436|1557->442|1604->468|2459->1296|2474->1302|2521->1328|2595->1375|2623->1394|2663->1396|2724->1429|2946->1620|2999->1645|3339->1958|3351->1961|3384->1973|3464->2026|3486->2039|3526->2041|3575->2062|3846->2306|3858->2309|3885->2315|3973->2372|4022->2394|4051->2414|4091->2416|4140->2437|4401->2671|4413->2674|4447->2687|4535->2744|4584->2766|4610->2783|4650->2785|4699->2806|4957->3037|4969->3040|5000->3050|5088->3107|5137->3128|5398->3362|5410->3365|5490->3423|6045->3951|6087->3972|6253->4111|6265->4114|6298->4126|6423->4224|6477->4269|6517->4271|6570->4296|6699->4394|6744->4411
                  LINES: 27->1|31->3|31->3|34->1|36->5|38->8|39->9|39->9|39->9|39->9|40->10|43->13|43->13|43->13|44->14|44->14|44->14|60->30|60->30|60->30|61->31|61->31|61->31|62->32|64->34|65->35|71->41|71->41|71->41|73->43|73->43|73->43|74->44|77->47|77->47|77->47|79->49|80->50|80->50|80->50|81->51|84->54|84->54|84->54|86->56|87->57|87->57|87->57|88->58|91->61|91->61|91->61|93->63|94->64|97->67|97->67|97->67|109->79|109->79|112->82|112->82|112->82|115->85|115->85|115->85|116->86|117->87|118->88
                  -- GENERATED --
              */
          