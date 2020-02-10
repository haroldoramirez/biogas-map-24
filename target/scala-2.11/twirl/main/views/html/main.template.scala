
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

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""<!doctype html>
<html ng-app="biogas-map" lang="en">
<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.versioned("pd-pro/HTML/assets/img/apple-icon.png")),format.raw/*12.119*/("""">
    <link rel="icon" type="image/png" sizes="96x96" href=""""),_display_(/*13.60*/routes/*13.66*/.Assets.versioned("pd-pro/HTML/assets/img/favicon.png")),format.raw/*13.121*/("""">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

    <title>Biogasmap | CIBiogás</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />

        """),format.raw/*21.31*/("""
    """),format.raw/*22.5*/("""<link href=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("pd-pro/HTML/assets/css/bootstrap.min.css")),format.raw/*22.85*/("""" rel="stylesheet" />

        """),format.raw/*24.37*/("""
    """),format.raw/*25.5*/("""<link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("pd-pro/HTML/assets/css/paper-dashboard.css")),format.raw/*25.87*/("""" rel="stylesheet"/>

        """),format.raw/*27.28*/("""
    """),format.raw/*28.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*28.50*/routes/*28.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*28.131*/("""">
    <link href=""""),_display_(/*29.18*/routes/*29.24*/.Assets.versioned("pd-pro/HTML/assets/css/google-fonts.css")),format.raw/*29.84*/("""" rel='stylesheet' type='text/css'>
    <link href=""""),_display_(/*30.18*/routes/*30.24*/.Assets.versioned("pd-pro/HTML/assets/css/themify-icons.css")),format.raw/*30.85*/("""" rel="stylesheet">
    <link href=""""),_display_(/*31.18*/routes/*31.24*/.Assets.versioned("bower_components/SpinKit/spinkit.min.css")),format.raw/*31.85*/("""" rel="stylesheet">

        """),format.raw/*33.45*/("""
    """),format.raw/*34.5*/("""<link href=""""),_display_(/*34.18*/routes/*34.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*34.65*/("""" rel="stylesheet">

</head>

<body>
<div class="wrapper">
    """),_display_(/*40.6*/sidebar()),format.raw/*40.15*/("""
    """),format.raw/*41.5*/("""<div class="main-panel">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-minimize">
                    <button id="minimizeSidebar" class="btn btn-fill btn-icon"><i class="ti-more-alt"></i></button>
                </div>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar bar1"></span>
                        <span class="icon-bar bar2"></span>
                        <span class="icon-bar bar3"></span>
                    </button>
                    <a class="navbar-brand" href="">Template</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#stats" class="dropdown-toggle btn-magnify" data-toggle="dropdown">
                                <i class="ti-panel"></i>
                                <p>Stats</p>
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#notifications" class="dropdown-toggle btn-rotate" data-toggle="dropdown">
                                <i class="ti-bell"></i>
                                <span class="notification">5</span>
                                <p class="hidden-md hidden-lg">
                                    Notifications
                                    <b class="caret"></b>
                                </p>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#not1">Notification 1</a></li>
                                <li><a href="#not2">Notification 2</a></li>
                                <li><a href="#not3">Notification 3</a></li>
                                <li><a href="#not4">Notification 4</a></li>
                                <li><a href="#another">Another notification</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#settings" class="btn-rotate">
                                <i class="ti-settings"></i>
                                <p class="hidden-md hidden-lg">
                                    Settings
                                </p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="content">
            <div class="container-fluid">
                <div ui-view class="row">
                    """),format.raw/*97.86*/("""
                """),format.raw/*98.17*/("""</div>
            </div>
        </div>
        """),_display_(/*101.10*/footer()),format.raw/*101.18*/("""
    """),format.raw/*102.5*/("""</div>
</div>
</body>

    """),format.raw/*106.83*/("""
"""),format.raw/*107.1*/("""<script src=""""),_display_(/*107.15*/routes/*107.21*/.Assets.versioned("pd-pro/HTML/assets/js/jquery-3.1.1.min.js")),format.raw/*107.83*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*108.15*/routes/*108.21*/.Assets.versioned("pd-pro/HTML/assets/js/jquery-ui.min.js")),format.raw/*108.80*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*109.15*/routes/*109.21*/.Assets.versioned("pd-pro/HTML/assets/js/perfect-scrollbar.min.js")),format.raw/*109.88*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*110.15*/routes/*110.21*/.Assets.versioned("pd-pro/HTML/assets/js/bootstrap.min.js")),format.raw/*110.80*/("""" type="text/javascript"></script>

    """),format.raw/*112.38*/("""
"""),format.raw/*113.1*/("""<script src=""""),_display_(/*113.15*/routes/*113.21*/.Assets.versioned("pd-pro/HTML/assets/js/bootstrap-switch-tags.js")),format.raw/*113.88*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*114.15*/routes/*114.21*/.Assets.versioned("pd-pro/HTML/assets/js/sweetalert2.js")),format.raw/*114.78*/("""" type="text/javascript"></script>

    """),format.raw/*116.73*/("""
"""),format.raw/*117.1*/("""<script src=""""),_display_(/*117.15*/routes/*117.21*/.Assets.versioned("pd-pro/HTML/assets/js/paper-dashboard.js")),format.raw/*117.82*/("""" type="text/javascript"></script>

    """),format.raw/*119.46*/("""
"""),format.raw/*120.1*/("""<script src=""""),_display_(/*120.15*/routes/*120.21*/.Assets.versioned("bower_components/html2canvas/build/html2canvas.js")),format.raw/*120.91*/("""" type="text/javascript"></script>

    """),format.raw/*122.16*/("""
"""),format.raw/*123.1*/("""<script src=""""),_display_(/*123.15*/routes/*123.21*/.Assets.versioned("bower_components/angular/angular.min.js")),format.raw/*123.81*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*124.15*/routes/*124.21*/.Assets.versioned("bower_components/angular-ui-router/release/angular-ui-router.min.js")),format.raw/*124.109*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*125.15*/routes/*125.21*/.Assets.versioned("bower_components/angular-resource/angular-resource.min.js")),format.raw/*125.99*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*126.15*/routes/*126.21*/.Assets.versioned("bower_components/angular-cookies/angular-cookies.min.js")),format.raw/*126.97*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*127.15*/routes/*127.21*/.Assets.versioned("bower_components/angular-animate/angular-animate.min.js")),format.raw/*127.97*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*128.15*/routes/*128.21*/.Assets.versioned("bower_components/angular-breadcrumb/dist/angular-breadcrumb.js")),format.raw/*128.104*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*129.15*/routes/*129.21*/.Assets.versioned("bower_components/angular-toastr/dist/angular-toastr.tpls.js")),format.raw/*129.101*/("""" type="text/javascript"></script>

    """),format.raw/*131.18*/("""
"""),format.raw/*132.1*/("""<script src=""""),_display_(/*132.15*/routes/*132.21*/.Assets.versioned("bower_components/moment/min/moment.min.js")),format.raw/*132.83*/("""" type="text/javascript"></script>

    """),format.raw/*134.24*/("""
"""),format.raw/*135.1*/("""<script src=""""),_display_(/*135.15*/routes/*135.21*/.Assets.versioned("bower_components/angular-input-masks/angular-input-masks-standalone.min.js")),format.raw/*135.116*/("""" type="text/javascript"></script>

    """),format.raw/*137.40*/("""
"""),format.raw/*138.1*/("""<script src=""""),_display_(/*138.15*/routes/*138.21*/.Assets.versioned("javascripts/main.js")),format.raw/*138.61*/("""" type="text/javascript"></script>

    """),format.raw/*140.26*/("""
"""),format.raw/*141.1*/("""<script src=""""),_display_(/*141.15*/routes/*141.21*/.Assets.versioned("app/app.js")),format.raw/*141.52*/("""" type="text/javascript"></script>

    """),format.raw/*143.71*/("""
"""),format.raw/*144.1*/("""<script src=""""),_display_(/*144.15*/routes/*144.21*/.Assets.versioned("app/services/address.service.js")),format.raw/*144.73*/("""" type="text/javascript"></script>

    """),format.raw/*146.20*/("""
"""),format.raw/*147.1*/("""<script src=""""),_display_(/*147.15*/routes/*147.21*/.Assets.versioned("app/controllers/principal.controller.js")),format.raw/*147.81*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*148.15*/routes/*148.21*/.Assets.versioned("app/controllers/pagina1.controller.js")),format.raw/*148.79*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*149.15*/routes/*149.21*/.Assets.versioned("app/controllers/pagina2.controller.js")),format.raw/*149.79*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*150.15*/routes/*150.21*/.Assets.versioned("app/controllers/pagina3.controller.js")),format.raw/*150.79*/("""" type="text/javascript"></script>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Feb 10 17:05:46 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/main.scala.html
                  HASH: f91a283f1d6d509962d4971171ac8d71c320667e
                  MATRIX: 1079->260|1249->403|1264->409|1344->467|1433->529|1448->535|1525->590|1847->906|1879->911|1919->924|1934->930|2016->991|2075->1050|2107->1055|2147->1068|2162->1074|2246->1137|2304->1186|2336->1191|2408->1236|2423->1242|2520->1317|2567->1337|2582->1343|2663->1403|2743->1456|2758->1462|2840->1523|2904->1560|2919->1566|3001->1627|3058->1692|3090->1697|3130->1710|3145->1716|3207->1757|3297->1821|3327->1830|3359->1835|6192->4705|6237->4722|6315->4772|6345->4780|6378->4785|6434->4890|6463->4891|6505->4905|6521->4911|6605->4973|6682->5022|6698->5028|6779->5087|6856->5136|6872->5142|6961->5209|7038->5258|7054->5264|7135->5323|7204->5396|7233->5397|7275->5411|7291->5417|7380->5484|7457->5533|7473->5539|7552->5596|7621->5704|7650->5705|7692->5719|7708->5725|7791->5786|7860->5867|7889->5868|7931->5882|7947->5888|8039->5958|8108->6009|8137->6010|8179->6024|8195->6030|8277->6090|8354->6139|8370->6145|8481->6233|8558->6282|8574->6288|8674->6366|8751->6415|8767->6421|8865->6497|8942->6546|8958->6552|9056->6628|9133->6677|9149->6683|9255->6766|9332->6815|9348->6821|9451->6901|9520->6954|9549->6955|9591->6969|9607->6975|9691->7037|9760->7096|9789->7097|9831->7111|9847->7117|9965->7212|10034->7287|10063->7288|10105->7302|10121->7308|10183->7348|10252->7409|10281->7410|10323->7424|10339->7430|10392->7461|10461->7567|10490->7568|10532->7582|10548->7588|10622->7640|10691->7695|10720->7696|10762->7710|10778->7716|10860->7776|10937->7825|10953->7831|11033->7889|11110->7938|11126->7944|11206->8002|11283->8051|11299->8057|11379->8115
                  LINES: 37->8|41->12|41->12|41->12|42->13|42->13|42->13|50->21|51->22|51->22|51->22|51->22|53->24|54->25|54->25|54->25|54->25|56->27|57->28|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|63->34|63->34|63->34|69->40|69->40|70->41|126->97|127->98|130->101|130->101|131->102|135->106|136->107|136->107|136->107|136->107|137->108|137->108|137->108|138->109|138->109|138->109|139->110|139->110|139->110|141->112|142->113|142->113|142->113|142->113|143->114|143->114|143->114|145->116|146->117|146->117|146->117|146->117|148->119|149->120|149->120|149->120|149->120|151->122|152->123|152->123|152->123|152->123|153->124|153->124|153->124|154->125|154->125|154->125|155->126|155->126|155->126|156->127|156->127|156->127|157->128|157->128|157->128|158->129|158->129|158->129|160->131|161->132|161->132|161->132|161->132|163->134|164->135|164->135|164->135|164->135|166->137|167->138|167->138|167->138|167->138|169->140|170->141|170->141|170->141|170->141|172->143|173->144|173->144|173->144|173->144|175->146|176->147|176->147|176->147|176->147|177->148|177->148|177->148|178->149|178->149|178->149|179->150|179->150|179->150
                  -- GENERATED --
              */
          