package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * class for multiply operations
 * I want to test rebase
 * This is the correct file
 * @author mwirth
 *
 */
public class Multiply extends AbstractOperation implements BinaryOperation {

	@Override
	public String getName() {
		return "*";
	}

	@Override
	public float perform(float arg1, float arg2) {
		return arg1 + arg2;
	}

}
