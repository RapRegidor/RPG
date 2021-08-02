package Loader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ImageLoader {
    private static HashMap<String, BufferedImage> obj;
    public static void load() {

        obj = new HashMap<String, BufferedImage>();

        File folder = new File("res");

        for(File file : folder.listFiles()) {
            try {
                obj.put(file.getName().replaceAll(".png", ""), ImageIO.read(file));
            } catch (IOException e) {
                System.err.println("[Utils][Textures]: Exception reading "+file.getName());
            }
        }
    }

    public static BufferedImage getObj(String name) {
        BufferedImage img = obj.get(name);
        if(img != null){
            return img;
        }
        return obj.get("error");
    }
}
