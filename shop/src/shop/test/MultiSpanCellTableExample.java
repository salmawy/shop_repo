/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.test;

/**
 *
 * @author ahmed
 */
/*
 * (swing1.1beta3) jfc#96
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;



/**
 * @version 1.0 11/26/98
 */
public class MultiSpanCellTableExample extends JFrame {

  MultiSpanCellTableExample() {
    super( "Multi-Span Cell Example" );
    
    AttributiveCellTableModel ml = new AttributiveCellTableModel(10,6);
    /*
    AttributiveCellTableModel ml = new AttributiveCellTableModel(10,6) {
      public Object getValueAt(int row, int col) { 
        return "" + row + ","+ col; 
      }
    };
    */
    final CellSpan cellAtt =(CellSpan)ml.getCellAttribute();
    final MultiSpanCellTable table = new MultiSpanCellTable( ml );
    JScrollPane scroll = new JScrollPane( table );

    JButton b_one   = new JButton("Combine");
    b_one.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	int[] columns = table.getSelectedColumns();
	int[] rows    = table.getSelectedRows();
	cellAtt.combine(rows,columns);
	table.clearSelection();
	table.revalidate();
	table.repaint();
      }
    });
    JButton b_split = new JButton("Split");
    b_split.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	int column = table.getSelectedColumn();
	int row    = table.getSelectedRow();
	cellAtt.split(row,column);
	table.clearSelection();
	table.revalidate();
	table.repaint();
      }
    });
    JPanel p_buttons = new JPanel();
    p_buttons.setLayout(new GridLayout(2,1));
    p_buttons.add(b_one);
    p_buttons.add(b_split);

    Box box = new Box(BoxLayout.X_AXIS);
    box.add(scroll);
    box.add(new JSeparator(SwingConstants.HORIZONTAL));
    box.add(p_buttons);
    getContentPane().add( box );
    setSize( 400, 200 );
    setVisible(true);
  }

  public static void main(String[] args) {
    MultiSpanCellTableExample frame = new MultiSpanCellTableExample();
    frame.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent e ) {
        System.exit(0);
      }
    });
  }
}
