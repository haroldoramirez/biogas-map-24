
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notificacoes_Scope0 {
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

class notificacoes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/if(!flash.isEmpty)/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""
    """),format.raw/*2.5*/("""<section class="container-fluid">
        """),_display_(/*3.10*/for(key <- flash.keySet) yield /*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
          """),format.raw/*4.11*/("""<p class="alert alert-"""),_display_(/*4.34*/key),format.raw/*4.37*/(""" """),format.raw/*4.38*/("""text-"""),_display_(/*4.44*/key),format.raw/*4.47*/("""">
          """),_display_(/*5.12*/flash/*5.17*/.get(key)),format.raw/*5.26*/("""
          """),format.raw/*6.11*/("""</p>
        """)))}),format.raw/*7.10*/("""
    """),format.raw/*8.5*/("""</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object notificacoes extends notificacoes_Scope0.notificacoes
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/notificacoes.scala.html
                  HASH: 1524e983303cc2375968773005c5ca5fe4a8c947
                  MATRIX: 847->1|873->19|912->21|943->26|1012->69|1051->93|1090->95|1128->106|1177->129|1200->132|1228->133|1260->139|1283->142|1323->156|1336->161|1365->170|1403->181|1447->195|1478->200
                  LINES: 32->1|32->1|32->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|38->7|39->8
                  -- GENERATED --
              */
          