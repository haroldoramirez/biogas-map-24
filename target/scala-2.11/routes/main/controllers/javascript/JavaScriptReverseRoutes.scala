
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Fri Feb 14 09:21:13 BRT 2020

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:71
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
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

  // @LINE:44
  class ReverseCategoriaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.telaLista",
      """
        function(p,s,o,f) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/categoria/lista/todos" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
        }
      """
    )
  
    // @LINE:44
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/categoria/novo/"})
        }
      """
    )
  
    // @LINE:46
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/categoria/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:51
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:50
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria"})
        }
      """
    )
  
    // @LINE:52
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/categoria/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:45
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/categoria/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseSenhaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def runReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.runReset",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:64
    def resetSenha: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.resetSenha",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/reset/senha"})
        }
      """
    )
  
    // @LINE:67
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.reset",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:63
    def runPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SenhaController.runPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/senha"})
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

  // @LINE:39
  class ReverseLogController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/log/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:40
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/log/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:41
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogController.telaLista",
      """
        function(p,s,o,f) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/log/lista/todos" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def desbloquear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.desbloquear",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/desbloqueia"})
        }
      """
    )
  
    // @LINE:31
    def enviarToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.enviarToken",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/enviarToken"})
        }
      """
    )
  
    // @LINE:21
    def telaLista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaLista",
      """
        function(p,s,o,f) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/lista/todos" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
        }
      """
    )
  
    // @LINE:16
    def telaNovo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaNovo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/novo/"})
        }
      """
    )
  
    // @LINE:29
    def filtra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.filtra",
      """
        function(filtro) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuarios/filtro/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
        }
      """
    )
  
    // @LINE:26
    def confirma: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirma",
      """
        function(email,confirmaToken) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/confirma/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmaToken", encodeURIComponent(confirmaToken))})
        }
      """
    )
  
    // @LINE:33
    def bloquear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.bloquear",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/bloqueia"})
        }
      """
    )
  
    // @LINE:19
    def telaEditar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaEditar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:58
    def formularioDeLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:30
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:32
    def confirmaAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirmaAdmin",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/confirma"})
        }
      """
    )
  
    // @LINE:18
    def telaReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaReset",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/reset"})
        }
      """
    )
  
    // @LINE:25
    def autenticado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.autenticado",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "current"})
        }
      """
    )
  
    // @LINE:17
    def telaCadastrado: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaCadastrado",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/cadastrado"})
        }
      """
    )
  
    // @LINE:60
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:35
    def inserirAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.inserirAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario"})
        }
      """
    )
  
    // @LINE:54
    def salvaNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.salvaNovoUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:56
    def confirmaUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirmaUsuario",
      """
        function(email,codigo) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/confirma/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("codigo", encodeURIComponent(codigo))})
        }
      """
    )
  
    // @LINE:36
    def exportar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.exportar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/exportar/"})
        }
      """
    )
  
    // @LINE:24
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.inserir",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
        }
      """
    )
  
    // @LINE:27
    def editar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.editar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/editar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:59
    def autenticar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.autenticar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:28
    def buscaPorId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.buscaPorId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:15
    def telaCadastro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaCadastro",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
        }
      """
    )
  
    // @LINE:55
    def formularioDeNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeNovoUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:20
    def telaDetalhe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.telaDetalhe",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adicionais/usuario/detalhe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }


}