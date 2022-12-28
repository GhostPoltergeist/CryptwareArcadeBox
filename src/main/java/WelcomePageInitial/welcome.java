package WelcomePageInitial;

import com.ArcadeBox.videoGameFrame.ArcadeBoxLoading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame {
    JLabel labelPrt, intro, playGif, credits;
    JTextArea noticeArea;
    public welcome() {
        noticeArea = new JTextArea();
        noticeArea.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        noticeArea.setText("Game programming is the term used to describe the computer or video game code Programming has changed along with technology. Early on in the history of video games, programmers were frequently in charge of the majority of development processes, including design. Dev teams, however, grew significantly as hardware and software advanced and games grew more complicated. A game programmer basically creates the code that makes a video game work. They collaborate closely with game designers, artists, sound engineers, and other departments to turn the project's concept into a fully playable, functional game.\n" +
                "\n" +
                "They could control anything, such as how quickly your character moves and how high they jump, as well as how many adversaries come at certain times and how they behave when assaulted.");
        noticeArea.setLineWrap(true);
        noticeArea.setWrapStyleWord(true);
        noticeArea.setBounds(100, 160, 600,450);
        noticeArea.setBackground(new Color(50,50,50,0));
        noticeArea.setForeground(Color.WHITE);
        noticeArea.setEditable(false);
        noticeArea.setFocusable(false);

        intro = new JLabel("{Notice}");
        intro.setFont(new Font("Press Start 2P", Font.BOLD, 35));
        intro.setBounds(100,30, 600,200);
        intro.setOpaque(false);
        intro.setForeground(Color.WHITE);

        credits = new JLabel("GhostPoltergeist@2022 | Harold");
        credits.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
        credits.setBounds(230,510, 600,200);
        credits.setOpaque(false);
        credits.setForeground(Color.WHITE);

        ImageIcon icon = new ImageIcon(new ImageIcon("stoney.gif").getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
        ImageIcon iconTwo = new ImageIcon(new ImageIcon("play.gif").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

        playGif = new JLabel();
        playGif.setBounds(380,-230,600,650);
        playGif.setIcon(iconTwo);
        playGif.setVisible(true);

        labelPrt = new JLabel();
        labelPrt.setBounds(430,200,600,650);
        labelPrt.setIcon(icon);
        labelPrt.setVisible(true);

        setUndecorated(true);
        getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLocationRelativeTo(null);

        Timer timer = new Timer(10000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new ArcadeBoxLoading();
            }
        });
        timer.setRepeats(false);
        timer.start();

        add(labelPrt);
        add(intro);
        add(noticeArea);
        add(playGif);
        add(credits);

    }
}
