import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedImage trojan;
        try {
            final BufferedImage rock = ImageIO.read(new File("res/rock.png"));
            final BufferedImage mark = ImageIO.read(new File("res/watermark.png"));
            trojan = embed(mark, rock);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** embeds the secret message into the decoy picture.
     *
     * @param message
     * @param decoy
     * @return
     */
    private static BufferedImage embed(BufferedImage message, BufferedImage decoy) {
        BufferedImage result = new BufferedImage(decoy.)
    }
}
