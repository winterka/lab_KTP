import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
class JImageDisplay extends JComponent{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private BufferedImage displayImage;
    public JImageDisplay(int width, int height){
        displayImage = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
        Dimension imageSize = new Dimension(width, height);
        super.setPreferredSize(imageSize);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(displayImage, 0, 0, getWidth(), getHeight(), null);
    }
    public void clearImage(){
        Graphics g = displayImage.getGraphics();
        g.clearRect(0, 0, getWidth(), getHeight());
    }
    public void drawPixel(int x, int y, int rgbColor){
        displayImage.setRGB(x, y, rgbColor);
    }
}
