
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object painel_Scope0 {
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

     object painel_Scope1 {
import views.html.admin.main

class painel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.20*/("""

"""),_display_(/*5.2*/main(Messages("app.title") + " | Dashboard")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""

    """),format.raw/*7.5*/("""<div class="col-md-12">
        <div class="page-header header-biogas">
            <div class="btn-group btn-breadcrumb pull-right">
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.AdminController.painel()),format.raw/*10.58*/("""" class="btn btn-default"><i class="fa fa-home"></i></a>
                <a disabled class="btn btn-default">Início</a>
            </div>
            <h1 class="font-style"><i class="fa fa-home" aria-hidden="true"></i> Dashboard</h1>
        </div>
    </div>

    """),format.raw/*17.23*/("""
    """),format.raw/*18.5*/("""<div class="col-lg-3 col-md-6">
        <div class="panel panel-yellow">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-newspaper-o fa-5x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">9876</div>
                        <div>Notícias Registradas</div>
                    </div>
                </div>
            </div>
            <a href="">
                <div class="panel-footer">
                    <span class="pull-left">Mais Detalhes</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>


    """),format.raw/*42.24*/("""
    """),format.raw/*43.5*/("""<div class="col-lg-3 col-md-6">
        <div class="panel panel-red">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-video-camera fa-5x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">9876</div>
                        <div>Vídeos Registrados</div>
                    </div>
                </div>
            </div>
            <a href="">
                <div class="panel-footer">
                    <span class="pull-left">Mais Detalhes</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>

    """),format.raw/*66.20*/("""
    """),format.raw/*67.5*/("""<div class="col-lg-3 col-md-6">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-file-text fa-5x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">987</div>
                        <div>Publicações Registradas</div>
                    </div>
                </div>
            </div>
            <a href="">
                <div class="panel-footer">
                    <span class="pull-left">Mais Detalhes</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>

    """),format.raw/*90.20*/("""
    """),format.raw/*91.5*/("""<div class="col-lg-3 col-md-6">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-leanpub fa-5x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">654</div>
                        <div>Avaliações Registradas</div>
                    </div>
                </div>
            </div>
            <a href="">
                <div class="panel-footer">
                    <span class="pull-left">Mais Detalhes</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>


""")))}))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}
}

/**/
object painel extends painel_Scope0.painel_Scope1.painel
              /*
                  -- GENERATED --
                  DATE: Thu Feb 13 16:58:29 BRT 2020
                  SOURCE: /home/haroldo/projetos/biogas-map-24/app/views/admin/painel.scala.html
                  HASH: fb719f76b5df3f9d42aa3e6115155f9810c03b7a
                  MATRIX: 812->32|925->50|953->53|1005->97|1044->99|1076->105|1263->265|1278->271|1324->296|1618->580|1650->585|2537->1463|2569->1468|3451->2337|3483->2342|4370->3216|4402->3221
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|42->10|42->10|42->10|49->17|50->18|74->42|75->43|98->66|99->67|122->90|123->91
                  -- GENERATED --
              */
          