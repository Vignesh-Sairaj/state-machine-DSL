/*
 * generated by Xtext 2.20.0
 */
package org.xtext.cs130.statemachine.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractStateMachineValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.cs130.statemachine.stateMachine.StateMachinePackage.eINSTANCE);
		return result;
	}
}
