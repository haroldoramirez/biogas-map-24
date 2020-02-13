
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object selecao_Scope0 {
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

class selecao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,Map[String, Boolean],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", optionMap: Map[String, Boolean], isMultiple: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div class="col-md-3">
        <select
            class="form-control"
            id=""""),_display_(/*8.18*/field/*8.23*/.id),format.raw/*8.26*/(""""
            name=""""),_display_(/*9.20*/if(isMultiple)/*9.34*/ {_display_(_display_(/*9.37*/(field.name + "[]")))}/*9.58*/else/*9.63*/{_display_(_display_(/*9.65*/field/*9.70*/.name))}),format.raw/*9.76*/(""""
            """),_display_(/*10.14*/if(isMultiple)/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""multiple="multiple"""")))}),format.raw/*10.50*/(""">
            """),_display_(/*11.14*/if(!isMultiple)/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""<option class="blank" value="">-- Selecione --</option>""")))}),format.raw/*11.87*/("""
            """),_display_(/*12.14*/for((optionName, isSelected) <- optionMap) yield /*12.56*/ {_display_(Seq[Any](format.raw/*12.58*/("""
                """),format.raw/*13.17*/("""<option id=""""),_display_(/*13.30*/optionName),format.raw/*13.40*/("""" value=""""),_display_(/*13.50*/optionName),format.raw/*13.60*/("""" """),_display_(/*13.63*/if(optionName == field.value.getOrElse(""))/*13.106*/ {_display_(Seq[Any](format.raw/*13.108*/("""selected""")))}),format.raw/*13.117*/(""">"""),_display_(/*13.119*/optionName),format.raw/*13.129*/("""</option>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</select>
        <span class="help-block"><small>"""),_display_(/*16.42*/{field.error.map { error => error.message }}),format.raw/*16.86*/("""</small></span>
    </div>
</div>"""))
      }
    }
  }

  def render(field:Field,label:String,optionMap:Map[String, Boolean],isMultiple:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isMultiple)

  def f:((Field,String,Map[String, Boolean],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isMultiple) => apply(field,label,optionMap,isMultiple)

  def ref: this.type = this

}


}

/**/
object selecao extends selecao_Scope0.selecao
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 17:18:27 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/selecao.scala.html
                  HASH: 8896bdce9e5d427b984e92b7c3acea02e18b150b
                  MATRIX: 804->1|987->89|1015->91|1065->115|1092->134|1131->136|1171->146|1217->166|1230->171|1253->174|1313->208|1338->213|1366->214|1528->350|1541->355|1564->358|1611->379|1633->393|1663->396|1693->417|1705->422|1734->424|1747->429|1775->435|1817->450|1840->464|1880->466|1931->486|1973->501|1997->516|2037->518|2124->574|2165->588|2223->630|2263->632|2308->649|2348->662|2379->672|2416->682|2447->692|2477->695|2530->738|2571->740|2612->749|2642->751|2674->761|2728->784|2764->793|2842->844|2907->888
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|46->15|47->16|47->16
                  -- GENERATED --
              */
          