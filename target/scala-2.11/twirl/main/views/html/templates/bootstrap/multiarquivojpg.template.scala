
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object multiarquivojpg_Scope0 {
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

class multiarquivojpg extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

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
                    multiple accept="image/jpeg">
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
object multiarquivojpg extends multiarquivojpg_Scope0.multiarquivojpg
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/multiarquivojpg.scala.html
                  HASH: d904a3b4acb1f496ea2c2603f85c25484bf2c219
                  MATRIX: 805->1|979->80|1007->82|1057->106|1084->125|1123->127|1163->137|1209->157|1222->162|1245->165|1305->199|1330->204|1358->205|1728->548|1742->553|1766->556|1854->617|1868->622|1894->627|2086->792|2151->836
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13|48->17|48->17
                  -- GENERATED --
              */
          