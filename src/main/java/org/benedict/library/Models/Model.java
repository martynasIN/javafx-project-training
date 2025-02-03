package org.benedict.library.Models;

import org.benedict.library.Views.ViewFactory;

import javax.swing.text.View;

public class Model {
    private static Model model; //Singleton instance
    private final ViewFactory viewFactory;

    private Model(){
        this.viewFactory = new ViewFactory();
    }

    /*
    * Return singelton instance  of the Model class
    * @return the singleton instance
     */

    public static  synchronized Model getInstance(){
        if(model == null){
            model = new Model();
        }

        return model;
    }

    /*
    * Get ViewFacctory instance
    * @return ViewFactory instance
     */

    public ViewFactory getViewFactory(){
        return viewFactory;
    }
}
