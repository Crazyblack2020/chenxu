package day00.June;

import java.awt.*;

public class June12th {

    public static void main (String[] args) {

        Frame f = new Frame("GridLayout");

        f.setLayout(new GridLayout(3,3));

        f.setSize(300,300);

        f.setLocation(400,300);

        for (int i = 0; i < 9; i++) {

            Button btn = new Button("btn" + i);

            f.add(btn);

        }

        f.setVisible(true);


    }


    protected void setLayout(GridBagLayout layout) {
    }

    protected void pack() {
    }

    protected void setVisible(boolean b) {
    }
}
