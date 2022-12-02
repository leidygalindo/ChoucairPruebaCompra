#Autor: Leidy Galindo
 @HistoriaDeUsuario
Feature: Validar el ingreso correto al sitio web
 Yo como usuario quiero ingresar al sitio web para validar que tengo acceso

 @CasoLogueo
  Scenario: Validar el ingreso correcto
   Given que leidy ingrea al sitio web
   When digita las credenciales usuario y contrasena del sitio web
   Then Valida que logro ingresar correctamente

@CasoAgregar
Scenario:Agregar articulos al carrito de compras
 Given que Leidy quiere comprar un bolso y una casmisa en el sitio web
 When agregar el bolso y camisa al carrito de compras
 Then ella valida los articulos en el carrito de compras

@CasoCompra
Scenario: Comprar los articulos del carrito de compras
Given verifica los articulos que se encuentran en el carrito de compras
When procede a realizar la orden de compra
Then Finaliza la orden de compra