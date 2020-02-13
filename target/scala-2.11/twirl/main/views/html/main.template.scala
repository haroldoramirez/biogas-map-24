
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="msapplication-TileColor" content="#3372DF">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="MAPA">
    <meta name="apple-mobile-web-app-title" content="MAPA">

    <title>BIOGASMAP | CIBiogás</title>

    <link rel="icon" sizes="192x192" href=""""),_display_(/*15.45*/routes/*15.51*/.Assets.versioned("images//ministerios/favicon-mapa.ico")),format.raw/*15.108*/("""">
    <link rel="apple-touch-icon-precomposed" href=""""),_display_(/*16.53*/routes/*16.59*/.Assets.versioned("images/ministerios/favicon-mapa.ico")),format.raw/*16.115*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("images/ministerios/favicon-mapa.ico")),format.raw/*17.117*/("""">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href=""""),_display_(/*20.35*/routes/*20.41*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.css")),format.raw/*20.111*/("""">
    <link rel="stylesheet" href=""""),_display_(/*21.35*/routes/*21.41*/.Assets.versioned("bower_components/material-design-lite/material.css")),format.raw/*21.112*/("""">
    <link rel="stylesheet" href=""""),_display_(/*22.35*/routes/*22.41*/.Assets.versioned("stylesheets/material-fonts.css")),format.raw/*22.92*/("""">
    <link rel="stylesheet" href=""""),_display_(/*23.35*/routes/*23.41*/.Assets.versioned("stylesheets/material-icons.css")),format.raw/*23.92*/("""">

    <link rel="stylesheet" href=""""),_display_(/*25.35*/routes/*25.41*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.css")),format.raw/*25.112*/("""">

    <link rel="stylesheet" href=""""),_display_(/*27.35*/routes/*27.41*/.Assets.versioned("openlayers/3.1.0/css/ol.css")),format.raw/*27.89*/("""">
    <link rel="stylesheet" href=""""),_display_(/*28.35*/routes/*28.41*/.Assets.versioned("bower_components/jquery-ui/themes/smoothness/jquery-ui.css")),format.raw/*28.120*/("""">

    <link rel="stylesheet" href=""""),_display_(/*30.35*/routes/*30.41*/.Assets.versioned("bower_components/jquery-toast-plugin/dist/jquery.toast.css")),format.raw/*30.120*/("""">
    <link rel="stylesheet" href=""""),_display_(/*31.35*/routes/*31.41*/.Assets.versioned("bower_components/bootstrap-multiselect/dist/css/bootstrap-multiselect.css")),format.raw/*31.135*/("""">


    <link rel="stylesheet" href=""""),_display_(/*34.35*/routes/*34.41*/.Assets.versioned("openlayers/css/style.css")),format.raw/*34.86*/("""">

    <link rel="stylesheet" href=""""),_display_(/*36.35*/routes/*36.41*/.Assets.versioned("stylesheets/map.css")),format.raw/*36.81*/("""">
    <link rel="stylesheet" href=""""),_display_(/*37.35*/routes/*37.41*/.Assets.versioned("stylesheets/template-mdl.css")),format.raw/*37.90*/("""">
    <link rel="stylesheet" href=""""),_display_(/*38.35*/routes/*38.41*/.Assets.versioned("stylesheets/modal.css")),format.raw/*38.83*/("""">

    <link rel="stylesheet" href=""""),_display_(/*40.35*/routes/*40.41*/.Assets.versioned("bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css")),format.raw/*40.151*/("""">

