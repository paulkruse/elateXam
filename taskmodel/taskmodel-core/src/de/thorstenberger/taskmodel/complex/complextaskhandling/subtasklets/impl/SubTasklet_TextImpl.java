/*

Copyright (C) 2006 Thorsten Berger

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/**
 * 
 */
package de.thorstenberger.taskmodel.complex.complextaskhandling.subtasklets.impl;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import de.thorstenberger.taskmodel.TaskApiException;
import de.thorstenberger.taskmodel.TaskModelPersistenceException;
import de.thorstenberger.taskmodel.complex.TaskHandlingConstants;
import de.thorstenberger.taskmodel.complex.complextaskdef.Block;
import de.thorstenberger.taskmodel.complex.complextaskdef.ComplexTaskDefRoot;
import de.thorstenberger.taskmodel.complex.complextaskdef.blocks.impl.TextBlockImpl;
import de.thorstenberger.taskmodel.complex.complextaskdef.subtaskdefs.impl.TextSubTaskDefImpl;
import de.thorstenberger.taskmodel.complex.complextaskhandling.CorrectionSubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.ManualSubTaskletCorrection;
import de.thorstenberger.taskmodel.complex.complextaskhandling.Page;
import de.thorstenberger.taskmodel.complex.complextaskhandling.SubTaskletCorrection;
import de.thorstenberger.taskmodel.complex.complextaskhandling.SubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.correctionsubmitdata.TextCorrectionSubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.impl.ManualSubTaskletCorrectionImpl;
import de.thorstenberger.taskmodel.complex.complextaskhandling.impl.PageImpl;
import de.thorstenberger.taskmodel.complex.complextaskhandling.submitdata.TextSubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.subtasklets.SubTasklet_Text;
import de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskHandlingType;
import de.thorstenberger.taskmodel.complex.jaxb.ObjectFactory;
import de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef;
import de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskDefType.CategoryType.TextTaskBlock;
import de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskHandlingType.TryType.PageType.TextSubTask;
import de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskHandlingType.TryType.PageType.TextSubTaskType.ManualCorrectionType;

/**
 * @author Thorsten Berger
 *
 */
public class SubTasklet_TextImpl extends AbstractSubTasklet implements SubTasklet_Text {

	private Block block;
	private TextTaskBlock textTaskBlock;
	private TextSubTaskDef textSubTaskDef;
	private TextSubTask textSubTask;
	private ComplexTaskDefRoot complexTaskDefRoot;
	private ObjectFactory objectFactory = new ObjectFactory();
	
	/**
	 * 
	 */
	public SubTasklet_TextImpl( Block block, TextSubTaskDefImpl textSubTaskDefImpl, TextSubTask textSubTask, ComplexTaskDefRoot complexTaskDefRoot ) {
		super( complexTaskDefRoot, textSubTaskDefImpl );
		this.block = block;
		this.textTaskBlock = ((TextBlockImpl)block).getTextTaskBlock();
		this.textSubTaskDef = textSubTaskDefImpl.getTextSubTaskDef();
		this.textSubTask = textSubTask;
		this.complexTaskDefRoot = complexTaskDefRoot;
	}


	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#addToPage(de.thorstenberger.taskmodel.complex.complextaskhandling.Page)
	 */
	public void addToPage(Page page) {
		PageImpl pageImpl = (PageImpl)page;
		pageImpl.getPageType().getMcSubTaskOrClozeSubTaskOrTextSubTask().add( textSubTask );
	}

	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#setVirtualSubtaskNumber(java.lang.String)
	 */
	public void setVirtualSubtaskNumber(String number) {
		textSubTask.setVirtualNum( number );
	}

	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#getVirtualSubtaskNumber()
	 */
	public String getVirtualSubtaskNumber() {
		return textSubTask.getVirtualNum();
	}
	
	public float getReachablePoints(){
		return textTaskBlock.getConfig().getPointsPerTask();
	}
	
	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.subtasklets.SubTasklet_Text#getInitialTextFieldValue()
	 */
	public String getInitialTextFieldValue() {
		// remove Windows/DOS line breaks,
		// see doSave() downwards
		if( textSubTaskDef.getInitialTextFieldValue() != null )
			return textSubTaskDef.getInitialTextFieldValue().replaceAll( "\r", "" );
		else
			return null;
	}

	public void setVirtualNum( String virtualNum ){
		textSubTask.setVirtualNum( virtualNum );
	}
	
	public String getVirtualNum(){
		return textSubTask.getVirtualNum();
	}
	
	public int getHash(){
		StringBuffer ret = new StringBuffer();
		ret.append( textSubTask.getRefId() );		
		ret.append( getAnswer() );
		ret.append( getVirtualNum() );
		return ret.toString().hashCode();
	}
	
	public String getAnswer(){
		return textSubTask.getAnswer();
	}
	
	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#getAutoCorrection()
	 */
	public SubTaskletCorrection getAutoCorrection(){
		if ( textSubTask.isSetAutoCorrection() )
			return new AutoSubTaskletCorrectionImpl( textSubTask.getAutoCorrection().getPoints() );
		else
			return null;
	}


	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#getManualCorrections()
	 */
	public List<ManualSubTaskletCorrection> getManualCorrections(){
		if( !textSubTask.isSetManualCorrection() )
			return null;
		List<ManualSubTaskletCorrection> ret = new LinkedList<ManualSubTaskletCorrection>();
		List<de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskHandlingType.TryType.PageType.TextSubTaskType.ManualCorrectionType> mcs = textSubTask.getManualCorrection();
		for( de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskHandlingType.TryType.PageType.TextSubTaskType.ManualCorrectionType mc : mcs )
			ret.add( new ManualSubTaskletCorrectionImpl( mc.getCorrector(), mc.getPoints() ) );
		return ret;
	}


