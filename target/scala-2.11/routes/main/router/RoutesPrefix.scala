
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Thu Feb 13 16:42:44 BRT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
