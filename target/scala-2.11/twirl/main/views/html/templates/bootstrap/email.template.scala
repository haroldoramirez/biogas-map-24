
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
  id=""""),_display_(/*9.8*/field/*9.13*/.id),format.raw/*9.16*/(""""
  name=""""),_display_(/*10.10*/field/*10.15*/.name),format.raw/*10.20*/(""""
  value=""""),_display_(/*11.11*/field/*11.16*/.value.getOrElse("")),format.raw/*11.36*/(""""
  placeholder=""""),_display_(/*12.17*/placeholder),format.raw/*12.28*/(""""/>
  <span class="help-block pull-right">"""),_display_(/*13.40*/{field.error.map { error => error.message }}),format.raw/*13.84*/("""</span>
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
                  DATE: Thu Feb 13 15:12:04 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/email.scala.html
                  HASH: c607f67371595aac4a093285a3cf23d9c3450f70
                  MATRIX: 771->1|906->41|934->43|984->67|1011->86|1050->88|1090->98|1224->207|1237->212|1260->215|1298->226|1312->231|1338->236|1377->248|1391->253|1432->273|1477->291|1509->302|1579->345|1644->389
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          