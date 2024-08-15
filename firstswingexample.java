import javax.swing.*; // import all classes from swing package

public class firstswingexample {

    public static void main(String[] args) {

        JFrame f = new JFrame(); // creating instance of JFrame

        JButton b = new JButton("Click"); // creating instance of JButton

        b.setBounds(130, 100, 100, 40); // x axis, y axis, width, height for the button

        f.add(b); // adding button in JFrame

        f.setSize(400, 500); // 400 width and 500 height for frame

        f.setLayout(null); // using no layout managers, complete positioning in frame

        f.setVisible(true); // making the frame visible, method helps to display it.

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application closes when the frame is closed
    }
}
