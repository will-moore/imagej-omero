/*
 * #%L
 * Call ImageJ commands from OMERO on the server side.
 * %%
 * Copyright (C) 2013 Board of Regents of the University of
 * Wisconsin-Madison.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package imagej.omero.server;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * Utility methods for converting between data types.
 * 
 * @author Curtis Rueden
 */
public final class ConversionUtils {

	private ConversionUtils() {
		// NB: Prevent instantiation of utility class.
	}

	// -- Utility methods --

	/** Converts a {@link Collection} to an array of the given type. */
	public static <T> T[] toArray(final Collection<Object> collection,
		final Class<T> type)
	{
		final Object array = Array.newInstance(type, 0);
		@SuppressWarnings("unchecked")
		final T[] typedArray = (T[]) array;
		return collection.toArray(typedArray);
	}

}
