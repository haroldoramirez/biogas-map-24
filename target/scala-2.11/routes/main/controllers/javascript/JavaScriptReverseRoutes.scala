
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Thu Feb 13 16:42:44 BRT 2020

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def painel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.painel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/painel"})
        }
      """
    )
  
    // @LINE:9
    def usuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.usuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/usuarios"})
        }
      """
    )
  
    // @LINE:12
    def paginaApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.paginaApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/api"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def formularioDeLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:20
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:14
    def salvaNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.salvaNovoUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:16
    def confirmaUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirmaUsuario",
      """
        function(email,codigo) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/confirma/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("codigo", encodeURIComponent(codigo))})
        }
      """
    )
  
    // @LINE:19
    def autenticar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.autenticar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:15
    def formularioDeNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeNovoUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}