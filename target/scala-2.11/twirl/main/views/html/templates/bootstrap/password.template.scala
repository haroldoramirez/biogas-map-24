
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_Scope0 {
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

class password extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group">
    <input
    type="password"
    class="form-password form-control"
    id=""""),_display_(/*7.10*/field/*7.15*/.id),format.raw/*7.18*/(""""
    name=""""),_display_(/*8.12*/field/*8.17*/.name),format.raw/*8.22*/(""""
    autocomplete="off"
    value=""""),_display_(/*10.13*/field/*10.18*/.value.getOrElse("")),format.raw/*10.38*/(""""
    placeholder=""""),_display_(/*11.19*/placeholder),format.raw/*11.30*/(""""/>
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
object password extends password_Scope0.password
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:26 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/password.scala.html
                  HASH: 11321571bc57b4ad4de48ca96cfa063e5f47dccb
                  MATRIX: 791->1|965->80|993->82|1123->186|1136->191|1159->194|1198->207|1211->212|1236->217|1300->254|1314->259|1355->279|1402->299|1434->310
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11
                  -- GENERATED --
              */
          