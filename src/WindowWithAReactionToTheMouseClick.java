import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowWithAReactionToTheMouseClick {
    public static void main(String[] args) {
        // создаем окн
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        // и показываем его
        jf.setVisible(true);
        jf.addMouseListener(new SimpleClickListener());

    }

}

class SimpleClickListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked аt " + e.getX() + "," + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
