/*
 * generated by Xtext 2.20.0
 */
package org.xtext.cs130.statemachine.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StateMachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/cs130/statemachine/parser/antlr/internal/InternalStateMachine.tokens");
	}
}
