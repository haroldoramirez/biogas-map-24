
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object datetimePickerDataFim_Scope0 {
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

class datetimePickerDataFim extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

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
</div>
"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object datetimePickerDataFim extends datetimePickerDataFim_Scope0.datetimePickerDataFim
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:26 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/datetimePickerDataFim.scala.html
                  HASH: ff739c55cafef92d57ccdc544d042a268d7f555e
                  MATRIX: 817->1|991->80|1019->82|1069->106|1096->125|1135->127|1175->137|1221->157|1234->162|1257->165|1317->199|1342->204|1370->205|1509->318|1522->323|1545->326|1614->369|1627->374|1650->377|1802->502|1816->507|1842->512|1901->544|1933->555|1986->581|2000->586|2041->606|2230->768|2295->812
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|37->6|37->6|37->6|39->8|39->8|39->8|43->12|43->12|43->12|44->13|44->13|45->14|45->14|45->14|48->17|48->17
                  -- GENERATED --
              */
          