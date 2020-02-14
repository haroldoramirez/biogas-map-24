
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object multiarquivo_Scope0 {
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

class multiarquivo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-sm-3 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div class="col-sm-9">
        <input id=""""),_display_(/*6.21*/field/*6.26*/.id),format.raw/*6.29*/("""" type="file" name=""""),_display_(/*6.50*/field/*6.55*/.name),format.raw/*6.60*/("""" class="form-control my-form-control" multiple>
        <span class="help-block"><small>"""),_display_(/*7.42*/{field.error.map { error => error.message }}),format.raw/*7.86*/("""</small></span>
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
object multiarquivo extends multiarquivo_Scope0.multiarquivo
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/multiarquivo.scala.html
                  HASH: e4a251786ab113d691c890a1ef2eff0b92ce42d0
                  MATRIX: 799->1|973->80|1001->82|1051->106|1078->125|1117->127|1157->137|1203->157|1216->162|1239->165|1299->199|1324->204|1352->205|1468->295|1481->300|1504->303|1551->324|1564->329|1589->334|1705->424|1769->468
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|37->6|37->6|37->6|37->6|37->6|37->6|38->7|38->7
                  -- GENERATED --
              */
          