/*
 * generated by Xtext 2.20.0
 */
package org.xtext.cs130.statemachine.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.cs130.statemachine.stateMachine.StateMachine


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StateMachineGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (sm : resource.allContents.toIterable.filter(StateMachine)) {
		   fsa.generateFile('''«sm.name»''' + ".java", sm.toCode)
		}
	}
	
	def toCode(StateMachine sm) '''
	interface State {
		«FOR e : sm.eventdefs.events» 
		public void «e.name»();
		«ENDFOR»
	}

	«FOR s : sm.statedefs.states»

	class «s.name.toFirstUpper»State implements State {
		
		«sm.name.toFirstUpper»StateMachine «sm.name»;
		
		public «s.name.toFirstUpper»State(«sm.name.toFirstUpper»StateMachine «sm.name») {
			this.«sm.name» = «sm.name»;
		}
	«FOR e : sm.eventdefs.events»
	 	«var flag = true»
	 	«for(t : s.transitions) {
	 		if(t.event == e) {
	 			flag = false;
	 		}
	 	}»
	 	«IF flag»
	 	
	 		public void «e.name»() {}
	 	«ENDIF»
	«ENDFOR»
		
		«FOR t : s.transitions»
		public void «t.event.name»() {
			«IF t.condition !== null»
			if (this.«sm.name».«t.condition.variable.name» «t.condition.op» «t.condition.value») {
				this.«sm.name».setState(this.«sm.name».get«t.target.name.toFirstUpper»State());
			}
			«ELSE»
			this.«sm.name».setState(this.«sm.name».get«t.target.name.toFirstUpper»State());
			«ENDIF»
		}
		«ENDFOR»
	}
	
	«ENDFOR»

	class «sm.name.toFirstUpper»StateMachine {
		«FOR v : sm.vardefs.vars»
		int «v.name» = 0;
		«ENDFOR»
		
		State state;
		«FOR s : sm.statedefs.states»
		«s.name.toFirstUpper»State «s.name»State;
		«ENDFOR»
		
		public «sm.name.toFirstUpper»StateMachine() {
			«FOR s : sm.statedefs.states»
			this.«s.name»State = new «s.name.toFirstUpper»State(this);
			«ENDFOR»
			this.state = «sm.statedefs.start.name»State;
		}
		
		public State getState() {
			return this.state;
		}
		
		void setState(State state) {
			this.state = state;
		}

		«FOR v : sm.vardefs.vars»
		public void set«v.name.toFirstUpper»(int val) {
			this.«v.name» = val;
		}
		public int get«v.name.toFirstUpper»() {
			return this.«v.name»;
		}
		«ENDFOR»

		
		«FOR s : sm.statedefs.states»
		public State get«s.name.toFirstUpper»State() {
			return this.«s.name»State;
		}
		«ENDFOR»
		
		«FOR e : sm.eventdefs.events» 
		public void «e.name»() {
			this.state.«e.name»();
		}
		«ENDFOR»
		
	}
	'''
}
