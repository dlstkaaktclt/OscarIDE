package com.oscar.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.oscar.opm.gef.editor.policy.OPMObjectProcessDiagramXYLayoutPolicy;
import com.oscar.opm.model.OPMObjectProcessDiagram;
import com.oscar.opm.model.OPMNode;

public class OPMObjectProcessDiagramEditPart extends AbstractGraphicalEditPart {
	
	private OPMObjectProcessDiagramAdapter adapter;
	
	public OPMObjectProcessDiagramEditPart() {
		super();
		adapter = new OPMObjectProcessDiagramAdapter();
	}
	
	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OPMObjectProcessDiagramXYLayoutPolicy());
	}

	@Override
	protected List<OPMNode> getModelChildren() {
		OPMObjectProcessDiagram opd = (OPMObjectProcessDiagram) getModel();
		return opd.getNodes();
	}
	
	@Override 
	public void activate() {
		if(!isActive()) {
			((OPMObjectProcessDiagram)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override 
	public void deactivate() {
		if(isActive()) {
			((OPMObjectProcessDiagram)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	public class OPMObjectProcessDiagramAdapter implements Adapter {
		
		@Override 
		public void notifyChanged(Notification notification) {
			refreshChildren();
		}
		
		@Override
		public Notifier getTarget() {
			return (OPMObjectProcessDiagram)getModel();
		}
		
		@Override
		public void setTarget(Notifier newTarget) {
			//Do nothing.
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(OPMObjectProcessDiagram.class);
		}
		
		
	}
	
	
	
}
