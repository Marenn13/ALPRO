
import javax.swing.JApplet;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo extends JApplet {

    JTree tree;
    JLabel jlab;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        public void run() {
                            makeGUI();
                        }
                    }
            );
        } catch (Exception exc) {
            System.out.println("Can't create because of" + exc);
        }
    }

    private void makeGUI() {
        // Create top node of tree
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("options");
        // create subtree "A"
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

         // Create top node of "B"
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);
 
        // Create the Tree
        tree = new JTree(top);

        // add the tree to a scoll pane.
        JScrollPane jsp = new JScrollPane(tree);

        // add the scroll pane to the conten pane. 
        add(jsp);

        // add the label to the conten pane.
        jlab = new JLabel();
        add(jlab, BorderLayout.SOUTH);

        // handle tree selection  events.
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
                jlab.setText("Selection is " + tse.getPath());
            }
        });
        
    }

}
