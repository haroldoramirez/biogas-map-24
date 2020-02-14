
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailSenhaAlteradaBody_Scope0 {
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

class emailSenhaAlteradaBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario : Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <p>"""),_display_(/*7.9*/Messages("app.best")),format.raw/*7.29*/(""",<br> """),_display_(/*7.36*/Messages("app.title")),format.raw/*7.57*/("""</p>
    <table bgcolor="#f58634" width="100%" border="0" cellspacing="0" cellpadding="0" style="min-width:332px;max-width:600px;border:1px solid #e0e0e0;border-bottom:0;border-top-left-radius:3px;border-top-right-radius:3px">
        <tbody>
            <tr>
                <td height="72px" colspan="3"></td>
            </tr>
            <tr>
                <td width="32px"></td>
                <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:24px;color:#ffffff;line-height:1.25">"""),_display_(/*15.130*/Messages("app.welcome.message")),format.raw/*15.161*/("""</td>
                <td width="32px"></td>
            </tr>
            <tr>
                <td height="18px" colspan="3"></td>
            </tr>
        </tbody>
    </table>
    <br>
    <table bgcolor="#FAFAFA" width="100%" border="0" cellspacing="0" cellpadding="0" style="min-width:332px;max-width:600px;border:1px solid #f0f0f0;border-bottom:1px solid #c0c0c0;border-top:0;border-bottom-left-radius:3px;border-bottom-right-radius:3px">
        <tbody>
            <tr height="16px"><td width="32px" rowspan="3"></td><td></td><td width="32px" rowspan="3"></td>
            </tr><tr><td>
            <table style="min-width:300px" border="0" cellspacing="0" cellpadding="0">
                <tbody>
                    <tr>
                        <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5">"""),_display_(/*31.137*/Messages("app.hello")),format.raw/*31.158*/(""", """),_display_(/*31.161*/usuario/*31.168*/.getNome),format.raw/*31.176*/("""</td>
                    </tr>
                    <tr>
                        <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5">
                        <p>"""),_display_(/*35.29*/Messages("app.send.password.email.change.message")),format.raw/*35.79*/("""</p>
                        <p>"""),_display_(/*36.29*/Messages("login")),format.raw/*36.46*/(""": <b>"""),_display_(/*36.52*/usuario/*36.59*/.getEmail),format.raw/*36.68*/("""</b></p>
                        <p>"""),_display_(/*37.29*/Messages("register.password")),format.raw/*37.58*/(""": <b>"""),_display_(/*37.64*/usuario/*37.71*/.getSenha),format.raw/*37.80*/("""</b></p>
                        <table border="0" cellspacing="0" cellpadding="0" style="margin-top:48px;margin-bottom:48px">
                            <tbody>
                                <tr>
                                    <td style="font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5">
                                        <p>"""),_display_(/*42.45*/Messages("app.best")),format.raw/*42.65*/(""",<br> """),_display_(/*42.72*/Messages("app.title")),format.raw/*42.93*/("""</p>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        </td>
                    </tr>
            </table>
        </td>
        </tr>
        </tbody>
    </table>
</body>
</html>"""))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object emailSenhaAlteradaBody extends emailSenhaAlteradaBody_Scope0.emailSenhaAlteradaBody
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:16:57 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/email/emailSenhaAlteradaBody.scala.html
                  HASH: 2c0b13e4b42d3751dcb5593a06398868db52113f
                  MATRIX: 786->1|900->20|927->21|1016->85|1056->105|1089->112|1130->133|1673->648|1726->679|2622->1547|2665->1568|2696->1571|2713->1578|2743->1586|2991->1807|3062->1857|3122->1890|3160->1907|3193->1913|3209->1920|3239->1929|3303->1966|3353->1995|3386->2001|3402->2008|3432->2017|3851->2409|3892->2429|3926->2436|3968->2457
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|38->7|46->15|46->15|62->31|62->31|62->31|62->31|62->31|66->35|66->35|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|73->42|73->42|73->42|73->42
                  -- GENERATED --
              */
          