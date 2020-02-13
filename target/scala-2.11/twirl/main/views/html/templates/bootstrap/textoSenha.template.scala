
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textoSenha_Scope0 {
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

class textoSenha extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div class="col-md-10">
        <input type="password"
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/field/*9.21*/.name),format.raw/*9.26*/(""""
        autocomplete="off"
        value=""""),_display_(/*11.17*/field/*11.22*/.value.getOrElse("")),format.raw/*11.42*/(""""
        placeholder=""""),_display_(/*12.23*/placeholder),format.raw/*12.34*/(""""/>
        <span data-toggle="tooltip" data-placement="top" title="Mostrar/Ocultar senha" toggle="#"""),_display_(/*13.98*/field/*13.103*/.id),format.raw/*13.106*/("""" class="fa fa-fw fa-eye field-password-icon toggle-password"></span>
        <span class="help-block">"""),_display_(/*14.35*/{field.error.map { error => error.message }}),format.raw/*14.79*/("""</span>
    </div>
</div>"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object textoSenha extends textoSenha_Scope0.textoSenha
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:24 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/textoSenha.scala.html
                  HASH: 48b7d57385d5d226cc487129cc31875caac0bfac
                  MATRIX: 795->1|969->80|997->82|1047->106|1074->125|1113->127|1153->137|1199->157|1212->162|1235->165|1295->199|1320->204|1348->205|1518->349|1531->354|1554->357|1597->374|1610->379|1635->384|1707->429|1721->434|1762->454|1813->478|1845->489|1973->590|1988->595|2013->598|2144->702|2209->746
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|44->13|44->13|44->13|45->14|45->14
                  -- GENERATED --
              */
          