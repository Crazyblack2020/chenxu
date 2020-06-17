package day00.June;

import java.awt.*;
import java.awt.event.*;
public class June5th {
    public static void main(String[] args) {
        final Frame frame = new Frame("我的窗口");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        frame.setSize(200, 300);
        frame.setLocation(300, 200);
        Button but1 = new Button("第一个按钮");
        frame.add(but1);
        but1.addActionListener(new ActionListener() {
            private  int num = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(new Button("第" + ++num+ "个按钮"));
                frame.setVisible(true);

            }
        });
        frame.setVisible(true);
    }

}
