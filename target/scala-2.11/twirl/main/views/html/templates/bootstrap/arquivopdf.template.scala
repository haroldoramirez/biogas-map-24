
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object arquivopdf_Scope0 {
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

class arquivopdf extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório arquivo PDF">*</abbr></label>
    <div class="col-md-10">
        <div class="input-group">
            <span class="input-group-addon">
                <span data-toggle="tooltip" title="" data-container=""><small>Apenas em formado PDF</small></span>
            </span>
            <input
                    id=""""),_display_(/*11.26*/field/*11.31*/.id),format.raw/*11.34*/(""""
                    type="file"
                    name=""""),_display_(/*13.28*/field/*13.33*/.name),format.raw/*13.38*/(""""
                    class="form-control my-form-control"
                    accept="application/pdf">
        </div>
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
object arquivopdf extends arquivopdf_Scope0.arquivopdf
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:26 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/arquivopdf.scala.html
                  HASH: 11193f8ace77b3afb01a1ab2c4c3438d2a4d008e
                  MATRIX: 795->1|969->80|997->82|1047->106|1074->125|1113->127|1153->137|1199->157|1212->162|1235->165|1295->199|1320->204|1348->205|1716->546|1730->551|1754->554|1842->615|1856->620|1882->625
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13
                  -- GENERATED --
              */
          