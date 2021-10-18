import javax.swing.*;

public class NoteControl {
  private NoteView view;
  private NoteModel model;

  public NoteControl() {
    view = new NoteView();
    model = new NoteModel();

    JFrame frame = new JFrame("Notepad");
    frame.setContentPane(view.getPanel());
  }
}
