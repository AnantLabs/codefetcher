/*******************************************************************************
 * Copyright (c) 2011 Tran Nam Quang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tran Nam Quang - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.util.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated Iterable is an immutable copy of another
 * Iterable. This implies that the copy can be safely iterated over while the
 * original Iterable is being modified (either by the same or by a different
 * thread).
 * 
 * @author Tran Nam Quang
 */
@Target({
	ElementType.FIELD,
	ElementType.METHOD,
	ElementType.PARAMETER
})
@Retention(RetentionPolicy.SOURCE)
public @interface ImmutableCopy {

}
