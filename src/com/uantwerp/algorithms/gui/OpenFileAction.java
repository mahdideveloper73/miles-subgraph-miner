package com.uantwerp.algorithms.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

//Methods

//This action creates and shows a modal open-file dialog.
public class OpenFileAction implements ActionListener {

	private JTextField textField;
	private JFrame frame;

	public OpenFileAction(JTextField textField, JFrame frame) {
		this.textField = textField;
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogType(JFileChooser.OPEN_DIALOG);
		chooser.setDialogTitle("Choose input file");
		// Show dialog; this method does not return until dialog is closed
		int returnVal = chooser.showOpenDialog(frame);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String filePath = chooser.getSelectedFile().getAbsolutePath();
			textField.setText(filePath);
		}
	}
};
