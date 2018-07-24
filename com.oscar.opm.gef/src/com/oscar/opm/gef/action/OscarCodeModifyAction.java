package com.oscar.opm.gef.action;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import com.oscar.opm.gef.editor.part.OPMNodeEditPart;
import com.oscar.opm.gef.editor.part.OPMStructuralLinkAggregatorEditPart;
import com.oscar.opm.gef.editor.part.OscarCodeEditPart;
import com.oscar.opm.model.OPMStructuralLinkAggregator;

public class OscarCodeModifyAction extends SelectionAction {

	public static final String MODIFY_CODE = "ModifyCode";
	public static final String REQ_MODIFY_CODE = "ModifyCode";
	
	Request request;
	
	/**
     * Create a new instance of the class.
     * @param part
     */
	public OscarCodeModifyAction(IWorkbenchPart part) {
		super(part);
		setId(MODIFY_CODE);
		setText("Modify Code");
		request = new Request(REQ_MODIFY_CODE);
	}
	
	/**
     * Execute the commands that perform the {@link OscarCodeModifyAction#REQ_MODIFY_CODE REQ_MODIFY_CODE}.
     *
     * It is assumed that this method is executed directly after
     * {@link OscarCodeModifyAction#calculateEnabled() calculateEnabled()}
     */
	@Override
	public void run() {
		OscarCodeEditPart editpart = (OscarCodeEditPart) getSelectedObjects().get(0);
		
		/*
		// selected objects must be nodes because the action is enabled.
		@SuppressWarnings("unchecked") List<OPMNodeEditPart> editParts = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		for(OPMNodeEditPart nodeEditPart : editParts) {
			if(!(nodeEditPart instanceof OPMStructuralLinkAggregatorEditPart)) {
				compoundCommand.add(nodeEditPart.getCommand(request));
			}
		}
		execute(compoundCommand);*/
	}
	/**
     * {@inheritDoc}
     * <p>The action is enabled if selected entities is only one,
     *  and entity is {@link OscarCodeEditPart} instances</p>
     */
	@Override
	protected boolean calculateEnabled() {
		if(getSelectedObjects().isEmpty()) {
			return false;
		}
		if(getSelectedObjects().size()!=1) {
			return false;
		}
		else if(getSelectedObjects().get(0) instanceof OscarCodeEditPart) return true;
		return false;
	}

}
