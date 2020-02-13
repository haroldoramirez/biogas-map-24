
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object arquivojpg_Scope0 {
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

class arquivojpg extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório arquivo JPEG">*</abbr></label>
    <div class="col-md-10">
        <div class="input-group">
            <span class="input-group-addon">
                <span data-toggle="tooltip" title="" data-container=""><small>Apenas em formado JPEG</small></span>
            </span>
            <input
                    id=""""),_display_(/*11.26*/field/*11.31*/.id),format.raw/*11.34*/(""""
                    type="file"
                    name=""""),_display_(/*13.28*/field/*13.33*/.name),format.raw/*13.38*/(""""
                    class="form-control my-form-control"
                    accept="image/jpeg">
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
object arquivojpg extends arquivojpg_Scope0.arquivojpg
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:26 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/arquivojpg.scala.html
                  HASH: 51853e61d36b90c004b4b92a13ba65b0cb2f6850
                  MATRIX: 795->1|969->80|997->82|1047->106|1074->125|1113->127|1153->137|1199->157|1212->162|1235->165|1295->199|1320->204|1348->205|1718->548|1732->553|1756->556|1844->617|1858->622|1884->627|2067->783|2132->827
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13|48->17|48->17
                  -- GENERATED --
              */
          