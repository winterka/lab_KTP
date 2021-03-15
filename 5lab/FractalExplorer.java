import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.event.*;
public class FractalExplorer {
    private int displaySize;
    private JImageDisplay display;
    private FractalGenerator fractal;
    private Rectangle2D.Double range;
    public FractalExplorer(int size){
        displaySize = size;
        fractal = new Mendelbrot();
        range = new Rectangle2D.Double();
        fractal.getInitialRange(range);
        display = new JImageDisplay(displaySize, displaySize);
    }
    public void createAndShowGUI(){
        display.setLayout(new BorderLayout());
        JFrame frame = new JFrame("Fractal Exploring");
        frame.add(display, BorderLayout.CENTER);
        JButton resetButton = new JButton("Reset");
        ResetHandler handler = new ResetHandler();
        resetButton.addActionListener(handler);
        frame.add(resetButton, BorderLayout.SOUTH);
        MouseHandler click = new MouseHandler();
        display.addMouseListener(click);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    private void DrawFractal(){
        for (int x = 0; x<displaySize; x++){
            for (int y = 0; y<displaySize; y++){
                double xCoord = fractal.getCoord(range.x, range.x + range.width, displaySize, x);
                double yCoord = fractal.getCoord(range.y, range.y + range.height, displaySize, y);
                int it = fractal.numIterations(xCoord, yCoord);
                if (it == -1)
                    display.drawPixel(x, y, 0);
                else
                    {
                        float hue = 0.7f + (float) it / 200f;
                        int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                        display.drawPixel(x, y, rgbColor);
                    }
            }
        }
        display.repaint();
    }
    private class ResetHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            fractal.getInitialRange(range);
            DrawFractal();
        }
    }
    private class MouseHandler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            int x = e.getX();
            double xCoord = fractal.getCoord(range.x, range.x + range.width, displaySize, x);
            int y = e.getY();
            double yCoord = fractal.getCoord(range.y, range.y + range.height, displaySize, y);
            fractal.recenterAndZoomRange(range, xCoord , yCoord, 0.5);
            DrawFractal();

        }
    }
    public static void main(String[] args){
        FractalExplorer disExplorer = new FractalExplorer(600);
        disExplorer.createAndShowGUI();
        disExplorer.DrawFractal();
    }
}
