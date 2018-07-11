package com.oscar.opm.gef.editor.part;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.jface.viewers.TextCellEditor;

import com.oscar.opm.gef.editor.figure.OPMThingFigure;
import com.oscar.opm.gef.editor.policy.OPMThingDirectEditPolicy;
import com.oscar.opm.model.OPMThing;

public abstract class OPMThingEditPart extends OPMNodeEditPart implements NodeEditPart{
	
	
	public OPMThingEditPart() {
		super();
	}
	
	@Override protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,new OPMThingDirectEditPolicy());
		}
	
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		return ((OPMThingFigure)getFigure()).getSourceConnectionAnchor();
	}
	
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return ((OPMThingFigure)getFigure()).getTargetConnectionAnchor();
	}
	
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((OPMThingFigure)getFigure()).getSourceConnectionAnchor();
	}
	
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((OPMThingFigure)getFigure()).getTargetConnectionAnchor();
	}
	
	
	@Override public void performRequest(Request req) {
		if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			performDirectEditing();
		}	
	}
	
	private void performDirectEditing() {
		Label label = ((OPMThingFigure)getFigure()).getNameLabel();
		OPMThingDirectEditManager manager = new OPMThingDirectEditManager(this, TextCellEditor.class, new OPMThingCellEditorLocator(label), label);
		manager.show();
	}
	
	
	@Override
	protected void refreshVisuals()
	{
		OPMThingFigure figure = (OPMThingFigure)getFigure();
		OPMThing model = (OPMThing)getModel();
		OPMObjectProcessDiagramEditPart parent = (OPMObjectProcessDiagramEditPart) getParent();
		
		figure.getNameLabel().setText(model.getName());
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}
}