</head>
<body>
"""),format.raw/*44.25*/("""
"""),format.raw/*45.1*/("""<div class="mdl-layout cib-layout mdl-js-layout mdl-layout--fixed-header">

    """),format.raw/*47.22*/("""
    """),format.raw/*48.5*/("""<header class="mdl-layout__header mdl-color--deep-green-cibiogas mdl-color-text--white">
        <div class="mdl-layout__header-row">
            <div class="esconde-celular">
                <img class="top-menu-imagem-centro" src=""""),_display_(/*51.59*/routes/*51.65*/.Assets.versioned("images/cibiogas-branco.png")),format.raw/*51.112*/("""">
            </div>
            <div class="mdl-layout-spacer"></div>
            <div class="esconde-celular text-center"><strong>BIOGASMAP<br></strong></div>
            <div class="mdl-layout-spacer"></div>
            <div>
                <img class="card-image-top-menu" src=""""),_display_(/*57.56*/routes/*57.62*/.Assets.versioned("images/logos-producao-mapa.png")),format.raw/*57.113*/("""">
            </div>
        </div>
    </header>
    """),format.raw/*61.26*/("""

    """),_display_(/*63.6*/sidebar()),format.raw/*63.15*/("""

    """),format.raw/*65.24*/("""
    """),format.raw/*66.5*/("""<main class="mdl-layout__content mdl-color--grey-100">
        <section>
            <div id="mapa" tabindex="0">
                <div id="popup" class="ol-popup">
                    <!-- Botao fechar o popup -->
                    <a id="popup-closer" class="ol-popup-closer"></a>
                    <!-- Conteudo do popup -->
                    <div id="popup-content"></div>
                </div>
            </div>
            <div id="mousePosition"></div>
            <div class="esconde-celular" id="legenda"></div>
        </section>
    </main>
    """),format.raw/*80.21*/("""

"""),format.raw/*82.1*/("""</div>
"""),format.raw/*83.22*/("""
"""),format.raw/*84.11*/("""
"""),format.raw/*85.1*/("""<script src=""""),_display_(/*85.15*/routes/*85.21*/.Assets.versioned("bower_components/jquery/dist/jquery.js")),format.raw/*85.80*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*86.15*/routes/*86.21*/.Assets.versioned("bower_components/jquery-ui/jquery-ui.js")),format.raw/*86.81*/("""" type="text/javascript"></script>

    """),format.raw/*88.20*/("""
"""),format.raw/*89.1*/("""<script src=""""),_display_(/*89.15*/routes/*89.21*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.js")),format.raw/*89.89*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*90.15*/routes/*90.21*/.Assets.versioned("material-design/material.js")),format.raw/*90.69*/("""" type="text/javascript"></script>

"""),format.raw/*92.15*/("""
"""),format.raw/*93.1*/("""<script src=""""),_display_(/*93.15*/routes/*93.21*/.Assets.versioned("bower_components/jquery-csv/src/jquery.csv.js")),format.raw/*93.87*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*94.15*/routes/*94.21*/.Assets.versioned("bower_components/jquery-toast-plugin/dist/jquery.toast.js")),format.raw/*94.99*/("""" type="text/javascript"></script>

"""),format.raw/*96.15*/("""
"""),format.raw/*97.1*/("""<script src=""""),_display_(/*97.15*/routes/*97.21*/.Assets.versioned("bower_components/downloadjs/download.js")),format.raw/*97.81*/("""" type="text/javascript"></script>

    """),format.raw/*99.12*/("""
"""),format.raw/*100.1*/("""<script src=""""),_display_(/*100.15*/routes/*100.21*/.Assets.versioned("bower_components/pdfmake/build/pdfmake.js")),format.raw/*100.83*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*101.15*/routes/*101.21*/.Assets.versioned("bower_components/pdfmake/build/vfs_fonts.js")),format.raw/*101.85*/("""" type="text/javascript"></script>

    """),format.raw/*103.26*/("""
"""),format.raw/*104.1*/("""<script src=""""),_display_(/*104.15*/routes/*104.21*/.Assets.versioned("openlayers/3.1.0/build/ol.js")),format.raw/*104.70*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*105.15*/routes/*105.21*/.Assets.versioned("bower_components/proj4/dist/proj4.js")),format.raw/*105.78*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*106.15*/routes/*106.21*/.Assets.versioned("openlayers/js/epsg/29191.js")),format.raw/*106.69*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*107.15*/routes/*107.21*/.Assets.versioned("openlayers/js/epsg/31981.js")),format.raw/*107.69*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*108.15*/routes/*108.21*/.Assets.versioned("openlayers/js/epsg/900913.js")),format.raw/*108.70*/("""" type="text/javascript"></script>

"""),format.raw/*110.13*/("""
"""),format.raw/*111.1*/("""<script src=""""),_display_(/*111.15*/routes/*111.21*/.Assets.versioned("bower_components/moment/min/moment.js")),format.raw/*111.79*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*113.15*/routes/*113.21*/.Assets.versioned("bower_components/bootstrap-multiselect/dist/js/bootstrap-multiselect.js")),format.raw/*113.113*/("""" type="text/javascript"></script>

