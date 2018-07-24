package com.oscar.opm.gef.editor.part;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import com.oscar.opm.gef.editor.figure.OPMObjectFigure;
import com.oscar.opm.gef.editor.figure.OscarCodeFigure;
import com.oscar.opm.gef.editor.policy.OPMThingDirectEditPolicy;
import com.oscar.opm.gef.editor.tool.FileCreationTool;
import com.oscar.opm.model.OscarCode;

public class OscarCodeEditPart extends OPMObjectEditPart {
	
	@Override 
	public void performRequest(Request req) {
		if(req.getType() == FileCreationTool.REQ_FILE_LOCATE) {
			performFileLocationSetting();
		}
		super.performRequest(req);
	}
	
	private void performFileLocationSetting()
	{
		// get FileLocation with GUI
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		
		int returnValue = jfc.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			((OscarCode) getModel()).setCodefile(selectedFile);
		}
	}
	
	@Override
	protected IFigure createFigure() {
		return new OscarCodeFigure();
	}
}