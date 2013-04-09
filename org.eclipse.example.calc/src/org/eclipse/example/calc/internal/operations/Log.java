/*******************************************************************************
 * Copyright (C) 2013, Ron Reckersbrink <rreckersbrink@meyle-mueller.de>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

/**
 * Square operation
 */
public class Log extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "log";
	}

	@Override
	public float perform(float arg1) {
		return (float) Math.log((double)arg1);
	}

}
