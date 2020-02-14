
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailSenhaBody_Scope0 {
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

class emailSenhaBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario : Usuario)(url : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <p>"""),_display_(/*7.9*/Messages("app.hello")),format.raw/*7.30*/(""", """),_display_(/*7.33*/usuario/*7.40*/.getNome),format.raw/*7.48*/("""</p>
    <p>"""),_display_(/*8.9*/Messages("password.change.email.message")),format.raw/*8.50*/("""</p>
    <br>
    <p><label>Link:</label> """),_display_(/*10.30*/url),format.raw/*10.33*/("""</p>
    <br>
    <p>"""),_display_(/*12.9*/Messages("app.best")),format.raw/*12.29*/(""",<br> """),_display_(/*12.36*/Messages("app.title")),format.raw/*12.57*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(usuario:Usuario,url:String): play.twirl.api.HtmlFormat.Appendable = apply(usuario)(url)

  def f:((Usuario) => (String) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => (url) => apply(usuario)(url)

  def ref: this.type = this

}


}

/**/
object emailSenhaBody extends emailSenhaBody_Scope0.emailSenhaBody
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:16:57 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/email/emailSenhaBody.scala.html
                  HASH: 4f42f8b327afb793848169544dbcf8f4f8907c6e
                  MATRIX: 777->1|905->34|932->35|1021->99|1062->120|1091->123|1106->130|1134->138|1172->151|1233->192|1303->235|1327->238|1375->260|1416->280|1450->287|1492->308
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|38->7|38->7|39->8|39->8|41->10|41->10|43->12|43->12|43->12|43->12
                  -- GENERATED --
              */
          