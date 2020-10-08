package com.musichubappfront.gui;

import com.musichubappfront.Dto.ResponseDto;
import com.musichubappfront.client.WebsitesClient;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("artist")
@StyleSheet("/css/style.css")

public class ArtistView extends VerticalLayout {

    @Autowired
    private WebsitesClient websitesClient;


    public ArtistView() {

        super();

        TextField textFieldName = new TextField("Enter artist's name");
        textFieldName.setClearButtonVisible(true);
        Button buttonName = new Button("Enter", new Icon(VaadinIcon.MUSIC));
        Label labelName = new Label();

        setSizeFull();

        buttonName.addClickListener(
                clickEvent -> {labelName.setText("Searching for... " + textFieldName.getValue());

            ResponseDto musicianInfo = websitesClient.getMusicianInfo(textFieldName.getValue());
            System.out.println(musicianInfo);

        });


 // Displaying two items next to each other

 //Button button1...
 //Button button2

 //HorizontalLayout layout = new HorizontalLayout(button1, button2);
 //layout.setDefaultVerticalComponentAlignment(Alignment.END);
 //add(layout);

 // Adding a functionality
 // .addClickListener(Insert Lambda);



        Icon youTubeIcon = new Icon(VaadinIcon.YOUTUBE);
        youTubeIcon.setSize("100px");

        Icon ticketIcon = new Icon(VaadinIcon.TICKET);
        ticketIcon.setSize("100px");

        Icon infoIcon = new Icon(VaadinIcon.INFO_CIRCLE_O);
        infoIcon.setSize("100px");


        add(textFieldName,buttonName,labelName);

        HorizontalLayout layout = new HorizontalLayout(youTubeIcon,ticketIcon, infoIcon);
        layout.setDefaultVerticalComponentAlignment(Alignment.START);
        add(layout);

        this.setJustifyContentMode (JustifyContentMode.CENTER);
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    }
}

