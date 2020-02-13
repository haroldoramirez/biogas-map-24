
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object api_Scope0 {
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

     object api_Scope1 {
import views.html.admin.main

class api extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.20*/("""

"""),_display_(/*5.2*/main(Messages("app.title") + " | Painel do usuário API")/*5.58*/ {_display_(Seq[Any](format.raw/*5.60*/("""

  """),format.raw/*7.3*/("""<div class="container">
    <section class="jumbotron">
      <h1>Painel do usuário</h1>
      <p>Bem vindo, <strong>"""),_display_(/*10.30*/usuario/*10.37*/.getNome()),format.raw/*10.47*/("""</strong>! Este é seu painel. Aqui você poderá ver sua chave de acesso e também suas requisições!</p>
    </section>
    <section class="panel panel-default">
      <header class="panel-heading">
        <h2 class="panel-title">Sua chave de acesso pessoal</h2>
      </header>
      <p class="panel-body">
        Sua chave de acesso é: <strong>"""),_display_(/*17.41*/usuario/*17.48*/.getToken().getCodigo()),format.raw/*17.71*/("""</strong>
      </p>
      <p class="panel-body">
        Para acessar a API, faça um GET na seguinte URL (adicionando no cabeçalho "API-Token" a sua chave de acesso): <pre>http://localhost:9000/api/unidades</pre>
      </p>
      <p class="panel-body">
        Você já fez <strong>"""),_display_(/*23.30*/usuario/*23.37*/.getAcessos.size()),format.raw/*23.55*/("""</strong> à nossa API;
      </p>
    </section>
  </div>

""")))}))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}
}

/**/
object api extends api_Scope0.api_Scope1.api
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 16:58:29 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/api.scala.html
                  HASH: 81e5bbb905cbe4bb70943950fb07b13e80e5355b
                  MATRIX: 803->32|916->50|944->53|1008->109|1047->111|1077->115|1222->233|1238->240|1269->250|1642->596|1658->603|1702->626|2012->909|2028->916|2067->934
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|42->10|42->10|42->10|49->17|49->17|49->17|55->23|55->23|55->23
                  -- GENERATED --
              */
          