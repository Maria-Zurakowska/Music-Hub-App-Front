package com.musichubappfront.gui;

import com.musichubappfront.client.WebsitesClient;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("user")
@StyleSheet("/css/style.css")
public class UserView  extends VerticalLayout {

    @Autowired
    private WebsitesClient websitesClient;

    public UserView() {

        add(new H1("MUSIC HUB"));

        Icon musicHubIcon = new Icon(VaadinIcon.DISC);
        musicHubIcon.addClickListener(
                click -> UI.getCurrent().getPage().setLocation("http://localhost:8080/artist")
        );

        musicHubIcon.setSize("100px");

        Button myFavourites = new Button("My favourites", new Icon(VaadinIcon.HEART));
        Button mySearches = new Button("My searches", new Icon(VaadinIcon.SEARCH));

        add(musicHubIcon ,myFavourites, mySearches);

        HorizontalLayout layout = new HorizontalLayout(myFavourites, mySearches);
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);


        this.setJustifyContentMode(JustifyContentMode.START);
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        setSizeFull();
    }
}
