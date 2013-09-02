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

import imagej.module.ModuleItem;
import omero.RType;
import omero.grid.Param;

import org.scijava.service.Service;

/**
 * Interface for ImageJ services that manage OMERO data conversion.
 * 
 * @author Curtis Rueden
 */
public interface OMEROService extends Service {

	/** Converts an ImageJ parameter value to an OMERO parameter value. */
	omero.RType convertValue(Object value);

	/** Converts an OMERO parameter value to an ImageJ value of the given type. */
	Object convertValue(omero.RType value, Class<?> type);

	/** Converts an ImageJ module parameter to an OMERO job parameter. */
	Param getJobParam(ModuleItem<?> item);

	/** Creates an OMERO parameter prototype for the given Java class. */
	RType prototype(Class<?> type);

}
