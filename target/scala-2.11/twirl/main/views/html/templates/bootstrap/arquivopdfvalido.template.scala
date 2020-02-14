
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object arquivopdfvalido_Scope0 {
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

class arquivopdfvalido extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

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
            <span class="input-group-addon ">
                <input type="radio" id="radio-arquivo" name="radio-arquivo" value='radio-value'>
            </span>
        </div>
        <span class="help-block"><small>"""),_display_(/*20.42*/{field.error.map { error => error.message }}),format.raw/*20.86*/("""</small></span>
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
object arquivopdfvalido extends arquivopdfvalido_Scope0.arquivopdfvalido
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/arquivopdfvalido.scala.html
                  HASH: f6bdaa850cfa6913b0d4567a7f0c27df9df51a4e
                  MATRIX: 807->1|981->80|1009->82|1059->106|1086->125|1125->127|1165->137|1211->157|1224->162|1247->165|1307->199|1332->204|1360->205|1728->546|1742->551|1766->554|1854->615|1868->620|1894->625|2245->949|2310->993
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13|51->20|51->20
                  -- GENERATED --
              */
          