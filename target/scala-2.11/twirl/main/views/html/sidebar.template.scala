
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sidebar_Scope0 {
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

class sidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="sidebar" data-background-color="brown" data-active-color="danger">
    <!--
        Tip 1: you can change the color of the sidebar's background using: data-background-color="white | brown"
        Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
    -->
    <div class="logo">
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.main()),format.raw/*7.47*/("""" class="simple-text logo-mini">
            AG
        </a>

        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.main()),format.raw/*11.47*/("""" class="simple-text logo-normal">
            Agil
        </a>
    </div>
    <div class="sidebar-wrapper">
        <ul class="nav">
            <li ng-class=""""),format.raw/*17.27*/("""{"""),format.raw/*17.28*/("""active:$state.current.activetab == 'principal'"""),format.raw/*17.74*/("""}"""),format.raw/*17.75*/("""">
                <a ui-sref="principal">
                    <i class="ti-calendar"></i>
                    <p>Principal</p>
                </a>
            </li>
            <li>
                <a data-toggle="collapse" href="#dashboardOverview">
                    <i class="ti-panel"></i>
                    <p>Collapse
                        <b class="caret"></b>
                    </p>
                </a>
                <div class="collapse" id="dashboardOverview">
                    <ul class="nav">
                        <li ng-class=""""),format.raw/*32.39*/("""{"""),format.raw/*32.40*/("""active:$state.current.activetab == 'pagina1'"""),format.raw/*32.84*/("""}"""),format.raw/*32.85*/("""">
                            <a ui-sref="pagina1">
                                <span class="sidebar-mini">P1</span>
                                <span class="sidebar-normal">Pagina 1</span>
                            </a>
                        </li>
                        <li ng-class=""""),format.raw/*38.39*/("""{"""),format.raw/*38.40*/("""active:$state.current.activetab == 'pagina2'"""),format.raw/*38.84*/("""}"""),format.raw/*38.85*/("""">
                            <a ui-sref="pagina2">
                                <span class="sidebar-mini">P2</span>
                                <span class="sidebar-normal">Pagina 2</span>
                            </a>
                        </li>
                        <li ng-class=""""),format.raw/*44.39*/("""{"""),format.raw/*44.40*/("""active:$state.current.activetab == 'pagina3'"""),format.raw/*44.84*/("""}"""),format.raw/*44.85*/("""">
                            <a ui-sref="pagina3">
                                <span class="sidebar-mini">P3</span>
                                <span class="sidebar-normal">Pagina 3</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </li>

        </ul>
    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object sidebar extends sidebar_Scope0.sidebar
              /*
                  -- GENERATED --
                  DATE: Mon Feb 10 17:05:46 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/sidebar.scala.html
                  HASH: ad5f45d8a638afa35858b082ebce464afa22e836
                  MATRIX: 831->0|1242->385|1256->391|1298->413|1405->493|1420->499|1463->521|1652->682|1681->683|1755->729|1784->730|2371->1289|2400->1290|2472->1334|2501->1335|2829->1635|2858->1636|2930->1680|2959->1681|3287->1981|3316->1982|3388->2026|3417->2027
                  LINES: 32->1|38->7|38->7|38->7|42->11|42->11|42->11|48->17|48->17|48->17|48->17|63->32|63->32|63->32|63->32|69->38|69->38|69->38|69->38|75->44|75->44|75->44|75->44
                  -- GENERATED --
              */
          