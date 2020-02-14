
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object email_Scope0 {
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

class email extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Field,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, placeholder: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <input
    type="email"
    autocomplete="off"
    maxlength="40"
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
object email extends email_Scope0.email
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/email.scala.html
                  HASH: 3847d69b0289d9fcbf04b9139b49f0f5503d3c86
                  MATRIX: 771->1|906->41|934->43|984->67|1011->86|1050->88|1090->98|1237->219|1250->224|1273->227|1313->240|1327->245|1353->250|1394->264|1408->269|1449->289|1496->309|1528->320|1600->365|1665->409
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          