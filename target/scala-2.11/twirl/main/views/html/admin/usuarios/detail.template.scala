
package views.html.admin.usuarios

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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import templates.bootstrap._

Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/views/*6.7*/.html.admin.main("Administração - Detalhe do Usuário")/*6.61*/ {_display_(Seq[Any](format.raw/*6.63*/("""
"""),format.raw/*7.1*/("""<div class="col-md-12">
    <div class="page-header header-biogas">
        <div class="btn-group btn-breadcrumb pull-right">
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.AdminController.painel()),format.raw/*10.54*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.UsuarioController.telaLista()),format.raw/*11.59*/("""" class="btn btn-default">Usuários</a>
            <a disabled class="btn btn-default">Detalhe</a>
        </div>
        <h1 class="font-style"><i class="fa fa-user" aria-hidden="true"></i> Detalhe do Usuário</h1>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-12 col-sm-6 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading">Detalhe do Usuário
                    <div class="btn-group pull-right">
                        <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Opções <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(/*27.43*/routes/*27.49*/.UsuarioController.telaLista()),format.raw/*27.79*/("""">Voltar</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href=""""),_display_(/*29.43*/routes/*29.49*/.UsuarioController.telaEditar(usuario.getId)),format.raw/*29.93*/("""">Editar</a></li>
                            <li role="separator" class="divider"></li>
                            """),_display_(/*31.30*/if(!usuario.isVerificado)/*31.55*/ {_display_(Seq[Any](format.raw/*31.57*/("""
                            """),format.raw/*32.29*/("""<li><a href=""""),_display_(/*32.43*/routes/*32.49*/.UsuarioController.enviarToken(usuario.getId)),format.raw/*32.94*/("""">Enviar email com o Token</a></li>
                            <li><a href=""""),_display_(/*33.43*/routes/*33.49*/.UsuarioController.confirmaAdmin(usuario.getId)),format.raw/*33.96*/("""">Confirmar Conta</a></li>
                            """)))}),format.raw/*34.30*/("""
                            """),_display_(/*35.30*/if(usuario.isAtivo)/*35.49*/ {_display_(Seq[Any](format.raw/*35.51*/("""
                            """),format.raw/*36.29*/("""<li><a href=""""),_display_(/*36.43*/routes/*36.49*/.UsuarioController.bloquear(usuario.getId)),format.raw/*36.91*/("""">Bloquear</a></li>
                            """)))}/*37.31*/else/*37.36*/{_display_(Seq[Any](format.raw/*37.37*/("""
                            """),format.raw/*38.29*/("""<li><a href=""""),_display_(/*38.43*/routes/*38.49*/.UsuarioController.desbloquear(usuario.getId)),format.raw/*38.94*/("""">Desbloquear</a></li>
                            """)))}),format.raw/*39.30*/("""
                            """),format.raw/*40.29*/("""<li role="separator" class="divider"></li>
                            <li><a data-toggle="modal" data-target=".bs-example-modal-sm" href="">Excluir</a></li>
                        </ul>
                    </div>
                </div>
                <div class="panel-body">
                    <form>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Nome</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*49.73*/usuario/*49.80*/.getNome),format.raw/*49.88*/("""</p>
                        </div>
                        <hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Email</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*54.73*/usuario/*54.80*/.getEmail),format.raw/*54.89*/("""</p>
                        </div>
                        <hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Confirmado</label>
                            """),_display_(/*59.30*/if(usuario.isVerificado)/*59.54*/ {_display_(Seq[Any](format.raw/*59.56*/("""
                            """),format.raw/*60.29*/("""<p class="text-success display-block margin-left-027em">Sim</p>
                            """)))}/*61.31*/else/*61.36*/{_display_(Seq[Any](format.raw/*61.37*/("""
                            """),format.raw/*62.29*/("""<p class="text-danger display-block margin-left-027em">Não</p>
                            """)))}),format.raw/*63.30*/("""

                        """),format.raw/*65.25*/("""</div>
                        <hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Status</label>
                            """),_display_(/*69.30*/if(usuario.isAtivo)/*69.49*/ {_display_(Seq[Any](format.raw/*69.51*/("""
                            """),format.raw/*70.29*/("""<p class="text-success display-block margin-left-027em">Ativo</p>
                            """)))}/*71.31*/else/*71.36*/{_display_(Seq[Any](format.raw/*71.37*/("""
                            """),format.raw/*72.29*/("""<p class="text-danger display-block margin-left-027em">Bloqueado</p>
                            """)))}),format.raw/*73.30*/("""

                        """),format.raw/*75.25*/("""</div>
                        <hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Papel</label>
                            """),_display_(/*79.30*/if(usuario.isAdmin)/*79.49*/ {_display_(Seq[Any](format.raw/*79.51*/("""
                            """),format.raw/*80.29*/("""<p class="display-block margin-left-027em text-danger">Administrador</p>
                            """)))}),format.raw/*81.30*/("""
                            """),_display_(/*82.30*/if(usuario.isGerente)/*82.51*/ {_display_(Seq[Any](format.raw/*82.53*/("""
                            """),format.raw/*83.29*/("""<p class="display-block margin-left-027em text-primary">Gerente</p>
                            """)))}),format.raw/*84.30*/("""
                            """),_display_(/*85.30*/if(usuario.isUsuario)/*85.51*/{_display_(Seq[Any](format.raw/*85.52*/("""
                            """),format.raw/*86.29*/("""<p class="display-block margin-left-027em text-success">Usuário</p>
                            """)))}),format.raw/*87.30*/("""
                        """),format.raw/*88.25*/("""</div>
                        <hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Data/Hora de Cadastro</label>
                            <p type="date" class="display-block margin-left-027em">"""),_display_(/*92.85*/usuario/*92.92*/.getDataCadastro.format("dd MMMM yyyy")),format.raw/*92.131*/("""</p>
                        </div>
                        """),_display_(/*94.26*/if(usuario.getDataAlteracao != null)/*94.62*/{_display_(Seq[Any](format.raw/*94.63*/("""
                        """),format.raw/*95.25*/("""<hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Data/Hora de Alteração</label>
                            <p class="display-block margin-left-027em">"""),_display_(/*98.73*/usuario/*98.80*/.getDataAlteracao.format("dd MMMM yyyy")),format.raw/*98.120*/("""</p>
                        </div>
                        """)))}),format.raw/*100.26*/("""
                        """),format.raw/*101.25*/("""<hr>
                        <div class="item-form width-600 margin-bottom-15">
                            <label class="display-block strong">Ultimo Acesso</label>
                            <p type="date" class="display-block margin-left-027em">"""),_display_(/*104.85*/usuario/*104.92*/.getUltimoAcesso.getTime.format("dd MMMM yyyy - HH:mm:ss")),format.raw/*104.150*/("""</p>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
""")))}),format.raw/*112.2*/("""

"""),format.raw/*114.1*/("""<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">"""),_display_(/*119.42*/Messages("app.title")),format.raw/*119.63*/("""</h4>
            </div>
            <div class="modal-body">
                <p class="text-center">Deseja remover o usuário <b>""""),_display_(/*122.70*/usuario/*122.77*/.getNome),format.raw/*122.85*/(""""</b>?</p>
            </div>
            <div class="modal-footer">
                """),_display_(/*125.18*/form(routes.UsuarioController.remover(usuario.getId))/*125.71*/ {_display_(Seq[Any](format.raw/*125.73*/("""
                """),format.raw/*126.17*/("""<input id="btnRemover" type="submit" value="Remover" class="btn btn-danger">
                """)))}),format.raw/*127.18*/("""
            """),format.raw/*128.13*/("""</div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>"""))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:55:52 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/usuarios/detail.scala.html
                  HASH: 51b7578243f394c122071b2c089c9a57e7453a27
                  MATRIX: 763->1|920->19|948->68|975->70|987->75|1049->129|1088->131|1115->132|1290->280|1305->286|1351->311|1457->390|1472->396|1523->426|2393->1269|2408->1275|2459->1305|2617->1436|2632->1442|2697->1486|2842->1604|2876->1629|2916->1631|2973->1660|3014->1674|3029->1680|3095->1725|3200->1803|3215->1809|3283->1856|3370->1912|3427->1942|3455->1961|3495->1963|3552->1992|3593->2006|3608->2012|3671->2054|3739->2104|3752->2109|3791->2110|3848->2139|3889->2153|3904->2159|3970->2204|4053->2256|4110->2285|4667->2815|4683->2822|4712->2830|5029->3120|5045->3127|5075->3136|5354->3388|5387->3412|5427->3414|5484->3443|5596->3537|5609->3542|5648->3543|5705->3572|5828->3664|5882->3690|6128->3909|6156->3928|6196->3930|6253->3959|6367->4055|6380->4060|6419->4061|6476->4090|6605->4188|6659->4214|6904->4432|6932->4451|6972->4453|7029->4482|7162->4584|7219->4614|7249->4635|7289->4637|7346->4666|7474->4763|7531->4793|7561->4814|7600->4815|7657->4844|7785->4941|7838->4966|8154->5255|8170->5262|8231->5301|8319->5362|8364->5398|8403->5399|8456->5424|8730->5671|8746->5678|8808->5718|8901->5779|8955->5804|9233->6054|9250->6061|9331->6119|9502->6259|9532->6261|9957->6658|10000->6679|10159->6810|10176->6817|10206->6825|10320->6911|10383->6964|10424->6966|10470->6983|10596->7077|10638->7090
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|36->6|37->7|40->10|40->10|40->10|41->11|41->11|41->11|57->27|57->27|57->27|59->29|59->29|59->29|61->31|61->31|61->31|62->32|62->32|62->32|62->32|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|68->38|69->39|70->40|79->49|79->49|79->49|84->54|84->54|84->54|89->59|89->59|89->59|90->60|91->61|91->61|91->61|92->62|93->63|95->65|99->69|99->69|99->69|100->70|101->71|101->71|101->71|102->72|103->73|105->75|109->79|109->79|109->79|110->80|111->81|112->82|112->82|112->82|113->83|114->84|115->85|115->85|115->85|116->86|117->87|118->88|122->92|122->92|122->92|124->94|124->94|124->94|125->95|128->98|128->98|128->98|130->100|131->101|134->104|134->104|134->104|142->112|144->114|149->119|149->119|152->122|152->122|152->122|155->125|155->125|155->125|156->126|157->127|158->128
                  -- GENERATED --
              */
          