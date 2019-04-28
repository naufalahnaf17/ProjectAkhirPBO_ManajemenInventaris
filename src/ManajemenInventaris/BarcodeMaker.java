package ManajemenInventaris;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.sourceforge.barbecue.*;
import net.sourceforge.barbecue.output.OutputException;
import org.krysalis.barcode4j.*;

/**
 *
 * @author Hafizh
 */
public class BarcodeMaker {

    static {
        System.out.println("Hello");
    }

    public void nothin() {

    }

    public static Image createBarcodeImage(String string) throws net.sourceforge.barbecue.BarcodeException, OutputException {
        Barcode barcode = BarcodeFactory.createGlobalTradeItemNumber(string);
        BufferedImage bi = BarcodeImageHandler.getImage(barcode);
        Image imageBarcode = bi.getScaledInstance(barcode.getWidth(), barcode.getHeight(), Image.SCALE_SMOOTH);
        return imageBarcode;
    }

    public static void saveToPNG(Image barcodeImage, File path) throws IOException {
        RenderedImage renderedImage = (RenderedImage) barcodeImage.getGraphics();
        ImageIO.write(renderedImage, "png", new File(""));

    }

    public static Image createBarcode() {
        Image barcode = null;
        try {
            Barcode barcodeMaker = BarcodeFactory.createGlobalTradeItemNumber("009-291-24");
            BufferedImage bih = BarcodeImageHandler.getImage(barcodeMaker);
            ImageIO.write(bih, "png", new File("barcode-imgeio.png"));
            BarcodeImageHandler.savePNG(barcodeMaker, new File("barcode-bih.png"));
            barcode = bih.getScaledInstance(barcodeMaker.getWidth(), barcodeMaker.getHeight(), Image.SCALE_SMOOTH);
        } catch (net.sourceforge.barbecue.BarcodeException ex) {
            ex.printStackTrace();
        } catch (OutputException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return barcode;
    }
}
