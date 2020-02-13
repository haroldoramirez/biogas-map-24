
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object texto_Scope0 {
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

class texto extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div class="col-md-10">
        <input type="text"
               class="form-control"
               id=""""),_display_(/*8.21*/field/*8.26*/.id),format.raw/*8.29*/(""""
               autocomplete="off"
               name=""""),_display_(/*10.23*/field/*10.28*/.name),format.raw/*10.33*/(""""
               value=""""),_display_(/*11.24*/field/*11.29*/.value.getOrElse("")),format.raw/*11.49*/(""""
               placeholder=""""),_display_(/*12.30*/placeholder),format.raw/*12.41*/(""""/>
        <span class="help-block"><small>"""),_display_(/*13.42*/{field.error.map { error => error.message }}),format.raw/*13.86*/("""</small></span>
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
object texto extends texto_Scope0.texto
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:24 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/texto.scala.html
                  HASH: a4f87f03456a6974cdc53425f53f57024ab94632
                  MATRIX: 785->1|959->80|987->82|1037->106|1064->125|1103->127|1143->137|1189->157|1202->162|1225->165|1285->199|1310->204|1338->205|1518->359|1531->364|1554->367|1639->425|1653->430|1679->435|1731->460|1745->465|1786->485|1844->516|1876->527|1948->572|2013->616
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          