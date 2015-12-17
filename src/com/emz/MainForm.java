package com.emz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager.LookAndFeelInfo;


public class MainForm extends JFrame{

    int width=300;
    int height=400;

    JMenu m_file;
    JMenuItem m_file_exist;
    JFrame mf=this;

    public MainForm() {
        //setSize(width,height);

        InitMenu();
        InitToolBar();

        SetFullScreen();
        //SetTheme();
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }

    private void InitMenu()
    {
        JMenuBar _bar=new JMenuBar();

        m_file = new JMenu("File");
        m_file_exist = new JMenuItem("Exit");
        m_file_exist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        m_file.add(m_file_exist);



        _bar.add(m_file);

        setJMenuBar(_bar);
    }

    private void InitToolBar()
    {
        JToolBar toolBar=new JToolBar();

        final JButton button1 = new JButton("click1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mf,"Click Button1");
            }
        });

        toolBar.add(button1);



        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);

        add("North", toolBar);
    }

    private void SetFullScreen()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        setSize(dimension);
    }

    private void SetTheme()
    {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }
}
