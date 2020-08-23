package com.musichubappfront.gui;

import com.musichubappfront.Dto.ResponseDto;
import com.musichubappfront.client.WebsitesClient;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
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

 //HorizontalLayout layout - new HorizontalLayount(button1, button2);
 //layout.setDefaultVerticalComponentAlignment(Alignment.END);
 //add(layout);

 // Adding a functionality
 // .addClickListener(Insert Lambda);


        Image image = new Image("/Users/mary_masza/IdeaProjects/music-hub-app-front/src/main/resources/spotify.jpg", "aa");
        add(textFieldName,buttonName,labelName, image);

        this.setJustifyContentMode (JustifyContentMode.CENTER );
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    }
}

