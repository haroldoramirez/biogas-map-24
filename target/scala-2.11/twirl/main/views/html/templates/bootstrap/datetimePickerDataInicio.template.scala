
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object datetimePickerDataInicio_Scope0 {
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

class datetimePickerDataInicio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div class="col-md-4">
        <div class="input-group date" id=""""),_display_(/*6.44*/field/*6.49*/.id),format.raw/*6.52*/("""">
            <input
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/(""""
                autocomplete="off"
                type="text"
                class="form-control"
                name=""""),_display_(/*12.24*/field/*12.29*/.name),format.raw/*12.34*/(""""
                placeholder=""""),_display_(/*13.31*/placeholder),format.raw/*13.42*/(""""
                value=""""),_display_(/*14.25*/field/*14.30*/.value.getOrElse("")),format.raw/*14.50*/(""""/>
            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
        </div>
        <span class="help-block"><small>"""),_display_(/*17.42*/{field.error.map { error => error.message }}),format.raw/*17.86*/("""</small></span>
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
object datetimePickerDataInicio extends datetimePickerDataInicio_Scope0.datetimePickerDataInicio
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/datetimePickerDataInicio.scala.html
                  HASH: 79bc00ad0e2ebda935d2d6c03fd028e9a46b1046
                  MATRIX: 823->1|997->80|1025->82|1075->106|1102->125|1141->127|1181->137|1227->157|1240->162|1263->165|1323->199|1348->204|1376->205|1515->318|1528->323|1551->326|1620->369|1633->374|1656->377|1808->502|1822->507|1848->512|1907->544|1939->555|1992->581|2006->586|2047->606|2236->768|2301->812
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|37->6|37->6|37->6|39->8|39->8|39->8|43->12|43->12|43->12|44->13|44->13|45->14|45->14|45->14|48->17|48->17
                  -- GENERATED --
              */
          