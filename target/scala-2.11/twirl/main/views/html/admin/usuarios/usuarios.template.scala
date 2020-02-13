
package views.html.admin.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarios_Scope0 {
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

     object usuarios_Scope1 {
import views.html.admin.main

class usuarios extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(usuarios: List[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/numeroDeAcessos/*5.17*/(usuario: Usuario) = {{
  usuario.getAcessos.size()
}};def /*9.2*/ultimoAcesso/*9.14*/(usuario: Usuario) = {{
  var ultimo = numeroDeAcessos(usuario)-1
  if (ultimo >= 0) {
    usuario.getAcessos.get(ultimo).getDataDeAcesso()
  }
}};def /*16.2*/codigo/*16.8*/(usuario: Usuario) = {{
  var token = usuario.getToken()
  if (token != null) {
    token.getCodigo()
  }
}};
Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*7.2*/("""

"""),format.raw/*14.2*/("""

"""),format.raw/*21.2*/("""

"""),_display_(/*23.2*/main("Lista de usuários")/*23.27*/ {_display_(Seq[Any](format.raw/*23.29*/("""
  """),format.raw/*24.3*/("""<section class="panel panel-default">
    <header class="panel-heading">
      <h2 class="panel-title">Lista de usuários</h2>
    </header>
    <div class="panel-body">
      <table class="table table-striped">
        <thead>
          <tr>
            <td>Id</td>
            <td>Nome</td>
            <td>Email</td>
            <td>Token</td>
            <td>Acessos</td>
            <td>Último acesso</td>
          </tr>
        </thead>
        <tbody>
        """),_display_(/*41.10*/for(usuario <- usuarios) yield /*41.34*/ {_display_(Seq[Any](format.raw/*41.36*/("""
          """),format.raw/*42.11*/("""<tr>
            <td>"""),_display_(/*43.18*/usuario/*43.25*/.getId()),format.raw/*43.33*/("""</td>
            <td>"""),_display_(/*44.18*/usuario/*44.25*/.getNome()),format.raw/*44.35*/("""</td>
            <td>"""),_display_(/*45.18*/usuario/*45.25*/.getEmail()),format.raw/*45.36*/("""</td>
            <td>"""),_display_(/*46.18*/codigo(usuario)),format.raw/*46.33*/("""</td>
            <td>"""),_display_(/*47.18*/numeroDeAcessos(usuario)),format.raw/*47.42*/("""</td>
            <td>"""),_display_(/*48.18*/ultimoAcesso(usuario)),format.raw/*48.39*/("""</td>
          </tr>
        """)))}),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""</tbody>
      </table>
    </div>
  </section>
""")))}))
      }
    }
  }

  def render(usuarios:List[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)

  def f:((List[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => apply(usuarios)

  def ref: this.type = this

}


}
}

/**/
object usuarios extends usuarios_Scope0.usuarios_Scope1.usuarios
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 14:49:56 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/usuarios/usuarios.scala.html
                  HASH: 4910e8c59bae14fbf51a762bcbdd5e3d15f1f5fd
                  MATRIX: 833->32|936->60|959->75|1025->131|1045->143|1204->291|1218->297|1355->57|1383->128|1412->288|1441->404|1470->407|1504->432|1544->434|1574->437|2069->905|2109->929|2149->931|2188->942|2237->964|2253->971|2282->979|2332->1002|2348->1009|2379->1019|2429->1042|2445->1049|2477->1060|2527->1083|2563->1098|2613->1121|2658->1145|2708->1168|2750->1189|2812->1220|2848->1229
                  LINES: 30->3|34->5|34->5|36->9|36->9|41->16|41->16|47->3|49->7|51->14|53->21|55->23|55->23|55->23|56->24|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|82->50|83->51
                  -- GENERATED --
              */
          