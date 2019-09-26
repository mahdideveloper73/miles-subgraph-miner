package com.uantwerp.algorithms.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.uantwerp.algorithms.ParameterConfig;
import com.uantwerp.algorithms.SubgraphMining;

//Methods

//This action creates and shows a modal open-file dialog.
public class StartButton implements ActionListener {
	
	private SubgraphMiningGUI gui;
	
	public StartButton(SubgraphMiningGUI gui) {
		this.gui = gui;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			ParameterConfig.transformGUI(
					gui.getTextGraphFile().getText(),
					gui.getTextLabels().getText(),
					gui.getTextInterestingVertices().getText(),
					gui.getTextBackground().getText(),
					gui.getTextFieldSupport().getText(),
					gui.getTextFieldAlpha().getText(),
					gui.getComboBoxMultipleTesting().getSelectedItem().toString(),
					gui.getCheckBoxAllPvalues().isSelected(),
					gui.getTextFieldVerticesSize().getText(),
					gui.getTextFieldSavePath().getText(),
					gui.getComboBoxAlgorithm().getSelectedItem().toString(),
					gui.getCheckBoxSingleLabel().isSelected(),
					gui.getCheckBoxUndirected().isSelected(),
					gui.getCheckBoxNestedPValue().isSelected(),
					gui.getCheckBoxVerbose().isSelected(),
					gui.getTextAreaProgressReport().getText(),
					gui.getCheckBoxDebug().isSelected()
					);
			SubgraphMining.runProcesses();
		} catch(Exception error){
			if (SubgraphMining.DEBUG)
				error.printStackTrace();
			System.err.println(error.getMessage());
		}
	}
};