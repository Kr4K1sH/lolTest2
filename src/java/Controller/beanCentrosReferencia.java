/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import Model.referencia;
/**
 *
 * @author User
 */
@Named(value = "beanCentrosReferencia")
@SessionScoped
public class beanCentrosReferencia implements Serializable {

     referencia mirefere;

    public referencia getMirefere() {
        return mirefere;
    }

    public void setMirefere(referencia mirefere) {
        this.mirefere = mirefere;
    }
    
    String tipoReeferencia;
    String tipoConsulta;
    String radioRef;
    String RiesgoIncluido;
    
    
    String CritPriConsExterna;
    String CritPriUrgencias;

    public String getCritPriConsExterna() {
        return CritPriConsExterna;
    }

    public void setCritPriConsExterna(String CritPriConsExterna) {
        this.CritPriConsExterna = CritPriConsExterna;
    }

    public String getCritPriUrgencias() {
        return CritPriUrgencias;
    }

    public void setCritPriUrgencias(String CritPriUrgencias) {
        this.CritPriUrgencias = CritPriUrgencias;
    }
    
    int CodCentroSalud;
    String NomCentroSalud;
    String AreaAtencion;
    int CodFuncionario;
    String NomFuncionario;
    int CodServicio;
    String NomServicio;
    int CodEspecialidad;
    String NomEspecialidad;
    
    int NumTeldelProfesional; 
    int Extension;
    
    int CodCentroSalud2;
    String NomCentroSalud2;
    String AreaAtencion2;
   int   CodServicio2;
   String NomServicio2;
 int CodEspecialidad2;
   String NomEspecialidad2;
    int CodFuncionarioRed;
    String NomFuncionarioRed;
    
    String Mensaje;
 
    public int getCodEspecialidad2() {
        return CodEspecialidad2;
    }

    public void setCodEspecialidad2(int CodEspecialidad2) {
        this.CodEspecialidad2 = CodEspecialidad2;
    }
  

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getTipoReeferencia() {
        return tipoReeferencia;
    }

