package com;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Property;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import javax.servlet.annotation.WebServlet;
import java.util.Date;

/**
 * Created by zhouchunjie on 16/1/5.
 */
//@Theme("hellotheme")
public class MyVaadinApplication extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyVaadinApplication.class)
    public static class Servlet extends VaadinServlet {

    }

    @Override
    public void init(VaadinRequest request) {
        //输出简单的hello world
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
//        layout.addComponent(new Label("Hello, world!"));
//
        //按钮以及按钮点击时间
//        final VerticalLayout layout = new VerticalLayout();
//        layout.setMargin(true);
//        setContent(layout);
//
//        Button button = new Button("click me");
//        button.addClickListener(new Button.ClickListener() {
//            @Override
//            public void buttonClick(Button.ClickEvent clickEvent) {
////                layout.addComponent(new Label("Thank you for clicking."));
//                clickEvent.getButton().setEnabled(false);
//            }
//        });
//        layout.addComponent(button);

        //构建简单UI
//        //the root of the component hierarchy
//        VerticalLayout layout = new VerticalLayout();
//        layout.setSizeFull();//user entire window
//        setContent(layout);//Attach to UI
//
//        //add some component
//        layout.addComponent(new Label("Hello!"));
//
//        //Layout inside layout
//        HorizontalLayout horizontalLayout = new HorizontalLayout();
//        horizontalLayout.setSizeFull();//Use all available space
//
//        //Couple of horizontally laid out components
//        Tree tree = new Tree("My Tree");
//        horizontalLayout.addComponent(tree);
//
//        Table table = new Table("My Table");
//        table.setSizeFull();
//        horizontalLayout.addComponent(table);
//        horizontalLayout.setExpandRatio(table, 1); //Expand to fill
//
//        layout.addComponent(horizontalLayout);
//        layout.setExpandRatio(horizontalLayout, 1);//Expand to fill

        //文件资源
//        //Find the application directory
//        String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
//
//        //Image as a file resource
//        FileResource resource = new FileResource(new File(basepath + "/WEB-INF/images/image.png"));
//
//        //Show the image in the application
//        Image image = new Image("Image from file", resource);
//
//        //Let the user view the file in browser or download it
//        Link link = new Link("Link to the image file", resource);
//        VerticalLayout layout = new VerticalLayout();
//        setContent(layout);
//        layout.addComponent(image);
//        layout.addComponent(link);

        //显示动态图片
//        //Create an imstance of our stream source
//        StreamResource.StreamSource imagesource = new MyImageSource();
//
//        //Create a resource that uses the stream source and give it a name.
//        StreamResource resource = new StreamResource(imagesource, "myimage.png");
//
//        //Create an image component that gets its contents
//        VerticalLayout layout = new VerticalLayout();
//        setContent(layout);
//        layout.addComponent(new Image("Image title", resource));

        //显示通知
//        Notification.show("This is the caption", "This is the description", Notification.Type.TRAY_NOTIFICATION);

        //输入框
//        VerticalLayout layout = new VerticalLayout();
//        setContent(layout);
//
//        TextField name = new TextField("Name");
//        name.setDescription("input your name.");
//        name.addValidator(new StringLengthValidator("The name must be 1-10 letters(was {0})", 1, 10, true));
//        name.addValidator(new MyValidator());
//        name.setImmediate(true);//输入框默认为Immediate为true
//        layout.addComponent(name);
//
//        //数据校验
//        Button validate = new Button("Validate");
//        validate.addClickListener(new Button.ClickListener() {
//            @Override
//            public void buttonClick(Button.ClickEvent clickEvent) {
//                name.setValidationVisible(false);
//                try {
//                    name.validate();
//                } catch (Validator.InvalidValueException e) {
//                    //如果存在多个错误,e.getMessage()为空,所以分开显示
//                    if (e.getCauses().length > 1) {
//                        Notification.show(e.getCauses()[0].getMessage());
//                    } else {
//                        Notification.show(e.getMessage());
//                    }
//                    name.setValidationVisible(true);
//                }
//            }
//        });
//        layout.addComponent(validate);

        //选择组件,数据
//        ComboBox select = new ComboBox("My Select");
//        layout.addComponent(select);
//        select.addItem("Mercury");
//        select.addItem("Venus");
//        select.addItem("Earth");
//        //other way to add item
//        Object itemId = select.addItem();
//        select.setItemCaption(itemId, "The Sun");
//        //select the item, set select default value
//        select.setValue(itemId);

        //选择监听器
//        ComboBox select = new ComboBox("My Select");
//        select.addItems("Io", "Europa", "Ganymedes", "Callisto");
//
//        //Handle selection change
//        select.addValueChangeListener(new Property.ValueChangeListener() {
//            @Override
//            public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
//                layout.addComponent(new Label("Selected " + valueChangeEvent.getProperty().getValue()));
//            }
//        });
//        layout.addComponent(select);

        //选择器添加新item
//        BeanItemContainer<Planet> container = new BeanItemContainer<Planet>(Planet.class);
//
//        //Put some example data in it
//        container.addBean(new Planet(1, "Mercury"));
//        container.addBean(new Planet(2, "Venus"));
//        container.addBean(new Planet(3, "Earth"));
//        container.addBean(new Planet(4, "Mars"));
//
//        //Create a selection component bound to the container
//        ComboBox select = new ComboBox("Planets", container);
//        select.setNullSelectionAllowed(false);
//
//        //Set the caption mode to read the caption directly from the 'name' property of the bean
//        select.setItemCaptionMode(AbstractSelect.ItemCaptionMode.PROPERTY);
//        select.setItemCaptionPropertyId("name");
//
//        //Allow adding new items
//        select.setNewItemsAllowed(true);
//        select.setImmediate(true);
//
//        //Custom handling for new items
//        select.setNewItemHandler(new AbstractSelect.NewItemHandler() {
//            @Override
//            public void addNewItem(String s) {
//                //Create a new bean - can't set all properties
//                Planet newPlanet = new Planet(0, s);
//                container.addBean(newPlanet);
//
//                //Remember to set the selection to the new item
//                select.select(newPlanet);
//
//                Notification.show("Added new planet called " + s);
//            }
//        });
//
//        layout.addComponent(select);
//
        //复数选择
//        //A selection component with some items
//        ListSelect select = new ListSelect("My Selection");
//        select.addItems("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
//
//        //Multiple selection mode
//        select.setMultiSelect(true);
//
//        //Feedback on value chages
//        select.addValueChangeListener(new Property.ValueChangeListener() {
//            @Override
//            public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
//                layout.addComponent(new Label("Selected: " + valueChangeEvent.getProperty().getValue().toString()));
//            }
//        });
//
//        select.setImmediate(true);
//        layout.addComponent(select);

        //Label组件
//        Label label = new Label("Labeling can be dangerous");
//        layout.addComponent(label);
//        //Get the label's text to initialize a field
//        TextField editor = new TextField(null, label.getValue());
//
//        //Change the label's text
//        editor.addValueChangeListener(valueChangeEvent -> label.setValue(editor.getValue()));//Java 8
//        editor.setImmediate(true);
//        layout.addComponent(editor);

        //TextField 文本变更事件
//        //Text field with maximum length
//        TextField textFild = new TextField("My Eventful Field");
//        textFild.setValue("Initial content");
//        textFild.setMaxLength(20);
//
//        //Counter for input length
//        Label counter = new Label();
//        counter.setValue(textFild.getValue().length() + " of " + textFild.getMaxLength());
//
//        //Display the current length interactively in the counter
//        textFild.addTextChangeListener(new FieldEvents.TextChangeListener() {
//            @Override
//            public void textChange(FieldEvents.TextChangeEvent textChangeEvent) {
//                int len = textChangeEvent.getText().length();
//                counter.setValue(len + " of " + textFild.getMaxLength());
//            }
//        });
//
//        textFild.setTextChangeEventMode(AbstractTextField.TextChangeEventMode.LAZY);
//
//        layout.addComponent(textFild);
//        layout.addComponent(counter);

        //时间选择器
//        InlineDateField date = new InlineDateField("Datum");
//        date.setLocale(new Locale("cn", "CN"));
//        date.setResolution(Resolution.DAY);
//        layout.addComponent(date);
//
//        DateField date = new DateField();
//        // Display only year, month, and day in ISO format
//        date.setDateFormat("yyyy-MM-dd");
//        date.setValue(new Date());
//        layout.addComponent(date);

        //checkbox
//        CheckBox checkBox1 = new CheckBox("Box with no Check");
//        CheckBox checkBox2 = new CheckBox("Box with a Check");
//
//        checkBox2.setValue(true);
//
//        checkBox1.addValueChangeListener(valueChangeEvent -> checkBox2.setValue(!checkBox1.getValue()));
//        checkBox2.addValueChangeListener(valueChangeEvent -> checkBox1.setValue(!checkBox2.getValue()));
//
//        layout.addComponent(checkBox1);
//        layout.addComponent(checkBox2);

        //Option Group
//        //A single-select radio button group
//        OptionGroup single = new OptionGroup("Single Selection");
//        single.addItems("Single", "Sola", "Yksi");
//        single.setItemEnabled("Sola", false);
//
//        //A multi-select check box group
//        OptionGroup multi = new OptionGroup("Multiple Selection");
//        multi.setMultiSelect(true);
//        multi.addItems("Many", "Muchos", "Monta");
//
//        layout.addComponent(single);
//        layout.addComponent(multi);

        //TwinColSelect
       /* TwinColSelect select = new TwinColSelect("Select Targets");

        select.setLeftColumnCaption("Left");
        select.setRightColumnCaption("right");

        //Put some items in the select
        select.addItems("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");

        //Few items, so we can set rows to match item count
        select.setRows(select.size());

        //Preselect a few items by creating a set
        select.setValue(new HashSet<String>(
                Arrays.asList("Venus", "Earth", "Mars","Abc")
        ));

        //Handle value changes
        select.addValueChangeListener(valueChangeEvent -> layout.addComponent(new Label("Selected: " + valueChangeEvent.getProperty().getValue())));

        layout.addComponent(select);*/


        //Table
        /*Table table = new Table("The Brightest Stars");
        //Define tow columns for the built-in container
        table.addContainerProperty("Name", String.class, null);
        table.addContainerProperty("Mag", Float.class, null);

        //Add a row the hard way
        Object newItemId = table.addItem();
        Item row1 = table.getItem(newItemId);
        row1.getItemProperty("Name").setValue("Sirius");
        row1.getItemProperty("Mag").setValue(-1.46f);

        //Add a few other rows using shorthand addItem()
        table.addItem(new Object[]{"Canopus", -0.72f}, 2);
        table.addItem(new Object[]{"Arcturus", -0.04f}, 3);
        table.addItem(new Object[]{"Alpha Centauri", -0.01f}, 4);

        //Show exactly the currently contained rows items
        table.setPageLength(table.size());
        layout.addComponent(table);

        //Allow selectiong items from the table
        table.setSelectable(true);

        //Send changes in selection immediately to server
        table.setImmediate(true);

        //Shows feedback from selection
        Label current = new Label("Selected: -");

        //Handle selection change
        table.addValueChangeListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
                current.setValue("Selected: " + table.getValue());
            }
        });

        layout.addComponent(current);

        //设置表格为多选
        table.setMultiSelectMode(MultiSelectMode.DEFAULT);
        table.setMultiSelect(true);

        table.addColumnResizeListener(new Table.ColumnResizeListener() {
            @Override
            public void columnResize(Table.ColumnResizeEvent columnResizeEvent) {
                //Get the new width of the resize column
                int width = columnResizeEvent.getCurrentWidth();

                //Get the property Id of the resized column
                String column = (String) columnResizeEvent.getPropertyId();

                //Do something with the information
                table.setColumnFooter(column, String.valueOf(width) + "px");
            }
        });
        //Must be immediate to send the resize events immediately
        table.setImmediate(true);*/

        //Table 内的组件
        /*//Create a table and add a style to allow setting the row height in theme.
        Table table = new Table();
        table.addStyleName("component-inside");

        table.addContainerProperty("Sum", Label.class, null);
        table.addContainerProperty("Is Transferred", CheckBox.class, null);
        table.addContainerProperty("Comments", TextField.class, null);
        table.addContainerProperty("Details", Button.class, null);

        //Add a few items in the table
        for (int i = 0; i < 100; i++) {
            //Create the fields for the current table row
            Label sumField = new Label(String.format("Sum is <b>$%04.2f</b><br/><i>(VAT incl.)</i>", new Object[]{
                    new Double(Math.random() * 1000)
            }), ContentMode.HTML);

            CheckBox transferredField = new CheckBox("is transferred");

            //Multiline text field. This required modifying the height of the table row.
            TextField commentsField = new TextField();
            commentsField.setHeight("10px");//无 setRows方法

            //The Table item identifier for the row
            Integer itemId = new Integer(i);

            //Create a button and handle its click. A Button does not know
            //the item it is contained in, so wo have to store the item ID as user-defined data.
            Button detailsField = new Button("show details");
            detailsField.setData(itemId);
            detailsField.addClickListener(new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent clickEvent) {
                    //Get the item identifier from the user-defined data.
                    Integer iid = (Integer) clickEvent.getButton().getData();
                    Notification.show("Link " + iid.intValue() + " clicked");
                }
            });

            detailsField.addStyleName("link");

            //Create the table row
            table.addItem(new Object[]{sumField, transferredField, commentsField, detailsField}, itemId);
        }

        //Show just three rows because they are so high
        table.setPageLength(3);

        layout.addComponent(table);*/

        //在Table内编辑数据值
        layout.addComponent(new Label("Table内编辑数据值"));
        //Create a table . It is by default not editable
        Table table = new Table();
        table.addContainerProperty("Data", Date.class, null);
        table.addContainerProperty("Work", Boolean.class, null);
        table.addContainerProperty("Comments", String.class, null);

        //Add a few items in the table
        for (int i = 0; i < 100; i++) {
            java.util.Calendar calendar = new java.util.GregorianCalendar(2008, 0, 1);
            calendar.add(java.util.Calendar.DAY_OF_YEAR, 1);

            //Create the table  row
            table.addItem(new Object[]{calendar.getTime(), new Boolean(false), ""}, new Integer(i));
        }
        table.setPageLength(8);
        layout.addComponent(table);

        CheckBox switchEditable = new CheckBox("Editable");
        switchEditable.addValueChangeListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
                table.setEditable(((Boolean) valueChangeEvent.getProperty().getValue()).booleanValue());
            }
        });

        switchEditable.setImmediate(true);
        layout.addComponent(switchEditable);
        

    }
}
