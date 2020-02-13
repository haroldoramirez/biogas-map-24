
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Thu Feb 13 16:42:44 BRT 2020

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
  Application_2: controllers.Application,
  // @LINE:9
  AdminController_0: controllers.AdminController,
  // @LINE:14
  UsuarioController_3: controllers.UsuarioController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_2: controllers.Application,
    // @LINE:9
    AdminController_0: controllers.AdminController,
    // @LINE:14
    UsuarioController_3: controllers.UsuarioController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, AdminController_0, UsuarioController_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, AdminController_0, UsuarioController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/usuarios""", """controllers.AdminController.usuarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/painel""", """controllers.AdminController.painel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adicionais/api""", """controllers.AdminController.paginaApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.salvaNovoUsuario"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.formularioDeNovoUsuario"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/confirma/$email<[^/]+>/$codigo<[^/]+>""", """controllers.UsuarioController.confirmaUsuario(email:String, codigo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.formularioDeLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.autenticar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UsuarioController.logout"""),
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
    Application_2.index,
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

  // @LINE:14
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario4_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario5_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_UsuarioController_confirmaUsuario6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/confirma/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("codigo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_confirmaUsuario6_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_UsuarioController_formularioDeLogin7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeLogin7_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_UsuarioController_autenticar8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_autenticar8_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_UsuarioController_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UsuarioController_logout9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_2.index)
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
  
    // @LINE:14
    case controllers_UsuarioController_salvaNovoUsuario4_route(params) =>
      call { 
        controllers_UsuarioController_salvaNovoUsuario4_invoker.call(UsuarioController_3.salvaNovoUsuario)
      }
  
    // @LINE:15
    case controllers_UsuarioController_formularioDeNovoUsuario5_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeNovoUsuario5_invoker.call(UsuarioController_3.formularioDeNovoUsuario)
      }
  
    // @LINE:16
    case controllers_UsuarioController_confirmaUsuario6_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("codigo", None)) { (email, codigo) =>
        controllers_UsuarioController_confirmaUsuario6_invoker.call(UsuarioController_3.confirmaUsuario(email, codigo))
      }
  
    // @LINE:18
    case controllers_UsuarioController_formularioDeLogin7_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeLogin7_invoker.call(UsuarioController_3.formularioDeLogin)
      }
  
    // @LINE:19
    case controllers_UsuarioController_autenticar8_route(params) =>
      call { 
        controllers_UsuarioController_autenticar8_invoker.call(UsuarioController_3.autenticar)
      }
  
    // @LINE:20
    case controllers_UsuarioController_logout9_route(params) =>
      call { 
        controllers_UsuarioController_logout9_invoker.call(UsuarioController_3.logout)
      }
  
    // @LINE:23
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}