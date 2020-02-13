
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textourl_Scope0 {
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

class textourl extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório endereço válido">*</abbr></label>
    <div class="col-md-10">
        <div class="input-group">
            <input type="text"
                   class="form-control"
                   id=""""),_display_(/*9.25*/field/*9.30*/.id),format.raw/*9.33*/(""""
                   autocomplete="off"
                   name=""""),_display_(/*11.27*/field/*11.32*/.name),format.raw/*11.37*/(""""
                   value=""""),_display_(/*12.28*/field/*12.33*/.value.getOrElse("")),format.raw/*12.53*/(""""
            placeholder=""""),_display_(/*13.27*/placeholder),format.raw/*13.38*/(""""/>
            <span class="input-group-addon ">
                 <input type="radio" id="radio-url" name="radio-url" value='radio-value' checked="checked">
            </span>
        </div>
        <span class="help-block"><small>"""),_display_(/*18.42*/{field.error.map { error => error.message }}),format.raw/*18.86*/("""</small></span>
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
object textourl extends textourl_Scope0.textourl
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:24 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/textourl.scala.html
                  HASH: 80b5841d9ca17a2f2a92793e3be5504306e614fd
                  MATRIX: 791->1|965->80|993->82|1043->106|1070->125|1109->127|1149->137|1195->157|1208->162|1231->165|1291->199|1316->204|1344->205|1586->421|1599->426|1622->429|1715->495|1729->500|1755->505|1811->534|1825->539|1866->559|1921->587|1953->598|2214->832|2279->876
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|49->18|49->18
                  -- GENERATED --
              */
          