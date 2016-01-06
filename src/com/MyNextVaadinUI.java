package com;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.servlet.annotation.WebServlet;

/**
 * Created by zhouchunjie on 16/1/5.
 */
public class MyNextVaadinUI extends UI {

    @WebServlet(value = "/clickButton", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyNextVaadinUI.class)
    public static class Servlet extends VaadinServlet {

    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
//        final VerticalLayout layout = new VerticalLayout();
//        layout.setMargin(true);
//        setContent(layout);
//
//        Button button = new Button("click me");
//        button.addClickListener(new Button.ClickListener() {
//            @Override
//            public void buttonClick(Button.ClickEvent clickEvent) {
//                layout.addComponent(new Label("Thank you for clicking."));
//            }
//        });
//        layout.addComponent(button);
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new Label("Hello, world!"));
    }
}
