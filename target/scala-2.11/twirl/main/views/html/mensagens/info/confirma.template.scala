
package views.html.mensagens.info

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirma_Scope0 {
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

class confirma extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensagem:String)(tipoMensagem:String)(usuarioNome:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/cibiogasicon.png")),format.raw/*8.105*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*9.130*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.min.css")),format.raw/*10.131*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/material/fonts.css")),format.raw/*11.107*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/bootstrap/form-elements.css")),format.raw/*12.116*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.versioned("stylesheets/bootstrap/style.css")),format.raw/*13.108*/("""">
    <title>"""),_display_(/*14.13*/Messages("app.title")),format.raw/*14.34*/(""" """),format.raw/*14.35*/("""- """),_display_(/*14.38*/Messages("confirmation.page.title")),format.raw/*14.73*/("""</title>
</head>
<body>
    """),format.raw/*17.20*/("""
    """),format.raw/*18.5*/("""<div class="top-content">
        <div class="inner-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1><strong>"""),_display_(/*23.38*/Messages("app.title")),format.raw/*23.59*/("""</strong></h1>
                        <div class="description">
                            <p> """),_display_(/*25.34*/Messages("app.title.cibiogas")),format.raw/*25.64*/("""</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-sm-offset-3 form-box">
                        <div class="form-top">
                            <div class="form-top-messages">
                                """),_display_(/*33.34*/if(tipoMensagem.equals("Sucesso"))/*33.68*/{_display_(Seq[Any](format.raw/*33.69*/("""
                                    """),format.raw/*34.37*/("""<p align="center" class="success"> """),_display_(/*34.73*/mensagem),format.raw/*34.81*/(""" """),format.raw/*34.82*/("""""""),_display_(/*34.84*/usuarioNome),format.raw/*34.95*/("""".</p>
                                """)))}),format.raw/*35.34*/("""
                                """),_display_(/*36.34*/if(tipoMensagem.equals("Validado"))/*36.69*/{_display_(Seq[Any](format.raw/*36.70*/("""
                                    """),format.raw/*37.37*/("""<p align="center" class="success"> """),_display_(/*37.73*/mensagem),format.raw/*37.81*/("""</p>
                                """)))}),format.raw/*38.34*/("""
                                """),_display_(/*39.34*/if(tipoMensagem.equals("Invalido"))/*39.69*/{_display_(Seq[Any](format.raw/*39.70*/("""
                                    """),format.raw/*40.37*/("""<p align="center" class="error"> """),_display_(/*40.71*/mensagem),format.raw/*40.79*/("""</p>
                                """)))}),format.raw/*41.34*/("""
                                """),_display_(/*42.34*/if(tipoMensagem.equals("Erro"))/*42.65*/{_display_(Seq[Any](format.raw/*42.66*/("""
                                    """),format.raw/*43.37*/("""<p align="center" class="error"> """),_display_(/*43.71*/mensagem),format.raw/*43.79*/("""</p>
                                """)))}),format.raw/*44.34*/("""
                            """),format.raw/*45.29*/("""</div>
                        </div>
                        <div class="form-bottom-messages">
                            <a class="btn" href=""""),_display_(/*48.51*/routes/*48.57*/.Application.index()),format.raw/*48.77*/("""">"""),_display_(/*48.80*/Messages("app.home.title")),format.raw/*48.106*/("""</a>
                        </div>
                    </div>
                </div>
                """),_display_(/*52.18*/views/*52.23*/.html.admin.footer()),format.raw/*52.43*/("""
            """),format.raw/*53.13*/("""</div>
        </div>
    </div>
    <script src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*56.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*57.19*/routes/*57.25*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*57.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*58.19*/routes/*58.25*/.Assets.versioned("bower_components/jquery-backstretch/jquery.backstretch.min.js")),format.raw/*58.107*/("""" type="text/javascript"></script>
    <script>
        /*
         Fullscreen background
         */
        $.backstretch(""""),_display_(/*63.25*/routes/*63.31*/.Assets.versioned("images/cib/udcib.jpg")),format.raw/*63.72*/("""", """),format.raw/*63.75*/("""{"""),format.raw/*63.76*/("""transitionDuration: 240"""),format.raw/*63.99*/("""}"""),format.raw/*63.100*/(""");
        $(document).ready(function()"""),format.raw/*64.37*/("""{"""),format.raw/*64.38*/("""
            """),format.raw/*65.13*/("""$('[data-toggle="tooltip"]').tooltip();
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(mensagem:String,tipoMensagem:String,usuarioNome:String): play.twirl.api.HtmlFormat.Appendable = apply(mensagem)(tipoMensagem)(usuarioNome)

  def f:((String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (mensagem) => (tipoMensagem) => (usuarioNome) => apply(mensagem)(tipoMensagem)(usuarioNome)

  def ref: this.type = this

}


}

/**/
object confirma extends confirma_Scope0.confirma
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/mensagens/info/confirma.scala.html
                  HASH: a241c59242c8bc63d1db3a642e8b80f85419db90
                  MATRIX: 780->1|933->59|960->60|1228->302|1242->308|1307->352|1385->404|1399->410|1494->484|1573->536|1588->542|1685->617|1764->669|1779->675|1852->726|1931->778|1946->784|2028->844|2107->896|2122->902|2196->954|2238->969|2280->990|2309->991|2339->994|2395->1029|2451->1072|2483->1077|2738->1305|2780->1326|2905->1424|2956->1454|3311->1782|3354->1816|3393->1817|3458->1854|3521->1890|3550->1898|3579->1899|3608->1901|3640->1912|3711->1952|3772->1986|3816->2021|3855->2022|3920->2059|3983->2095|4012->2103|4081->2141|4142->2175|4186->2210|4225->2211|4290->2248|4351->2282|4380->2290|4449->2328|4510->2362|4550->2393|4589->2394|4654->2431|4715->2465|4744->2473|4813->2511|4870->2540|5044->2687|5059->2693|5100->2713|5130->2716|5178->2742|5308->2845|5322->2850|5363->2870|5404->2883|5482->2934|5497->2940|5581->3003|5661->3056|5676->3062|5769->3134|5849->3187|5864->3193|5968->3275|6121->3401|6136->3407|6198->3448|6229->3451|6258->3452|6309->3475|6339->3476|6406->3515|6435->3516|6476->3529|6551->3577|6580->3578
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|48->17|49->18|54->23|54->23|56->25|56->25|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|76->45|79->48|79->48|79->48|79->48|79->48|83->52|83->52|83->52|84->53|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|96->65|97->66|97->66
                  -- GENERATED --
              */
          