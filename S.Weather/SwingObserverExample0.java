import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample0 {
  JFrame frame;

  public static void main(String[] args) {
    SwingObserverExample0 example = new SwingObserverExample0();
    example.go();
  }

  public void go() {
    frame = new JFrame();

    JButton button = new JButton("Should I do it?");
    button.addActionListener(new AngelListener());
    button.addActionListener(new DevilListener());
  }

  class AngelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Don't do it, you might regret it!");
    }
  }

  class DevilListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Come on, do it!");
    }
  }
}
