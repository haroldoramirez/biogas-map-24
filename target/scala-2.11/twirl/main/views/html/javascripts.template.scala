
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object javascripts_Scope0 {
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

class javascripts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*Jquery*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*2.80*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("bower_components/jquery-ui/jquery-ui.js")),format.raw/*3.81*/("""" type="text/javascript"></script>

"""),format.raw/*5.16*/("""
"""),format.raw/*6.1*/("""<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*6.89*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("bower_components/bootstrap-multiselect/dist/js/bootstrap-multiselect.js")),format.raw/*7.113*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("material-design/material.js")),format.raw/*8.69*/("""" type="text/javascript"></script>

"""),format.raw/*10.15*/("""
"""),format.raw/*11.1*/("""<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("bower_components/jquery-csv/src/jquery.csv.js")),format.raw/*11.87*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.versioned("bower_components/jquery-toast-plugin/dist/jquery.toast.js")),format.raw/*12.99*/("""" type="text/javascript"></script>

"""),format.raw/*14.15*/("""
"""),format.raw/*15.1*/("""<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.versioned("bower_components/downloadjs/download.js")),format.raw/*15.81*/("""" type="text/javascript"></script>

"""),format.raw/*17.8*/("""
"""),format.raw/*18.1*/("""<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("bower_components/pdfmake/build/pdfmake.js")),format.raw/*18.83*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.versioned("bower_components/pdfmake/build/vfs_fonts.js")),format.raw/*19.85*/("""" type="text/javascript"></script>

"""),format.raw/*21.22*/("""
"""),format.raw/*22.1*/("""<script src=""""),_display_(/*22.15*/routes/*22.21*/.Assets.versioned("openlayers/3.1.0/build/ol.js")),format.raw/*22.70*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*23.15*/routes/*23.21*/.Assets.versioned("bower_components/proj4/dist/proj4.js")),format.raw/*23.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*24.15*/routes/*24.21*/.Assets.versioned("openlayers/js/epsg/29191.js")),format.raw/*24.69*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*25.15*/routes/*25.21*/.Assets.versioned("openlayers/js/epsg/31981.js")),format.raw/*25.69*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*26.15*/routes/*26.21*/.Assets.versioned("openlayers/js/epsg/900913.js")),format.raw/*26.70*/("""" type="text/javascript"></script>

"""),format.raw/*28.13*/("""
"""),format.raw/*29.1*/("""<script src=""""),_display_(/*29.15*/routes/*29.21*/.Assets.versioned("bower_components/moment/min/moment.js")),format.raw/*29.79*/("""" type="text/javascript"></script>

"""),format.raw/*31.9*/("""
"""),format.raw/*32.1*/("""<script src=""""),_display_(/*32.15*/routes/*32.21*/.Assets.versioned("javascripts/mapa/variaveis.js")),format.raw/*32.71*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*33.15*/routes/*33.21*/.Assets.versioned("javascripts/mapa/relatorios.js")),format.raw/*33.72*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*34.15*/routes/*34.21*/.Assets.versioned("javascripts/mapa/servicos.js")),format.raw/*34.70*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*35.15*/routes/*35.21*/.Assets.versioned("javascripts/mapa/botoes.js")),format.raw/*35.68*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*36.15*/routes/*36.21*/.Assets.versioned("javascripts/mapa/popup.js")),format.raw/*36.67*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*37.15*/routes/*37.21*/.Assets.versioned("javascripts/mapa/verificadores.js")),format.raw/*37.75*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*38.15*/routes/*38.21*/.Assets.versioned("javascripts/mapa/mapa.js")),format.raw/*38.66*/("""" type="text/javascript"></script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*Jquery*/
object javascripts extends javascripts_Scope0.javascripts
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/javascripts.scala.html
                  HASH: ebdc385d2b176ab531d38585f2ba2de33d2b591e
                  MATRIX: 845->11|885->25|899->31|978->90|1053->139|1067->145|1147->205|1210->256|1237->257|1277->271|1291->277|1379->345|1454->394|1468->400|1581->492|1656->541|1670->547|1738->595|1802->645|1830->646|1871->660|1886->666|1973->732|2049->781|2064->787|2163->865|2227->915|2255->916|2296->930|2311->936|2392->996|2455->1039|2483->1040|2524->1054|2539->1060|2622->1122|2698->1171|2713->1177|2798->1241|2862->1298|2890->1299|2931->1313|2946->1319|3016->1368|3092->1417|3107->1423|3185->1480|3261->1529|3276->1535|3345->1583|3421->1632|3436->1638|3505->1686|3581->1735|3596->1741|3666->1790|3730->1838|3758->1839|3799->1853|3814->1859|3893->1917|3956->1961|3984->1962|4025->1976|4040->1982|4111->2032|4187->2081|4202->2087|4274->2138|4350->2187|4365->2193|4435->2242|4511->2291|4526->2297|4594->2344|4670->2393|4685->2399|4752->2445|4828->2494|4843->2500|4918->2554|4994->2603|5009->2609|5075->2654
                  LINES: 32->2|32->2|32->2|32->2|33->3|33->3|33->3|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|44->14|45->15|45->15|45->15|45->15|47->17|48->18|48->18|48->18|48->18|49->19|49->19|49->19|51->21|52->22|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|58->28|59->29|59->29|59->29|59->29|61->31|62->32|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38
                  -- GENERATED --
              */
          