
package views.html.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emailRespConfirmacaoBody_Scope0 {
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

class emailRespConfirmacaoBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario : Usuario)(url : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>"""),_display_(/*6.17*/Messages("app.title")),format.raw/*6.38*/(""" """),format.raw/*6.39*/("""- CIBIOGÁS</title>
    </head>
    <body style="margin: 0; padding: 0; min-width: 100%!important;" bgcolor="#f6f8f1">
        <table width="100%" bgcolor="#f6f8f1" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                        <!--[if (gte mso 9)|(IE)]>
            <table width="600" align="center" cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td>
                      <![endif]-->
                    <table bgcolor="#ffffff" style="width: 100%; max-width: 600px;" align="center" cellpadding="0" cellspacing="0" border="0">
                        <tr>
                            <td bgcolor="#cfd8dc" style="padding: 40px 30px 20px 30px">
                                <table width="70" align="left" border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td height="70" style="padding: 0 20px 20px 0;">
                                            <img style="height: auto;" src="https://gallery.mailchimp.com/e348220cdbefe0755a59e3be0/images/34f00adf-3b93-471a-a745-e1795deaac9f.png" width="70" height="70" border="0" alt="icon"/>
                                        </td>
                                    </tr>
                                </table>
                        <!--[if (gte mso 9)|(IE)]>
                        <table width="425" align="left" cellpadding="0" cellspacing="0" border="0">
                            <tr>
                                <td>
                        <![endif]-->
                                <table align="left" border="0" cellpadding="0" cellspacing="0" style="width: 100%; max-width: 425px;">
                                    <tr>
                                        <td height="70">
                                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td style="padding: 0 0 0 3px; font-size: 15px; color: #153643; font-family: sans-serif; letter-spacing: 10px;">CIBIOGÁS</td>
                                                </tr>
                                                <tr>
                                                        <!--h1-->
                                                    <td style="padding: 5px 0 0 0;font-size: 33px; line-height: 38px; font-weight: bold; color: #153643; font-family: sans-serif;">"""),_display_(/*41.181*/Messages("app.title")),format.raw/*41.202*/("""</td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                        <!--[if (gte mso 9)|(IE)]>
                        </td>
                        </tr>
                        </table>
                        <![endif]-->
                            </td>
                        </tr>
                        <tr>
                            <td style="padding: 30px 30px 30px 30px; border-bottom: 1px solid #f2eeed;">
                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td style="padding: 0 0 15px 0; font-size: 24px; line-height: 28px; font-weight: bold; color: #153643; font-family: sans-serif;">"""),_display_(/*58.171*/Messages("app.hello")),format.raw/*58.192*/(""", """),_display_(/*58.195*/usuario/*58.202*/.getNome),format.raw/*58.210*/("""</td>
                                    </tr>
                                    <tr>
                                        <td style="font-size: 16px; line-height: 22px; color: #153643; font-family: sans-serif;">"""),_display_(/*61.131*/Messages("app.send.confirm.email.message")),format.raw/*61.173*/("""</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td style="padding: 30px 30px 30px 30px; border-bottom: 1px solid #f2eeed;">
                            <!--[if (gte mso 9)|(IE)]>
                        <table width="380" align="left" cellpadding="0" cellspacing="0" border="0">
                            <tr>
                                <td>
                            <![endif]-->
                                <table align="left" border="0" cellpadding="0" cellspacing="0" style="width: 100%; max-width: 425px;">
                                    <tr>
                                        <td>
                                            <table style="width: 100%;" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                        <!--bodycopy-->
                                                    <td style="font-size: 16px; line-height: 22px; color: #153643; font-family: sans-serif;">
                                                        <textarea rows="4" style="width: 100%;" readonly>"""),_display_(/*80.107*/url),format.raw/*80.110*/("""</textarea>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="padding: 20px 0 0 0;">
                                                        <table bgcolor="#f58634" border="0" cellspacing="0" cellpadding="0">
                                                            <tr>
                                                                <td style="text-align: center; font-size: 18px; font-family: sans-serif; font-weight: bold; padding: 0 30px 0 30px;" height="45">
                                                                    <a type="button" style="color: #ffffff; text-decoration: none;" href=""""),_display_(/*88.140*/url),format.raw/*88.143*/("""">"""),_display_(/*88.146*/Messages("email.button.activate.title")),format.raw/*88.185*/("""</a>
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            <!--[if (gte mso 9)|(IE)]>
                        </td>
                        </tr>
                        </table>
                        <![endif]-->
                            </td>
                        </tr>
                        <tr>
                            <td style="padding: 20px 30px 15px 30px;" bgcolor="#383838">
                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td align="center" style="font-family: sans-serif; font-size: 14px; color: #ffffff;">&reg; """),_display_(/*109.133*/Messages("app.title.cibiogas")),format.raw/*109.163*/(""", 2017<br/></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                        <!--[if (gte mso 9)|(IE)]>
            </td>
            </tr>
            <![endif]-->
        </table>
        </td>
        </tr>
        </table>
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
object emailRespConfirmacaoBody extends emailRespConfirmacaoBody_Scope0.emailRespConfirmacaoBody
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:16:57 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/email/emailRespConfirmacaoBody.scala.html
                  HASH: 2c1f99ceff880ac4f17787056f02b7cfee3d3e5a
                  MATRIX: 797->1|925->34|952->35|1143->200|1184->221|1212->222|3745->2727|3788->2748|4744->3676|4787->3697|4818->3700|4835->3707|4865->3715|5112->3934|5176->3976|6467->5239|6492->5242|7306->6028|7331->6031|7362->6034|7423->6073|8588->7209|8641->7239
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|72->41|72->41|89->58|89->58|89->58|89->58|89->58|92->61|92->61|111->80|111->80|119->88|119->88|119->88|119->88|140->109|140->109
                  -- GENERATED --
              */
          