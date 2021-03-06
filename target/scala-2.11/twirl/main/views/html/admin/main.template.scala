
package views.html.admin

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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/usuario/*3.9*/() = {{
    Http.Context.current().args.get("usuario").asInstanceOf[Usuario]
}};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*13.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*14.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*15.135*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css")),format.raw/*16.174*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/bootstrap/tabelas.css")),format.raw/*17.114*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap/main.css")),format.raw/*18.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/bootstrap/home.css")),format.raw/*19.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/bootstrap/docs.min.css")),format.raw/*20.115*/("""">
        """),format.raw/*21.22*/("""
        """),format.raw/*22.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("bower_components/lightbox2/dist/css/lightbox.min.css")),format.raw/*22.133*/("""">
        <title>"""),_display_(/*23.17*/title),format.raw/*23.22*/("""</title>
    </head>
    <body>
        <div id="wrap">

            <nav class="navbar navbar-default navbar-static-top">
                <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href=""""),_display_(/*38.56*/routes/*38.62*/.AdminController.painel()),format.raw/*38.87*/("""">"""),_display_(/*38.90*/Messages("app.title")),format.raw/*38.111*/(""" """),format.raw/*38.112*/("""Admin</a>
                    </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*44.34*/if(request.path.contains("/painel"))/*44.70*/{_display_(Seq[Any](format.raw/*44.71*/(""" """),format.raw/*44.72*/("""class="active" """)))}),format.raw/*44.88*/(""">
                                <a href=""""),_display_(/*45.43*/routes/*45.49*/.AdminController.painel()),format.raw/*45.74*/(""""><span class="fa fa-home"></span> Início</a></li>
                            <li """),_display_(/*46.34*/if(request.path.contains("/admin/trabalho"))/*46.78*/{_display_(Seq[Any](format.raw/*46.79*/(""" """),format.raw/*46.80*/("""class="active" """)))}),format.raw/*46.96*/(""">
                                <a href=""><span class="glyphicon glyphicon-education"></span> Unidades</a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li></li>
                            <li """),_display_(/*51.34*/if(request.path.contains("/admin/adicionais"))/*51.80*/{_display_(Seq[Any](format.raw/*51.81*/(""" """),format.raw/*51.82*/("""class="active" """)))}),format.raw/*51.98*/(""" """),format.raw/*51.99*/("""class="dropdown">
                                <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                    <span class="fa fa-cog" aria-hidden="true"></span>
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                """),_display_(/*57.34*/if(usuario.isAdmin())/*57.55*/ {_display_(Seq[Any](format.raw/*57.57*/("""
                                   """),format.raw/*58.36*/("""<li class="dropdown-header">Usuário</li>
                                    <span class="label label-danger center-block">"""),_display_(/*59.84*/usuario/*59.91*/.getEmail),format.raw/*59.100*/("""</span>
                                    <li role="separator" class="divider"></li>
                                """)))}/*61.35*/else/*61.40*/{_display_(Seq[Any](format.raw/*61.41*/("""
                                    """),format.raw/*62.37*/("""<li class="dropdown-header">Usuário</li>
                                    <span class="label label-primary center-block">"""),_display_(/*63.85*/usuario/*63.92*/.getEmail),format.raw/*63.101*/("""</span>
                                    <li role="separator" class="divider"></li>
                                """)))}),format.raw/*65.34*/("""
                                    """),format.raw/*66.37*/("""<li><a href=""""),_display_(/*66.51*/routes/*66.57*/.Application.index),format.raw/*66.75*/(""""><span class="fa fa-sign-in"></span> Home</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li class="dropdown-header">Adicionais</li>
                                    <li """),_display_(/*69.42*/if(request.path.contains("/idioma"))/*69.78*/ {_display_(Seq[Any](format.raw/*69.80*/("""
                                        """),format.raw/*70.41*/("""class="active" """)))}),format.raw/*70.57*/("""><a href=""><span class="fa fa-language"></span> Idiomas</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li class="dropdown-header">Sistema</li>
                                    """),_display_(/*73.38*/if(usuario.isAdmin())/*73.59*/ {_display_(Seq[Any](format.raw/*73.61*/("""
                                        """),format.raw/*74.41*/("""<li """),_display_(/*74.46*/if(request.path.contains("/usuario"))/*74.83*/ {_display_(Seq[Any](format.raw/*74.85*/("""
                                            """),format.raw/*75.45*/("""class="active" """)))}),format.raw/*75.61*/("""><a href=""""),_display_(/*75.72*/routes/*75.78*/.UsuarioController.telaLista()),format.raw/*75.108*/(""""><span class="fa fa-users"></span> Usuários</a></li>
                                         <li """),_display_(/*76.47*/if(request.path.contains("/admin/adicionais/api"))/*76.97*/ {_display_(Seq[Any](format.raw/*76.99*/("""
                                            """),format.raw/*77.45*/("""class="active" """)))}),format.raw/*77.61*/("""><a href=""""),_display_(/*77.72*/routes/*77.78*/.AdminController.paginaApi),format.raw/*77.104*/(""""><span class="fa fa-cloud"></span> Api</a></li>
                                    """)))}),format.raw/*78.38*/("""
                                    """),format.raw/*79.37*/("""<li """),_display_(/*79.42*/if(request.path.contains("/log"))/*79.75*/ {_display_(Seq[Any](format.raw/*79.77*/("""
                                        """),format.raw/*80.41*/("""class="active" """)))}),format.raw/*80.57*/("""><a href=""><span class="fa fa-file"></span> Logs</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li class="dropdown-header">Autenticação</li>
                                    <li><a href=""""),_display_(/*83.51*/routes/*83.57*/.UsuarioController.logout()),format.raw/*83.84*/(""""><span class="fa fa-sign-out"></span> Sair</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>

            """),_display_(/*91.14*/views/*91.19*/.html.admin.notificacoes()),format.raw/*91.45*/("""
            """),format.raw/*92.45*/("""
            """),format.raw/*93.13*/("""<div class="container-fluid">
                <div class="row">
                    """),_display_(/*95.22*/content),format.raw/*95.29*/("""
                """),format.raw/*96.17*/("""</div>
            </div>

            <div id="push"></div>
        </div>

        """),_display_(/*102.10*/views/*102.15*/.html.admin.footer()),format.raw/*102.35*/("""

        """),format.raw/*104.9*/("""<script src=""""),_display_(/*104.23*/routes/*104.29*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*104.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*105.23*/routes/*105.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*105.101*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*106.23*/routes/*106.29*/.Assets.versioned("bower_components/moment/min/moment.min.js")),format.raw/*106.91*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*107.23*/routes/*107.29*/.Assets.versioned("bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js")),format.raw/*107.141*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*108.23*/routes/*108.29*/.Assets.versioned("bower_components/zeroclipboard/dist/ZeroClipboard.min.js")),format.raw/*108.106*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*109.23*/routes/*109.29*/.Assets.versioned("javascripts/docs.min.js")),format.raw/*109.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*110.23*/routes/*110.29*/.Assets.versioned("javascripts/ie10-viewport-bug-workaround.js")),format.raw/*110.93*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*111.23*/routes/*111.29*/.Assets.versioned("javascripts/resizable.js")),format.raw/*111.74*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:38:16 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/main.scala.html
                  HASH: 2852729a4dddbcaf3c54d2f423872ea5b1590892
                  MATRIX: 754->1|862->34|876->41|984->31|1012->119|1040->121|1339->393|1354->399|1420->443|1503->499|1518->505|1614->579|1697->635|1712->641|1809->716|1892->772|1907->778|2043->892|2126->948|2141->954|2217->1008|2300->1064|2315->1070|2388->1121|2471->1177|2486->1183|2559->1234|2642->1290|2657->1296|2734->1351|2773->1375|2809->1384|2881->1429|2896->1435|2991->1508|3037->1527|3063->1532|3904->2346|3919->2352|3965->2377|3995->2380|4038->2401|4068->2402|4405->2712|4450->2748|4489->2749|4518->2750|4565->2766|4636->2810|4651->2816|4697->2841|4808->2925|4861->2969|4900->2970|4929->2971|4976->2987|5284->3268|5339->3314|5378->3315|5407->3316|5454->3332|5483->3333|5968->3791|5998->3812|6038->3814|6102->3850|6253->3974|6269->3981|6300->3990|6439->4111|6452->4116|6491->4117|6556->4154|6708->4279|6724->4286|6755->4295|6906->4415|6971->4452|7012->4466|7027->4472|7066->4490|7345->4742|7390->4778|7430->4780|7499->4821|7546->4837|7832->5096|7862->5117|7902->5119|7971->5160|8003->5165|8049->5202|8089->5204|8162->5249|8209->5265|8247->5276|8262->5282|8314->5312|8441->5412|8500->5462|8540->5464|8613->5509|8660->5525|8698->5536|8713->5542|8761->5568|8878->5654|8943->5691|8975->5696|9017->5729|9057->5731|9126->5772|9173->5788|9470->6058|9485->6064|9533->6091|9850->6381|9864->6386|9911->6412|9952->6457|9993->6470|10105->6555|10133->6562|10178->6579|10292->6665|10307->6670|10349->6690|10387->6700|10429->6714|10445->6720|10530->6783|10615->6840|10631->6846|10726->6918|10811->6975|10827->6981|10911->7043|10996->7100|11012->7106|11147->7218|11232->7275|11248->7281|11348->7358|11433->7415|11449->7421|11515->7465|11600->7522|11616->7528|11702->7592|11787->7649|11803->7655|11870->7700
                  LINES: 27->1|31->3|31->3|34->1|36->5|38->7|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|53->22|53->22|53->22|54->23|54->23|69->38|69->38|69->38|69->38|69->38|69->38|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|82->51|82->51|82->51|82->51|82->51|82->51|88->57|88->57|88->57|89->58|90->59|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|94->63|96->65|97->66|97->66|97->66|97->66|100->69|100->69|100->69|101->70|101->70|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|109->78|110->79|110->79|110->79|110->79|111->80|111->80|114->83|114->83|114->83|122->91|122->91|122->91|123->92|124->93|126->95|126->95|127->96|133->102|133->102|133->102|135->104|135->104|135->104|135->104|136->105|136->105|136->105|137->106|137->106|137->106|138->107|138->107|138->107|139->108|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|142->111|142->111|142->111
                  -- GENERATED --
              */
          