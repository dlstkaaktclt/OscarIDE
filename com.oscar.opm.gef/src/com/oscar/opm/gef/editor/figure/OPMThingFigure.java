package com.oscar.opm.gef.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;

public abstract class OPMThingFigure extends Figure implements OPMNodeFigure {
	
	private Label nameLabel;
	private TooltipFigure tooltipFigure;
	
	abstract public IFigure getContentPane();
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	public OPMThingFigure() {
		setLayoutManager(new XYLayout());
		nameLabel = new Label();
		add(nameLabel);
		tooltipFigure = new TooltipFigure();
		setToolTip(tooltipFigure);
	}
	
	public void setTooltipText(String tooltipText) {
		tooltipFigure.setMessage(tooltipText);
	}
	
	protected final boolean useLocalCoordinates() {
		return true;
	}
	
}