	public void doSave( SubmitData submitData ) throws IllegalStateException{
		TextSubmitData tsd = (TextSubmitData) submitData;
		// remove Windows/DOS line breaks,
		// otherwise comparing the answer to the initial text field value will always return false
		// if the page has been saved without changing the text field by the user
		textSubTask.setAnswer( tsd.getAnswer().replaceAll( "\r", "" ) );
	}
	
	public void doAutoCorrection(){
		if( !isProcessed() ){
			setAutoCorrection( 0 );
		}else
			textSubTask.setNeedsManualCorrection( true );
		
		// mehr k�nnen wir leider nicht machen...
	}
	
	public void doManualCorrection( CorrectionSubmitData csd ){
		
		if( isAutoCorrected() )
			throw new IllegalStateException( TaskHandlingConstants.SUBTASK_AUTO_CORRECTED );
		
		TextCorrectionSubmitData tcsd = (TextCorrectionSubmitData) csd;
		
		if( tcsd.getPoints() <0 || tcsd.getPoints() > textTaskBlock.getConfig().getPointsPerTask() )
			return;
			
		List<ManualCorrectionType> manualCorrections = textSubTask.getManualCorrection();
		if( complexTaskDefRoot.getCorrectionMode().getType() == ComplexTaskDefRoot.CorrectionModeType.MULTIPLECORRECTORS ){
			
			for( ManualCorrectionType mc : manualCorrections ){
				if( mc.getCorrector().equals( tcsd.getCorrector() ) ){
					mc.setPoints( tcsd.getPoints() );
					return;
				}
			}
			// corrector not found, so create a new ManualCorrection for him
			ManualCorrectionType mc;
			try {
				mc = objectFactory.createComplexTaskHandlingTypeTryTypePageTypeTextSubTaskTypeManualCorrectionType();
			} catch (JAXBException e) {
				throw new TaskModelPersistenceException( e );
			}
			mc.setCorrector( tcsd.getCorrector() );
			mc.setPoints( tcsd.getPoints() );
			manualCorrections.add( mc );
			
		}else{
			
			ManualCorrectionType mc;
			if( manualCorrections.size() > 0 ){
				mc = manualCorrections.get( 0 );
			}else{
				try {
					mc = objectFactory.createComplexTaskHandlingTypeTryTypePageTypeTextSubTaskTypeManualCorrectionType();
				} catch (JAXBException e) {
					throw new TaskModelPersistenceException( e );
				}
				manualCorrections.add( mc );
			}
			mc.setCorrector( tcsd.getCorrector() );
			mc.setPoints( tcsd.getPoints() );
		}
		
	}
	
	private void setAutoCorrection( float points ){
		ComplexTaskHandlingType.TryType.PageType.TextSubTaskType.AutoCorrectionType corr = textSubTask.getAutoCorrection();
		if( corr == null ){
			ObjectFactory of = new ObjectFactory();
			try {
				corr = of.createComplexTaskHandlingTypeTryTypePageTypeTextSubTaskTypeAutoCorrectionType();
				textSubTask.setAutoCorrection( corr );
			} catch (JAXBException e) {
				throw new TaskModelPersistenceException( e );
			}
		}
		corr.setPoints( points );
	}

	

//	public float getPoints() throws IllegalStateException{
//		if( !isCorrected() )
//			throw new IllegalStateException( TaskHandlingConstants.SUBTASK_NOT_CORRECTED );
//		
//		return textSubTask.getCorrection().getPoints();
//	}
	
	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#isSetNeedsManualCorrectionFlag()
	 */
	public boolean isSetNeedsManualCorrectionFlag() {
		return textSubTask.isNeedsManualCorrection();
	}

	public boolean isProcessed(){
		if( getInitialTextFieldValue() != null ){
			if( getInitialTextFieldValue().equals( textSubTask.getAnswer() ) )
				return false;
			else
				return true;
		}else
			return textSubTask.getAnswer() != null && textSubTask.getAnswer().length() > 0;
	}
	
	public int getTextFieldWidth(){
		return textSubTaskDef.isSetTextFieldWidth() ?
					textSubTaskDef.getTextFieldWidth() : 60;
	}
	
	public int getTextFieldHeight(){
		return textSubTaskDef.isSetTextFieldHeight() ?
					textSubTaskDef.getTextFieldHeight() : 15;
	}

	public String getCorrectionHint(){
	    return textSubTaskDef.getCorrectionHint();
	}

	/* (non-Javadoc)
	 * @see de.thorstenberger.taskmodel.complex.complextaskhandling.SubTasklet#build()
	 */
	public void build() throws TaskApiException {
		// nothing to build :)		
		// except:
		textSubTask.setAnswer( getInitialTextFieldValue() != null ? getInitialTextFieldValue() : "" );
	}
	
}
