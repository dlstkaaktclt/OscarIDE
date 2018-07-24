package com.oscar.opm.gef.action;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;

public class OscarCodeCreateAction extends WorkbenchPartAction {
	
	public static final String ID = "CreateOscarCode";
	public static final String REQUEST = "CreateOscarCode";
	
	private final CreateRequest request;
	private CreationTool tool;
	private static final Dimension DEFAULT_THING_DIMENSION = new Dimension(50,50);
	
	
	
	public OscarCodeCreateAction(IWorkbenchPart part) {
		super(part);
		request = new CreateRequest(REQUEST);
		setId(ID);
		setText("Create OscarCode");
	}
	
	public Request getRequest() {
		return request;
	}
	
	@Override
	public void run() {
		// for now we don't use this, I change this code to comment.
		// if you want to use this code, change OPMGraphicalEditor's getEditDomain() method.
		// (it is also commentized)
		/*
		OPMGraphicalEditor editor = (OPMGraphicalEditor) getWorkbenchPart();
		CreationTool tool = new CreationTool(new OPMObjectFactory());
		editor.getEditDomain().setActiveTool(tool);
		*/
	}
	
	@Override
	protected boolean calculateEnabled() {
		return true;
	}

}
