package com.oscar.opm.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.oscar.opm.model.OPMObjectProcessDiagram;
import com.oscar.opm.model.OPMNode;

public class OPMNodeCreateCommand extends Command {
		
	private OPMNode node;
	private Rectangle constraints;
	private OPMObjectProcessDiagram opd;
	
	@Override
	public boolean canExecute() {
	    return node != null && constraints != null && opd != null;
	}
	
	@Override
	public void execute() {
		node.setConstraints(constraints);
		node.setOpd(opd);
	}
	
	@Override
	public void undo() {
		node.setOpd(null);
	}
	
	
	public void setParent(final OPMObjectProcessDiagram opd) {
		this.opd = opd;
	}
	
	public void setNode(final OPMNode node) {
		this.node = node;
	}
	
	public void setConstraints(final Rectangle constraints) {
	    this.constraints = constraints;
	}
	
	
}
