
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Thu Feb 13 17:36:41 BRT 2020

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:63
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def painel(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/painel")
    }
  
    // @LINE:9
    def usuarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/usuarios")
    }
  
    // @LINE:12
    def paginaApi(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/api")
    }
  
  }

  // @LINE:44
  class ReverseCategoriaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def telaLista(p:Int = 0, s:String = "nome", o:String = "asc", f:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/categoria/lista/todos" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "nome") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
    }
  
    // @LINE:44
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/categoria/novo/")
    }
  
    // @LINE:46
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/categoria/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:51
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/categoria/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:50
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/categoria")
    }
  
    // @LINE:52
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/categoria/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:45
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/categoria/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:39
  class ReverseLogController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/log/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:40
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/log/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:41
    def telaLista(p:Int = 0, s:String = "dataCadastro", o:String = "desc", f:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/log/lista/todos" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "dataCadastro") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
    }
  
  }

  // @LINE:15
  class ReverseUsuarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def desbloquear(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/desbloqueia")
    }
  
    // @LINE:31
    def enviarToken(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/enviarToken")
    }
  
    // @LINE:21
    def telaLista(p:Int = 0, s:String = "nome", o:String = "asc", f:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/lista/todos" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "nome") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
    }
  
    // @LINE:16
    def telaNovo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/novo/")
    }
  
    // @LINE:29
    def filtra(filtro:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuarios/filtro/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
    }
  
    // @LINE:26
    def confirma(email:String, confirmaToken:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/confirma/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[String]].unbind("confirmaToken", dynamicString(confirmaToken)))
    }
  
    // @LINE:33
    def bloquear(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/bloqueia")
    }
  
    // @LINE:19
    def telaEditar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:58
    def formularioDeLogin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:30
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
    }
  
    // @LINE:32
    def confirmaAdmin(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/" + implicitly[PathBindable[Long]].unbind("id", id) + "/confirma")
    }
  
    // @LINE:18
    def telaReset(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/reset")
    }
  
    // @LINE:25
    def autenticado(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "current")
    }
  
    // @LINE:17
    def telaCadastrado(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/cadastrado")
    }
  
    // @LINE:60
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:35
    def inserirAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/adicionais/usuario")
    }
  
    // @LINE:54
    def salvaNovoUsuario(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario/novo")
    }
  
    // @LINE:56
    def confirmaUsuario(email:String, codigo:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/confirma/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[String]].unbind("codigo", dynamicString(codigo)))
    }
  
    // @LINE:36
    def exportar(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/exportar/")
    }
  
    // @LINE:24
    def inserir(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario")
    }
  
    // @LINE:27
    def editar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/editar/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:59
    def autenticar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:28
    def buscaPorId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:15
    def telaCadastro(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cadastro")
    }
  
    // @LINE:55
    def formularioDeNovoUsuario(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/novo")
    }
  
    // @LINE:20
    def telaDetalhe(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adicionais/usuario/detalhe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }


}