    public void setTipoReeferencia(String tipoReeferencia) {
        this.tipoReeferencia = tipoReeferencia;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getRadioRef() {
        return radioRef;
    }

    public void setRadioRef(String radioRef) {
        this.radioRef = radioRef;
    }

    public String getRiesgoIncluido() {
        return RiesgoIncluido;
    }

    public void setRiesgoIncluido(String RiesgoIncluido) {
        this.RiesgoIncluido = RiesgoIncluido;
    }

   

    public int getCodCentroSalud() {
        return CodCentroSalud;
    }

    public void setCodCentroSalud(int CodCentroSalud) {
        this.CodCentroSalud = CodCentroSalud;
    }

    public String getNomCentroSalud() {
        return NomCentroSalud;
    }

    public void setNomCentroSalud(String NomCentroSalud) {
        this.NomCentroSalud = NomCentroSalud;
    }

    public String getAreaAtencion() {
        return AreaAtencion;
    }

    public void setAreaAtencion(String AreaAtencion) {
        this.AreaAtencion = AreaAtencion;
    }

    public int getCodFuncionario() {
        return CodFuncionario;
    }

    public void setCodFuncionario(int CodFuncionario) {
        this.CodFuncionario = CodFuncionario;
    }

    public String getNomFuncionario() {
        return NomFuncionario;
    }

    public void setNomFuncionario(String NomFuncionario) {
        this.NomFuncionario = NomFuncionario;
    }

    public int getCodServicio() {
        return CodServicio;
    }

    public void setCodServicio(int CodServicio) {
        this.CodServicio = CodServicio;
    }

    public String getNomServicio() {
        return NomServicio;
    }

    public void setNomServicio(String NomServicio) {
        this.NomServicio = NomServicio;
    }

    public int getCodEspecialidad() {
        return CodEspecialidad;
    }

    public void setCodEspecialidad(int CodEspecialidad) {
        this.CodEspecialidad = CodEspecialidad;
    }

    public String getNomEspecialidad() {
        return NomEspecialidad;
    }

    public void setNomEspecialidad(String NomEspecialidad) {
        this.NomEspecialidad = NomEspecialidad;
    }

    public int getNumTeldelProfesional() {
        return NumTeldelProfesional;
    }

    public void setNumTeldelProfesional(int NumTeldelProfesional) {
        this.NumTeldelProfesional = NumTeldelProfesional;
    }

    public int getExtension() {
        return Extension;
    }

    public void setExtension(int Extension) {
        this.Extension = Extension;
    }

    public int getCodCentroSalud2() {
        return CodCentroSalud2;
    }

    public void setCodCentroSalud2(int CodCentroSalud2) {
        this.CodCentroSalud2 = CodCentroSalud2;
    }

    public String getNomCentroSalud2() {
        return NomCentroSalud2;
    }

    public void setNomCentroSalud2(String NomCentroSalud2) {
        this.NomCentroSalud2 = NomCentroSalud2;
    }

    public String getAreaAtencion2() {
        return AreaAtencion2;
    }

    public void setAreaAtencion2(String AreaAtencion2) {
        this.AreaAtencion2 = AreaAtencion2;
    }

    public int getCodServicio2() {
        return CodServicio2;
    }

    public void setCodServicio2(int CodServicio2) {
        this.CodServicio2 = CodServicio2;
    }

    public String getNomServicio2() {
        return NomServicio2;
    }

    public void setNomServicio2(String NomServicio2) {
        this.NomServicio2 = NomServicio2;
    }

   

    public String getNomEspecialidad2() {
        return NomEspecialidad2;
    }

    public void setNomEspecialidad2(String NomEspecialidad2) {
        this.NomEspecialidad2 = NomEspecialidad2;
    }

    public int getCodFuncionarioRed() {
        return CodFuncionarioRed;
    }

    public void setCodFuncionarioRed(int CodFuncionarioRed) {
        this.CodFuncionarioRed = CodFuncionarioRed;
    }

    public String getNomFuncionarioRed() {
        return NomFuncionarioRed;
    }

    public void setNomFuncionarioRed(String NomFuncionarioRed) {
        this.NomFuncionarioRed = NomFuncionarioRed;
    }
    
    public beanCentrosReferencia() {
    }
    
    public void ValidarNombredelCentroSalud1(){
    if( (this.CodCentroSalud == 0)  || (this.CodCentroSalud < 1000) || (this.CodCentroSalud >9999)){
    this.CodCentroSalud =0;
    this.setMensaje("El Codigo del Centro de Salud es Invalido");
    }else{
    this.setMensaje("");
    }
    
    }
    
    public void ValidarNombredelCentroSalud2(){
    
    if((this.CodCentroSalud2 == 0) || (this.CodCentroSalud2 < 1000) || (this.CodCentroSalud2 > 9999)){
    this.CodCentroSalud2 =0; 
    this.setMensaje("El Codigo del Centro de Salud es Invalido");
   
    }else{
    this.setMensaje("");
    }
    }
   
    
    
    public void ValidarFuncionario1() {
     if( (this.CodFuncionario < 200)  ||  (this.CodFuncionario > 250) || (this.CodFuncionario == 0)
       ){this.CodFuncionario = 0;
     this.setMensaje("El Codigo de Funcionario es Invalido");
     
     }else{
    this.setMensaje("");
    }
    }
    
      public void ValidarFuncionario2() {
    if((this.CodFuncionarioRed < 200) || (this.CodFuncionarioRed > 250) || (this.CodFuncionarioRed == 0)){
       this.CodFuncionarioRed =0;
        this.setMensaje("El Codigo de Funcionario de red es Invalido");
    }else{
    this.setMensaje("");
    }
      }
    
    
    
    public void ValidarServicio1(){
    if( (this.CodServicio < 366) || (this.CodServicio >390) || (this.CodServicio == 0)  ){
    this.CodServicio =0;
    this.setMensaje("El codigo de Servicio es Invalido");
    }else{
    this.setMensaje("");
    }}
    
      public void ValidarServicio2(){  
    if((this.CodServicio2 < 366) || (this.CodServicio2 > 390 ) || (this.CodServicio2 == 0)){
       this.CodServicio2=0;
        this.setMensaje("El codigo de Servicio es Invalido");
    }else{
    this.setMensaje("");
    }
      }
    
    
    
    public void ValidarEspecialidad1(){
    if(  (this.CodEspecialidad <900) || (this.CodEspecialidad >980) || (this.CodEspecialidad == 0) )
    {
    this.CodEspecialidad=0;
    this.setMensaje("El codigo de Especialidad es Invalido");
    }else{
    this.setMensaje("");
    }
}


  public void ValidarEspecialidad2(){
    if((this.CodEspecialidad2 < 900) || (this.CodEspecialidad2 > 980) || (this.CodEspecialidad2 == 0)){
     this.CodEspecialidad2=0;
        this.setMensaje("El codigo de Especialidad es Invalido");
    }else{
    this.setMensaje("");
    }
}
    
    
    public void Blanquear(){
      
    this.tipoReeferencia ="";
    this.tipoConsulta = "";
    this.radioRef ="";
    this.RiesgoIncluido="";
    
    
    this.CritPriConsExterna="";
    this.CritPriUrgencias="";
    
     this.CodCentroSalud=0;
    this.NomCentroSalud="";
    this.AreaAtencion="";
    this.CodFuncionario=0;
    this.NomFuncionario="";
    this.CodServicio=0;
    this.NomServicio="";
    this.CodEspecialidad=0;
    this.NomEspecialidad="";
    
  this.NumTeldelProfesional=0; 
    this.Extension=0;
    
   this.CodCentroSalud2=0;
    this.NomCentroSalud2="";
  this.AreaAtencion2="";
 this.CodServicio2=0;
  this.NomServicio2="";
  this.CodEspecialidad2=0;
 this.NomEspecialidad2="";
     this.CodFuncionarioRed=0;
    this.NomFuncionarioRed="";
    
     this.Mensaje="";
    
    }
   public String  Validar(){
   /////////////////////////////////////////////////////////////////////////////
   this.mirefere = new referencia();
   
    if( (this.tipoReeferencia != null) && (!this.tipoReeferencia.isEmpty()  ) ){
    this.mirefere.setTipoReeferencia(this.tipoReeferencia);   
    }else{
    if((this.tipoReeferencia == null) || (this.tipoReeferencia.isEmpty()  )){
    this.setMensaje("Debe de seleccionar un Tipo de referencia ") ;
    return Mensaje;
    }
    }
    //bien
    
     if( (this.tipoConsulta != null)  && (!this.tipoConsulta.isEmpty()) ){
    this.mirefere.setTipoConsulta(tipoConsulta);
     }else{
    if((this.tipoConsulta == null)  || (this.tipoConsulta.isEmpty())){
    return this.Mensaje += ("Debe de seleccionar un tipo de Consulta");
   }
     }
    //bien
     
    if(this.radioRef != null && (!this.radioRef.isEmpty())){
    this.mirefere.setRadioRef(radioRef);
    }else{   
   if ( (this.radioRef == null) || (this.radioRef.isEmpty()) ){
  return  this.Mensaje =("Debe de seleccionar el Tipo de Referencia en el boton");
    } 
    }
    //bien
    
     
   
    if( (this.RiesgoIncluido != null) && (! this.RiesgoIncluido.isEmpty()) ){
    this.mirefere.setRiesgoIncluido(RiesgoIncluido);
    }else{
    if( (this.RiesgoIncluido == null) || ( this.RiesgoIncluido.isEmpty())){
  return  this.Mensaje =("Debe de seleccionar un Riesgo Excluido");
    }
    }
    //bienn
    
    if( (this.CritPriConsExterna != null) && (!this.CritPriConsExterna.isEmpty()) ){
    this.mirefere.setCritPriConsExterna(CritPriConsExterna);
    }else{
    if((this.CritPriConsExterna == null) || (this.CritPriUrgencias.isEmpty()) ){
 return   this.Mensaje =("Debe de seleccionar un Criterio de Priorizacion de Consulta Externa");
    }
    }
    //bien
    
    if( (this.CritPriUrgencias != null) && (!this.CritPriUrgencias.isEmpty()) ){
    this.mirefere.setCritPriUrgencias(CritPriUrgencias);
    }else{
    if((this.CritPriUrgencias == null) || (this.CritPriUrgencias.isEmpty()) ){
  return  this.Mensaje = ("Debe de seleccionar un Criterio de Prioridad de Urgencia ");
    }
    }
    //bien
   ///////////////////////////////////////////parte 2 /////////////////// //////////
    
    if( (this.CodCentroSalud >= 1000) && (this.CodCentroSalud <= 9999)  ){
    this.mirefere.setCodCentroSalud(CodCentroSalud);
    }else{
    if ( (this.CodCentroSalud < 1000) || (this.CodCentroSalud > 9999) || this.CodCentroSalud == 0){ 
 return   this.Mensaje=("Ingrese un Codigo de Centro de Salud Valido (Parte || )");
    }
    }
    
   if( (this.NomCentroSalud != null) && (!this.NomCentroSalud.isEmpty()) ){
   this.mirefere.setNomCentroSalud(NomCentroSalud);
   }else{
   if ( (this.NomCentroSalud == null) || (this.NomCentroSalud.isEmpty()) ){
 return  this.Mensaje=("El Nombre del Centro de Salud esta vacio (Parte || )");
   }
   }
   
   
   if( (this.AreaAtencion != null) && (!this.AreaAtencion.isEmpty() )){
   this.mirefere.setAreaAtencion(AreaAtencion);
   }else{
   if ( (this.AreaAtencion == null) || (this.AreaAtencion.isEmpty() ) ){
 return  this.Mensaje=("El Area de Atencion debe de ser seleccionada (Parte || )");
   }
   }
   
 
   
   
   if( (this.CodFuncionario >= 200) &&  (this.CodFuncionario <= 250) ){
   this.mirefere.setCodFuncionario(CodFuncionario);
   }else{
   if((this.CodFuncionario < 200) ||  (this.CodFuncionario >  250) || this.CodFuncionario ==0){
 return  this.Mensaje=("El Codigo de Funcionario debe ser digitado (Parte || )");
   }
   }
   
   if( (this.NomFuncionario != null ) && (!this.NomFuncionario.isEmpty())  ){
   this.mirefere.setNomFuncionario(this.NomFuncionario);
   }else{
   if( (this.NomFuncionario == null ) || (this.NomFuncionario.isEmpty())){
  return  this.Mensaje=("El Nombre de Funcionario esta vacio (Parte || ) ");
   }
   }
   
  if ( (this.CodServicio >= 366) && (this.CodServicio <= 390) ){
  this.mirefere.setCodServicio(CodServicio);
  }else{
  if( (this.CodServicio < 366) || (this.CodServicio > 390) || this.CodServicio == 0){
 return  this.Mensaje=("Se debe de digitar un codigo de servicio (Parte || )");
  }
  }
   
  if(this.NomServicio != null && (!this.NomServicio.isEmpty())){
  this.mirefere.setNomServicio(NomServicio);
  }else{
  if(this.NomServicio == null || (this.NomServicio.isEmpty())){
   return  this.Mensaje=("Se debe de digitar un Nombre de Servicio (Parte || )");
  }
  }
  
  if((this.CodEspecialidad >=900) && (this.CodEspecialidad <=980) ){
  this.mirefere.setCodEspecialidad(CodEspecialidad);
  }else{
      
  if((this.CodEspecialidad <900) || (this.CodEspecialidad >980) || this.CodEspecialidad ==0 ){
 return  this.Mensaje=("Se debe de digitar un numero valido para la especialidad (Parte || )");
  }
  }
  
  if(this.NomEspecialidad != null && (!this.NomEspecialidad.isEmpty()) ){
  this.mirefere.setNomEspecialidad(NomEspecialidad);
  }else{
   if(this.NomEspecialidad == null || (this.NomEspecialidad.isEmpty()) ){
 return  this.Mensaje=("Se debe de digitar un nombre de especialidad (Parte || )");
  }
  }
  
  if(this.NumTeldelProfesional >0 && (this.NumTeldelProfesional!=0) ){
  this.mirefere.setNumTeldelProfesional(NumTeldelProfesional);
  }else{
  if(this.NumTeldelProfesional == 0 ){
 return  this.Mensaje=("Se debe de digitar un numero mayor a 9 digitos (Parte || )");
  }
  }
  
  if(this.Extension>0 && (this.Extension !=0) ){
  this.mirefere.setExtension(Extension);
  }else{
  if(this.Extension == 0){
  return  this.Mensaje=("Se debe de digitar un aextension");
  }
  }
  ////////////////////////////////// parte 3/////////////////////////////////
    if( (this.CodCentroSalud2 >= 1000) && (this.CodCentroSalud2 <= 9999)  ){
    this.mirefere.setCodCentroSalud(CodCentroSalud);
    }else{
    if ( (this.CodCentroSalud2 < 1000) || (this.CodCentroSalud2 > 9999) || this.CodCentroSalud2 == 0){ 
 return   this.Mensaje=("Ingrese un Codigo de Centro de Salud Valido (Parte ||| )");
    }
    }
  
  if( (this.NomCentroSalud2 != null) && (!this.NomCentroSalud2.isEmpty()) ){
   this.mirefere.setNomCentroSalud2(NomCentroSalud2);
   }else{
   if ( (this.NomCentroSalud2 == null) || (this.NomCentroSalud2.isEmpty()) ){
 return  this.Mensaje=("El Nombre del Centro de Salud esta vacio (Parte ||| )");
   }
  }
   
   if( (this.AreaAtencion2 != null) && (!this.AreaAtencion2.isEmpty() )){
   this.mirefere.setAreaAtencion2(AreaAtencion2);
   }else{
   if ( (this.AreaAtencion2 == null) || (this.AreaAtencion2.isEmpty() ) ){
 return  this.Mensaje=("El Area de Atencion debe de ser seleccionada (Parte ||| )");
   }
   }
   
   if ( (this.CodServicio2 >= 366) && (this.CodServicio2 <= 390) ){
  this.mirefere.setCodServicio2(CodServicio2);
  }else{
  if( (this.CodServicio2 < 366) || (this.CodServicio2 > 390) || this.CodServicio2 == 0){
  return  this.Mensaje=("Se debe de digitar un codigo de servicio (Parte ||| )");
  }
   }
   
   if(this.NomServicio2 != null && (!this.NomServicio2.isEmpty())){
  this.mirefere.setNomServicio2(NomServicio2);
  }else{
  if(this.NomServicio2 == null || (this.NomServicio2.isEmpty())){
   return  this.Mensaje=("Se debe de digitar un Nombre de Servicio (Parte || )");
  }
  }
  
   
   
   if((this.CodEspecialidad2 <=900) && (this.CodEspecialidad2 >=980) ){
  this.mirefere.setCodEspecialidad2(CodEspecialidad2);
  }else{  
  if((this.CodEspecialidad2 <900) || (this.CodEspecialidad2 >980) || this.CodEspecialidad2 == 0){
  return  this.Mensaje=("Se debe de digitar un numero valido para la especialidad (Parte ||| )");
  }}
  
  if(this.NomEspecialidad2 != null && (!this.NomEspecialidad2.isEmpty()) ){
  this.mirefere.setNomEspecialidad2(NomEspecialidad2);
  }else{
   if(this.NomEspecialidad2 == null || (this.NomEspecialidad2.isEmpty()) ){
 return  this.Mensaje=("Se debe de digitar un nombre de especialidad (Parte ||| )");
  }}
  
   if(this.CodFuncionarioRed >= 200 && (this.CodFuncionarioRed <= 260)  ){
   this.mirefere.setCodFuncionarioRed(CodFuncionarioRed);
   }else{  
   if((this.CodFuncionarioRed < 200) || (this.CodFuncionarioRed > 260) || this.CodFuncionarioRed == 0 )
   {
return  this.Mensaje=("Se debe de digitar un numero valido para el funcionario");
   }}
   
   if(!this.NomFuncionarioRed.isEmpty() && this.NomFuncionario !=null ){
   this.mirefere.setNomFuncionarioRed(NomFuncionarioRed);
   this.mirefere.TablaRecibelo(mirefere);
  
   }else{
   if(this.NomFuncionarioRed.isEmpty() || this.NomFuncionario == null ){
  return  this.Mensaje=("Se debe de digitar un nombre para el funcionario ");
   }
  
   }
 
    
  
    
    
   
    return this.Mensaje;
   }
    
    
    
}
