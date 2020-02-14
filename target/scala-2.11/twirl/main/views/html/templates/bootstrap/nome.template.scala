
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object nome_Scope0 {
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

class nome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Field,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, placeholder: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <input
    type="text"
    autocomplete="off"
    maxlength="60"
    class="form-username form-control"
    id=""""),_display_(/*9.10*/field/*9.15*/.id),format.raw/*9.18*/(""""
    name=""""),_display_(/*10.12*/field/*10.17*/.name),format.raw/*10.22*/(""""
    value=""""),_display_(/*11.13*/field/*11.18*/.value.getOrElse("")),format.raw/*11.38*/(""""
    placeholder=""""),_display_(/*12.19*/placeholder),format.raw/*12.30*/(""""/>
    <span class="help-block pull-right">"""),_display_(/*13.42*/{field.error.map { error => error.message }}),format.raw/*13.86*/("""</span>
</div>"""))
      }
    }
  }

  def render(field:Field,placeholder:String): play.twirl.api.HtmlFormat.Appendable = apply(field,placeholder)

  def f:((Field,String) => play.twirl.api.HtmlFormat.Appendable) = (field,placeholder) => apply(field,placeholder)

  def ref: this.type = this

}


}

/**/
object nome extends nome_Scope0.nome
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/nome.scala.html
                  HASH: 8a3a864057cc4ff4d88a891f0b04dacac8308178
                  MATRIX: 769->1|904->41|932->43|982->67|1009->86|1048->88|1088->98|1234->218|1247->223|1270->226|1310->239|1324->244|1350->249|1391->263|1405->268|1446->288|1493->308|1525->319|1597->364|1662->408
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          