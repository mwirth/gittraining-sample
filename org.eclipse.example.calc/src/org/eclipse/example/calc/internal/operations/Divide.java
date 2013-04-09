package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * class for the divide operation.
 * I want to test the rebase feature
 * @author mwirth
 *
 */
public class Divide extends AbstractOperation implements BinaryOperation {

	@Override
	public String getName() {
		return "/";
	}

	@Override
	public float perform(float arg1, float arg2) {
		if(arg2 != 0)
		{
			return arg1/arg2;
		}
		else
		{
			return arg1/arg2;
		}
	}

}
