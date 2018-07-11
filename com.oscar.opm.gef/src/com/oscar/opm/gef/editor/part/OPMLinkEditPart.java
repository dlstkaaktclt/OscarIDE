package com.oscar.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.oscar.opm.gef.editor.policy.OPMLinkBendpointEditPolicy;
import com.oscar.opm.gef.editor.policy.OPMLinkConnectionEditPolicy;
import com.oscar.opm.model.OPMLink;

public class OPMLinkEditPart extends AbstractConnectionEditPart {
	
	private OPMLinkAdapter adapter;
	
	public OPMLinkEditPart() {
		super();
		adapter=new OPMLinkAdapter();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE,new OPMLinkConnectionEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,new OPMLinkBendpointEditPolicy());
	}
	
	@Override
	protected IFigure createFigure() {
		PolylineConnection conn = new PolylineConnection();
		conn.setConnectionRouter(new BendpointConnectionRouter());
		return conn;
	}
	
	@Override
	protected void refreshVisuals() {
		Connection connection = getConnectionFigure();
		List<Point> modelConstraint = ((OPMLink)getModel()).getBendpoints();
		List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
		for (Point p : modelConstraint) {
			figureConstraint.add(new AbsoluteBendpoint(p));
		}
		connection.setRoutingConstraint(figureConstraint);
	}
	
	@Override 
	public void activate() {
		if(!isActive()) {
			((OPMLink)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		if(isActive()) {
			((OPMLink)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	
	
	public class OPMLinkAdapter implements Adapter{
		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
		}
		
		@Override
		public Notifier getTarget() {
			return (OPMLink)getModel();
		}
		
		@Override
		public void setTarget(Notifier newTarget) {
			// Do Nothing.
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(OPMLink.class);
		}
		
	}
	
	
}
