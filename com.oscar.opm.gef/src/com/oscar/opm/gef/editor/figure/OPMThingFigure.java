package com.oscar.opm.gef.editor.figure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

public interface OPMThingFigure extends OPMNodeFigure {
	public Label getNameLabel();
	
	public IFigure getContentPane();
}