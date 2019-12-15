package gui.frames;

import graph.adapters.GraphAdapter;
import gui.menuBars.GraphMenuBar;
import gui.panels.WorkspacePanel;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    GraphAdapter graph;
    WorkspacePanel workspacePanel;

    public MainFrame(GraphAdapter graph) {
        super("Grapher");
        setSize(700, 700);
        setMinimumSize(new Dimension(700, 700));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        this.graph = graph;

        JMenuBar menuBar = new GraphMenuBar(graph);
        setJMenuBar(menuBar);

        add(new WorkspacePanel(graph));

        revalidate();
    }
}
