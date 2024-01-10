/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

/**
 *
 * @author engen
 */
public class somenteLetras extends PlainDocument {

    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
       // super.insertString(offs, str.replaceAll("[^a-z A-Z]", ""), a);
        super.insertString(offs, str.replaceAll("[^\\p{IsLatin} ^~´`]", ""), a);
    }

}

