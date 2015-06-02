/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptionHandlers;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 *
 * @author Marek Pawłowski
 */
public class CustomExceptionHandlerFactory extends ExceptionHandlerFactory {
   private ExceptionHandlerFactory parent;

  /**
   * Konstruktor ustawiający pole "parent".
   * 
   * @param parent
   * @author Marek Pawłowski
   */   
   public CustomExceptionHandlerFactory(ExceptionHandlerFactory parent) {
    this.parent = parent;
   }
 
  /**
   * Metoda zwracająca obiekt typu ExceptionHandler wygenerowany przez klasę CustomExceptionHandler.
   * 
   * @param parent
   * @author Marek Pawłowski
   */     
   @Override
   public ExceptionHandler getExceptionHandler() {
 
       ExceptionHandler handler = new CustomExceptionHandler(parent.getExceptionHandler());
 
       return handler;
   }
   
}