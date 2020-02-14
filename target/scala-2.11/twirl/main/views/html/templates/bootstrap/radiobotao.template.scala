
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object radiobotao_Scope0 {
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

class radiobotao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Field,String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", buttonNameList: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-md-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div id=""""),_display_(/*5.15*/(field.id + "s")),format.raw/*5.31*/("""" class="col-md-10" >
        """),_display_(/*6.10*/for(buttonName <- buttonNameList) yield /*6.43*/ {_display_(Seq[Any](format.raw/*6.45*/("""
            """),format.raw/*7.13*/("""<label class="radio-inline">
                <input
                type="radio"
                name=""""),_display_(/*10.24*/field/*10.29*/.name),format.raw/*10.34*/(""""
                id=""""),_display_(/*11.22*/buttonName),format.raw/*11.32*/(""""
                value=""""),_display_(/*12.25*/buttonName),format.raw/*12.35*/(""""
                """),_display_(/*13.18*/if(buttonName == field.value.getOrElse(""))/*13.61*/ {_display_(Seq[Any](format.raw/*13.63*/("""checked""")))}),format.raw/*13.71*/(""" """),format.raw/*13.72*/("""/>
                """),_display_(/*14.18*/buttonName),format.raw/*14.28*/("""
            """),format.raw/*15.13*/("""</label>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""<span class="help-block">"""),_display_(/*17.35*/{field.error.map { error => error.message }}),format.raw/*17.79*/("""</span>
    </div>
</div>
"""))
      }
    }
  }

  def render(field:Field,label:String,buttonNameList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(field,label,buttonNameList)

  def f:((Field,String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (field,label,buttonNameList) => apply(field,label,buttonNameList)

  def ref: this.type = this

}


}

/**/
object radiobotao extends radiobotao_Scope0.radiobotao
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/radiobotao.scala.html
                  HASH: 64689cf0a3ca98976a8bef5029adfe825ef4b1f9
                  MATRIX: 794->1|961->73|989->75|1039->99|1066->118|1105->120|1145->130|1222->181|1235->186|1258->189|1287->192|1312->197|1340->198|1423->255|1459->271|1516->302|1564->335|1603->337|1643->350|1774->454|1788->459|1814->464|1864->487|1895->497|1948->523|1979->533|2025->552|2077->595|2117->597|2156->605|2185->606|2232->626|2263->636|2304->649|2353->667|2389->676|2442->702|2507->746
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|46->15|47->16|48->17|48->17|48->17
                  -- GENERATED --
              */
          