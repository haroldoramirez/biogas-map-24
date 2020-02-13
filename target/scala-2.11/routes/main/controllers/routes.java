
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo/projetos/biogas-map-24/conf/routes
// @DATE:Thu Feb 13 16:42:44 BRT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminController AdminController = new controllers.ReverseAdminController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsuarioController UsuarioController = new controllers.ReverseUsuarioController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminController AdminController = new controllers.javascript.ReverseAdminController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsuarioController UsuarioController = new controllers.javascript.ReverseUsuarioController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
