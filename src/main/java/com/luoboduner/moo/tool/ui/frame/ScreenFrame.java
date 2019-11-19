package com.luoboduner.moo.tool.ui.frame;

import com.luoboduner.moo.tool.ui.UiConsts;
import com.luoboduner.moo.tool.ui.listener.ScreenMouseListener;

import javax.swing.*;
import java.awt.*;

/**
 * 屏幕透明框架
 */
public class ScreenFrame extends JFrame {
    private static ScreenFrame screenFrame;

    private ScreenFrame() {
    }

    public static ScreenFrame getInstance() {
        if (screenFrame == null) {
            screenFrame = new ScreenFrame();
            screenFrame.init();
        }

        return screenFrame;
    }

    private void init() {
        setName(UiConsts.APP_NAME);
        setTitle(UiConsts.APP_NAME + "-ColorPickerScreen");
        FrameUtil.setFrameIcon(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(false);
        setAutoRequestFocus(true);
        setUndecorated(true);
        setOpacity(0.05f);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setPreferredSize(screen);
        setBounds(0, 0, (int) screen.getWidth(), (int) screen.getHeight());
        addMouseListener(new ScreenMouseListener());
        addMouseMotionListener(new ScreenMouseListener());
    }
}
