
package views.html.admin.usuarios

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioDeNovoUsuario_Scope0 {
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

class formularioDeNovoUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: play.data.Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor;

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
    """),_display_(/*5.6*/b3/*5.8*/.form(routes.UsuarioController.salvaNovoUsuario)/*5.56*/ {_display_(Seq[Any](format.raw/*5.58*/("""
        """),format.raw/*6.9*/("""<h1>Cadastre-se</h1>
        """),_display_(/*7.10*/b3/*7.12*/.text(formulario("nome"), '_label -> "Nome")),format.raw/*7.56*/("""
        """),_display_(/*8.10*/b3/*8.12*/.email(formulario("email"), '_label -> "Email")),format.raw/*8.59*/("""
        """),_display_(/*9.10*/b3/*9.12*/.password(formulario("senha"), '_label -> "Senha")),format.raw/*9.62*/("""
        """),_display_(/*10.10*/b3/*10.12*/.password(formulario("confirmaSenha"), '_label -> "Confirmação de senha")),format.raw/*10.85*/("""
        """),_display_(/*11.10*/b3/*11.12*/.submit('class -> "btn btn-primary")/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/(""" """),format.raw/*11.51*/("""Cadastrar """)))}),format.raw/*11.62*/("""
    """)))}))
      }
    }
  }

  def render(formulario:play.data.Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((play.data.Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/**/
object formularioDeNovoUsuario extends formularioDeNovoUsuario_Scope0.formularioDeNovoUsuario
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:49 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/usuarios/formularioDeNovoUsuario.scala.html
                  HASH: a7093082b7b7989a1194914435a3e81d00bf178a
                  MATRIX: 813->1|981->38|1009->78|1040->84|1049->86|1105->134|1144->136|1179->145|1235->175|1245->177|1309->221|1345->231|1355->233|1422->280|1458->290|1468->292|1538->342|1575->352|1586->354|1680->427|1717->437|1728->439|1773->475|1813->477|1842->478|1884->489
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|41->11|41->11|41->11
                  -- GENERATED --
              */
          