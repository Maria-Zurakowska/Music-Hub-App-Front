package com.musichubappfront.gui.login;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;


import com.vaadin.flow.router.Route;

@Route("login")
@StyleSheet("/css/styleMainView.css")
public class LoginView extends HorizontalLayout {

    public LoginView() {

        super ();

        // Widgets
        this.add ( new LoginForm () );

        // Arrange
        this.getStyle ().set ("border" , "");
        this.setSizeFull ();
        this.setJustifyContentMode ( FlexComponent.JustifyContentMode.CENTER );
        this.setDefaultVerticalComponentAlignment ( FlexComponent.Alignment.CENTER );


    }
}