"""),format.raw/*115.9*/("""
"""),format.raw/*116.1*/("""<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.versioned("javascripts/mapa/variaveis.js")),format.raw/*116.71*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*117.15*/routes/*117.21*/.Assets.versioned("javascripts/mapa/relatorios.js")),format.raw/*117.72*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*118.15*/routes/*118.21*/.Assets.versioned("javascripts/mapa/servicos.js")),format.raw/*118.70*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*119.15*/routes/*119.21*/.Assets.versioned("javascripts/mapa/botoes.js")),format.raw/*119.68*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*120.15*/routes/*120.21*/.Assets.versioned("javascripts/mapa/popup.js")),format.raw/*120.67*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*121.15*/routes/*121.21*/.Assets.versioned("javascripts/mapa/verificadores.js")),format.raw/*121.75*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*122.15*/routes/*122.21*/.Assets.versioned("javascripts/mapa/mapa.js")),format.raw/*122.66*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 08:19:21 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/main.scala.html
                  HASH: cfbcf0a568ed881d9924423821daa2f88ab6dea9
                  MATRIX: 825->0|1434->582|1449->588|1528->645|1610->700|1625->706|1703->762|1787->819|1802->825|1880->881|1977->951|1992->957|2084->1027|2148->1064|2163->1070|2256->1141|2320->1178|2335->1184|2407->1235|2471->1272|2486->1278|2558->1329|2623->1367|2638->1373|2731->1444|2796->1482|2811->1488|2880->1536|2944->1573|2959->1579|3060->1658|3125->1696|3140->1702|3241->1781|3305->1818|3320->1824|3436->1918|3502->1957|3517->1963|3583->2008|3648->2046|3663->2052|3724->2092|3788->2129|3803->2135|3873->2184|3937->2221|3952->2227|4015->2269|4080->2307|4095->2313|4227->2423|4274->2466|4302->2467|4410->2564|4442->2569|4703->2803|4718->2809|4787->2856|5099->3141|5114->3147|5187->3198|5270->3274|5303->3281|5333->3290|5367->3315|5399->3320|5990->3899|6019->3901|6054->3929|6083->3940|6111->3941|6152->3955|6167->3961|6247->4020|6323->4069|6338->4075|6419->4135|6487->4190|6515->4191|6556->4205|6571->4211|6660->4279|6736->4328|6751->4334|6820->4382|6884->4432|6912->4433|6953->4447|6968->4453|7055->4519|7131->4568|7146->4574|7245->4652|7309->4702|7337->4703|7378->4717|7393->4723|7474->4783|7542->4830|7571->4831|7613->4845|7629->4851|7713->4913|7790->4962|7806->4968|7892->5032|7961->5093|7990->5094|8032->5108|8048->5114|8119->5163|8196->5212|8212->5218|8291->5275|8368->5324|8384->5330|8454->5378|8531->5427|8547->5433|8617->5481|8694->5530|8710->5536|8781->5585|8846->5633|8875->5634|8917->5648|8933->5654|9013->5712|9091->5762|9107->5768|9222->5860|9286->5904|9315->5905|9357->5919|9373->5925|9445->5975|9522->6024|9538->6030|9611->6081|9688->6130|9704->6136|9775->6185|9852->6234|9868->6240|9937->6287|10014->6336|10030->6342|10098->6388|10175->6437|10191->6443|10267->6497|10344->6546|10360->6552|10427->6597
                  LINES: 32->1|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|65->34|65->34|65->34|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|71->40|71->40|71->40|75->44|76->45|78->47|79->48|82->51|82->51|82->51|88->57|88->57|88->57|92->61|94->63|94->63|96->65|97->66|111->80|113->82|114->83|115->84|116->85|116->85|116->85|116->85|117->86|117->86|117->86|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|127->96|128->97|128->97|128->97|128->97|130->99|131->100|131->100|131->100|131->100|132->101|132->101|132->101|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|137->106|137->106|137->106|138->107|138->107|138->107|139->108|139->108|139->108|141->110|142->111|142->111|142->111|142->111|144->113|144->113|144->113|146->115|147->116|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122
                  -- GENERATED --
              */
          