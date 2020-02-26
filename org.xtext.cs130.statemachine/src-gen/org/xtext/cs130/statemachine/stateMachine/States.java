/**
 * generated by Xtext 2.20.0
 */
package org.xtext.cs130.statemachine.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cs130.statemachine.stateMachine.States#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.cs130.statemachine.stateMachine.States#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.xtext.cs130.statemachine.stateMachine.StateMachinePackage#getStates()
 * @model
 * @generated
 */
public interface States extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' reference.
   * @see #setStart(State)
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachinePackage#getStates_Start()
   * @model
   * @generated
   */
  State getStart();

  /**
   * Sets the value of the '{@link org.xtext.cs130.statemachine.stateMachine.States#getStart <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' reference.
   * @see #getStart()
   * @generated
   */
  void setStart(State value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cs130.statemachine.stateMachine.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachinePackage#getStates_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // States