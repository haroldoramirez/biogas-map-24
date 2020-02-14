
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailConfirmacaoBody_Scope0 {
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

class emailConfirmacaoBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,String,play.twirl.api.HtmlFormat.Appendable] {

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
    <p>"""),_display_(/*8.9*/Messages("app.send.confirm.email.message")),format.raw/*8.51*/("""</p>
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
object emailConfirmacaoBody extends emailConfirmacaoBody_Scope0.emailConfirmacaoBody
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/email/emailConfirmacaoBody.scala.html
                  HASH: 50a468cbbaddaba81d756aec32537c028e5d76db
                  MATRIX: 789->1|917->34|944->35|1033->99|1074->120|1103->123|1118->130|1146->138|1184->151|1246->193|1316->236|1340->239|1388->261|1429->281|1463->288|1505->309
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|38->7|38->7|39->8|39->8|41->10|41->10|43->12|43->12|43->12|43->12
                  -- GENERATED --
              */
          