
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Fri Feb 14 09:36:48 BRT 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_6: controllers.Application,
  // @LINE:9
  AdminController_0: controllers.AdminController,
  // @LINE:15
  UsuarioController_3: controllers.UsuarioController,
  // @LINE:39
  LogController_2: controllers.LogController,
  // @LINE:44
  CategoriaController_1: controllers.CategoriaController,
  // @LINE:63
  SenhaController_4: controllers.SenhaController,
  // @LINE:71
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_6: controllers.Application,
    // @LINE:9
    AdminController_0: controllers.AdminController,
    // @LINE:15
    UsuarioController_3: controllers.UsuarioController,
    // @LINE:39
    LogController_2: controllers.LogController,
    // @LINE:44
    CategoriaController_1: controllers.CategoriaController,
    // @LINE:63
    SenhaController_4: controllers.SenhaController,
    // @LINE:71
    Assets_5: controllers.Assets
  ) = this(errorHandler, Application_6, AdminController_0, UsuarioController_3, LogController_2, CategoriaController_1, SenhaController_4, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, AdminController_0, UsuarioController_3, LogController_2, CategoriaController_1, SenhaController_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/usuarios""", """controllers.AdminController.usuarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/painel""", """controllers.AdminController.painel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/api""", """controllers.AdminController.paginaApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastro""", """controllers.UsuarioController.telaCadastro()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/novo/""", """controllers.UsuarioController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/cadastrado""", """controllers.UsuarioController.telaCadastrado()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/reset""", """controllers.UsuarioController.telaReset()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/editar/$id<[^/]+>""", """controllers.UsuarioController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/detalhe/$id<[^/]+>""", """controllers.UsuarioController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/lista/todos""", """controllers.UsuarioController.telaLista(p:Int ?= 0, s:String ?= "nome", o:String ?= "asc", f:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.UsuarioController.inserir()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """current""", """controllers.UsuarioController.autenticado()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/confirma/$email<[^/]+>/$confirmaToken<[^/]+>""", """controllers.UsuarioController.confirma(email:String, confirmaToken:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/editar/$id<[^/]+>""", """controllers.UsuarioController.editar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/$id<[^/]+>""", """controllers.UsuarioController.buscaPorId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuarios/filtro/$filtro<[^/]+>""", """controllers.UsuarioController.filtra(filtro:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/$id<[^/]+>/remover""", """controllers.UsuarioController.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/$id<[^/]+>/enviarToken""", """controllers.UsuarioController.enviarToken(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/$id<[^/]+>/confirma""", """controllers.UsuarioController.confirmaAdmin(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/$id<[^/]+>/bloqueia""", """controllers.UsuarioController.bloquear(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/$id<[^/]+>/desbloqueia""", """controllers.UsuarioController.desbloquear(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario""", """controllers.UsuarioController.inserirAdmin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/usuario/exportar/""", """controllers.UsuarioController.exportar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/log/$id<[^/]+>/remover""", """controllers.LogController.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/log/detalhe/$id<[^/]+>""", """controllers.LogController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/log/lista/todos""", """controllers.LogController.telaLista(p:Int ?= 0, s:String ?= "dataCadastro", o:String ?= "desc", f:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/categoria/novo/""", """controllers.CategoriaController.telaNovo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/categoria/detalhe/$id<[^/]+>""", """controllers.CategoriaController.telaDetalhe(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/categoria/editar/$id<[^/]+>""", """controllers.CategoriaController.telaEditar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/categoria/lista/todos""", """controllers.CategoriaController.telaLista(p:Int ?= 0, s:String ?= "nome", o:String ?= "asc", f:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/categoria""", """controllers.CategoriaController.inserir()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/categoria/$id<[^/]+>/remover""", """controllers.CategoriaController.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/categoria/editar/$id<[^/]+>""", """controllers.CategoriaController.editar(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.salvaNovoUsuario"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.formularioDeNovoUsuario"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/confirma/$email<[^/]+>/$codigo<[^/]+>""", """controllers.UsuarioController.confirmaUsuario(email:String, codigo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.formularioDeLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.autenticar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UsuarioController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/senha""", """controllers.SenhaController.runPassword()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/reset/senha""", """controllers.SenhaController.resetSenha()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.SenhaController.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.SenhaController.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page
 Rotas""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AdminController_usuarios1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/usuarios")))
  )
  private[this] lazy val controllers_AdminController_usuarios1_invoker = createInvoker(
    AdminController_0.usuarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "usuarios",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/usuarios"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AdminController_painel2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/painel")))
  )
  private[this] lazy val controllers_AdminController_painel2_invoker = createInvoker(
    AdminController_0.painel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "painel",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/painel"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AdminController_paginaApi3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/api")))
  )
  private[this] lazy val controllers_AdminController_paginaApi3_invoker = createInvoker(
    AdminController_0.paginaApi,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "paginaApi",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/adicionais/api"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UsuarioController_telaCadastro4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastro")))
  )
  private[this] lazy val controllers_UsuarioController_telaCadastro4_invoker = createInvoker(
    UsuarioController_3.telaCadastro(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaCadastro",
      Nil,
      "GET",
      """ Adicionais Usuario telas""",
      this.prefix + """cadastro"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UsuarioController_telaNovo5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/novo/")))
  )
  private[this] lazy val controllers_UsuarioController_telaNovo5_invoker = createInvoker(
    UsuarioController_3.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaNovo",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/novo/"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UsuarioController_telaCadastrado6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/cadastrado")))
  )
  private[this] lazy val controllers_UsuarioController_telaCadastrado6_invoker = createInvoker(
    UsuarioController_3.telaCadastrado(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaCadastrado",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/cadastrado"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsuarioController_telaReset7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/reset")))
  )
  private[this] lazy val controllers_UsuarioController_telaReset7_invoker = createInvoker(
    UsuarioController_3.telaReset(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaReset",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/reset"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UsuarioController_telaEditar8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_telaEditar8_invoker = createInvoker(
    UsuarioController_3.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/editar/$id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuarioController_telaDetalhe9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_telaDetalhe9_invoker = createInvoker(
    UsuarioController_3.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UsuarioController_telaLista10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/lista/todos")))
  )
  private[this] lazy val controllers_UsuarioController_telaLista10_invoker = createInvoker(
    UsuarioController_3.telaLista(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "telaLista",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/lista/todos"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UsuarioController_inserir11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_UsuarioController_inserir11_invoker = createInvoker(
    UsuarioController_3.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "inserir",
      Nil,
      "POST",
      """ Usuario Servicos""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UsuarioController_autenticado12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("current")))
  )
  private[this] lazy val controllers_UsuarioController_autenticado12_invoker = createInvoker(
    UsuarioController_3.autenticado(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "autenticado",
      Nil,
      "GET",
      """""",
      this.prefix + """current"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UsuarioController_confirma13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/confirma/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("confirmaToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_confirma13_invoker = createInvoker(
    UsuarioController_3.confirma(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "confirma",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """usuario/confirma/$email<[^/]+>/$confirmaToken<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UsuarioController_editar14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_editar14_invoker = createInvoker(
    UsuarioController_3.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/adicionais/usuario/editar/$id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_UsuarioController_buscaPorId15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_buscaPorId15_invoker = createInvoker(
    UsuarioController_3.buscaPorId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "buscaPorId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/$id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UsuarioController_filtra16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuarios/filtro/"), DynamicPart("filtro", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_filtra16_invoker = createInvoker(
    UsuarioController_3.filtra(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "filtra",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuarios/filtro/$filtro<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UsuarioController_remover17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_UsuarioController_remover17_invoker = createInvoker(
    UsuarioController_3.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/adicionais/usuario/$id<[^/]+>/remover"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UsuarioController_enviarToken18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/enviarToken")))
  )
  private[this] lazy val controllers_UsuarioController_enviarToken18_invoker = createInvoker(
    UsuarioController_3.enviarToken(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "enviarToken",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/$id<[^/]+>/enviarToken"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_UsuarioController_confirmaAdmin19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/confirma")))
  )
  private[this] lazy val controllers_UsuarioController_confirmaAdmin19_invoker = createInvoker(
    UsuarioController_3.confirmaAdmin(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "confirmaAdmin",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/$id<[^/]+>/confirma"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UsuarioController_bloquear20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bloqueia")))
  )
  private[this] lazy val controllers_UsuarioController_bloquear20_invoker = createInvoker(
    UsuarioController_3.bloquear(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "bloquear",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/$id<[^/]+>/bloqueia"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_UsuarioController_desbloquear21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/desbloqueia")))
  )
  private[this] lazy val controllers_UsuarioController_desbloquear21_invoker = createInvoker(
    UsuarioController_3.desbloquear(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "desbloquear",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/$id<[^/]+>/desbloqueia"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UsuarioController_inserirAdmin22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario")))
  )
  private[this] lazy val controllers_UsuarioController_inserirAdmin22_invoker = createInvoker(
    UsuarioController_3.inserirAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "inserirAdmin",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/adicionais/usuario"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_UsuarioController_exportar23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/usuario/exportar/")))
  )
  private[this] lazy val controllers_UsuarioController_exportar23_invoker = createInvoker(
    UsuarioController_3.exportar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "exportar",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/adicionais/usuario/exportar/"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_LogController_remover24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/log/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_LogController_remover24_invoker = createInvoker(
    LogController_2.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """ Adicionais Logs""",
      this.prefix + """admin/adicionais/log/$id<[^/]+>/remover"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_LogController_telaDetalhe25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/log/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LogController_telaDetalhe25_invoker = createInvoker(
    LogController_2.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/log/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_LogController_telaLista26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/log/lista/todos")))
  )
  private[this] lazy val controllers_LogController_telaLista26_invoker = createInvoker(
    LogController_2.telaLista(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogController",
      "telaLista",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/log/lista/todos"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_CategoriaController_telaNovo27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/categoria/novo/")))
  )
  private[this] lazy val controllers_CategoriaController_telaNovo27_invoker = createInvoker(
    CategoriaController_1.telaNovo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "telaNovo",
      Nil,
      "GET",
      """ Adicionais Categorias""",
      this.prefix + """admin/adicionais/categoria/novo/"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_CategoriaController_telaDetalhe28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/categoria/detalhe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriaController_telaDetalhe28_invoker = createInvoker(
    CategoriaController_1.telaDetalhe(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "telaDetalhe",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/categoria/detalhe/$id<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_CategoriaController_telaEditar29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/categoria/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriaController_telaEditar29_invoker = createInvoker(
    CategoriaController_1.telaEditar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "telaEditar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/categoria/editar/$id<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_CategoriaController_telaLista30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adicionais/categoria/lista/todos")))
  )
  private[this] lazy val controllers_CategoriaController_telaLista30_invoker = createInvoker(
    CategoriaController_1.telaLista(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "telaLista",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/adicionais/categoria/lista/todos"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_CategoriaController_inserir31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/categoria")))
  )
  private[this] lazy val controllers_CategoriaController_inserir31_invoker = createInvoker(
    CategoriaController_1.inserir(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "inserir",
      Nil,
      "POST",
      """ Categoria Servicos""",
      this.prefix + """admin/categoria"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_CategoriaController_remover32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/categoria/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_CategoriaController_remover32_invoker = createInvoker(
    CategoriaController_1.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/categoria/$id<[^/]+>/remover"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_CategoriaController_editar33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/categoria/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriaController_editar33_invoker = createInvoker(
    CategoriaController_1.editar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "editar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/categoria/editar/$id<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario34_invoker = createInvoker(
    UsuarioController_3.salvaNovoUsuario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "salvaNovoUsuario",
      Nil,
      "POST",
      """""",
      this.prefix + """usuario/novo"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario35_invoker = createInvoker(
    UsuarioController_3.formularioDeNovoUsuario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeNovoUsuario",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/novo"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_UsuarioController_confirmaUsuario36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/confirma/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("codigo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_confirmaUsuario36_invoker = createInvoker(
    UsuarioController_3.confirmaUsuario(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "confirmaUsuario",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """usuario/confirma/$email<[^/]+>/$codigo<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_UsuarioController_formularioDeLogin37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeLogin37_invoker = createInvoker(
    UsuarioController_3.formularioDeLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_UsuarioController_autenticar38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_autenticar38_invoker = createInvoker(
    UsuarioController_3.autenticar,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "autenticar",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_UsuarioController_logout39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UsuarioController_logout39_invoker = createInvoker(
    UsuarioController_3.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_SenhaController_runPassword40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/senha")))
  )
  private[this] lazy val controllers_SenhaController_runPassword40_invoker = createInvoker(
    SenhaController_4.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "runPassword",
      Nil,
      "POST",
      """ Senha""",
      this.prefix + """reset/senha"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_SenhaController_resetSenha41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/reset/senha")))
  )
  private[this] lazy val controllers_SenhaController_resetSenha41_invoker = createInvoker(
    SenhaController_4.resetSenha(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "resetSenha",
      Nil,
      "POST",
      """""",
      this.prefix + """usuario/reset/senha"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_SenhaController_reset42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SenhaController_reset42_invoker = createInvoker(
    SenhaController_4.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Reseta a senha""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_SenhaController_runReset43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SenhaController_runReset43_invoker = createInvoker(
    SenhaController_4.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SenhaController",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Assets_versioned44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned44_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index)
      }
  
    // @LINE:9
    case controllers_AdminController_usuarios1_route(params) =>
      call { 
        controllers_AdminController_usuarios1_invoker.call(AdminController_0.usuarios)
      }
  
    // @LINE:10
    case controllers_AdminController_painel2_route(params) =>
      call { 
        controllers_AdminController_painel2_invoker.call(AdminController_0.painel)
      }
  
    // @LINE:12
    case controllers_AdminController_paginaApi3_route(params) =>
      call { 
        controllers_AdminController_paginaApi3_invoker.call(AdminController_0.paginaApi)
      }
  
    // @LINE:15
    case controllers_UsuarioController_telaCadastro4_route(params) =>
      call { 
        controllers_UsuarioController_telaCadastro4_invoker.call(UsuarioController_3.telaCadastro())
      }
  
    // @LINE:16
    case controllers_UsuarioController_telaNovo5_route(params) =>
      call { 
        controllers_UsuarioController_telaNovo5_invoker.call(UsuarioController_3.telaNovo())
      }
  
    // @LINE:17
    case controllers_UsuarioController_telaCadastrado6_route(params) =>
      call { 
        controllers_UsuarioController_telaCadastrado6_invoker.call(UsuarioController_3.telaCadastrado())
      }
  
    // @LINE:18
    case controllers_UsuarioController_telaReset7_route(params) =>
      call { 
        controllers_UsuarioController_telaReset7_invoker.call(UsuarioController_3.telaReset())
      }
  
    // @LINE:19
    case controllers_UsuarioController_telaEditar8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_telaEditar8_invoker.call(UsuarioController_3.telaEditar(id))
      }
  
    // @LINE:20
    case controllers_UsuarioController_telaDetalhe9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_telaDetalhe9_invoker.call(UsuarioController_3.telaDetalhe(id))
      }
  
    // @LINE:21
    case controllers_UsuarioController_telaLista10_route(params) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nome")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_UsuarioController_telaLista10_invoker.call(UsuarioController_3.telaLista(p, s, o, f))
      }
  
    // @LINE:24
    case controllers_UsuarioController_inserir11_route(params) =>
      call { 
        controllers_UsuarioController_inserir11_invoker.call(UsuarioController_3.inserir())
      }
  
    // @LINE:25
    case controllers_UsuarioController_autenticado12_route(params) =>
      call { 
        controllers_UsuarioController_autenticado12_invoker.call(UsuarioController_3.autenticado())
      }
  
    // @LINE:26
    case controllers_UsuarioController_confirma13_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("confirmaToken", None)) { (email, confirmaToken) =>
        controllers_UsuarioController_confirma13_invoker.call(UsuarioController_3.confirma(email, confirmaToken))
      }
  
    // @LINE:27
    case controllers_UsuarioController_editar14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_editar14_invoker.call(UsuarioController_3.editar(id))
      }
  
    // @LINE:28
    case controllers_UsuarioController_buscaPorId15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_buscaPorId15_invoker.call(UsuarioController_3.buscaPorId(id))
      }
  
    // @LINE:29
    case controllers_UsuarioController_filtra16_route(params) =>
      call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_UsuarioController_filtra16_invoker.call(UsuarioController_3.filtra(filtro))
      }
  
    // @LINE:30
    case controllers_UsuarioController_remover17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_remover17_invoker.call(UsuarioController_3.remover(id))
      }
  
    // @LINE:31
    case controllers_UsuarioController_enviarToken18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_enviarToken18_invoker.call(UsuarioController_3.enviarToken(id))
      }
  
    // @LINE:32
    case controllers_UsuarioController_confirmaAdmin19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_confirmaAdmin19_invoker.call(UsuarioController_3.confirmaAdmin(id))
      }
  
    // @LINE:33
    case controllers_UsuarioController_bloquear20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_bloquear20_invoker.call(UsuarioController_3.bloquear(id))
      }
  
    // @LINE:34
    case controllers_UsuarioController_desbloquear21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_desbloquear21_invoker.call(UsuarioController_3.desbloquear(id))
      }
  
    // @LINE:35
    case controllers_UsuarioController_inserirAdmin22_route(params) =>
      call { 
        controllers_UsuarioController_inserirAdmin22_invoker.call(UsuarioController_3.inserirAdmin())
      }
  
    // @LINE:36
    case controllers_UsuarioController_exportar23_route(params) =>
      call { 
        controllers_UsuarioController_exportar23_invoker.call(UsuarioController_3.exportar())
      }
  
    // @LINE:39
    case controllers_LogController_remover24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LogController_remover24_invoker.call(LogController_2.remover(id))
      }
  
    // @LINE:40
    case controllers_LogController_telaDetalhe25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LogController_telaDetalhe25_invoker.call(LogController_2.telaDetalhe(id))
      }
  
    // @LINE:41
    case controllers_LogController_telaLista26_route(params) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("dataCadastro")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_LogController_telaLista26_invoker.call(LogController_2.telaLista(p, s, o, f))
      }
  
    // @LINE:44
    case controllers_CategoriaController_telaNovo27_route(params) =>
      call { 
        controllers_CategoriaController_telaNovo27_invoker.call(CategoriaController_1.telaNovo())
      }
  
    // @LINE:45
    case controllers_CategoriaController_telaDetalhe28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_telaDetalhe28_invoker.call(CategoriaController_1.telaDetalhe(id))
      }
  
    // @LINE:46
    case controllers_CategoriaController_telaEditar29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_telaEditar29_invoker.call(CategoriaController_1.telaEditar(id))
      }
  
    // @LINE:47
    case controllers_CategoriaController_telaLista30_route(params) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nome")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_CategoriaController_telaLista30_invoker.call(CategoriaController_1.telaLista(p, s, o, f))
      }
  
    // @LINE:50
    case controllers_CategoriaController_inserir31_route(params) =>
      call { 
        controllers_CategoriaController_inserir31_invoker.call(CategoriaController_1.inserir())
      }
  
    // @LINE:51
    case controllers_CategoriaController_remover32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_remover32_invoker.call(CategoriaController_1.remover(id))
      }
  
    // @LINE:52
    case controllers_CategoriaController_editar33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_editar33_invoker.call(CategoriaController_1.editar(id))
      }
  
    // @LINE:54
    case controllers_UsuarioController_salvaNovoUsuario34_route(params) =>
      call { 
        controllers_UsuarioController_salvaNovoUsuario34_invoker.call(UsuarioController_3.salvaNovoUsuario)
      }
  
    // @LINE:55
    case controllers_UsuarioController_formularioDeNovoUsuario35_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeNovoUsuario35_invoker.call(UsuarioController_3.formularioDeNovoUsuario)
      }
  
    // @LINE:56
    case controllers_UsuarioController_confirmaUsuario36_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("codigo", None)) { (email, codigo) =>
        controllers_UsuarioController_confirmaUsuario36_invoker.call(UsuarioController_3.confirmaUsuario(email, codigo))
      }
  
    // @LINE:58
    case controllers_UsuarioController_formularioDeLogin37_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeLogin37_invoker.call(UsuarioController_3.formularioDeLogin)
      }
  
    // @LINE:59
    case controllers_UsuarioController_autenticar38_route(params) =>
      call { 
        controllers_UsuarioController_autenticar38_invoker.call(UsuarioController_3.autenticar)
      }
  
    // @LINE:60
    case controllers_UsuarioController_logout39_route(params) =>
      call { 
        controllers_UsuarioController_logout39_invoker.call(UsuarioController_3.logout)
      }
  
    // @LINE:63
    case controllers_SenhaController_runPassword40_route(params) =>
      call { 
        controllers_SenhaController_runPassword40_invoker.call(SenhaController_4.runPassword())
      }
  
    // @LINE:64
    case controllers_SenhaController_resetSenha41_route(params) =>
      call { 
        controllers_SenhaController_resetSenha41_invoker.call(SenhaController_4.resetSenha())
      }
  
    // @LINE:67
    case controllers_SenhaController_reset42_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_SenhaController_reset42_invoker.call(SenhaController_4.reset(token))
      }
  
    // @LINE:68
    case controllers_SenhaController_runReset43_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_SenhaController_runReset43_invoker.call(SenhaController_4.runReset(token))
      }
  
    // @LINE:71
    case controllers_Assets_versioned44_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned44_invoker.call(Assets_5.versioned(path, file))
      }
  }
}