package com.musichubappfront.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.web.client.RestTemplate;


@Route("createAccount")
@StyleSheet("/css/styleMainView.css")
public class CreateAccountView extends VerticalLayout {

    public CreateAccountView() {

        RestTemplate restTemplate = new RestTemplate();


        add(new H1("Create an account"));

        TextField firstName = new TextField("First name");
        TextField lastName = new TextField("Last name");
        TextField email = new TextField("Email");
        TextField password = new TextField("Password");
        TextField age = new TextField("Age");
        TextField gender = new TextField("Gender");
        TextField city = new TextField("City");
        TextField country = new TextField("Country");

        Button buttonName = new Button("Enter", new Icon(VaadinIcon.CLOUD));


        add(firstName, lastName, email, password, age, gender, city, country, buttonName);

        this.setJustifyContentMode(JustifyContentMode.CENTER);
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

//        String url = "http://localhost:8080/createAccount";
//
//        buttonName.addClickListener(
//                click -> restTemplate.getForObject(url,CreateAccountView.class));

//        Example:
//        buttonName.addClickListener(
//                click -> add(new Paragraph("Provided value " + firstName.getValue())
//        ));

// returns „Provided value” with the value entered in firstName variable.
    }
}
