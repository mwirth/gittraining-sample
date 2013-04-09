/*******************************************************************************
 * Copyright (C) 2010, Sascha Homeier <matthias.sohn@sap.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
