/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.Validation_pkg;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author ahmed
 */
public class DoubleInputValidator extends DocumentFilter {

    JTextField TF;
    JLabel warningLabel;
    Color errprColor = Color.pink;
    Color validColor = Color.white;

    public DoubleInputValidator(JTextField TF, JLabel warningLabel) {

        this.TF = TF;
        this.warningLabel = warningLabel;

    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string,
            AttributeSet attr) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);
        if (sb.toString().isEmpty()) {
            TF.setBackground(validColor);
            warningLabel.setText("");

            super.insertString(fb, offset, string, attr);
        } else if (validateDouble(sb.toString())) {
            double x = Double.parseDouble(sb.toString());
            if (x <= 0) {
                TF.setBackground(errprColor);
                warningLabel.setText("يجب إدخال قيم اكبر من الصفر ");
            } else {
                super.insertString(fb, offset, string, attr);

                TF.setBackground(validColor);
                warningLabel.setText("");
            }

        } else {
            TF.setBackground(errprColor);
            warningLabel.setText("يجب إدخال ارقام فقط");
        }
    }

    boolean validateDouble(String txt) {
        try {

            double x = Double.parseDouble(txt);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);
        if (sb.toString().isEmpty()) {
            TF.setBackground(validColor);
            warningLabel.setText("");

            super.replace(fb, offset, length, text, attrs);
        } else if (validateDouble(sb.toString())) {
            double x = Double.parseDouble(sb.toString());
            if (x <= 0) {
                TF.setBackground(errprColor);
                warningLabel.setText("يجب إدخال قيم اكبر من الصفر ");
                super.replace(fb, offset, length, "", attrs);
            } else {
            super.replace(fb, offset, length, text, attrs);

                TF.setBackground(validColor);
                warningLabel.setText("");
            }

        } else {
            TF.setBackground(errprColor);
            warningLabel.setText("يجب إدخال ارقام فقط");
        }

    }
}
