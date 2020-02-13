
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object senha_Scope0 {
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

class senha extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Field,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, placeholder: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <input
    type="password"
    autocomplete="off"
    maxlength="60"
    class="form-password form-control"
    id=""""),_display_(/*9.10*/field/*9.15*/.id),format.raw/*9.18*/(""""
    name=""""),_display_(/*10.12*/field/*10.17*/.name),format.raw/*10.22*/(""""
    autocomplete="off"
    value=""""),_display_(/*12.13*/field/*12.18*/.value.getOrElse("")),format.raw/*12.38*/(""""
    placeholder=""""),_display_(/*13.19*/placeholder),format.raw/*13.30*/(""""/>
    <span data-toggle="tooltip" data-placement="top" title="Mostrar/Ocultar senha" toggle="#"""),_display_(/*14.94*/field/*14.99*/.id),format.raw/*14.102*/("""" class="fa fa-fw fa-eye field-password-icon toggle-password"></span>
    <span class="help-block pull-right">"""),_display_(/*15.42*/{field.error.map { error => error.message }}),format.raw/*15.86*/("""</span>
</div>
"""))
      }
    }
  }

  def render(field:Field,placeholder:String): play.twirl.api.HtmlFormat.Appendable = apply(field,placeholder)

  def f:((Field,String) => play.twirl.api.HtmlFormat.Appendable) = (field,placeholder) => apply(field,placeholder)

  def ref: this.type = this

}


}

/**/
object senha extends senha_Scope0.senha
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:26 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/senha.scala.html
                  HASH: d2e67f7988a4736680795fae724891de38a11377
                  MATRIX: 771->1|906->41|934->43|984->67|1011->86|1050->88|1090->98|1240->222|1253->227|1276->230|1316->243|1330->248|1356->253|1420->290|1434->295|1475->315|1522->335|1554->346|1678->443|1692->448|1717->451|1855->562|1920->606
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|45->14|45->14|45->14|46->15|46->15
                  -- GENERATED --
              */
          