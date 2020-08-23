package com.musichubappfront.gui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project base for Vaadin Flow with Spring", shortName = "Project Base")
@StyleSheet("/css/styleMainView.css")
public class MainView extends VerticalLayout {

    public MainView(){

        add(new H1("Welcome to Music Hub App!"));

        Button button = new Button("Click me",

                                    click -> UI.getCurrent().getPage().setLocation("http://localhost:8080/createAccount")

                                    //click -> UI.getCurrent().getPage().addDynamicImport("window.open('http://localhost:8080/login')"));
                                    //click ->{add(new Span("Done!")); }

                                    // Example code:
                                    //click -> UI.getCurrent().getPage().addDynamicImport("window.open('https://www.google.com')")
                                    //click -> UI.getCurrent().getPage().setLocation("https://www.google.com")
         );
        add( button);
        this.setJustifyContentMode (JustifyContentMode.CENTER );
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        //this.setDefaultVerticalComponentAlignment (Alignment.BASELINE );

        setSizeFull();
    }
}
