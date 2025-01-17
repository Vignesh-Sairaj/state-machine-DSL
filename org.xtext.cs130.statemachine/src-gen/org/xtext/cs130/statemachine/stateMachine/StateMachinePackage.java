/**
 * generated by Xtext 2.20.0
 */
package org.xtext.cs130.statemachine.stateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.cs130.statemachine.stateMachine.StateMachineFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachinePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stateMachine";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/cs130/statemachine/StateMachine";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stateMachine";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateMachinePackage eINSTANCE = org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachineImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Vardefs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__VARDEFS = 1;

  /**
   * The feature id for the '<em><b>Eventdefs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__EVENTDEFS = 2;

  /**
   * The feature id for the '<em><b>Statedefs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__STATEDEFS = 3;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.VariablesImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__VARS = 0;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.VariableImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.EventsImpl <em>Events</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.EventsImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getEvents()
   * @generated
   */
  int EVENTS = 3;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS__EVENTS = 0;

  /**
   * The number of structural features of the '<em>Events</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.EventImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.StatesImpl <em>States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StatesImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getStates()
   * @generated
   */
  int STATES = 5;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__START = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__STATES = 1;

  /**
   * The number of structural features of the '<em>States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getState()
   * @generated
   */
  int STATE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.TransitionImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 7;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cs130.statemachine.stateMachine.impl.ConditionImpl
   * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OP = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cs130.statemachine.stateMachine.StateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachine#getName()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cs130.statemachine.stateMachine.StateMachine#getVardefs <em>Vardefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vardefs</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachine#getVardefs()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Vardefs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cs130.statemachine.stateMachine.StateMachine#getEventdefs <em>Eventdefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eventdefs</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachine#getEventdefs()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Eventdefs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cs130.statemachine.stateMachine.StateMachine#getStatedefs <em>Statedefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statedefs</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.StateMachine#getStatedefs()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Statedefs();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cs130.statemachine.stateMachine.Variables#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Variables#getVars()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_Vars();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cs130.statemachine.stateMachine.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.Events <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Events</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Events
   * @generated
   */
  EClass getEvents();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cs130.statemachine.stateMachine.Events#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Events#getEvents()
   * @see #getEvents()
   * @generated
   */
  EReference getEvents_Events();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cs130.statemachine.stateMachine.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.States
   * @generated
   */
  EClass getStates();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cs130.statemachine.stateMachine.States#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.States#getStart()
   * @see #getStates()
   * @generated
   */
  EReference getStates_Start();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cs130.statemachine.stateMachine.States#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.States#getStates()
   * @see #getStates()
   * @generated
   */
  EReference getStates_States();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cs130.statemachine.stateMachine.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cs130.statemachine.stateMachine.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cs130.statemachine.stateMachine.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cs130.statemachine.stateMachine.Transition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Transition#getCondition()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cs130.statemachine.stateMachine.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for class '{@link org.xtext.cs130.statemachine.stateMachine.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.cs130.statemachine.stateMachine.Condition#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Condition#getVariable()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cs130.statemachine.stateMachine.Condition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Condition#getOp()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cs130.statemachine.stateMachine.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.cs130.statemachine.stateMachine.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StateMachineFactory getStateMachineFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachineImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

    /**
     * The meta object literal for the '<em><b>Vardefs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__VARDEFS = eINSTANCE.getStateMachine_Vardefs();

    /**
     * The meta object literal for the '<em><b>Eventdefs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__EVENTDEFS = eINSTANCE.getStateMachine_Eventdefs();

    /**
     * The meta object literal for the '<em><b>Statedefs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__STATEDEFS = eINSTANCE.getStateMachine_Statedefs();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.VariablesImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__VARS = eINSTANCE.getVariables_Vars();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.VariableImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.EventsImpl <em>Events</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.EventsImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getEvents()
     * @generated
     */
    EClass EVENTS = eINSTANCE.getEvents();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENTS__EVENTS = eINSTANCE.getEvents_Events();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.EventImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.StatesImpl <em>States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StatesImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getStates()
     * @generated
     */
    EClass STATES = eINSTANCE.getStates();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__START = eINSTANCE.getStates_Start();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__STATES = eINSTANCE.getStates_States();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.TransitionImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '{@link org.xtext.cs130.statemachine.stateMachine.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cs130.statemachine.stateMachine.impl.ConditionImpl
     * @see org.xtext.cs130.statemachine.stateMachine.impl.StateMachinePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__VARIABLE = eINSTANCE.getCondition_Variable();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OP = eINSTANCE.getCondition_Op();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

  }

} //StateMachinePackage
