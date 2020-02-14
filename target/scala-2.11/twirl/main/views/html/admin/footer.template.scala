
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
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

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="row">
  <div class="col-sm-6 col-sm-offset-3">
    <br>
    <footer>
      <a type="reset" data-toggle="tooltip" title=""""),_display_(/*5.53*/Messages("login.page.footer.tooltip.title")),format.raw/*5.96*/("""" data-placement="bottom" href=""""),_display_(/*5.129*/routes/*5.135*/.Application.index()),format.raw/*5.155*/(""""><p class="footer-messages">&copy; <script>document.write(new Date().getFullYear())</script> - """),_display_(/*5.252*/Messages("app.title")),format.raw/*5.273*/("""</p></a>
    </footer>
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
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/footer.scala.html
                  HASH: 546f90073eaedfc830d6f7427bf0f3e47a33e302
                  MATRIX: 835->0|994->133|1057->176|1117->209|1132->215|1173->235|1297->332|1339->353
                  LINES: 32->1|36->5|36->5|36->5|36->5|36->5|36->5|36->5
                  -- GENERATED --
              */
          