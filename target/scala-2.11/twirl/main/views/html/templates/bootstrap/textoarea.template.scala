
package views.html.templates.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textoarea_Scope0 {
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

class textoarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Field,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "6", label: String = "", placeholder: String = "", caracteres: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.126*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label for=""""),_display_(/*4.18*/field/*4.23*/.id),format.raw/*4.26*/("""" class="col-md-2 control-label">"""),_display_(/*4.60*/label),format.raw/*4.65*/(""" """),format.raw/*4.66*/("""<abbr title="obrigatório">*</abbr></label>
    <div class="col-md-10">
        <textarea class="form-control"
        rows=""""),_display_(/*7.16*/rows),format.raw/*7.20*/(""""
        name=""""),_display_(/*8.16*/field/*8.21*/.name),format.raw/*8.26*/(""""
        id=""""),_display_(/*9.14*/field/*9.19*/.id),format.raw/*9.22*/(""""
        maxlength=""""),_display_(/*10.21*/caracteres),format.raw/*10.31*/(""""
        placeholder=""""),_display_(/*11.23*/placeholder),format.raw/*11.34*/("""">"""),_display_(/*11.37*/field/*11.42*/.value.getOrElse("")),format.raw/*11.62*/("""</textarea>
        <p class="pull-right"><small class="caracteres"></small></p>
        <span class="help-block"><small>"""),_display_(/*13.42*/{field.error.map { error => error.message }}),format.raw/*13.86*/("""</small></span>
    </div>
</div>

"""),format.raw/*17.65*/("""
"""),format.raw/*18.1*/("""<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*18.84*/("""" type="text/javascript"></script>
<script type="text/javascript">
    $(document).on("input", "#"""),_display_(/*20.32*/field/*20.37*/.id),format.raw/*20.40*/("""", function() """),format.raw/*20.54*/("""{"""),format.raw/*20.55*/("""
        """),format.raw/*21.9*/("""var limite = '"""),_display_(/*21.24*/caracteres),format.raw/*21.34*/("""';
        var informativo = "caractéres restantes.";
        var caracteresDigitados = $(this).val().length;
        var caracteresRestantes = limite - caracteresDigitados;

        if (caracteresRestantes <= 0) """),format.raw/*26.39*/("""{"""),format.raw/*26.40*/("""
            """),format.raw/*27.13*/("""var comentario = $("textarea[name="""),_display_(/*27.48*/field/*27.53*/.id),format.raw/*27.56*/("""]").val();
            $("textarea[name="""),_display_(/*28.31*/field/*28.36*/.id),format.raw/*28.39*/("""]").val(comentario.substr(0, limite));
            $(".caracteres").text("0 " + informativo);
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""" """),format.raw/*30.11*/("""else """),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""
            """),format.raw/*31.13*/("""$(".caracteres").text(caracteresRestantes + " " + informativo);
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/(""");
</script>"""))
      }
    }
  }

  def render(field:Field,rows:String,label:String,placeholder:String,caracteres:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,caracteres,help)

  def f:((Field,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,caracteres,help) => apply(field,rows,label,placeholder,caracteres,help)

  def ref: this.type = this

}


}

/**/
object textoarea extends textoarea_Scope0.textoarea
              /*
                  -- GENERATED --
                  DATE: Fri Feb 14 09:36:48 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/templates/bootstrap/textoarea.scala.html
                  HASH: ffbaf2d040f7840b677d4357e367fbce44d2ce7d
                  MATRIX: 807->1|1027->125|1055->127|1105->151|1132->170|1171->172|1211->182|1257->202|1270->207|1293->210|1353->244|1378->249|1406->250|1557->375|1581->379|1624->396|1637->401|1662->406|1703->421|1716->426|1739->429|1788->451|1819->461|1870->485|1902->496|1932->499|1946->504|1987->524|2136->646|2201->690|2264->789|2292->790|2333->804|2348->810|2432->873|2557->971|2571->976|2595->979|2637->993|2666->994|2702->1003|2744->1018|2775->1028|3016->1241|3045->1242|3086->1255|3148->1290|3162->1295|3186->1298|3254->1339|3268->1344|3292->1347|3421->1449|3450->1450|3479->1451|3512->1456|3541->1457|3582->1470|3681->1542|3710->1543|3742->1548|3770->1549
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|42->11|42->11|42->11|42->11|42->11|44->13|44->13|48->17|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|61->30|61->30|62->31|63->32|63->32|64->33|64->33
                  -- GENERATED --
              */
          