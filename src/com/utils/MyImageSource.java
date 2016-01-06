package com.utils;

import com.vaadin.server.StreamResource;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhouchunjie on 16/1/6.
 */
public class MyImageSource implements StreamResource.StreamSource {
    ByteArrayOutputStream imagebuffer = null;
    int reloads = 0;


    @Override
    public InputStream getStream() {
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics drawable = image.getGraphics();
        drawable.setColor(Color.lightGray);
        drawable.fillRect(0, 0, 200, 200);
        drawable.setColor(Color.yellow);
        drawable.fillOval(25, 25, 150, 150);
        drawable.setColor(Color.blue);
        drawable.drawRect(0, 0, 199, 199);
        drawable.setColor(Color.black);
        drawable.drawString("Reloads=" + reloads, 75, 100);
        reloads++;
        try {
            //Write the image to a buffer.
            imagebuffer = new ByteArrayOutputStream();
            ImageIO.write(image, "png", imagebuffer);

            //Return a stream from the buffer.
            return new ByteArrayInputStream(imagebuffer.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }
}
